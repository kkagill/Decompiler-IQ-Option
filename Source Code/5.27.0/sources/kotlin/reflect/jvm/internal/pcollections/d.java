package kotlin.reflect.jvm.internal.pcollections;

/* compiled from: IntTreePMap */
final class d<V> {
    private static final d<Object> fAt = new d(c.fAp);
    private final c<V> fAu;

    public static <V> d<V> bQj() {
        return fAt;
    }

    private d(c<V> cVar) {
        this.fAu = cVar;
    }

    private d<V> a(c<V> cVar) {
        if (cVar == this.fAu) {
            return this;
        }
        return new d(cVar);
    }

    public V get(int i) {
        return this.fAu.get((long) i);
    }

    public d<V> c(int i, V v) {
        return a(this.fAu.b((long) i, v));
    }
}
