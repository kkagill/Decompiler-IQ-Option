package com.iqoption.billing;

import com.iqoption.core.d;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, bng = {"getBillingUrl", "", "billing_release"})
/* compiled from: BillingHostUtils.kt */
public final class a {
    public static final String Kh() {
        String Vn = d.Um().EE().Vn();
        if (!v.b((CharSequence) Vn, '/', false, 2, null)) {
            return Vn;
        }
        int length = Vn.length() - 1;
        if (Vn != null) {
            Vn = Vn.substring(0, length);
            kotlin.jvm.internal.i.e(Vn, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return Vn;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
