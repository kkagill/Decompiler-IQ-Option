package com.google.common.collect;

import com.google.common.base.i;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    private transient int XK;
    final transient E element;

    /* Access modifiers changed, original: 0000 */
    public boolean sP() {
        return false;
    }

    public int size() {
        return 1;
    }

    SingletonImmutableSet(E e) {
        this.element = i.checkNotNull(e);
    }

    SingletonImmutableSet(E e, int i) {
        this.element = e;
        this.XK = i;
    }

    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    /* renamed from: sK */
    public aj<E> iterator() {
        return t.aV(this.element);
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableList<E> tn() {
        return ImmutableList.aJ(this.element);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.XK;
        if (i != 0) {
            return i;
        }
        i = this.element.hashCode();
        this.XK = i;
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean te() {
        return this.XK != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.element.toString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
