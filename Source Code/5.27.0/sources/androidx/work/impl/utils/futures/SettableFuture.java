package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.google.common.util.concurrent.t;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class SettableFuture<V> extends AbstractFuture<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture();
    }

    public boolean set(@Nullable V v) {
        return super.set(v);
    }

    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    public boolean setFuture(t<? extends V> tVar) {
        return super.setFuture(tVar);
    }

    private SettableFuture() {
    }
}
