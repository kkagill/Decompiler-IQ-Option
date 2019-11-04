package com.iqoption.util;

import com.google.common.base.Suppliers;
import com.google.common.base.n;

/* compiled from: Caser */
public class f {
    private static n<a> eaU = Suppliers.a(new n<a>() {
        /* renamed from: aWG */
        public a get() {
            return new a(0.01d, null);
        }
    });

    /* compiled from: Caser */
    private static final class a {
        private final double value;

        /* synthetic */ a(double d, AnonymousClass1 anonymousClass1) {
            this(d);
        }

        private a(double d) {
            this.value = d;
        }

        /* Access modifiers changed, original: 0000 */
        public void b(double d, b bVar) {
            double d2 = this.value;
            if (d >= d2) {
                bVar.F(d);
            } else if (d <= (-d2)) {
                bVar.G(Math.abs(d));
            } else {
                bVar.H(d);
            }
        }
    }

    /* compiled from: Caser */
    public interface b {
        void F(double d);

        void G(double d);

        void H(double d);
    }

    public static void a(double d, b bVar) {
        ((a) eaU.get()).b(d, bVar);
    }
}
