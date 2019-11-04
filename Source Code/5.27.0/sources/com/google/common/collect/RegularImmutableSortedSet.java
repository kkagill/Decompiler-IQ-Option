package com.google.common.collect;

import com.google.common.base.i;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    static final RegularImmutableSortedSet<Comparable> XG = new RegularImmutableSortedSet(ImmutableList.sQ(), Ordering.natural());
    final transient ImmutableList<E> XH;

    RegularImmutableSortedSet(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.XH = immutableList;
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] sL() {
        return this.XH.sL();
    }

    /* Access modifiers changed, original: 0000 */
    public int sM() {
        return this.XH.sM();
    }

    /* Access modifiers changed, original: 0000 */
    public int sN() {
        return this.XH.sN();
    }

    /* renamed from: sK */
    public aj<E> iterator() {
        return this.XH.iterator();
    }

    /* renamed from: tz */
    public aj<E> descendingIterator() {
        return this.XH.sS().iterator();
    }

    public int size() {
        return this.XH.size();
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return aZ(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        Iterable collection2;
        if (collection2 instanceof x) {
            collection2 = ((x) collection2).sh();
        }
        if (!af.b(comparator(), collection2) || collection2.size() <= 1) {
            return super.containsAll(collection2);
        }
        aj sK = iterator();
        Iterator it = collection2.iterator();
        if (!sK.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = sK.next();
        while (true) {
            try {
                int r = r(next2, next);
                if (r < 0) {
                    if (!sK.hasNext()) {
                        return false;
                    }
                    next2 = sK.next();
                } else if (r == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (r > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    private int aZ(Object obj) {
        return Collections.binarySearch(this.XH, obj, uv());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean sP() {
        return this.XH.sP();
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        return this.XH.a(objArr, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!af.b(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            aj sK = iterator();
            while (sK.hasNext()) {
                Object next = sK.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (r(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    public E first() {
        if (!isEmpty()) {
            return this.XH.get(0);
        }
        throw new NoSuchElementException();
    }

    public E last() {
        if (!isEmpty()) {
            return this.XH.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e) {
        int g = g(e, false) - 1;
        if (g == -1) {
            return null;
        }
        return this.XH.get(g);
    }

    public E floor(E e) {
        int g = g(e, true) - 1;
        if (g == -1) {
            return null;
        }
        return this.XH.get(g);
    }

    public E ceiling(E e) {
        int h = h(e, true);
        return h == size() ? null : this.XH.get(h);
    }

    public E higher(E e) {
        int h = h(e, false);
        return h == size() ? null : this.XH.get(h);
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableSortedSet<E> e(E e, boolean z) {
        return E(0, g(e, z));
    }

    /* Access modifiers changed, original: 0000 */
    public int g(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.XH, i.checkNotNull(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            binarySearch++;
        }
        return binarySearch;
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableSortedSet<E> c(E e, boolean z, E e2, boolean z2) {
        return f(e, z).e(e2, z2);
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableSortedSet<E> f(E e, boolean z) {
        return E(h(e, z), size());
    }

    /* Access modifiers changed, original: 0000 */
    public int h(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.XH, i.checkNotNull(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (!z) {
            binarySearch++;
        }
        return binarySearch;
    }

    /* Access modifiers changed, original: 0000 */
    public Comparator<Object> uv() {
        return this.comparator;
    }

    /* Access modifiers changed, original: 0000 */
    public RegularImmutableSortedSet<E> E(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new RegularImmutableSortedSet(this.XH.subList(i, i2), this.comparator);
        }
        return ImmutableSortedSet.c(this.comparator);
    }

    /* Access modifiers changed, original: 0000 */
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.XH, obj, uv());
            if (binarySearch < 0) {
                binarySearch = -1;
            }
            return binarySearch;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public ImmutableList<E> sO() {
        return this.XH;
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableSortedSet<E> ty() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return ImmutableSortedSet.c(reverseOrder);
        }
        return new RegularImmutableSortedSet(this.XH.sS(), reverseOrder);
    }
}
