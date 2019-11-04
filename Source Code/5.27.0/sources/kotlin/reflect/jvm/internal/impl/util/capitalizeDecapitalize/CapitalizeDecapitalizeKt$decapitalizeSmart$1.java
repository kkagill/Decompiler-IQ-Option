package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

/* compiled from: capitalizeDecapitalize.kt */
final class CapitalizeDecapitalizeKt$decapitalizeSmart$1 extends Lambda implements b<Integer, Boolean> {
    final /* synthetic */ boolean $asciiOnly;
    final /* synthetic */ String $this_decapitalizeSmart;

    CapitalizeDecapitalizeKt$decapitalizeSmart$1(String str, boolean z) {
        this.$this_decapitalizeSmart = str;
        this.$asciiOnly = z;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(mB(((Number) obj).intValue()));
    }

    public final boolean mB(int i) {
        char charAt = this.$this_decapitalizeSmart.charAt(i);
        if (this.$asciiOnly) {
            return 'A' <= charAt && 'Z' >= charAt;
        } else {
            return Character.isUpperCase(charAt);
        }
    }
}
