package com.google.common.collect;

import com.google.common.base.i;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> extends aj<T> {
    private T RL;
    private State UO = State.NOT_READY;

    /* renamed from: com.google.common.collect.AbstractIterator$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] UQ = new int[State.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.google.common.collect.AbstractIterator.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            UQ = r0;
            r0 = UQ;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.common.collect.AbstractIterator.State.DONE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = UQ;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.common.collect.AbstractIterator.State.READY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractIterator$AnonymousClass1.<clinit>():void");
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
        this.UO = State.DONE;
        return null;
    }

    public final boolean hasNext() {
        i.checkState(this.UO != State.FAILED);
        int i = AnonymousClass1.UQ[this.UO.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return pQ();
        }
        return true;
    }

    private boolean pQ() {
        this.UO = State.FAILED;
        this.RL = pO();
        if (this.UO == State.DONE) {
            return false;
        }
        this.UO = State.READY;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.UO = State.NOT_READY;
            Object obj = this.RL;
            this.RL = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
