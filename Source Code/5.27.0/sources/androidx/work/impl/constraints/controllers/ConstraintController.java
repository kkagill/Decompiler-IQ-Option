package androidx.work.impl.constraints.controllers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

public abstract class ConstraintController<T> implements ConstraintListener<T> {
    private OnConstraintUpdatedCallback mCallback;
    private T mCurrentValue;
    private final List<String> mMatchingWorkSpecIds = new ArrayList();
    private ConstraintTracker<T> mTracker;

    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(@NonNull List<String> list);

        void onConstraintNotMet(@NonNull List<String> list);
    }

    public abstract boolean hasConstraint(@NonNull WorkSpec workSpec);

    public abstract boolean isConstrained(@NonNull T t);

    ConstraintController(ConstraintTracker<T> constraintTracker) {
        this.mTracker = constraintTracker;
    }

    public void setCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.mCallback != onConstraintUpdatedCallback) {
            this.mCallback = onConstraintUpdatedCallback;
            updateCallback();
        }
    }

    public void replace(@NonNull List<WorkSpec> list) {
        this.mMatchingWorkSpecIds.clear();
        for (WorkSpec workSpec : list) {
            if (hasConstraint(workSpec)) {
                this.mMatchingWorkSpecIds.add(workSpec.id);
            }
        }
        if (this.mMatchingWorkSpecIds.isEmpty()) {
            this.mTracker.removeListener(this);
        } else {
            this.mTracker.addListener(this);
        }
        updateCallback();
    }

    public void reset() {
        if (!this.mMatchingWorkSpecIds.isEmpty()) {
            this.mMatchingWorkSpecIds.clear();
            this.mTracker.removeListener(this);
        }
    }

    public boolean isWorkSpecConstrained(@NonNull String str) {
        Object obj = this.mCurrentValue;
        return obj != null && isConstrained(obj) && this.mMatchingWorkSpecIds.contains(str);
    }

    private void updateCallback() {
        if (!this.mMatchingWorkSpecIds.isEmpty() && this.mCallback != null) {
            Object obj = this.mCurrentValue;
            if (obj == null || isConstrained(obj)) {
                this.mCallback.onConstraintNotMet(this.mMatchingWorkSpecIds);
            } else {
                this.mCallback.onConstraintMet(this.mMatchingWorkSpecIds);
            }
        }
    }

    public void onConstraintChanged(@Nullable T t) {
        this.mCurrentValue = t;
        updateCallback();
    }
}
