package io.reactivex.internal.queue;

import io.reactivex.internal.b.g;
import io.reactivex.internal.util.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscLinkedArrayQueue */
public final class a<T> implements g<T> {
    static final int eSD = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object eSJ = new Object();
    final AtomicLong consumerIndex = new AtomicLong();
    int eSE;
    final int eSF;
    AtomicReferenceArray<Object> eSG;
    final int eSH;
    AtomicReferenceArray<Object> eSI;
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;

    private static int jB(int i) {
        return i;
    }

    public a(int i) {
        i = f.jF(Math.max(8, i));
        int i2 = i - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
        this.eSG = atomicReferenceArray;
        this.eSF = i2;
        jA(i);
        this.eSI = atomicReferenceArray;
        this.eSH = i2;
        this.producerLookAhead = (long) (i2 - 1);
        cX(0);
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray atomicReferenceArray = this.eSG;
            long bml = bml();
            int i = this.eSF;
            int e = e(bml, i);
            if (bml < this.producerLookAhead) {
                return a(atomicReferenceArray, t, bml, e);
            }
            long j = ((long) this.eSE) + bml;
            if (b(atomicReferenceArray, e(j, i)) == null) {
                this.producerLookAhead = j - 1;
                return a(atomicReferenceArray, t, bml, e);
            } else if (b(atomicReferenceArray, e(1 + bml, i)) == null) {
                return a(atomicReferenceArray, t, bml, e);
            } else {
                a(atomicReferenceArray, bml, e, t, (long) i);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        a((AtomicReferenceArray) atomicReferenceArray, i, (Object) t);
        cX(j + 1);
        return true;
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.eSG = atomicReferenceArray2;
        this.producerLookAhead = (j2 + j) - 1;
        a(atomicReferenceArray2, i, (Object) t);
        a((AtomicReferenceArray) atomicReferenceArray, atomicReferenceArray2);
        a((AtomicReferenceArray) atomicReferenceArray, i, eSJ);
        cX(j + 1);
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        a((AtomicReferenceArray) atomicReferenceArray, jB(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    private AtomicReferenceArray<Object> a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        i = jB(i);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) b(atomicReferenceArray, i);
        a((AtomicReferenceArray) atomicReferenceArray, i, null);
        return atomicReferenceArray2;
    }

    public T poll() {
        AtomicReferenceArray atomicReferenceArray = this.eSI;
        long bmm = bmm();
        int i = this.eSH;
        int e = e(bmm, i);
        Object b = b(atomicReferenceArray, e);
        Object obj = b == eSJ ? 1 : null;
        if (b != null && obj == null) {
            a(atomicReferenceArray, e, null);
            cY(bmm + 1);
            return b;
        } else if (obj != null) {
            return a(a(atomicReferenceArray, i + 1), bmm, i);
        } else {
            return null;
        }
    }

    private T a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.eSI = atomicReferenceArray;
        i = e(j, i);
        Object b = b(atomicReferenceArray, i);
        if (b != null) {
            a((AtomicReferenceArray) atomicReferenceArray, i, null);
            cY(j + 1);
        }
        return b;
    }

    public void clear() {
        while (true) {
            if (poll() == null) {
                if (isEmpty()) {
                    return;
                }
            }
        }
    }

    public boolean isEmpty() {
        return bmj() == bmk();
    }

    private void jA(int i) {
        this.eSE = Math.min(i / 4, eSD);
    }

    private long bmj() {
        return this.producerIndex.get();
    }

    private long bmk() {
        return this.consumerIndex.get();
    }

    private long bml() {
        return this.producerIndex.get();
    }

    private long bmm() {
        return this.consumerIndex.get();
    }

    private void cX(long j) {
        this.producerIndex.lazySet(j);
    }

    private void cY(long j) {
        this.consumerIndex.lazySet(j);
    }

    private static int e(long j, int i) {
        return jB(((int) j) & i);
    }

    private static void a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private static <E> Object b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public boolean offer(T t, T t2) {
        AtomicReferenceArray atomicReferenceArray = this.eSG;
        long bmj = bmj();
        int i = this.eSF;
        long j = 2 + bmj;
        int e;
        if (b(atomicReferenceArray, e(j, i)) == null) {
            e = e(bmj, i);
            a(atomicReferenceArray, e + 1, (Object) t2);
            a(atomicReferenceArray, e, (Object) t);
            cX(j);
        } else {
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.eSG = atomicReferenceArray2;
            e = e(bmj, i);
            a(atomicReferenceArray2, e + 1, (Object) t2);
            a(atomicReferenceArray2, e, (Object) t);
            a(atomicReferenceArray, atomicReferenceArray2);
            a(atomicReferenceArray, e, eSJ);
            cX(j);
        }
        return true;
    }
}
