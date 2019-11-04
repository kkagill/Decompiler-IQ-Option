package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;

/* compiled from: util.kt */
public final class g extends a {
    private final String value;

    public g(String str) {
        i.f(str, ConditionalUserProperty.VALUE);
        super();
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
