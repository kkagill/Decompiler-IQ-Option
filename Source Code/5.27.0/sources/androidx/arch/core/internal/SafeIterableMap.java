package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.Iterator;
import java.util.WeakHashMap;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SafeIterableMap<K, V> implements Iterable<java.util.Map.Entry<K, V>> {
    private Entry<K, V> mEnd;
    private WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap();
    private int mSize = 0;
    Entry<K, V> mStart;

    static class Entry<K, V> implements java.util.Map.Entry<K, V> {
        @NonNull
        final K mKey;
        Entry<K, V> mNext;
        Entry<K, V> mPrevious;
        @NonNull
        final V mValue;

        Entry(@NonNull K k, @NonNull V v) {
            this.mKey = k;
            this.mValue = v;
        }

        @NonNull
        public K getKey() {
            return this.mKey;
        }

        @NonNull
        public V getValue() {
            return this.mValue;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mKey);
            stringBuilder.append("=");
            stringBuilder.append(this.mValue);
            return stringBuilder.toString();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!(this.mKey.equals(entry.mKey) && this.mValue.equals(entry.mValue))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.mKey.hashCode() ^ this.mValue.hashCode();
        }
    }

    interface SupportRemove<K, V> {
        void supportRemove(@NonNull Entry<K, V> entry);
    }

    private class IteratorWithAdditions implements SupportRemove<K, V>, Iterator<java.util.Map.Entry<K, V>> {
        private boolean mBeforeStart = true;
        private Entry<K, V> mCurrent;

        IteratorWithAdditions() {
        }

        public void supportRemove(@NonNull Entry<K, V> entry) {
            Entry<K, V> entry2 = this.mCurrent;
            if (entry == entry2) {
                this.mCurrent = entry2.mPrevious;
                this.mBeforeStart = this.mCurrent == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.mBeforeStart) {
                if (SafeIterableMap.this.mStart == null) {
                    z = false;
                }
                return z;
            }
            Entry entry = this.mCurrent;
            if (entry == null || entry.mNext == null) {
                z = false;
            }
            return z;
        }

        public java.util.Map.Entry<K, V> next() {
            if (this.mBeforeStart) {
                this.mBeforeStart = false;
                this.mCurrent = SafeIterableMap.this.mStart;
            } else {
                Entry entry = this.mCurrent;
                this.mCurrent = entry != null ? entry.mNext : null;
            }
            return this.mCurrent;
        }
    }

    private static abstract class ListIterator<K, V> implements SupportRemove<K, V>, Iterator<java.util.Map.Entry<K, V>> {
        Entry<K, V> mExpectedEnd;
        Entry<K, V> mNext;

        public abstract Entry<K, V> backward(Entry<K, V> entry);

        public abstract Entry<K, V> forward(Entry<K, V> entry);

        ListIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            this.mExpectedEnd = entry2;
            this.mNext = entry;
        }

        public boolean hasNext() {
            return this.mNext != null;
        }

        public void supportRemove(@NonNull Entry<K, V> entry) {
            if (this.mExpectedEnd == entry && entry == this.mNext) {
                this.mNext = null;
                this.mExpectedEnd = null;
            }
            Entry<K, V> entry2 = this.mExpectedEnd;
            if (entry2 == entry) {
                this.mExpectedEnd = backward(entry2);
            }
            if (this.mNext == entry) {
                this.mNext = nextNode();
            }
        }

        private Entry<K, V> nextNode() {
            Entry entry = this.mNext;
            Entry entry2 = this.mExpectedEnd;
            return (entry == entry2 || entry2 == null) ? null : forward(entry);
        }

        public java.util.Map.Entry<K, V> next() {
            Entry entry = this.mNext;
            this.mNext = nextNode();
            return entry;
        }
    }

    static class AscendingIterator<K, V> extends ListIterator<K, V> {
        AscendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mNext;
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mPrevious;
        }
    }

    private static class DescendingIterator<K, V> extends ListIterator<K, V> {
        DescendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mPrevious;
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mNext;
        }
    }

    /* Access modifiers changed, original: protected */
    public Entry<K, V> get(K k) {
        Entry entry = this.mStart;
        while (entry != null && !entry.mKey.equals(k)) {
            entry = entry.mNext;
        }
        return entry;
    }

    public V putIfAbsent(@NonNull K k, @NonNull V v) {
        Entry entry = get(k);
        if (entry != null) {
            return entry.mValue;
        }
        put(k, v);
        return null;
    }

    /* Access modifiers changed, original: protected */
    public Entry<K, V> put(@NonNull K k, @NonNull V v) {
        Entry entry = new Entry(k, v);
        this.mSize++;
        Entry entry2 = this.mEnd;
        if (entry2 == null) {
            this.mStart = entry;
            this.mEnd = this.mStart;
            return entry;
        }
        entry2.mNext = entry;
        entry.mPrevious = entry2;
        this.mEnd = entry;
        return entry;
    }

    public V remove(@NonNull K k) {
        Entry entry = get(k);
        if (entry == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            for (SupportRemove supportRemove : this.mIterators.keySet()) {
                supportRemove.supportRemove(entry);
            }
        }
        if (entry.mPrevious != null) {
            entry.mPrevious.mNext = entry.mNext;
        } else {
            this.mStart = entry.mNext;
        }
        if (entry.mNext != null) {
            entry.mNext.mPrevious = entry.mPrevious;
        } else {
            this.mEnd = entry.mPrevious;
        }
        entry.mNext = null;
        entry.mPrevious = null;
        return entry.mValue;
    }

    public int size() {
        return this.mSize;
    }

    @NonNull
    public Iterator<java.util.Map.Entry<K, V>> iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.mStart, this.mEnd);
        this.mIterators.put(ascendingIterator, Boolean.valueOf(false));
        return ascendingIterator;
    }

    public Iterator<java.util.Map.Entry<K, V>> descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.mEnd, this.mStart);
        this.mIterators.put(descendingIterator, Boolean.valueOf(false));
        return descendingIterator;
    }

    public IteratorWithAdditions iteratorWithAdditions() {
        IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.mIterators.put(iteratorWithAdditions, Boolean.valueOf(false));
        return iteratorWithAdditions;
    }

    public java.util.Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public java.util.Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((java.util.Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((java.util.Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
