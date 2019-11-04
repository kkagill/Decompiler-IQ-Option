package com.google.common.collect;

import com.google.common.base.n;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class MultimapBuilder<K0, V0> {

    public static abstract class a<K0> {
        public abstract <K extends K0, V> Map<K, Collection<V>> un();

        a() {
        }

        public b<K0, Object> up() {
            return ck(2);
        }

        public b<K0, Object> ck(final int i) {
            g.b(i, "expectedValuesPerKey");
            return new b<K0, Object>() {
                public <K extends K0, V> ad<K, V> uq() {
                    return Multimaps.a(a.this.un(), new HashSetSupplier(i));
                }
            };
        }
    }

    private static final class HashSetSupplier<V> implements n<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        HashSetSupplier(int i) {
            this.expectedValuesPerKey = g.b(i, "expectedValuesPerKey");
        }

        /* renamed from: uo */
        public Set<V> get() {
            return aa.cr(this.expectedValuesPerKey);
        }
    }

    public static abstract class b<K0, V0> extends MultimapBuilder<K0, V0> {
        public abstract <K extends K0, V extends V0> ad<K, V> uq();

        b() {
            super();
        }
    }

    /* synthetic */ MultimapBuilder(AnonymousClass1 anonymousClass1) {
        this();
    }

    private MultimapBuilder() {
    }

    public static a<Object> um() {
        return cj(8);
    }

    public static a<Object> cj(final int i) {
        g.b(i, "expectedKeys");
        return new a<Object>() {
            /* Access modifiers changed, original: 0000 */
            public <K, V> Map<K, Collection<V>> un() {
                return aa.cq(i);
            }
        };
    }
}
