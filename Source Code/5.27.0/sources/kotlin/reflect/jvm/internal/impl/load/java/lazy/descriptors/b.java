package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: DeclaredMemberIndex.kt */
public interface b {

    /* compiled from: DeclaredMemberIndex.kt */
    public static final class a implements b {
        public static final a fjo = new a();

        public n s(f fVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            return null;
        }

        private a() {
        }

        /* renamed from: t */
        public List<q> r(f fVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            return m.emptyList();
        }

        public Set<f> bwq() {
            return al.emptySet();
        }

        public Set<f> bwr() {
            return al.emptySet();
        }
    }

    Set<f> bwq();

    Set<f> bwr();

    Collection<q> r(f fVar);

    n s(f fVar);
}
