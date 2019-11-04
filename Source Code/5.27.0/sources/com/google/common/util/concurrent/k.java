package com.google.common.util.concurrent;

import com.google.common.base.Optional;
import com.google.common.base.i;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CollectionFuture */
abstract class k<V, C> extends e<V, C> {

    /* compiled from: CollectionFuture */
    static final class b<V> extends k<V, List<V>> {

        /* compiled from: CollectionFuture */
        private final class a extends a {
            a(ImmutableCollection<? extends t<? extends V>> immutableCollection, boolean z) {
                super(immutableCollection, z);
            }

            /* renamed from: n */
            public List<V> m(List<Optional<V>> list) {
                ArrayList ca = Lists.ca(list.size());
                for (Optional optional : list) {
                    ca.add(optional != null ? optional.pN() : null);
                }
                return Collections.unmodifiableList(ca);
            }
        }

        b(ImmutableCollection<? extends t<? extends V>> immutableCollection, boolean z) {
            a(new a(immutableCollection, z));
        }
    }

    /* compiled from: CollectionFuture */
    abstract class a extends a {
        private List<Optional<V>> values;

        public abstract C m(List<Optional<V>> list);

        a(ImmutableCollection<? extends t<? extends V>> immutableCollection, boolean z) {
            ImmutableList sQ;
            super(immutableCollection, z, true);
            if (immutableCollection.isEmpty()) {
                sQ = ImmutableList.sQ();
            } else {
                sQ = Lists.ca(immutableCollection.size());
            }
            this.values = sQ;
            for (int i = 0; i < immutableCollection.size(); i++) {
                this.values.add(null);
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(boolean z, int i, V v) {
            List list = this.values;
            if (list != null) {
                list.set(i, Optional.an(v));
                return;
            }
            z = z || k.this.isCancelled();
            i.checkState(z, "Future was done before all dependencies completed");
        }

        /* Access modifiers changed, original: final */
        public final void vx() {
            List list = this.values;
            if (list != null) {
                k.this.set(m(list));
            } else {
                i.checkState(k.this.isDone());
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void vw() {
            super.vw();
            this.values = null;
        }
    }

    k() {
    }
}
