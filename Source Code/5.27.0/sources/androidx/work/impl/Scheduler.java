package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.work.impl.model.WorkSpec;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface Scheduler {
    public static final int MAX_SCHEDULER_LIMIT = 50;

    void cancel(@NonNull String str);

    void schedule(WorkSpec... workSpecArr);
}
