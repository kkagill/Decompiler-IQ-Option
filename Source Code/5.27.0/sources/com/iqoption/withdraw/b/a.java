package com.iqoption.withdraw.b;

import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.withdraw.response.o;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, bng = {"Lcom/iqoption/withdraw/history/AdapterData;", "", "payouts", "", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "cancellationProgress", "", "", "currencies", "", "", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Map;)V", "getCancellationProgress", "()Ljava/util/Set;", "getCurrencies", "()Ljava/util/Map;", "getPayouts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "withdraw_release"})
/* compiled from: WithdrawHistoryAdapter.kt */
public final class a {
    private final List<o> epE;
    private final Map<String, d> epF;
    private final Set<Long> esC;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.epF, r3.epF) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.withdraw.b.a;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.withdraw.b.a) r3;
        r0 = r2.epE;
        r1 = r3.epE;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.esC;
        r1 = r3.esC;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.epF;
        r3 = r3.epF;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.b.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.epE;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Set set = this.esC;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.epF;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdapterData(payouts=");
        stringBuilder.append(this.epE);
        stringBuilder.append(", cancellationProgress=");
        stringBuilder.append(this.esC);
        stringBuilder.append(", currencies=");
        stringBuilder.append(this.epF);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(List<o> list, Set<Long> set, Map<String, d> map) {
        kotlin.jvm.internal.i.f(list, "payouts");
        kotlin.jvm.internal.i.f(set, "cancellationProgress");
        kotlin.jvm.internal.i.f(map, "currencies");
        this.epE = list;
        this.esC = set;
        this.epF = map;
    }

    public final List<o> bbY() {
        return this.epE;
    }

    public final Map<String, d> bbZ() {
        return this.epF;
    }

    public final Set<Long> bcM() {
        return this.esC;
    }
}
