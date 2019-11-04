package com.iqoption.deposit.d;

import android.content.res.Resources;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.core.d;
import com.iqoption.core.microservices.billing.response.deposit.cashboxitem.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/deposit/util/DepositAnalyticUtils;", "", "()V", "getDepositScreenParams", "Lcom/google/gson/JsonObject;", "cashboxItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "deposit_release"})
/* compiled from: DepositAnalyticUtils.kt */
public final class a {
    public static final a cGB = new a();

    private a() {
    }

    public final JsonObject atf() {
        JsonObject jsonObject = new JsonObject();
        Resources resources = d.Uo().getResources();
        kotlin.jvm.internal.i.e(resources, "appContext.resources");
        int i = 1;
        if (resources.getConfiguration().orientation == 1) {
            i = 0;
        }
        jsonObject.add("landscape", new JsonPrimitive((Number) Integer.valueOf(i)));
        return jsonObject;
    }

    public final JsonObject o(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
        Long l = null;
        if (!(aVar instanceof c)) {
            aVar = null;
        }
        c cVar = (c) aVar;
        if (cVar != null) {
            l = Long.valueOf(cVar.aaD());
        }
        JsonObject atf = atf();
        if (l != null) {
            atf.add("payment_method_id", new JsonPrimitive((Number) Long.valueOf(l.longValue())));
        }
        return atf;
    }
}
