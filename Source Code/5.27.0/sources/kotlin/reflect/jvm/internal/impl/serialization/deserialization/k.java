package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: DeserializedPackageFragment.kt */
public abstract class k extends x {
    public boolean N(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        h bsF = bsF();
        return (bsF instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f) && ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f) bsF).bOU().contains(fVar);
    }
}
