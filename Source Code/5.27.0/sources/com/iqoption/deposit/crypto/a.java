package com.iqoption.deposit.crypto;

import androidx.annotation.ColorInt;
import com.iqoption.core.d;
import com.iqoption.deposit.o.b;
import com.iqoption.deposit.o.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, bng = {"getStatusColor", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "getStatusDescription", "", "deposit_release"})
/* compiled from: CryptoDepositExtesions.kt */
public final class a {
    public static final String b(com.iqoption.core.microservices.billing.response.crypto.a aVar) {
        int i;
        kotlin.jvm.internal.i.f(aVar, "$this$getStatusDescription");
        int i2 = b.aob[aVar.ZR().ordinal()];
        if (i2 == 1) {
            i = g.success2;
        } else if (i2 == 2 || i2 == 3) {
            i = g.in_progress;
        } else if (i2 == 4 || i2 == 5) {
            i = g.failed;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected state for status name ");
            stringBuilder.append(aVar.ZR());
            throw new IllegalStateException(stringBuilder.toString());
        }
        String string = d.Uo().getString(i);
        kotlin.jvm.internal.i.e(string, "appContext.getString(statusResId)");
        return u.mY(string);
    }

    @ColorInt
    public static final int c(com.iqoption.core.microservices.billing.response.crypto.a aVar) {
        int i;
        kotlin.jvm.internal.i.f(aVar, "$this$getStatusColor");
        int i2 = b.axg[aVar.ZR().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            i = b.green;
        } else if (i2 == 4 || i2 == 5) {
            i = b.red;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected state for status color ");
            stringBuilder.append(aVar.ZR());
            throw new IllegalStateException(stringBuilder.toString());
        }
        return com.iqoption.core.ext.a.k(d.Uo(), i);
    }
}
