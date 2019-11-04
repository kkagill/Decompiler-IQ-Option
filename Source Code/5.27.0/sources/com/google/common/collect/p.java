package com.google.common.collect;

import com.google.common.base.i;
import java.util.Collection;
import java.util.Set;

/* compiled from: ForwardingSet */
public abstract class p<E> extends j<E> implements Set<E> {
    /* renamed from: su */
    public abstract Set<E> sv();

    protected p() {
    }

    public boolean equals(Object obj) {
        return obj == this || sv().equals(obj);
    }

    public int hashCode() {
        return sv().hashCode();
    }

    /* Access modifiers changed, original: protected */
    public boolean l(Collection<?> collection) {
        return Sets.a((Set) this, (Collection) i.checkNotNull(collection));
    }
}
