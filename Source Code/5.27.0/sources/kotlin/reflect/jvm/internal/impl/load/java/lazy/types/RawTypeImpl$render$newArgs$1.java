package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: RawType.kt */
final class RawTypeImpl$render$newArgs$1 extends Lambda implements b<String, String> {
    public static final RawTypeImpl$render$newArgs$1 fkx = new RawTypeImpl$render$newArgs$1();

    RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    /* renamed from: fn */
    public final String invoke(String str) {
        i.f(str, "it");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(raw) ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
