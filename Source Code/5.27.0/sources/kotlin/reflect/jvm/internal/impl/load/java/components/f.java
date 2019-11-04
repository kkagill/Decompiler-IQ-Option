package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

/* compiled from: JavaPropertyInitializerEvaluator.kt */
public interface f {

    /* compiled from: JavaPropertyInitializerEvaluator.kt */
    public static final class a implements f {
        public static final a fik = new a();

        public Void b(n nVar, ae aeVar) {
            i.f(nVar, "field");
            i.f(aeVar, "descriptor");
            return null;
        }

        private a() {
        }

        public /* synthetic */ g a(n nVar, ae aeVar) {
            return (g) b(nVar, aeVar);
        }
    }

    g<?> a(n nVar, ae aeVar);
}
