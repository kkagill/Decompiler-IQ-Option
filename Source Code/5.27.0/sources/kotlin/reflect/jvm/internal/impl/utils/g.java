package kotlin.reflect.jvm.internal.impl.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;

/* compiled from: numbers.kt */
public final class g {
    public static final f mS(String str) {
        i.f(str, ConditionalUserProperty.VALUE);
        String str2 = "(this as java.lang.String).substring(startIndex)";
        if (u.a(str, "0x", false, 2, null) || u.a(str, "0X", false, 2, null)) {
            str = str.substring(2);
            i.e(str, str2);
            return new f(str, 16);
        } else if (!u.a(str, "0b", false, 2, null) && !u.a(str, "0B", false, 2, null)) {
            return new f(str, 10);
        } else {
            str = str.substring(2);
            i.e(str, str2);
            return new f(str, 2);
        }
    }
}
