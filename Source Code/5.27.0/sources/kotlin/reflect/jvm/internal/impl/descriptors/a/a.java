package kotlin.reflect.jvm.internal.impl.descriptors.a;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AdditionalClassPartsProvider.kt */
public interface a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    public static final class a implements a {
        public static final a fdL = new a();

        private a() {
        }

        public Collection<w> l(d dVar) {
            i.f(dVar, "classDescriptor");
            return m.emptyList();
        }

        public Collection<ai> a(f fVar, d dVar) {
            i.f(fVar, ConditionalUserProperty.NAME);
            i.f(dVar, "classDescriptor");
            return m.emptyList();
        }

        public Collection<f> n(d dVar) {
            i.f(dVar, "classDescriptor");
            return m.emptyList();
        }

        public Collection<c> p(d dVar) {
            i.f(dVar, "classDescriptor");
            return m.emptyList();
        }
    }

    Collection<ai> a(f fVar, d dVar);

    Collection<w> l(d dVar);

    Collection<f> n(d dVar);

    Collection<c> p(d dVar);
}
