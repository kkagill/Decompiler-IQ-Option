package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.t;

public interface Operation {
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final IN_PROGRESS IN_PROGRESS = new IN_PROGRESS();
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final SUCCESS SUCCESS = new SUCCESS();

    public static abstract class State {

        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            public FAILURE(@NonNull Throwable th) {
                this.mThrowable = th;
            }

            @NonNull
            public Throwable getThrowable() {
                return this.mThrowable;
            }

            @NonNull
            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.mThrowable.getMessage()});
            }
        }

        public static final class IN_PROGRESS extends State {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            private IN_PROGRESS() {
            }
        }

        public static final class SUCCESS extends State {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            private SUCCESS() {
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        State() {
        }
    }

    @NonNull
    t<SUCCESS> getResult();

    @NonNull
    LiveData<State> getState();
}
