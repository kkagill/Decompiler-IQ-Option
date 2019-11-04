package kotlin.reflect.jvm.internal.impl.util;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.util.c.c;
import kotlin.text.Regex;

/* compiled from: modifierChecks.kt */
public final class d {
    private final f fdP;
    private final Regex fyp;
    private final Collection<f> fyq;
    private final b<s, String> fyr;
    private final b[] fys;

    private d(f fVar, Regex regex, Collection<f> collection, b<? super s, String> bVar, b... bVarArr) {
        this.fdP = fVar;
        this.fyp = regex;
        this.fyq = collection;
        this.fyr = bVar;
        this.fys = bVarArr;
    }

    public final boolean o(s sVar) {
        i.f(sVar, "functionDescriptor");
        if (this.fdP != null && (i.y(sVar.bsZ(), this.fdP) ^ 1) != 0) {
            return false;
        }
        if (this.fyp != null) {
            String boi = sVar.bsZ().boi();
            i.e(boi, "functionDescriptor.name.asString()");
            if (!this.fyp.L(boi)) {
                return false;
            }
        }
        Collection collection = this.fyq;
        return collection == null || collection.contains(sVar.bsZ());
    }

    public final c p(s sVar) {
        i.f(sVar, "functionDescriptor");
        for (b a : this.fys) {
            String a2 = a.a(sVar);
            if (a2 != null) {
                return new c.b(a2);
            }
        }
        String str = (String) this.fyr.invoke(sVar);
        if (str != null) {
            return new c.b(str);
        }
        return c.fyo;
    }

    public d(f fVar, b[] bVarArr, b<? super s, String> bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVarArr, "checks");
        i.f(bVar, "additionalChecks");
        this(fVar, null, null, (b) bVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public d(Regex regex, b[] bVarArr, b<? super s, String> bVar) {
        i.f(regex, "regex");
        i.f(bVarArr, "checks");
        i.f(bVar, "additionalChecks");
        this(null, regex, null, (b) bVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public d(Collection<f> collection, b[] bVarArr, b<? super s, String> bVar) {
        i.f(collection, "nameList");
        i.f(bVarArr, "checks");
        i.f(bVar, "additionalChecks");
        this(null, null, (Collection) collection, (b) bVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }
}
