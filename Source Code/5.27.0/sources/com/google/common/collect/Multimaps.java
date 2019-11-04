package com.google.common.collect;

import com.google.common.base.i;
import com.google.common.base.n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public final class Multimaps {

    private static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient n<? extends Set<V>> Xo;

        CustomSetMultimap(Map<K, Collection<V>> map, n<? extends Set<V>> nVar) {
            super(map);
            this.Xo = (n) i.checkNotNull(nVar);
        }

        /* Access modifiers changed, original: 0000 */
        public Set<K> rJ() {
            return rK();
        }

        /* Access modifiers changed, original: 0000 */
        public Map<K, Collection<V>> rL() {
            return rM();
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: sk */
        public Set<V> rH() {
            return (Set) this.Xo.get();
        }

        /* Access modifiers changed, original: 0000 */
        public <E> Collection<E> h(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.unmodifiableNavigableSet((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            return Collections.unmodifiableSet((Set) collection);
        }

        /* Access modifiers changed, original: 0000 */
        public Collection<V> a(K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new h(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new j(k, (SortedSet) collection, null);
            }
            return new i(k, (Set) collection);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.Xo);
            objectOutputStream.writeObject(rI());
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.Xo = (n) objectInputStream.readObject();
            n((Map) objectInputStream.readObject());
        }
    }

    public static <K, V> ad<K, V> a(Map<K, Collection<V>> map, n<? extends Set<V>> nVar) {
        return new CustomSetMultimap(map, nVar);
    }

    public static <K, V> ad<K, V> a(ad<K, V> adVar) {
        return Synchronized.a((ad) adVar, null);
    }

    static boolean a(w<?, ?> wVar, Object obj) {
        if (obj == wVar) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return wVar.sg().equals(((w) obj).sg());
    }
}
