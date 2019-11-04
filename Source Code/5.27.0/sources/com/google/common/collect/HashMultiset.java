package com.google.common.collect;

import java.util.Set;

public class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Set sh() {
        return super.sh();
    }

    public static <E> HashMultiset<E> sJ() {
        return bQ(3);
    }

    public static <E> HashMultiset<E> bQ(int i) {
        return new HashMultiset(i);
    }

    HashMultiset(int i) {
        super(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void init(int i) {
        this.Vj = new z(i);
    }
}
