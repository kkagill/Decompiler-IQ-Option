package androidx.collection;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class MapCollections<K, V> {
    @Nullable
    EntrySet mEntrySet;
    @Nullable
    KeySet mKeySet;
    @Nullable
    ValuesCollection mValues;

    final class ArrayIterator<T> implements Iterator<T> {
        boolean mCanRemove = false;
        int mIndex;
        final int mOffset;
        int mSize;

        ArrayIterator(int i) {
            this.mOffset = i;
            this.mSize = MapCollections.this.colGetSize();
        }

        public boolean hasNext() {
            return this.mIndex < this.mSize;
        }

        public T next() {
            if (hasNext()) {
                Object colGetEntry = MapCollections.this.colGetEntry(this.mIndex, this.mOffset);
                this.mIndex++;
                this.mCanRemove = true;
                return colGetEntry;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.mCanRemove) {
                this.mIndex--;
                this.mSize--;
                this.mCanRemove = false;
                MapCollections.this.colRemoveAt(this.mIndex);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class EntrySet implements Set<Entry<K, V>> {
        EntrySet() {
        }

        public boolean add(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int colGetSize = MapCollections.this.colGetSize();
            for (Entry entry : collection) {
                MapCollections.this.colPut(entry.getKey(), entry.getValue());
            }
            return colGetSize != MapCollections.this.colGetSize();
        }

        public void clear() {
            MapCollections.this.colClear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int colIndexOfKey = MapCollections.this.colIndexOfKey(entry.getKey());
            if (colIndexOfKey < 0) {
                return false;
            }
            return ContainerHelpers.equal(MapCollections.this.colGetEntry(colIndexOfKey, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return MapCollections.this.colGetSize() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new MapIterator();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return MapCollections.this.colGetSize();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return MapCollections.equalsSetHelper(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int colGetSize = MapCollections.this.colGetSize() - 1; colGetSize >= 0; colGetSize--) {
                int i2;
                int i3;
                Object colGetEntry = MapCollections.this.colGetEntry(colGetSize, 0);
                Object colGetEntry2 = MapCollections.this.colGetEntry(colGetSize, 1);
                if (colGetEntry == null) {
                    i2 = 0;
                } else {
                    i2 = colGetEntry.hashCode();
                }
                if (colGetEntry2 == null) {
                    i3 = 0;
                } else {
                    i3 = colGetEntry2.hashCode();
                }
                i += i2 ^ i3;
            }
            return i;
        }
    }

    final class KeySet implements Set<K> {
        KeySet() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            MapCollections.this.colClear();
        }

        public boolean contains(Object obj) {
            return MapCollections.this.colIndexOfKey(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return MapCollections.containsAllHelper(MapCollections.this.colGetMap(), collection);
        }

        public boolean isEmpty() {
            return MapCollections.this.colGetSize() == 0;
        }

        public Iterator<K> iterator() {
            return new ArrayIterator(0);
        }

        public boolean remove(Object obj) {
            int colIndexOfKey = MapCollections.this.colIndexOfKey(obj);
            if (colIndexOfKey < 0) {
                return false;
            }
            MapCollections.this.colRemoveAt(colIndexOfKey);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return MapCollections.removeAllHelper(MapCollections.this.colGetMap(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return MapCollections.retainAllHelper(MapCollections.this.colGetMap(), collection);
        }

        public int size() {
            return MapCollections.this.colGetSize();
        }

        public Object[] toArray() {
            return MapCollections.this.toArrayHelper(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return MapCollections.this.toArrayHelper(tArr, 0);
        }

        public boolean equals(Object obj) {
            return MapCollections.equalsSetHelper(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int colGetSize = MapCollections.this.colGetSize() - 1; colGetSize >= 0; colGetSize--) {
                int i2;
                Object colGetEntry = MapCollections.this.colGetEntry(colGetSize, 0);
                if (colGetEntry == null) {
                    i2 = 0;
                } else {
                    i2 = colGetEntry.hashCode();
                }
                i += i2;
            }
            return i;
        }
    }

    final class MapIterator implements Iterator<Entry<K, V>>, Entry<K, V> {
        int mEnd;
        boolean mEntryValid = false;
        int mIndex;

        MapIterator() {
            this.mEnd = MapCollections.this.colGetSize() - 1;
            this.mIndex = -1;
        }

        public boolean hasNext() {
            return this.mIndex < this.mEnd;
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                this.mIndex++;
                this.mEntryValid = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.mEntryValid) {
                MapCollections.this.colRemoveAt(this.mIndex);
                this.mIndex--;
                this.mEnd--;
                this.mEntryValid = false;
                return;
            }
            throw new IllegalStateException();
        }

        public K getKey() {
            if (this.mEntryValid) {
                return MapCollections.this.colGetEntry(this.mIndex, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.mEntryValid) {
                return MapCollections.this.colGetEntry(this.mIndex, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V v) {
            if (this.mEntryValid) {
                return MapCollections.this.colSetValue(this.mIndex, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object obj) {
            if (this.mEntryValid) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (ContainerHelpers.equal(entry.getKey(), MapCollections.this.colGetEntry(this.mIndex, 0)) && ContainerHelpers.equal(entry.getValue(), MapCollections.this.colGetEntry(this.mIndex, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public int hashCode() {
            if (this.mEntryValid) {
                int i;
                int i2 = 0;
                Object colGetEntry = MapCollections.this.colGetEntry(this.mIndex, 0);
                Object colGetEntry2 = MapCollections.this.colGetEntry(this.mIndex, 1);
                if (colGetEntry == null) {
                    i = 0;
                } else {
                    i = colGetEntry.hashCode();
                }
                if (colGetEntry2 != null) {
                    i2 = colGetEntry2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    final class ValuesCollection implements Collection<V> {
        ValuesCollection() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            MapCollections.this.colClear();
        }

        public boolean contains(Object obj) {
            return MapCollections.this.colIndexOfValue(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return MapCollections.this.colGetSize() == 0;
        }

        public Iterator<V> iterator() {
            return new ArrayIterator(1);
        }

        public boolean remove(Object obj) {
            int colIndexOfValue = MapCollections.this.colIndexOfValue(obj);
            if (colIndexOfValue < 0) {
                return false;
            }
            MapCollections.this.colRemoveAt(colIndexOfValue);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int colGetSize = MapCollections.this.colGetSize();
            int i = 0;
            boolean z = false;
            while (i < colGetSize) {
                if (collection.contains(MapCollections.this.colGetEntry(i, 1))) {
                    MapCollections.this.colRemoveAt(i);
                    i--;
                    colGetSize--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int colGetSize = MapCollections.this.colGetSize();
            int i = 0;
            boolean z = false;
            while (i < colGetSize) {
                if (!collection.contains(MapCollections.this.colGetEntry(i, 1))) {
                    MapCollections.this.colRemoveAt(i);
                    i--;
                    colGetSize--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return MapCollections.this.colGetSize();
        }

        public Object[] toArray() {
            return MapCollections.this.toArrayHelper(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return MapCollections.this.toArrayHelper(tArr, 1);
        }
    }

    public abstract void colClear();

    public abstract Object colGetEntry(int i, int i2);

    public abstract Map<K, V> colGetMap();

    public abstract int colGetSize();

    public abstract int colIndexOfKey(Object obj);

    public abstract int colIndexOfValue(Object obj);

    public abstract void colPut(K k, V v);

    public abstract void colRemoveAt(int i);

    public abstract V colSetValue(int i, V v);

    MapCollections() {
    }

    public static <K, V> boolean containsAllHelper(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean removeAllHelper(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean retainAllHelper(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] toArrayHelper(int i) {
        int colGetSize = colGetSize();
        Object[] objArr = new Object[colGetSize];
        for (int i2 = 0; i2 < colGetSize; i2++) {
            objArr[i2] = colGetEntry(i2, i);
        }
        return objArr;
    }

    public <T> T[] toArrayHelper(T[] tArr, int i) {
        int colGetSize = colGetSize();
        if (tArr.length < colGetSize) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), colGetSize);
        }
        for (int i2 = 0; i2 < colGetSize; i2++) {
            tArr[i2] = colGetEntry(i2, i);
        }
        if (tArr.length > colGetSize) {
            tArr[colGetSize] = null;
        }
        return tArr;
    }

    public static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (!(set.size() == set2.size() && set.containsAll(set2))) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Set<Entry<K, V>> getEntrySet() {
        if (this.mEntrySet == null) {
            this.mEntrySet = new EntrySet();
        }
        return this.mEntrySet;
    }

    public Set<K> getKeySet() {
        if (this.mKeySet == null) {
            this.mKeySet = new KeySet();
        }
        return this.mKeySet;
    }

    public Collection<V> getValues() {
        if (this.mValues == null) {
            this.mValues = new ValuesCollection();
        }
        return this.mValues;
    }
}
