package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;

/* compiled from: NameUtils.kt */
public final class g {
    private static final Regex fpw = new Regex("[^\\p{L}\\p{Digit}]");
    public static final g fpx = new g();

    private g() {
    }

    public static final String mw(String str) {
        i.f(str, ConditionalUserProperty.NAME);
        return fpw.c(str, "_");
    }
}
