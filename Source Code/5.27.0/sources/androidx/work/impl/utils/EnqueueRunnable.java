package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.work.Constraints;
import androidx.work.Data.Builder;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.Operation.State.FAILURE;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class EnqueueRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
    private final OperationImpl mOperation = new OperationImpl();
    private final WorkContinuationImpl mWorkContinuation;

    public EnqueueRunnable(@NonNull WorkContinuationImpl workContinuationImpl) {
        this.mWorkContinuation = workContinuationImpl;
    }

    public void run() {
        try {
            if (this.mWorkContinuation.hasCycles()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.mWorkContinuation}));
            }
            if (addToDatabase()) {
                PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.mOperation.setState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.setState(new FAILURE(th));
        }
    }

    public Operation getOperation() {
        return this.mOperation;
    }

    @VisibleForTesting
    public boolean addToDatabase() {
        WorkDatabase workDatabase = this.mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean processContinuation = processContinuation(this.mWorkContinuation);
            workDatabase.setTransactionSuccessful();
            return processContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @VisibleForTesting
    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(@NonNull WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        int i = 0;
        if (parents != null) {
            int i2 = 0;
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (workContinuationImpl2.isEnqueued()) {
                    Logger logger = Logger.get();
                    String str = TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.join(", ", workContinuationImpl2.getIds());
                    logger.warning(str, String.format("Already enqueued work ids (%s).", objArr), new Throwable[0]);
                } else {
                    i2 |= processContinuation(workContinuationImpl2);
                }
            }
            i = i2;
        }
        return enqueueContinuation(workContinuationImpl) | i;
    }

    private static boolean enqueueContinuation(@NonNull WorkContinuationImpl workContinuationImpl) {
        boolean enqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuationImpl.getWorkManagerImpl(), workContinuationImpl.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuationImpl).toArray(new String[0]), workContinuationImpl.getName(), workContinuationImpl.getExistingWorkPolicy());
        workContinuationImpl.markEnqueued();
        return enqueueWorkWithPrerequisites;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ae A:{LOOP_END, LOOP:6: B:109:0x01a8->B:111:0x01ae} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d7 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0123  */
    private static boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl r19, @androidx.annotation.NonNull java.util.List<? extends androidx.work.WorkRequest> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.ExistingWorkPolicy r23) {
        /*
        r0 = r19;
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r4 = java.lang.System.currentTimeMillis();
        r6 = r19.getWorkDatabase();
        r8 = 1;
        if (r1 == 0) goto L_0x0018;
    L_0x0013:
        r9 = r1.length;
        if (r9 <= 0) goto L_0x0018;
    L_0x0016:
        r9 = 1;
        goto L_0x0019;
    L_0x0018:
        r9 = 0;
    L_0x0019:
        if (r9 == 0) goto L_0x005d;
    L_0x001b:
        r10 = r1.length;
        r11 = 0;
        r12 = 1;
        r13 = 0;
        r14 = 0;
    L_0x0020:
        if (r11 >= r10) goto L_0x0060;
    L_0x0022:
        r15 = r1[r11];
        r7 = r6.workSpecDao();
        r7 = r7.getWorkSpec(r15);
        if (r7 != 0) goto L_0x0045;
    L_0x002e:
        r0 = androidx.work.Logger.get();
        r1 = TAG;
        r2 = new java.lang.Object[r8];
        r3 = 0;
        r2[r3] = r15;
        r4 = "Prerequisite %s doesn't exist; not enqueuing";
        r2 = java.lang.String.format(r4, r2);
        r4 = new java.lang.Throwable[r3];
        r0.error(r1, r2, r4);
        return r3;
    L_0x0045:
        r7 = r7.state;
        r15 = androidx.work.WorkInfo.State.SUCCEEDED;
        if (r7 != r15) goto L_0x004d;
    L_0x004b:
        r15 = 1;
        goto L_0x004e;
    L_0x004d:
        r15 = 0;
    L_0x004e:
        r12 = r12 & r15;
        r15 = androidx.work.WorkInfo.State.FAILED;
        if (r7 != r15) goto L_0x0055;
    L_0x0053:
        r13 = 1;
        goto L_0x005a;
    L_0x0055:
        r15 = androidx.work.WorkInfo.State.CANCELLED;
        if (r7 != r15) goto L_0x005a;
    L_0x0059:
        r14 = 1;
    L_0x005a:
        r11 = r11 + 1;
        goto L_0x0020;
    L_0x005d:
        r12 = 1;
        r13 = 0;
        r14 = 0;
    L_0x0060:
        r7 = android.text.TextUtils.isEmpty(r22);
        r7 = r7 ^ r8;
        if (r7 == 0) goto L_0x006b;
    L_0x0067:
        if (r9 != 0) goto L_0x006b;
    L_0x0069:
        r10 = 1;
        goto L_0x006c;
    L_0x006b:
        r10 = 0;
    L_0x006c:
        if (r10 == 0) goto L_0x00ce;
    L_0x006e:
        r10 = r6.workSpecDao();
        r10 = r10.getWorkSpecIdAndStatesForName(r2);
        r11 = r10.isEmpty();
        if (r11 != 0) goto L_0x00ce;
    L_0x007c:
        r11 = androidx.work.ExistingWorkPolicy.APPEND;
        if (r3 != r11) goto L_0x00d0;
    L_0x0080:
        r3 = r6.dependencyDao();
        r9 = new java.util.ArrayList;
        r9.<init>();
        r10 = r10.iterator();
    L_0x008d:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x00c2;
    L_0x0093:
        r11 = r10.next();
        r11 = (androidx.work.impl.model.WorkSpec.IdAndState) r11;
        r15 = r11.id;
        r15 = r3.hasDependents(r15);
        if (r15 != 0) goto L_0x00c0;
    L_0x00a1:
        r15 = r11.state;
        r8 = androidx.work.WorkInfo.State.SUCCEEDED;
        if (r15 != r8) goto L_0x00a9;
    L_0x00a7:
        r8 = 1;
        goto L_0x00aa;
    L_0x00a9:
        r8 = 0;
    L_0x00aa:
        r8 = r8 & r12;
        r12 = r11.state;
        r15 = androidx.work.WorkInfo.State.FAILED;
        if (r12 != r15) goto L_0x00b3;
    L_0x00b1:
        r13 = 1;
        goto L_0x00ba;
    L_0x00b3:
        r12 = r11.state;
        r15 = androidx.work.WorkInfo.State.CANCELLED;
        if (r12 != r15) goto L_0x00ba;
    L_0x00b9:
        r14 = 1;
    L_0x00ba:
        r11 = r11.id;
        r9.add(r11);
        r12 = r8;
    L_0x00c0:
        r8 = 1;
        goto L_0x008d;
    L_0x00c2:
        r1 = r9.toArray(r1);
        r1 = (java.lang.String[]) r1;
        r3 = r1.length;
        if (r3 <= 0) goto L_0x00cd;
    L_0x00cb:
        r9 = 1;
        goto L_0x00ce;
    L_0x00cd:
        r9 = 0;
    L_0x00ce:
        r3 = 0;
        goto L_0x0117;
    L_0x00d0:
        r8 = androidx.work.ExistingWorkPolicy.KEEP;
        if (r3 != r8) goto L_0x00f2;
    L_0x00d4:
        r3 = r10.iterator();
    L_0x00d8:
        r8 = r3.hasNext();
        if (r8 == 0) goto L_0x00f2;
    L_0x00de:
        r8 = r3.next();
        r8 = (androidx.work.impl.model.WorkSpec.IdAndState) r8;
        r11 = r8.state;
        r15 = androidx.work.WorkInfo.State.ENQUEUED;
        if (r11 == r15) goto L_0x00f0;
    L_0x00ea:
        r8 = r8.state;
        r11 = androidx.work.WorkInfo.State.RUNNING;
        if (r8 != r11) goto L_0x00d8;
    L_0x00f0:
        r3 = 0;
        return r3;
    L_0x00f2:
        r3 = 0;
        r8 = androidx.work.impl.utils.CancelWorkRunnable.forName(r2, r0, r3);
        r8.run();
        r8 = r6.workSpecDao();
        r10 = r10.iterator();
    L_0x0102:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x0114;
    L_0x0108:
        r11 = r10.next();
        r11 = (androidx.work.impl.model.WorkSpec.IdAndState) r11;
        r11 = r11.id;
        r8.delete(r11);
        goto L_0x0102;
    L_0x0114:
        r16 = 1;
        goto L_0x0119;
    L_0x0117:
        r16 = 0;
    L_0x0119:
        r8 = r20.iterator();
    L_0x011d:
        r10 = r8.hasNext();
        if (r10 == 0) goto L_0x01dc;
    L_0x0123:
        r10 = r8.next();
        r10 = (androidx.work.WorkRequest) r10;
        r11 = r10.getWorkSpec();
        if (r9 == 0) goto L_0x0144;
    L_0x012f:
        if (r12 != 0) goto L_0x0144;
    L_0x0131:
        if (r13 == 0) goto L_0x0138;
    L_0x0133:
        r15 = androidx.work.WorkInfo.State.FAILED;
        r11.state = r15;
        goto L_0x014c;
    L_0x0138:
        if (r14 == 0) goto L_0x013f;
    L_0x013a:
        r15 = androidx.work.WorkInfo.State.CANCELLED;
        r11.state = r15;
        goto L_0x014c;
    L_0x013f:
        r15 = androidx.work.WorkInfo.State.BLOCKED;
        r11.state = r15;
        goto L_0x014c;
    L_0x0144:
        r15 = r11.isPeriodic();
        if (r15 != 0) goto L_0x014f;
    L_0x014a:
        r11.periodStartTime = r4;
    L_0x014c:
        r17 = r4;
        goto L_0x0155;
    L_0x014f:
        r17 = r4;
        r3 = 0;
        r11.periodStartTime = r3;
    L_0x0155:
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 23;
        if (r3 < r4) goto L_0x0165;
    L_0x015b:
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 25;
        if (r3 > r4) goto L_0x0165;
    L_0x0161:
        tryDelegateConstrainedWorkSpec(r11);
        goto L_0x0176;
    L_0x0165:
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 22;
        if (r3 > r4) goto L_0x0176;
    L_0x016b:
        r3 = "androidx.work.impl.background.gcm.GcmScheduler";
        r3 = usesScheduler(r0, r3);
        if (r3 == 0) goto L_0x0176;
    L_0x0173:
        tryDelegateConstrainedWorkSpec(r11);
    L_0x0176:
        r3 = r11.state;
        r4 = androidx.work.WorkInfo.State.ENQUEUED;
        if (r3 != r4) goto L_0x017e;
    L_0x017c:
        r16 = 1;
    L_0x017e:
        r3 = r6.workSpecDao();
        r3.insertWorkSpec(r11);
        if (r9 == 0) goto L_0x01a0;
    L_0x0187:
        r3 = r1.length;
        r4 = 0;
    L_0x0189:
        if (r4 >= r3) goto L_0x01a0;
    L_0x018b:
        r5 = r1[r4];
        r11 = new androidx.work.impl.model.Dependency;
        r15 = r10.getStringId();
        r11.<init>(r15, r5);
        r5 = r6.dependencyDao();
        r5.insertDependency(r11);
        r4 = r4 + 1;
        goto L_0x0189;
    L_0x01a0:
        r3 = r10.getTags();
        r3 = r3.iterator();
    L_0x01a8:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x01c5;
    L_0x01ae:
        r4 = r3.next();
        r4 = (java.lang.String) r4;
        r5 = r6.workTagDao();
        r11 = new androidx.work.impl.model.WorkTag;
        r15 = r10.getStringId();
        r11.<init>(r4, r15);
        r5.insert(r11);
        goto L_0x01a8;
    L_0x01c5:
        if (r7 == 0) goto L_0x01d7;
    L_0x01c7:
        r3 = r6.workNameDao();
        r4 = new androidx.work.impl.model.WorkName;
        r5 = r10.getStringId();
        r4.<init>(r2, r5);
        r3.insert(r4);
    L_0x01d7:
        r4 = r17;
        r3 = 0;
        goto L_0x011d;
    L_0x01dc:
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.EnqueueRunnable.enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private static void tryDelegateConstrainedWorkSpec(WorkSpec workSpec) {
        Constraints constraints = workSpec.constraints;
        if (constraints.requiresBatteryNotLow() || constraints.requiresStorageNotLow()) {
            String str = workSpec.workerClassName;
            Builder builder = new Builder();
            builder.putAll(workSpec.input).putString(ConstraintTrackingWorker.ARGUMENT_CLASS_NAME, str);
            workSpec.workerClassName = ConstraintTrackingWorker.class.getName();
            workSpec.input = builder.build();
        }
    }

    private static boolean usesScheduler(@NonNull WorkManagerImpl workManagerImpl, @NonNull String str) {
        try {
            Class cls = Class.forName(str);
            for (Scheduler scheduler : workManagerImpl.getSchedulers()) {
                if (cls.isAssignableFrom(scheduler.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
