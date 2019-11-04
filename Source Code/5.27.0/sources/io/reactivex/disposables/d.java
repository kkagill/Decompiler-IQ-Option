package io.reactivex.disposables;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SerialDisposable */
public final class d implements b {
    final AtomicReference<b> resource = new AtomicReference();

    public boolean h(b bVar) {
        return DisposableHelper.set(this.resource, bVar);
    }

    public void dispose() {
        DisposableHelper.dispose(this.resource);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((b) this.resource.get());
    }
}
