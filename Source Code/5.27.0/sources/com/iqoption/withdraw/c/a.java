package com.iqoption.withdraw.c;

import android.content.Context;
import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.core.microservices.withdraw.response.c;
import com.iqoption.core.microservices.withdraw.response.e;
import com.iqoption.core.microservices.withdraw.response.k;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ/\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, bng = {"Lcom/iqoption/withdraw/methods/BalanceHolder;", "", "context", "Landroid/content/Context;", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "totalAmountWithFeeByMethod", "", "", "", "amountToRefund", "(Landroid/content/Context;Lcom/iqoption/core/microservices/internalbilling/response/Balance;Lcom/iqoption/core/microservices/configuration/response/Currency;Ljava/util/Map;D)V", "getAmountToRefund", "()D", "getBalance", "()Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "getContext", "()Landroid/content/Context;", "getCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "getTotalAmountWithFeeByMethod", "()Ljava/util/Map;", "getAmountUpperLimit", "Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "methodId", "commission", "refundAmount", "withMethodLimit", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "(JDLjava/lang/Double;Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;)Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "getFormattedAmountToRefund", "", "withdraw_release"})
/* compiled from: WithdrawMethodsViewModel.kt */
final class a {
    private final b bcM;
    private final d bcN;
    private final Context context;
    private final Map<Long, Double> epy;
    private final double esY;

    public a(Context context, b bVar, d dVar, Map<Long, Double> map, double d) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(bVar, "balance");
        kotlin.jvm.internal.i.f(dVar, "currency");
        kotlin.jvm.internal.i.f(map, "totalAmountWithFeeByMethod");
        this.context = context;
        this.bcM = bVar;
        this.bcN = dVar;
        this.epy = map;
        this.esY = d;
    }

    public final com.iqoption.core.microservices.withdraw.response.a a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "method");
        Double d = null;
        e eVar = (e) (!(cVar instanceof e) ? null : cVar);
        if (eVar != null) {
            d = Double.valueOf(eVar.ajG());
        }
        return a(cVar.getId(), cVar.ajB(), d, cVar.ajE());
    }

    public final com.iqoption.core.microservices.withdraw.response.a a(long j, double d, Double d2, k kVar) {
        return com.iqoption.core.microservices.withdraw.response.b.a(this.bcM.aeo().doubleValue(), (Double) this.epy.get(Long.valueOf(j)), d, d2, kVar);
    }

    public final String bcV() {
        return com.iqoption.core.util.e.a(this.esY, 0, this.bcN.getMask(), false, false, false, false, null, null, 253, null);
    }
}
