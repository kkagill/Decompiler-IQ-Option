package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.a;

/* compiled from: propertiesConventionUtil.kt */
public final class q {
    public static final f o(f fVar) {
        i.f(fVar, "methodName");
        f a = a(fVar, "get", false, null, 12, null);
        if (a != null) {
            return a;
        }
        return a(fVar, "is", false, null, 8, null);
    }

    public static final f a(f fVar, boolean z) {
        i.f(fVar, "methodName");
        return a(fVar, "set", false, z ? "is" : null, 4, null);
    }

    public static final List<f> p(f fVar) {
        i.f(fVar, "methodName");
        return u.P(m.listOf(a(fVar, false), a(fVar, true)));
    }

    static /* synthetic */ f a(f fVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = (String) null;
        }
        return a(fVar, str, z, str2);
    }

    private static final f a(f fVar, String str, boolean z, String str2) {
        if (fVar.bKh()) {
            return null;
        }
        String identifier = fVar.getIdentifier();
        i.e(identifier, "methodName.identifier");
        if (!u.a(identifier, str, false, 2, null) || identifier.length() == str.length()) {
            return null;
        }
        char charAt = identifier.charAt(str.length());
        if ('a' <= charAt && 'z' >= charAt) {
            return null;
        }
        if (str2 != null) {
            if (!m.eVC || z) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(v.a(identifier, (CharSequence) str));
                return f.ms(stringBuilder.toString());
            }
            throw new AssertionError("Assertion failed");
        } else if (!z) {
            return fVar;
        } else {
            String D = a.D(v.a(identifier, (CharSequence) str), true);
            if (f.mt(D)) {
                return f.ms(D);
            }
            return null;
        }
    }

    public static final List<f> q(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        String boi = fVar.boi();
        i.e(boi, "name.asString()");
        if (m.lZ(boi)) {
            return m.dc(o(fVar));
        }
        if (m.ma(boi)) {
            return p(fVar);
        }
        return c.fgW.n(fVar);
    }
}
