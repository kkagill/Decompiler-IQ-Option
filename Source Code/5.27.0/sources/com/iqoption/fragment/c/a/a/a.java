package com.iqoption.fragment.c.a.a;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetBaseCfd;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "minInvest", "", "spread", "", "leverage", "", "exp", "commissions", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCommissions", "()Ljava/lang/String;", "getExp", "getLeverage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinInvest", "getSpread", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetBaseCfd;", "equals", "", "other", "", "hashCode", "toString", "app_optionXRelease"})
/* compiled from: ConditionsAssetAdapterItems.kt */
public final class a extends j {
    private final Double akT;
    private final String dgH;
    private final String dgI;
    private final String dgJ;
    private final Integer leverage;

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dgJ, r3.dgJ) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.fragment.c.a.a.a;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.fragment.c.a.a.a) r3;
        r0 = r2.dgH;
        r1 = r3.dgH;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.akT;
        r1 = r3.akT;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.leverage;
        r1 = r3.leverage;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.dgI;
        r1 = r3.dgI;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.dgJ;
        r3 = r3.dgJ;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.c.a.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.dgH;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Double d = this.akT;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Integer num = this.leverage;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.dgI;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dgJ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetBaseCfd(minInvest=");
        stringBuilder.append(this.dgH);
        stringBuilder.append(", spread=");
        stringBuilder.append(this.akT);
        stringBuilder.append(", leverage=");
        stringBuilder.append(this.leverage);
        stringBuilder.append(", exp=");
        stringBuilder.append(this.dgI);
        stringBuilder.append(", commissions=");
        stringBuilder.append(this.dgJ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final String aDo() {
        return this.dgH;
    }

    public final Double aDp() {
        return this.akT;
    }

    public final Integer aDq() {
        return this.leverage;
    }

    public final String aDr() {
        return this.dgI;
    }

    public final String aDs() {
        return this.dgJ;
    }

    public a(String str, Double d, Integer num, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "minInvest");
        kotlin.jvm.internal.i.f(str2, "exp");
        kotlin.jvm.internal.i.f(str3, "commissions");
        super(2, null);
        this.dgH = str;
        this.akT = d;
        this.leverage = num;
        this.dgI = str2;
        this.dgJ = str3;
    }
}
