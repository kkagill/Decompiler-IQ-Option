package kotlin.reflect.jvm.internal.pcollections;

/* compiled from: HashPMap */
public final class b<K, V> {
    private static final b<Object, Object> fAn = new b(d.bQj(), 0);
    private final d<a<MapEntry<K, V>>> fAo;
    private final int size;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i == 1) {
            objArr[1] = "plus";
        } else if (i == 2 || i == 3 || i == 4) {
            objArr[1] = "minus";
        } else {
            objArr[1] = "empty";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public static <K, V> b<K, V> bQi() {
        b bVar = fAn;
        if (bVar == null) {
            $$$reportNull$$$0(0);
        }
        return bVar;
    }

    private b(d<a<MapEntry<K, V>>> dVar, int i) {
        this.fAo = dVar;
        this.size = i;
    }

    public V get(Object obj) {
        a mG = mG(obj.hashCode());
        while (mG != null && mG.size() > 0) {
            MapEntry mapEntry = (MapEntry) mG.first;
            if (mapEntry.key.equals(obj)) {
                return mapEntry.value;
            }
            mG = mG.fAl;
        }
        return null;
    }

    public b<K, V> D(K k, V v) {
        a mG = mG(k.hashCode());
        int size = mG.size();
        int a = a(mG, k);
        if (a != -1) {
            mG = mG.mE(a);
        }
        a ec = mG.ec(new MapEntry(k, v));
        return new b(this.fAo.c(k.hashCode(), ec), (this.size - size) + ec.size());
    }

    private a<MapEntry<K, V>> mG(int i) {
        a<MapEntry<K, V>> aVar = (a) this.fAo.get(i);
        return aVar == null ? a.bQh() : aVar;
    }

    private static <K, V> int a(a<MapEntry<K, V>> aVar, Object obj) {
        int i = 0;
        a aVar2;
        while (aVar2 != null && aVar2.size() > 0) {
            if (((MapEntry) aVar2.first).key.equals(obj)) {
                return i;
            }
            aVar2 = aVar2.fAl;
            i++;
        }
        return -1;
    }
}
