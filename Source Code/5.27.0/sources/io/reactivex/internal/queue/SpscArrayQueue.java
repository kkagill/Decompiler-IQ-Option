package io.reactivex.internal.queue;

import io.reactivex.internal.b.g;
import io.reactivex.internal.util.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements g<E> {
    private static final Integer eSC = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex = new AtomicLong();
    final int lookAheadStep;
    final int mask = (length() - 1);
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;

    /* Access modifiers changed, original: 0000 */
    public int d(long j, int i) {
        return ((int) j) & i;
    }

    public SpscArrayQueue(int i) {
        super(f.jF(i));
        this.lookAheadStep = Math.min(i / 4, eSC.intValue());
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.mask;
            long j = this.producerIndex.get();
            int d = d(j, i);
            if (j >= this.producerLookAhead) {
                long j2 = ((long) this.lookAheadStep) + j;
                if (jz(d(j2, i)) == null) {
                    this.producerLookAhead = j2;
                } else if (jz(d) != null) {
                    return false;
                }
            }
            b(d, e);
            cX(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.consumerIndex.get();
        int cZ = cZ(j);
        Object jz = jz(cZ);
        if (jz == null) {
            return null;
        }
        cY(j + 1);
        b(cZ, null);
        return jz;
    }

    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    /* Access modifiers changed, original: 0000 */
    public void cX(long j) {
        this.producerIndex.lazySet(j);
    }

    /* Access modifiers changed, original: 0000 */
    public void cY(long j) {
        this.consumerIndex.lazySet(j);
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

    /* Access modifiers changed, original: 0000 */
    public int cZ(long j) {
        return this.mask & ((int) j);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(int i, E e) {
        lazySet(i, e);
    }

    /* Access modifiers changed, original: 0000 */
    public E jz(int i) {
        return get(i);
    }
}
