package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.work.Operation;
import androidx.work.Operation.State.FAILURE;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo({Scope.LIBRARY_GROUP})
public class PruneWorkRunnable implements Runnable {
    private final OperationImpl mOperation = new OperationImpl();
    private final WorkManagerImpl mWorkManagerImpl;

    public PruneWorkRunnable(WorkManagerImpl workManagerImpl) {
        this.mWorkManagerImpl = workManagerImpl;
    }

    public Operation getOperation() {
        return this.mOperation;
    }

    public void run() {
        try {
            this.mWorkManagerImpl.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            this.mOperation.setState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.setState(new FAILURE(th));
        }
    }
}
