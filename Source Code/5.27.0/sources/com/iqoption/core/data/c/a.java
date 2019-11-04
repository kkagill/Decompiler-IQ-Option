package com.iqoption.core.data.c;

import com.iqoption.core.microservices.configuration.a.d;
import com.iqoption.core.microservices.internalbilling.a.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000  2\u00020\u0001:\u0001 B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015¨\u0006!"}, bng = {"Lcom/iqoption/core/data/mediators/BalanceData;", "", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "isReal", "", "amount", "", "(Lcom/iqoption/core/microservices/internalbilling/response/Balance;Lcom/iqoption/core/microservices/configuration/response/Currency;ZLjava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBalance", "()Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "getCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "currencyName", "getCurrencyName", "currencySymbol", "getCurrencySymbol", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "core_release"})
/* compiled from: BalanceMediator.kt */
public final class a {
    private static final a bcP;
    public static final a bcQ = new a();
    private final String amount;
    private final b bcM;
    private final d bcN;
    private final boolean bcO;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/data/mediators/BalanceData$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/data/mediators/BalanceData;", "getEMPTY", "()Lcom/iqoption/core/data/mediators/BalanceData;", "core_release"})
    /* compiled from: BalanceMediator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a VP() {
            return a.bcP;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.bcM, aVar.bcM) && kotlin.jvm.internal.i.y(this.bcN, aVar.bcN)) {
                    if ((this.bcO == aVar.bcO ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.amount, aVar.amount)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        b bVar = this.bcM;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        d dVar = this.bcN;
        hashCode = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        int i2 = this.bcO;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.amount;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BalanceData(balance=");
        stringBuilder.append(this.bcM);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.bcN);
        stringBuilder.append(", isReal=");
        stringBuilder.append(this.bcO);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.amount);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(b bVar, d dVar, boolean z, String str) {
        kotlin.jvm.internal.i.f(bVar, "balance");
        kotlin.jvm.internal.i.f(dVar, "currency");
        kotlin.jvm.internal.i.f(str, "amount");
        this.bcM = bVar;
        this.bcN = dVar;
        this.bcO = z;
        this.amount = str;
    }

    public final b VL() {
        return this.bcM;
    }

    public final d VM() {
        return this.bcN;
    }

    public final boolean isReal() {
        return this.bcO;
    }

    public final String VN() {
        return this.amount;
    }

    public final String VK() {
        return this.bcN.getName();
    }

    static {
        b bVar = r1;
        b bVar2 = new b(0, 0, 0, null, null, null, null, null, null, null, null, false, 4095, null);
        bcP = new a(bVar, d.brN.acT(), false, "");
    }
}
