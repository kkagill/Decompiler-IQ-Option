package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.concurrent.Executor;

@RestrictTo({Scope.LIBRARY_GROUP})
enum DirectExecutor implements Executor {
    INSTANCE;

    public String toString() {
        return "DirectExecutor";
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
