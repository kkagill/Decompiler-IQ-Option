package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AbstractMultiset */
abstract class d<E> extends AbstractCollection<E> implements x<E> {
    private transient Set<com.google.common.collect.x.a<E>> Tz;
    private transient Set<E> Vo;

    /* compiled from: AbstractMultiset */
    class a extends b<E> {
        a() {
        }

        /* Access modifiers changed, original: 0000 */
        public x<E> sj() {
            return d.this;
        }

        public Iterator<E> iterator() {
            return d.this.sc();
        }
    }

    /* compiled from: AbstractMultiset */
    class b extends c<E> {
        b() {
        }

        /* Access modifiers changed, original: 0000 */
        public x<E> sj() {
            return d.this;
        }

        public Iterator<com.google.common.collect.x.a<E>> iterator() {
            return d.this.sd();
        }

        public int size() {
            return d.this.se();
        }
    }

    public abstract Iterator<E> sc();

    public abstract Iterator<com.google.common.collect.x.a<E>> sd();

    public abstract int se();

    d() {
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public final boolean add(E e) {
        e(e, 1);
        return true;
    }

    public int e(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        return f(obj, 1) > 0;
    }

    public int f(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int g(E e, int i) {
        return Multisets.a(this, e, i);
    }

    public boolean a(E e, int i, int i2) {
        return Multisets.a(this, e, i, i2);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.a((x) this, (Collection) collection);
    }

    public final boolean removeAll(Collection<?> collection) {
        return Multisets.b(this, collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return Multisets.c(this, collection);
    }

    public Set<E> sh() {
        Set<E> set = this.Vo;
        if (set != null) {
            return set;
        }
        Set si = si();
        this.Vo = si;
        return si;
    }

    /* Access modifiers changed, original: 0000 */
    public Set<E> si() {
        return new a();
    }

    public Set<com.google.common.collect.x.a<E>> entrySet() {
        Set<com.google.common.collect.x.a<E>> set = this.Tz;
        if (set != null) {
            return set;
        }
        Set rN = rN();
        this.Tz = rN;
        return rN;
    }

    /* Access modifiers changed, original: 0000 */
    public Set<com.google.common.collect.x.a<E>> rN() {
        return new b();
    }

    public final boolean equals(Object obj) {
        return Multisets.a((x) this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final String toString() {
        return entrySet().toString();
    }
}
