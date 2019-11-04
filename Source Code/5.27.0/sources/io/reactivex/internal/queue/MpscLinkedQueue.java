package io.reactivex.internal.queue;

import io.reactivex.internal.b.g;
import java.util.concurrent.atomic.AtomicReference;

public final class MpscLinkedQueue<T> implements g<T> {
    private final AtomicReference<LinkedQueueNode<T>> eSA = new AtomicReference();
    private final AtomicReference<LinkedQueueNode<T>> eSB = new AtomicReference();

    static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e) {
            cU(e);
        }

        public E bmg() {
            Object bmh = bmh();
            cU(null);
            return bmh;
        }

        public E bmh() {
            return this.value;
        }

        public void cU(E e) {
            this.value = e;
        }

        public void c(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public LinkedQueueNode<E> bmi() {
            return (LinkedQueueNode) get();
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        b(linkedQueueNode);
        a(linkedQueueNode);
    }

    public boolean offer(T t) {
        if (t != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(t);
            a(linkedQueueNode).c(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T poll() {
        LinkedQueueNode bmf = bmf();
        LinkedQueueNode bmi = bmf.bmi();
        Object bmg;
        if (bmi != null) {
            bmg = bmi.bmg();
            b(bmi);
            return bmg;
        } else if (bmf == bmd()) {
            return null;
        } else {
            while (true) {
                bmi = bmf.bmi();
                if (bmi != null) {
                    bmg = bmi.bmg();
                    b(bmi);
                    return bmg;
                }
            }
        }
    }

    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* Access modifiers changed, original: 0000 */
    public LinkedQueueNode<T> bmd() {
        return (LinkedQueueNode) this.eSA.get();
    }

    /* Access modifiers changed, original: 0000 */
    public LinkedQueueNode<T> a(LinkedQueueNode<T> linkedQueueNode) {
        return (LinkedQueueNode) this.eSA.getAndSet(linkedQueueNode);
    }

    /* Access modifiers changed, original: 0000 */
    public LinkedQueueNode<T> bme() {
        return (LinkedQueueNode) this.eSB.get();
    }

    /* Access modifiers changed, original: 0000 */
    public LinkedQueueNode<T> bmf() {
        return (LinkedQueueNode) this.eSB.get();
    }

    /* Access modifiers changed, original: 0000 */
    public void b(LinkedQueueNode<T> linkedQueueNode) {
        this.eSB.lazySet(linkedQueueNode);
    }

    public boolean isEmpty() {
        return bme() == bmd();
    }
}
