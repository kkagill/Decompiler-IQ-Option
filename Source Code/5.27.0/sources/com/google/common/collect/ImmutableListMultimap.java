package com.google.common.collect;

import com.google.common.collect.ImmutableMap.a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements u<K, V> {
    private static final long serialVersionUID = 0;

    public static <K, V> ImmutableListMultimap<K, V> sV() {
        return EmptyImmutableListMultimap.VQ;
    }

    static <K, V> ImmutableListMultimap<K, V> a(Collection<? extends Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return sV();
        }
        a aVar = new a(collection.size());
        int i = 0;
        for (Entry entry : collection) {
            ImmutableList m;
            Object key = entry.getKey();
            Iterable iterable = (Collection) entry.getValue();
            if (comparator == null) {
                m = ImmutableList.m(iterable);
            } else {
                m = ImmutableList.a((Comparator) comparator, iterable);
            }
            if (!m.isEmpty()) {
                aVar.m(key, m);
                i += m.size();
            }
        }
        return new ImmutableListMultimap(aVar.tf(), i);
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    /* renamed from: aL */
    public ImmutableList<V> az(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.sQ() : immutableList;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        ac.a((w) this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            a sX = ImmutableMap.sX();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.a sT = ImmutableList.sT();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        sT.aI(objectInputStream.readObject());
                    }
                    sX.m(readObject, sT.sU());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid value count ");
                    stringBuilder.append(readInt2);
                    throw new InvalidObjectException(stringBuilder.toString());
                }
            }
            try {
                b.Wm.set((Object) this, sX.tf());
                b.Wn.set((Object) this, i2);
                return;
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Invalid key count ");
        stringBuilder2.append(readInt);
        throw new InvalidObjectException(stringBuilder2.toString());
    }
}
