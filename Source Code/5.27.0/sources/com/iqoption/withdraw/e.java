package com.iqoption.withdraw;

import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.core.microservices.withdraw.response.l;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, bng = {"Lcom/iqoption/withdraw/RawWithdrawRepositoryMethodsData;", "", "cards", "", "Lcom/iqoption/core/microservices/withdraw/response/Card;", "methods", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethod;", "payoutSettings", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "(Ljava/util/List;Ljava/util/List;Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;Lcom/iqoption/core/microservices/internalbilling/response/Balance;Lcom/iqoption/core/microservices/configuration/response/Currency;)V", "getBalance", "()Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "getCards", "()Ljava/util/List;", "getCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "getMethods", "getPayoutSettings", "()Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "withdraw_release"})
/* compiled from: WithdrawRepository.kt */
final class e {
    private final List<l> bEh;
    private final b bcM;
    private final d bcN;
    private final List<com.iqoption.core.microservices.withdraw.response.d> epe;
    private final com.iqoption.core.microservices.withdraw.response.i epf;

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bcN, r3.bcN) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.withdraw.e;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.withdraw.e) r3;
        r0 = r2.epe;
        r1 = r3.epe;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.bEh;
        r1 = r3.bEh;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.epf;
        r1 = r3.epf;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.bcM;
        r1 = r3.bcM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.bcN;
        r3 = r3.bcN;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.epe;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.bEh;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        com.iqoption.core.microservices.withdraw.response.i iVar = this.epf;
        hashCode = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        b bVar = this.bcM;
        hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        d dVar = this.bcN;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RawWithdrawRepositoryMethodsData(cards=");
        stringBuilder.append(this.epe);
        stringBuilder.append(", methods=");
        stringBuilder.append(this.bEh);
        stringBuilder.append(", payoutSettings=");
        stringBuilder.append(this.epf);
        stringBuilder.append(", balance=");
        stringBuilder.append(this.bcM);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.bcN);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(List<com.iqoption.core.microservices.withdraw.response.d> list, List<l> list2, com.iqoption.core.microservices.withdraw.response.i iVar, b bVar, d dVar) {
        kotlin.jvm.internal.i.f(list, "cards");
        kotlin.jvm.internal.i.f(list2, "methods");
        kotlin.jvm.internal.i.f(iVar, "payoutSettings");
        kotlin.jvm.internal.i.f(bVar, "balance");
        kotlin.jvm.internal.i.f(dVar, "currency");
        this.epe = list;
        this.bEh = list2;
        this.epf = iVar;
        this.bcM = bVar;
        this.bcN = dVar;
    }

    public final List<com.iqoption.core.microservices.withdraw.response.d> bbR() {
        return this.epe;
    }

    public final List<l> ajQ() {
        return this.bEh;
    }

    public final com.iqoption.core.microservices.withdraw.response.i bbS() {
        return this.epf;
    }

    public final b VL() {
        return this.bcM;
    }

    public final d VM() {
        return this.bcN;
    }
}
