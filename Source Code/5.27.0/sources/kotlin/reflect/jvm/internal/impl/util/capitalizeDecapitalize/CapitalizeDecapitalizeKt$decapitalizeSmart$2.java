package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: capitalizeDecapitalize.kt */
final class CapitalizeDecapitalizeKt$decapitalizeSmart$2 extends Lambda implements b<String, String> {
    final /* synthetic */ boolean $asciiOnly;

    CapitalizeDecapitalizeKt$decapitalizeSmart$2(boolean z) {
        this.$asciiOnly = z;
        super(1);
    }

    /* renamed from: fn */
    public final String invoke(String str) {
        i.f(str, "string");
        if (this.$asciiOnly) {
            return a.mR(str);
        }
        str = str.toLowerCase();
        i.e(str, "(this as java.lang.String).toLowerCase()");
        return str;
    }
}
