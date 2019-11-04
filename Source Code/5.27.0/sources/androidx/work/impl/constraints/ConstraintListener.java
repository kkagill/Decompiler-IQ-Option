package androidx.work.impl.constraints;

import androidx.annotation.Nullable;

public interface ConstraintListener<T> {
    void onConstraintChanged(@Nullable T t);
}
