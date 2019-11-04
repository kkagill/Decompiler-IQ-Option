package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: PriorityFutureTask */
public class e<V> extends FutureTask<V> implements a<i>, f, i {
    final Object delegate;

    public e(Callable<V> callable) {
        super(callable);
        this.delegate = cz(callable);
    }

    public e(Runnable runnable, V v) {
        super(runnable, v);
        this.delegate = cz(runnable);
    }

    public int compareTo(Object obj) {
        return ((f) bjV()).compareTo(obj);
    }

    /* renamed from: a */
    public void cy(i iVar) {
        ((a) ((f) bjV())).cy(iVar);
    }

    public Collection<i> bjh() {
        return ((a) ((f) bjV())).bjh();
    }

    public boolean bjQ() {
        return ((a) ((f) bjV())).bjQ();
    }

    public Priority fq() {
        return ((f) bjV()).fq();
    }

    public void gn(boolean z) {
        ((i) ((f) bjV())).gn(z);
    }

    public boolean isFinished() {
        return ((i) ((f) bjV())).isFinished();
    }

    public void Y(Throwable th) {
        ((i) ((f) bjV())).Y(th);
    }

    public <T extends a<i> & f & i> T bjV() {
        return (a) this.delegate;
    }

    /* Access modifiers changed, original: protected */
    public <T extends a<i> & f & i> T cz(Object obj) {
        if (g.cA(obj)) {
            return (a) obj;
        }
        return new g();
    }
}
