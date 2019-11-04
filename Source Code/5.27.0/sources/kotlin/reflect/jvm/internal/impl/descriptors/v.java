package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: ModuleDescriptor.kt */
public interface v extends k {

    /* compiled from: ModuleDescriptor.kt */
    public static final class a<T> {
        private final String name;

        public a(String str) {
            i.f(str, ConditionalUserProperty.NAME);
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* compiled from: ModuleDescriptor.kt */
    public static final class b {
        public static k d(v vVar) {
            return null;
        }

        public static <R, D> R a(v vVar, m<R, D> mVar, D d) {
            i.f(mVar, "visitor");
            return mVar.a(vVar, (Object) d);
        }
    }

    Collection<kotlin.reflect.jvm.internal.impl.name.b> a(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.jvm.a.b<? super f, Boolean> bVar2);

    g btw();

    boolean c(v vVar);

    aa f(kotlin.reflect.jvm.internal.impl.name.b bVar);
}
