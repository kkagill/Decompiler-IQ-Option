package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.Operation.State;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation.State.SUCCESS;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.t;

@RestrictTo({Scope.LIBRARY_GROUP})
public class OperationImpl implements Operation {
    private final SettableFuture<SUCCESS> mOperationFuture = SettableFuture.create();
    private final MutableLiveData<State> mOperationState = new MutableLiveData();

    public OperationImpl() {
        setState(Operation.IN_PROGRESS);
    }

    @NonNull
    public t<SUCCESS> getResult() {
        return this.mOperationFuture;
    }

    @NonNull
    public LiveData<State> getState() {
        return this.mOperationState;
    }

    public void setState(@NonNull State state) {
        this.mOperationState.postValue(state);
        if (state instanceof SUCCESS) {
            this.mOperationFuture.set((SUCCESS) state);
        } else if (state instanceof FAILURE) {
            this.mOperationFuture.setException(((FAILURE) state).getThrowable());
        }
    }
}
