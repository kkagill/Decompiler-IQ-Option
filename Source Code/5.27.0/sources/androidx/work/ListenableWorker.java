package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    @NonNull
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class Result {

        @RestrictTo({Scope.LIBRARY_GROUP})
        public static final class Failure extends Result {
            private final Data mOutputData;

            public Failure() {
                this(Data.EMPTY);
            }

            public Failure(@NonNull Data data) {
                this.mOutputData = data;
            }

            @RestrictTo({Scope.LIBRARY_GROUP})
            public Data getOutputData() {
                return this.mOutputData;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((Failure) obj).mOutputData);
            }

            public int hashCode() {
                return (Failure.class.getName().hashCode() * 31) + this.mOutputData.hashCode();
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failure {mOutputData=");
                stringBuilder.append(this.mOutputData);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public static final class Retry extends Result {
            public String toString() {
                return "Retry";
            }

            public boolean equals(Object obj) {
                boolean z = true;
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    z = false;
                }
                return z;
            }

            public int hashCode() {
                return Retry.class.getName().hashCode();
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public static final class Success extends Result {
            private final Data mOutputData;

            public Success() {
                this(Data.EMPTY);
            }

            public Success(@NonNull Data data) {
                this.mOutputData = data;
            }

            @RestrictTo({Scope.LIBRARY_GROUP})
            public Data getOutputData() {
                return this.mOutputData;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((Success) obj).mOutputData);
            }

            public int hashCode() {
                return (Success.class.getName().hashCode() * 31) + this.mOutputData.hashCode();
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Success {mOutputData=");
                stringBuilder.append(this.mOutputData);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        @NonNull
        public static Result success() {
            return new Success();
        }

        @NonNull
        public static Result success(@NonNull Data data) {
            return new Success(data);
        }

        @NonNull
        public static Result retry() {
            return new Retry();
        }

        @NonNull
        public static Result failure() {
            return new Failure();
        }

        @NonNull
        public static Result failure(@NonNull Data data) {
            return new Failure(data);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        Result() {
        }
    }

    public void onStopped() {
    }

    @MainThread
    @NonNull
    public abstract t<Result> startWork();

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.getId();
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.getInputData();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.getTags();
    }

    @RequiresApi(24)
    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.getTriggeredContentUris();
    }

    @RequiresApi(24)
    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.getTriggeredContentAuthorities();
    }

    @RequiresApi(28)
    @Nullable
    public final Network getNetwork() {
        return this.mWorkerParams.getNetwork();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.getRunAttemptCount();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.getBackgroundExecutor();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.getTaskExecutor();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.getWorkerFactory();
    }
}
