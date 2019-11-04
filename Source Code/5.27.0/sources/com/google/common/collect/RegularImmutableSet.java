package com.google.common.collect;

final class RegularImmutableSet<E> extends ImmutableSet<E> {
    static final RegularImmutableSet<Object> XE = new RegularImmutableSet(new Object[0], 0, null, 0, 0);
    final transient Object[] XF;
    final transient Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;

    /* Access modifiers changed, original: 0000 */
    public int sM() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean sP() {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean te() {
        return true;
    }

    RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.XF = objArr2;
        this.mask = i2;
        this.hashCode = i;
        this.size = i3;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.XF;
        if (obj == null || objArr == null) {
            return false;
        }
        int aG = r.aG(obj);
        while (true) {
            aG &= this.mask;
            Object obj2 = objArr[aG];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            aG++;
        }
    }

    public int size() {
        return this.size;
    }

    /* renamed from: sK */
    public aj<E> iterator() {
        return sO().iterator();
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] sL() {
        return this.elements;
    }

    /* Access modifiers changed, original: 0000 */
    public int sN() {
        return this.size;
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.size);
        return i + this.size;
    }

    /* Access modifiers changed, original: 0000 */
    public ImmutableList<E> tn() {
        return ImmutableList.b(this.elements, this.size);
    }

    public int hashCode() {
        return this.hashCode;
    }
}
