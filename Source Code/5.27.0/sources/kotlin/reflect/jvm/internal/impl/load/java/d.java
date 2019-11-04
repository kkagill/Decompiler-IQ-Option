package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;

/* compiled from: utils.kt */
public final class d extends j {
    private final Object value;

    public d(Object obj) {
        i.f(obj, ConditionalUserProperty.VALUE);
        super();
        this.value = obj;
    }
}
