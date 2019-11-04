package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: constantValues.kt */
public final class a extends g<c> {
    public a(c cVar) {
        i.f(cVar, ConditionalUserProperty.VALUE);
        super(cVar);
    }

    public w g(v vVar) {
        i.f(vVar, "module");
        return ((c) getValue()).bpT();
    }
}
