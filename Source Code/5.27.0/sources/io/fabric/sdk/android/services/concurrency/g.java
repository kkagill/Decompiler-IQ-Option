package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PriorityTask */
public class g implements a<i>, f, i {
    private final List<i> eOc = new ArrayList();
    private final AtomicBoolean eOd = new AtomicBoolean(false);
    private final AtomicReference<Throwable> eOe = new AtomicReference(null);

    public synchronized Collection<i> bjh() {
        return Collections.unmodifiableCollection(this.eOc);
    }

    /* renamed from: a */
    public synchronized void cy(i iVar) {
        this.eOc.add(iVar);
    }

    public boolean bjQ() {
        for (i isFinished : bjh()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void gn(boolean z) {
        this.eOd.set(z);
    }

    public boolean isFinished() {
        return this.eOd.get();
    }

    public Priority fq() {
        return Priority.NORMAL;
    }

    public void Y(Throwable th) {
        this.eOe.set(th);
    }

    public int compareTo(Object obj) {
        return Priority.compareTo(this, obj);
    }

    public static boolean cA(Object obj) {
        try {
            a aVar = (a) obj;
            i iVar = (i) obj;
            f fVar = (f) obj;
            if (aVar == null || iVar == null || fVar == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
