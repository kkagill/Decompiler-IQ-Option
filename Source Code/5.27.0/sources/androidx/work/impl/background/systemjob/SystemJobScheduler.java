package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.IdGenerator;
import java.util.List;
import java.util.Locale;

@RequiresApi(23)
@RestrictTo({Scope.LIBRARY_GROUP})
public class SystemJobScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("SystemJobScheduler");
    private final IdGenerator mIdGenerator;
    private final JobScheduler mJobScheduler;
    private final SystemJobInfoConverter mSystemJobInfoConverter;
    private final WorkManagerImpl mWorkManager;

    public SystemJobScheduler(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, (JobScheduler) context.getSystemService("jobscheduler"), new SystemJobInfoConverter(context));
    }

    @VisibleForTesting
    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl, JobScheduler jobScheduler, SystemJobInfoConverter systemJobInfoConverter) {
        this.mWorkManager = workManagerImpl;
        this.mJobScheduler = jobScheduler;
        this.mIdGenerator = new IdGenerator(context);
        this.mSystemJobInfoConverter = systemJobInfoConverter;
    }

    public void schedule(WorkSpec... workSpecArr) {
        WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        int length = workSpecArr.length;
        int i = 0;
        while (i < length) {
            WorkSpec workSpec = workSpecArr[i];
            workDatabase.beginTransaction();
            try {
                WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(workSpec.id);
                String str = "Skipping scheduling ";
                Logger logger;
                String str2;
                StringBuilder stringBuilder;
                if (workSpec2 == null) {
                    logger = Logger.get();
                    str2 = TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(workSpec.id);
                    stringBuilder.append(" because it's no longer in the DB");
                    logger.warning(str2, stringBuilder.toString(), new Throwable[0]);
                } else if (workSpec2.state != State.ENQUEUED) {
                    logger = Logger.get();
                    str2 = TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(workSpec.id);
                    stringBuilder.append(" because it is no longer enqueued");
                    logger.warning(str2, stringBuilder.toString(), new Throwable[0]);
                } else {
                    SystemIdInfo systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(workSpec.id);
                    if (systemIdInfo == null || getPendingJobInfo(this.mJobScheduler, workSpec.id) == null) {
                        int nextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : this.mIdGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId());
                        if (systemIdInfo == null) {
                            this.mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(new SystemIdInfo(workSpec.id, nextJobSchedulerIdWithRange));
                        }
                        scheduleInternal(workSpec, nextJobSchedulerIdWithRange);
                        if (VERSION.SDK_INT == 23) {
                            scheduleInternal(workSpec, this.mIdGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId()));
                        }
                        workDatabase.setTransactionSuccessful();
                    } else {
                        Logger.get().debug(TAG, String.format("Skipping scheduling %s because JobScheduler is aware of it already.", new Object[]{workSpec.id}), new Throwable[0]);
                    }
                }
                workDatabase.endTransaction();
                i++;
            } catch (Throwable th) {
                workDatabase.endTransaction();
            }
        }
    }

    @VisibleForTesting
    public void scheduleInternal(WorkSpec workSpec, int i) {
        int i2;
        JobInfo convert = this.mSystemJobInfoConverter.convert(workSpec, i);
        Logger.get().debug(TAG, String.format("Scheduling work ID %s Job ID %s", new Object[]{workSpec.id, Integer.valueOf(i)}), new Throwable[0]);
        try {
            this.mJobScheduler.schedule(convert);
        } catch (IllegalStateException e) {
            List<JobInfo> allPendingJobs = this.mJobScheduler.getAllPendingJobs();
            if (allPendingJobs != null) {
                i2 = 0;
                for (JobInfo extras : allPendingJobs) {
                    if (extras.getExtras().getString("EXTRA_WORK_SPEC_ID") != null) {
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.mWorkManager.getWorkDatabase().workSpecDao().getScheduledWork().size()), Integer.valueOf(this.mWorkManager.getConfiguration().getMaxSchedulerLimit())});
            Logger.get().error(TAG, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        }
    }

    public void cancel(@NonNull String str) {
        List<JobInfo> allPendingJobs = this.mJobScheduler.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (str.equals(jobInfo.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(str);
                    this.mJobScheduler.cancel(jobInfo.getId());
                    if (VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    public static void jobSchedulerCancelAll(@NonNull Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs != null) {
                for (JobInfo jobInfo : allPendingJobs) {
                    if (jobInfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                        jobScheduler.cancel(jobInfo.getId());
                    }
                }
            }
        }
    }

    private static JobInfo getPendingJobInfo(@NonNull JobScheduler jobScheduler, @NonNull String str) {
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    String str2 = "EXTRA_WORK_SPEC_ID";
                    if (extras.containsKey(str2) && str.equals(extras.getString(str2))) {
                        return jobInfo;
                    }
                }
            }
        }
        return null;
    }
}
