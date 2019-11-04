package com.iqoption.fragment.c.a.a;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u0010"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetScheduleItem;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "id", "", "dayName", "", "day", "interval", "isThisDay", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDay", "()Ljava/lang/String;", "getDayName", "getInterval", "()Z", "app_optionXRelease"})
/* compiled from: ConditionsAssetAdapterItems.kt */
public final class g extends j {
    private final String dgL;
    private final boolean dgP;
    private final String dgS;
    private final String dgT;

    public final String aDu() {
        return this.dgL;
    }

    public final String aDA() {
        return this.dgS;
    }

    public final String aDB() {
        return this.dgT;
    }

    public final boolean aDx() {
        return this.dgP;
    }

    public g(int i, String str, String str2, String str3, boolean z) {
        kotlin.jvm.internal.i.f(str, "dayName");
        kotlin.jvm.internal.i.f(str2, "day");
        kotlin.jvm.internal.i.f(str3, "interval");
        super(i + 8, null);
        this.dgL = str;
        this.dgS = str2;
        this.dgT = str3;
        this.dgP = z;
    }
}
