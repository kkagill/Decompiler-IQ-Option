package com.google.common.collect;

import com.google.common.base.i;

class RegularImmutableList<E> extends ImmutableList<E> {
    static final ImmutableList<Object> XA = new RegularImmutableList(new Object[0], 0);
    final transient Object[] array;
    private final transient int size;

    /* Access modifiers changed, original: 0000 */
    public int sM() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean sP() {
        return false;
    }

    RegularImmutableList(Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }

    public int size() {
        return this.size;
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] sL() {
        return this.array;
    }

    /* Access modifiers changed, original: 0000 */
    public int sN() {
        return this.size;
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.array, 0, objArr, i, this.size);
        return i + this.size;
    }

    public E get(int i) {
        i.s(i, this.size);
        return this.array[i];
    }
}
