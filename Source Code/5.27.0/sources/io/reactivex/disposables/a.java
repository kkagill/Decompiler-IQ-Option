package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.a.b;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.e;
import java.util.ArrayList;

/* compiled from: CompositeDisposable */
public final class a implements b, io.reactivex.internal.disposables.a {
    volatile boolean eQm;
    e<b> eQs;

    public void dispose() {
        if (!this.eQm) {
            synchronized (this) {
                if (this.eQm) {
                    return;
                }
                this.eQm = true;
                e eVar = this.eQs;
                this.eQs = null;
                a(eVar);
            }
        }
    }

    public boolean isDisposed() {
        return this.eQm;
    }

    public boolean e(b bVar) {
        b.requireNonNull(bVar, "disposable is null");
        if (!this.eQm) {
            synchronized (this) {
                if (!this.eQm) {
                    e eVar = this.eQs;
                    if (eVar == null) {
                        eVar = new e();
                        this.eQs = eVar;
                    }
                    eVar.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public boolean f(b bVar) {
        if (!g(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    /* JADX WARNING: Missing block: B:18:0x0021, code skipped:
            return false;
     */
    public boolean g(io.reactivex.disposables.b r3) {
        /*
        r2 = this;
        r0 = "disposables is null";
        io.reactivex.internal.a.b.requireNonNull(r3, r0);
        r0 = r2.eQm;
        r1 = 0;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        monitor-enter(r2);
        r0 = r2.eQm;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0012;
    L_0x0010:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        return r1;
    L_0x0012:
        r0 = r2.eQs;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0020;
    L_0x0016:
        r3 = r0.remove(r3);	 Catch:{ all -> 0x0022 }
        if (r3 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0020;
    L_0x001d:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        r3 = 1;
        return r3;
    L_0x0020:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        return r1;
    L_0x0022:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.a.g(io.reactivex.disposables.b):boolean");
    }

    public void clear() {
        if (!this.eQm) {
            synchronized (this) {
                if (this.eQm) {
                    return;
                }
                e eVar = this.eQs;
                this.eQs = null;
                a(eVar);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(e<b> eVar) {
        if (eVar != null) {
            Iterable iterable = null;
            for (Object obj : eVar.bmD()) {
                if (obj instanceof b) {
                    try {
                        ((b) obj).dispose();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.ad(th);
                        if (iterable == null) {
                            iterable = new ArrayList();
                        }
                        iterable.add(th);
                    }
                }
            }
            if (iterable == null) {
                return;
            }
            if (iterable.size() == 1) {
                throw ExceptionHelper.aj((Throwable) iterable.get(0));
            }
            throw new CompositeException(iterable);
        }
    }
}
