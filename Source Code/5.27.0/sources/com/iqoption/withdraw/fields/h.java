package com.iqoption.withdraw.fields;

import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.withdraw.response.j;
import com.iqoption.core.util.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"USD_MASK", "", "feeShortDescription", "", "oldFee", "", "fee", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "withdraw_release"})
/* compiled from: WithdrawFieldsViewModel.kt */
public final class h {
    public static final CharSequence b(double d, j jVar, d dVar) {
        double d2;
        d dVar2 = dVar;
        kotlin.jvm.internal.i.f(dVar2, "currency");
        int i = 0;
        double d3 = (double) null;
        Object obj = d > d3 ? 1 : null;
        double d4 = 0.0d;
        double agx = (obj == null && jVar != null) ? jVar.agx() : 0.0d;
        if (obj != null) {
            d2 = d;
        } else {
            if (jVar != null) {
                d4 = jVar.ajO();
            }
            d2 = d4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (agx > d3) {
            stringBuilder.append(e.a(agx, null, 1, null));
        }
        if (d2 > d3) {
            String a;
            if (stringBuilder.length() > 0) {
                i = 1;
            }
            if (i != 0) {
                stringBuilder.append(" + ");
            }
            if (obj != null) {
                a = e.a(d2, 0, "$%s", true, false, false, false, null, null, 249, null);
            } else {
                a = e.a(d2, dVar2, true);
            }
            stringBuilder.append(a);
        }
        return stringBuilder;
    }
}
