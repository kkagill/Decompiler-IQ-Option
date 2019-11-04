package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: RawType.kt */
final class RawTypeImpl$render$1 extends Lambda implements m<String, String, Boolean> {
    public static final RawTypeImpl$render$1 fkv = new RawTypeImpl$render$1();

    RawTypeImpl$render$1() {
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return Boolean.valueOf(bb((String) obj, (String) obj2));
    }

    public final boolean bb(String str, String str2) {
        i.f(str, "first");
        i.f(str2, "second");
        return i.y(str, v.a(str2, (CharSequence) "out ")) || i.y(str2, "*");
    }
}
