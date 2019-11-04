package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: MemberScope.kt */
public interface h extends j {
    public static final a fuz = a.fuB;

    /* compiled from: MemberScope.kt */
    public static final class a {
        private static final kotlin.jvm.a.b<f, Boolean> fuA = MemberScope$Companion$ALL_NAME_FILTER$1.fuC;
        static final /* synthetic */ a fuB = new a();

        private a() {
        }

        public final kotlin.jvm.a.b<f, Boolean> bNM() {
            return fuA;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b {
        public static void a(h hVar, f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(bVar, "location");
            kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a.a(hVar, fVar, bVar);
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class c extends i {
        public static final c fuD = new c();

        private c() {
        }

        public Set<f> bux() {
            return al.emptySet();
        }

        public Set<f> buy() {
            return al.emptySet();
        }
    }

    Collection<? extends ae> a(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar);

    Collection<? extends ai> b(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar);

    Set<f> bux();

    Set<f> buy();
}
