package com.google.common.collect;

import com.google.common.base.i;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;

public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    public /* bridge */ /* synthetic */ Set aE(Object obj) {
        return super.az(obj);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean i(Object obj, Object obj2) {
        return super.i(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Map sg() {
        return super.sg();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> HashMultimap<K, V> sI() {
        return new HashMultimap();
    }

    private HashMultimap() {
        this(12, 2);
    }

    private HashMultimap(int i, int i2) {
        super(aa.cq(i));
        this.expectedValuesPerKey = 2;
        i.checkArgument(i2 >= 0);
        this.expectedValuesPerKey = i2;
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: sk */
    public Set<V> rH() {
        return aa.cr(this.expectedValuesPerKey);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        ac.a((w) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int c = ac.c(objectInputStream);
        n(aa.cq(12));
        ac.a((w) this, objectInputStream, c);
    }
}
