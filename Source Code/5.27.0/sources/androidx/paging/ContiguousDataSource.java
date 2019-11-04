package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

abstract class ContiguousDataSource<Key, Value> extends DataSource<Key, Value> {
    public abstract void dispatchLoadAfter(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull Receiver<Value> receiver);

    public abstract void dispatchLoadBefore(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull Receiver<Value> receiver);

    public abstract void dispatchLoadInitial(@Nullable Key key, int i, int i2, boolean z, @NonNull Executor executor, @NonNull Receiver<Value> receiver);

    public abstract Key getKey(int i, Value value);

    /* Access modifiers changed, original: 0000 */
    public boolean isContiguous() {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean supportsPageDropping() {
        return true;
    }

    ContiguousDataSource() {
    }
}
