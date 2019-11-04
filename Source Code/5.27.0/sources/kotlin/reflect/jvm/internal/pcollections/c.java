package kotlin.reflect.jvm.internal.pcollections;

/* compiled from: IntTree */
final class c<V> {
    static final c<Object> fAp = new c();
    private final long fAq;
    private final c<V> fAr;
    private final c<V> fAs;
    private final int size;
    private final V value;

    private c() {
        this.size = 0;
        this.fAq = 0;
        this.value = null;
        this.fAr = null;
        this.fAs = null;
    }

    private c(long j, V v, c<V> cVar, c<V> cVar2) {
        this.fAq = j;
        this.value = v;
        this.fAr = cVar;
        this.fAs = cVar2;
        this.size = (cVar.size + 1) + cVar2.size;
    }

    private c<V> dq(long j) {
        if (this.size == 0 || j == this.fAq) {
            return this;
        }
        return new c(j, this.value, this.fAr, this.fAs);
    }

    /* Access modifiers changed, original: 0000 */
    public V get(long j) {
        if (this.size == 0) {
            return null;
        }
        long j2 = this.fAq;
        if (j < j2) {
            return this.fAr.get(j - j2);
        }
        if (j > j2) {
            return this.fAs.get(j - j2);
        }
        return this.value;
    }

    /* Access modifiers changed, original: 0000 */
    public c<V> b(long j, V v) {
        if (this.size == 0) {
            return new c(j, v, this, this);
        }
        long j2 = this.fAq;
        if (j < j2) {
            return a(this.fAr.b(j - j2, v), this.fAs);
        }
        if (j > j2) {
            return a(this.fAr, this.fAs.b(j - j2, v));
        }
        if (v == this.value) {
            return this;
        }
        return new c(j, v, this.fAr, this.fAs);
    }

    private c<V> a(c<V> cVar, c<V> cVar2) {
        if (cVar == this.fAr && cVar2 == this.fAs) {
            return this;
        }
        return a(this.fAq, this.value, cVar, cVar2);
    }

    private static <V> c<V> a(long j, V v, c<V> cVar, c<V> cVar2) {
        c<V> cVar3 = cVar;
        c<V> cVar4 = cVar2;
        int i = cVar3.size;
        int i2 = cVar4.size;
        if (i + i2 > 1) {
            c cVar5;
            long j2;
            c cVar6;
            long j3;
            if (i >= i2 * 5) {
                c cVar7 = cVar3.fAr;
                cVar5 = cVar3.fAs;
                if (cVar5.size < cVar7.size * 2) {
                    j2 = cVar3.fAq;
                    return new c(j2 + j, cVar3.value, cVar7, new c(-j2, v, cVar5.dq(cVar5.fAq + j2), cVar2));
                }
                c cVar8 = cVar5.fAr;
                c cVar9 = cVar5.fAs;
                long j4 = cVar5.fAq;
                long j5 = (cVar3.fAq + j4) + j;
                Object obj = cVar5.value;
                long j6 = -j4;
                Object obj2 = obj;
                cVar6 = new c(j6, cVar3.value, cVar7, cVar8.dq(cVar8.fAq + j4));
                long j7 = cVar3.fAq;
                long j8 = -j7;
                j3 = cVar5.fAq;
                return new c(j5, obj2, cVar6, new c(j8 - j3, v, cVar9.dq((cVar9.fAq + j3) + j7), cVar2));
            } else if (i2 >= i * 5) {
                cVar4 = cVar2;
                cVar6 = cVar4.fAr;
                c cVar10 = cVar4.fAs;
                if (cVar6.size < cVar10.size * 2) {
                    j3 = cVar4.fAq;
                    return new c(j3 + j, cVar4.value, new c(-j3, v, cVar, cVar6.dq(cVar6.fAq + j3)), cVar10);
                }
                cVar5 = cVar6.fAr;
                c cVar11 = cVar6.fAs;
                j2 = cVar6.fAq;
                long j9 = cVar4.fAq;
                long j10 = (j2 + j9) + j;
                Object obj3 = cVar6.value;
                j = j10;
                cVar5 = new c((-j9) - j2, v, cVar, cVar5.dq((cVar5.fAq + j2) + j9));
                j3 = cVar6.fAq;
                return new c(j, obj3, cVar5, new c(-j3, cVar4.value, cVar11.dq(cVar11.fAq + j3), cVar10));
            } else {
                cVar4 = cVar2;
            }
        }
        return new c(j, v, cVar, cVar2);
    }
}
