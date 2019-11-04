package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: constantValues.kt */
public final class b extends g<List<? extends g<?>>> {
    private final kotlin.jvm.a.b<v, w> ftz;

    public b(List<? extends g<?>> list, kotlin.jvm.a.b<? super v, ? extends w> bVar) {
        i.f(list, ConditionalUserProperty.VALUE);
        i.f(bVar, "computeType");
        super(list);
        this.ftz = bVar;
    }

    public w g(v vVar) {
        i.f(vVar, "module");
        w wVar = (w) this.ftz.invoke(vVar);
        Object obj = (g.o(wVar) || g.p(wVar)) ? 1 : null;
        if (!m.eVC || obj != null) {
            return wVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type should be an array, but was ");
        stringBuilder.append(wVar);
        stringBuilder.append(": ");
        stringBuilder.append((List) getValue());
        throw new AssertionError(stringBuilder.toString());
    }
}
