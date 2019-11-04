package com.google.common.collect;

import com.google.common.base.d;
import com.google.common.base.i;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Collections2 */
public final class h {

    /* compiled from: Collections2 */
    static class a<F, T> extends AbstractCollection<T> {
        final Collection<F> Vs;
        final d<? super F, ? extends T> function;

        a(Collection<F> collection, d<? super F, ? extends T> dVar) {
            this.Vs = (Collection) i.checkNotNull(collection);
            this.function = (d) i.checkNotNull(dVar);
        }

        public void clear() {
            this.Vs.clear();
        }

        public boolean isEmpty() {
            return this.Vs.isEmpty();
        }

        public Iterator<T> iterator() {
            return t.a(this.Vs.iterator(), this.function);
        }

        public int size() {
            return this.Vs.size();
        }
    }

    static boolean a(Collection<?> collection, Object obj) {
        i.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean b(Collection<?> collection, Object obj) {
        i.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <F, T> Collection<T> a(Collection<F> collection, d<? super F, T> dVar) {
        return new a(collection, dVar);
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder bz(int i) {
        g.b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    static <T> Collection<T> a(Iterable<T> iterable) {
        return (Collection) iterable;
    }
}
