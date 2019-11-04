package com.google.common.collect;

import com.google.common.base.i;
import java.util.Iterator;

/* compiled from: TransformedIterator */
abstract class ah<F, T> implements Iterator<T> {
    final Iterator<? extends F> XS;

    public abstract T aW(F f);

    ah(Iterator<? extends F> it) {
        this.XS = (Iterator) i.checkNotNull(it);
    }

    public final boolean hasNext() {
        return this.XS.hasNext();
    }

    public final T next() {
        return aW(this.XS.next());
    }

    public final void remove() {
        this.XS.remove();
    }
}
