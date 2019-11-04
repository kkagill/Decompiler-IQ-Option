package com.iqoption.fragment.c.a.a;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetOvernightItem;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "id", "", "dayName", "", "time", "long", "", "short", "isThisDay", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)V", "getDayName", "()Ljava/lang/String;", "()Z", "getLong", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getShort", "getTime", "app_optionXRelease"})
/* compiled from: ConditionsAssetAdapterItems.kt */
public final class d extends j {
    private final String dgL;
    private final String dgM;
    private final Double dgN;
    private final Double dgO;
    private final boolean dgP;

    public final String aDu() {
        return this.dgL;
    }

    public final String getTime() {
        return this.dgM;
    }

    public final Double aDv() {
        return this.dgN;
    }

    public final Double aDw() {
        return this.dgO;
    }

    public final boolean aDx() {
        return this.dgP;
    }

    public d(int i, String str, String str2, Double d, Double d2, boolean z) {
        kotlin.jvm.internal.i.f(str, "dayName");
        super(i + 16, null);
        this.dgL = str;
        this.dgM = str2;
        this.dgN = d;
        this.dgO = d2;
        this.dgP = z;
    }
}
