package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ArraySet<E> implements Collection<E>, Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final int[] INT = new int[0];
    private static final Object[] OBJECT = new Object[0];
    private static final String TAG = "ArraySet";
    @Nullable
    private static Object[] sBaseCache;
    private static int sBaseCacheSize;
    @Nullable
    private static Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    Object[] mArray;
    private MapCollections<E, E> mCollections;
    private int[] mHashes;
    int mSize;

    private int indexOf(Object obj, int i) {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i2, i);
        if (binarySearch < 0 || obj.equals(this.mArray[binarySearch])) {
            return binarySearch;
        }
        int i3 = binarySearch + 1;
        while (i3 < i2 && this.mHashes[i3] == i) {
            if (obj.equals(this.mArray[i3])) {
                return i3;
            }
            i3++;
        }
        binarySearch--;
        while (binarySearch >= 0 && this.mHashes[binarySearch] == i) {
            if (obj.equals(this.mArray[binarySearch])) {
                return binarySearch;
            }
            binarySearch--;
        }
        return i3 ^ -1;
    }

    private int indexOfNull() {
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i, 0);
        if (binarySearch < 0 || this.mArray[binarySearch] == null) {
            return binarySearch;
        }
        int i2 = binarySearch + 1;
        while (i2 < i && this.mHashes[i2] == 0) {
            if (this.mArray[i2] == null) {
                return i2;
            }
            i2++;
        }
        binarySearch--;
        while (binarySearch >= 0 && this.mHashes[binarySearch] == 0) {
            if (this.mArray[binarySearch] == null) {
                return binarySearch;
            }
            binarySearch--;
        }
        return i2 ^ -1;
    }

    private void allocArrays(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ArraySet.class) {
                if (sTwiceBaseCache != null) {
                    objArr = sTwiceBaseCache;
                    this.mArray = objArr;
                    sTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    sTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArraySet.class) {
                if (sBaseCache != null) {
                    objArr = sBaseCache;
                    this.mArray = objArr;
                    sBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    sBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i];
        this.mArray = new Object[i];
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArraySet.class) {
                if (sTwiceBaseCacheSize < 10) {
                    objArr[0] = sTwiceBaseCache;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    sTwiceBaseCache = objArr;
                    sTwiceBaseCacheSize++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ArraySet.class) {
                if (sBaseCacheSize < 10) {
                    objArr[0] = sBaseCache;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    sBaseCache = objArr;
                    sBaseCacheSize++;
                }
            }
        }
    }

    public ArraySet() {
        this(0);
    }

    public ArraySet(int i) {
        if (i == 0) {
            this.mHashes = INT;
            this.mArray = OBJECT;
        } else {
            allocArrays(i);
        }
        this.mSize = 0;
    }

    public ArraySet(@Nullable ArraySet<E> arraySet) {
        this();
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(@Nullable Collection<E> collection) {
        this();
        if (collection != null) {
            addAll((Collection) collection);
        }
    }

    public void clear() {
        int i = this.mSize;
        if (i != 0) {
            freeArrays(this.mHashes, this.mArray, i);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        }
    }

    public void ensureCapacity(int i) {
        int[] iArr = this.mHashes;
        if (iArr.length < i) {
            Object[] objArr = this.mArray;
            allocArrays(i);
            i = this.mSize;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i);
                System.arraycopy(objArr, 0, this.mArray, 0, this.mSize);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
    }

    public boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    @Nullable
    public E valueAt(int i) {
        return this.mArray[i];
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public boolean add(@Nullable E e) {
        int indexOfNull;
        int i;
        if (e == null) {
            indexOfNull = indexOfNull();
            i = 0;
        } else {
            indexOfNull = e.hashCode();
            i = indexOfNull;
            indexOfNull = indexOf(e, indexOfNull);
        }
        if (indexOfNull >= 0) {
            return false;
        }
        int i2;
        int[] iArr;
        indexOfNull ^= -1;
        int i3 = this.mSize;
        if (i3 >= this.mHashes.length) {
            i2 = 4;
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i2 = 8;
            }
            iArr = this.mHashes;
            Object[] objArr = this.mArray;
            allocArrays(i2);
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
        int i4 = this.mSize;
        if (indexOfNull < i4) {
            iArr = this.mHashes;
            i2 = indexOfNull + 1;
            System.arraycopy(iArr, indexOfNull, iArr, i2, i4 - indexOfNull);
            Object[] objArr2 = this.mArray;
            System.arraycopy(objArr2, indexOfNull, objArr2, i2, this.mSize - indexOfNull);
        }
        this.mHashes[indexOfNull] = i;
        this.mArray[indexOfNull] = e;
        this.mSize++;
        return true;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void append(E e) {
        int i;
        int i2 = this.mSize;
        if (e == null) {
            i = 0;
        } else {
            i = e.hashCode();
        }
        int[] iArr = this.mHashes;
        if (i2 >= iArr.length) {
            throw new IllegalStateException("Array is full");
        } else if (i2 <= 0 || iArr[i2 - 1] <= i) {
            this.mSize = i2 + 1;
            this.mHashes[i2] = i;
            this.mArray[i2] = e;
        } else {
            add(e);
        }
    }

    public void addAll(@NonNull ArraySet<? extends E> arraySet) {
        int i = arraySet.mSize;
        ensureCapacity(this.mSize + i);
        int i2 = 0;
        if (this.mSize != 0) {
            while (i2 < i) {
                add(arraySet.valueAt(i2));
                i2++;
            }
        } else if (i > 0) {
            System.arraycopy(arraySet.mHashes, 0, this.mHashes, 0, i);
            System.arraycopy(arraySet.mArray, 0, this.mArray, 0, i);
            this.mSize = i;
        }
    }

    public boolean remove(@Nullable Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public E removeAt(int i) {
        Object[] objArr = this.mArray;
        E e = objArr[i];
        int i2 = this.mSize;
        if (i2 <= 1) {
            freeArrays(this.mHashes, objArr, i2);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        } else {
            int[] iArr = this.mHashes;
            int i3 = 8;
            int i4;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.mSize--;
                int i5 = this.mSize;
                if (i < i5) {
                    int[] iArr2 = this.mHashes;
                    i4 = i + 1;
                    System.arraycopy(iArr2, i4, iArr2, i, i5 - i);
                    objArr = this.mArray;
                    System.arraycopy(objArr, i4, objArr, i, this.mSize - i);
                }
                this.mArray[this.mSize] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                iArr = this.mHashes;
                Object[] objArr2 = this.mArray;
                allocArrays(i3);
                this.mSize--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i);
                    System.arraycopy(objArr2, 0, this.mArray, 0, i);
                }
                i4 = this.mSize;
                if (i < i4) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.mHashes, i, i4 - i);
                    System.arraycopy(objArr2, i6, this.mArray, i, this.mSize - i);
                }
            }
        }
        return e;
    }

    public boolean removeAll(@NonNull ArraySet<? extends E> arraySet) {
        int i = arraySet.mSize;
        int i2 = this.mSize;
        for (int i3 = 0; i3 < i; i3++) {
            remove(arraySet.valueAt(i3));
        }
        if (i2 != this.mSize) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.mSize;
    }

    @NonNull
    public Object[] toArray() {
        int i = this.mSize;
        Object[] objArr = new Object[i];
        System.arraycopy(this.mArray, 0, objArr, 0, i);
        return objArr;
    }

    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        Object tArr2;
        if (tArr2.length < this.mSize) {
            tArr2 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), this.mSize);
        }
        System.arraycopy(this.mArray, 0, tArr2, 0, this.mSize);
        int length = tArr2.length;
        int i = this.mSize;
        if (length > i) {
            tArr2[i] = null;
        }
        return tArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.mSize) {
                try {
                    if (!set.contains(valueAt(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        int i = 0;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.mSize * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            ArraySet valueAt = valueAt(i);
            if (valueAt != this) {
                stringBuilder.append(valueAt);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private MapCollections<E, E> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections<E, E>() {
                /* Access modifiers changed, original: protected */
                public int colGetSize() {
                    return ArraySet.this.mSize;
                }

                /* Access modifiers changed, original: protected */
                public Object colGetEntry(int i, int i2) {
                    return ArraySet.this.mArray[i];
                }

                /* Access modifiers changed, original: protected */
                public int colIndexOfKey(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                /* Access modifiers changed, original: protected */
                public int colIndexOfValue(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                /* Access modifiers changed, original: protected */
                public Map<E, E> colGetMap() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* Access modifiers changed, original: protected */
                public void colPut(E e, E e2) {
                    ArraySet.this.add(e);
                }

                /* Access modifiers changed, original: protected */
                public E colSetValue(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* Access modifiers changed, original: protected */
                public void colRemoveAt(int i) {
                    ArraySet.this.removeAt(i);
                }

                /* Access modifiers changed, original: protected */
                public void colClear() {
                    ArraySet.this.clear();
                }
            };
        }
        return this.mCollections;
    }

    public Iterator<E> iterator() {
        return getCollection().getKeySet().iterator();
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        ensureCapacity(this.mSize + collection.size());
        int i = 0;
        for (Object add : collection) {
            i |= add(add);
        }
        return i;
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        int i = 0;
        for (Object remove : collection) {
            i |= remove(remove);
        }
        return i;
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.mSize - 1; i >= 0; i--) {
            if (!collection.contains(this.mArray[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }
}
