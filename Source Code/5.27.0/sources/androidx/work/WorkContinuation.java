package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.t;
import java.util.Collections;
import java.util.List;

public abstract class WorkContinuation {
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract WorkContinuation combineInternal(@NonNull List<WorkContinuation> list);

    @NonNull
    public abstract Operation enqueue();

    @NonNull
    public abstract t<List<WorkInfo>> getWorkInfos();

    @NonNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData();

    @NonNull
    public abstract WorkContinuation then(@NonNull List<OneTimeWorkRequest> list);

    @NonNull
    public final WorkContinuation then(@NonNull OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    @NonNull
    public static WorkContinuation combine(@NonNull List<WorkContinuation> list) {
        return ((WorkContinuation) list.get(0)).combineInternal(list);
    }
}
