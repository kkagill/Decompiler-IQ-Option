package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;

/* compiled from: resolvers.kt */
public interface m {

    /* compiled from: resolvers.kt */
    public static final class a implements m {
        public static final a fjj = new a();

        public ao a(w wVar) {
            i.f(wVar, "javaTypeParameter");
            return null;
        }

        private a() {
        }
    }

    ao a(w wVar);
}
