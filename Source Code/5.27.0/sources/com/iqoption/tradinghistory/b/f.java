package com.iqoption.tradinghistory.b;

import androidx.annotation.ColorInt;
import androidx.core.app.NotificationCompat;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, bng = {"Lcom/iqoption/tradinghistory/details/MultiItemData;", "", "asset", "", "openPrice", "openTime", "closePrice", "closeTime", "isBuy", "", "status", "statusColor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V", "getAsset", "()Ljava/lang/String;", "getClosePrice", "getCloseTime", "()Z", "getOpenPrice", "getOpenTime", "getStatus", "getStatusColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "tradinghistory_release"})
/* compiled from: PositionDetailsViewModel.kt */
public final class f {
    private final String btr;
    private final String dWC;
    private final String dWD;
    private final String dWE;
    private final String dWF;
    private final Integer dWK;
    private final boolean isBuy;
    private final String status;

    public f(String str, String str2, String str3, String str4, String str5, boolean z, String str6, @ColorInt Integer num) {
        kotlin.jvm.internal.i.f(str, "asset");
        kotlin.jvm.internal.i.f(str2, "openPrice");
        kotlin.jvm.internal.i.f(str3, "openTime");
        kotlin.jvm.internal.i.f(str4, "closePrice");
        kotlin.jvm.internal.i.f(str5, "closeTime");
        kotlin.jvm.internal.i.f(str6, NotificationCompat.CATEGORY_STATUS);
        this.btr = str;
        this.dWC = str2;
        this.dWD = str3;
        this.dWE = str4;
        this.dWF = str5;
        this.isBuy = z;
        this.status = str6;
        this.dWK = num;
    }

    public final String aVs() {
        return this.btr;
    }

    public final String aVt() {
        return this.dWC;
    }

    public final String aVu() {
        return this.dWD;
    }

    public final String aVv() {
        return this.dWE;
    }

    public final String aVw() {
        return this.dWF;
    }

    public final boolean aVx() {
        return this.isBuy;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer aVC() {
        return this.dWK;
    }
}
