package com.iqoption.core.microservices.withdraw.response;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a9\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, bng = {"getAmountLowerLimit", "Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "withdrawMethodLimit", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "getAmountUpperLimit", "walletAmount", "", "totalMaxIncludingFee", "oldFee", "refundAmount", "(DLjava/lang/Double;DLjava/lang/Double;Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;)Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "core_release"})
/* compiled from: AmountLimits.kt */
public final class b {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Double.valueOf(((a) t).getValue()), Double.valueOf(((a) t2).getValue()));
        }
    }

    public static final a a(double d, Double d2, double d3, Double d4, k kVar) {
        List arrayList = new ArrayList();
        d = Math.max(0.0d, d - d3);
        if (d2 != null) {
            d = Math.min(d, d2.doubleValue());
        }
        arrayList.add(new a(d, LimitType.WALLET_AMOUNT, LimitDirection.UPPER));
        if (d4 != null) {
            arrayList.add(new a(d4.doubleValue(), LimitType.CARD_REFUND_LIMIT, LimitDirection.UPPER));
        }
        if (kVar != null) {
            d = kVar.getMax();
            if (d > ((double) 0)) {
                arrayList.add(new a(d, LimitType.WITHDRAW_METHOD_LIMIT, LimitDirection.UPPER));
            }
        }
        if (arrayList.size() > 1) {
            q.a(arrayList, new a());
        }
        return (a) u.bU(arrayList);
    }

    public static final a a(k kVar) {
        return new a(kVar != null ? kVar.getMin() : 0.0d, LimitType.WITHDRAW_METHOD_LIMIT, LimitDirection.LOWER);
    }
}
