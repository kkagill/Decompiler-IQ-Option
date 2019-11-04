package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: constantValues.kt */
public final class t extends g<String> {
    public t(String str) {
        i.f(str, ConditionalUserProperty.VALUE);
        super(str);
    }

    /* renamed from: h */
    public ad g(v vVar) {
        i.f(vVar, "module");
        ad bqY = vVar.btw().bqY();
        i.e(bqY, "module.builtIns.stringType");
        return bqY;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\"');
        stringBuilder.append((String) getValue());
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }
}
