package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ConstantValueFactory.kt */
public final class h {
    public static final h ftB = new h();

    private h() {
    }

    public final b a(List<? extends g<?>> list, w wVar) {
        i.f(list, ConditionalUserProperty.VALUE);
        i.f(wVar, "type");
        return new b(list, new ConstantValueFactory$createArrayValue$1(wVar));
    }

    public final g<?> dQ(Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new s(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new q(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new t((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(i.X((byte[]) obj), PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return a(i.a((short[]) obj), PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return a(i.p((int[]) obj), PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return a(i.h((long[]) obj), PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return a(i.c((char[]) obj), PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return a(i.d((float[]) obj), PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return a(i.a((double[]) obj), PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return a(i.a((boolean[]) obj), PrimitiveType.BOOLEAN);
        }
        return obj == null ? new r() : null;
    }

    private final b a(List<?> list, PrimitiveType primitiveType) {
        Collection arrayList = new ArrayList();
        for (Object dQ : u.T(list)) {
            g dQ2 = dQ(dQ);
            if (dQ2 != null) {
                arrayList.add(dQ2);
            }
        }
        return new b((List) arrayList, new ConstantValueFactory$createArrayValue$3(primitiveType));
    }
}
