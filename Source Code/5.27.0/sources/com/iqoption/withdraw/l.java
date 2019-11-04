package com.iqoption.withdraw;

import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.withdraw.response.o;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, bng = {"Lcom/iqoption/withdraw/WithdrawalHistoryData;", "", "payouts", "", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "currencies", "", "", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "(Ljava/util/List;Ljava/util/Map;)V", "getCurrencies", "()Ljava/util/Map;", "getPayouts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "withdraw_release"})
/* compiled from: WithdrawRepository.kt */
public final class l {
    private final List<o> epE;
    private final Map<String, d> epF;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.epF, r3.epF) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.withdraw.l;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.withdraw.l) r3;
        r0 = r2.epE;
        r1 = r3.epE;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.epF;
        r3 = r3.epF;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.l.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.epE;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Map map = this.epF;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawalHistoryData(payouts=");
        stringBuilder.append(this.epE);
        stringBuilder.append(", currencies=");
        stringBuilder.append(this.epF);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public l(List<o> list, Map<String, d> map) {
        kotlin.jvm.internal.i.f(list, "payouts");
        kotlin.jvm.internal.i.f(map, "currencies");
        this.epE = list;
        this.epF = map;
    }

    public final List<o> bbY() {
        return this.epE;
    }

    public final Map<String, d> bbZ() {
        return this.epF;
    }
}
