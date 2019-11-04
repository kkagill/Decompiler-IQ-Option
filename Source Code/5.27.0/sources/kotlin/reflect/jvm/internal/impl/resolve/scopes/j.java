package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: ResolutionScope.kt */
public interface j {

    /* compiled from: ResolutionScope.kt */
    public static final class a {
        public static /* synthetic */ Collection a(j jVar, d dVar, b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    dVar = d.fui;
                }
                if ((i & 2) != 0) {
                    bVar = h.fuz.bNM();
                }
                return jVar.a(dVar, bVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }

        public static void a(j jVar, f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(bVar, "location");
            jVar.b(fVar, bVar);
        }
    }

    Collection<k> a(d dVar, b<? super f, Boolean> bVar);

    Collection<? extends s> b(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar);

    kotlin.reflect.jvm.internal.impl.descriptors.f c(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar);
}
