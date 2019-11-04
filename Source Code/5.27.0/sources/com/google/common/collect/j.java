package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: ForwardingCollection */
public abstract class j<E> extends o implements Collection<E> {
    /* renamed from: sv */
    public abstract Collection<E> qK();

    protected j() {
    }

    public Iterator<E> iterator() {
        return qK().iterator();
    }

    public int size() {
        return qK().size();
    }

    public boolean removeAll(Collection<?> collection) {
        return qK().removeAll(collection);
    }

    public boolean isEmpty() {
        return qK().isEmpty();
    }

    public boolean contains(Object obj) {
        return qK().contains(obj);
    }

    public boolean add(E e) {
        return qK().add(e);
    }

    public boolean remove(Object obj) {
        return qK().remove(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return qK().containsAll(collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return qK().addAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return qK().retainAll(collection);
    }

    public void clear() {
        qK().clear();
    }

    public Object[] toArray() {
        return qK().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return qK().toArray(tArr);
    }

    /* Access modifiers changed, original: protected */
    public boolean k(Collection<?> collection) {
        return h.a((Collection) this, (Collection) collection);
    }

    /* Access modifiers changed, original: protected */
    public boolean l(Collection<?> collection) {
        return t.a(iterator(), (Collection) collection);
    }
}
