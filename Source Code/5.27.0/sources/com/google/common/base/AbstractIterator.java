package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractIterator<T> implements Iterator<T> {
    private State RK = State.NOT_READY;
    private T RL;

    /* renamed from: com.google.common.base.AbstractIterator$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] RM = new int[State.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.google.common.base.AbstractIterator.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            RM = r0;
            r0 = RM;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.common.base.AbstractIterator.State.READY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = RM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.common.base.AbstractIterator.State.DONE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractIterator$AnonymousClass1.<clinit>():void");
        }
    }

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T pO();

    protected AbstractIterator() {
    }

    /* Access modifiers changed, original: protected|final */
    public final T pP() {
        this.RK = State.DONE;
        return null;
    }

    public final boolean hasNext() {
        i.checkState(this.RK != State.FAILED);
        int i = AnonymousClass1.RM[this.RK.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return pQ();
        }
        return false;
    }

    private boolean pQ() {
        this.RK = State.FAILED;
        this.RL = pO();
        if (this.RK == State.DONE) {
            return false;
        }
        this.RK = State.READY;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.RK = State.NOT_READY;
            Object obj = this.RL;
            this.RL = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
