package com.iqoption.tradinghistory.filter.b;

import com.iqoption.core.d;
import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.tradinghistory.g.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, bng = {"getDescription", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "tradinghistory_release"})
/* compiled from: BalanceExtensions.kt */
public final class a {
    public static final String e(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "$this$getDescription");
        int type = bVar.getType();
        if (type == 1) {
            return d.getString(f.real_balance);
        }
        if (type == 2) {
            String aeq = bVar.aeq();
            CharSequence charSequence = aeq;
            Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj != null || u.v("null", aeq, true)) {
                return d.getString(f.tournament);
            }
            if (aeq != null) {
                return aeq;
            }
            kotlin.jvm.internal.i.bnJ();
            return aeq;
        } else if (type != 4) {
            return "";
        } else {
            return d.getString(f.practice);
        }
    }
}
