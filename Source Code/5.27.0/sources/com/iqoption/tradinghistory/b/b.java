package com.iqoption.tradinghistory.b;

import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, bng = {"Lcom/iqoption/tradinghistory/details/CommonData;", "Lcom/iqoption/tradinghistory/details/Data;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "closeReason", "", "instruments", "asset", "openPrice", "openTime", "closePrice", "closeTime", "isBuy", "", "leverage", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAsset", "()Ljava/lang/String;", "getClosePrice", "getCloseReason", "getCloseTime", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getInstruments", "()Z", "getLeverage", "getOpenPrice", "getOpenTime", "tradinghistory_release"})
/* compiled from: PositionDetailsViewModel.kt */
public final class b extends c {
    private final String btr;
    private final String closeReason;
    private final String dWB;
    private final String dWC;
    private final String dWD;
    private final String dWE;
    private final String dWF;
    private final String dWG;
    private final InstrumentType instrumentType;
    private final boolean isBuy;

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getCloseReason() {
        return this.closeReason;
    }

    public final String aVr() {
        return this.dWB;
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

    public final String aVy() {
        return this.dWG;
    }

    public b(InstrumentType instrumentType, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(str, "closeReason");
        kotlin.jvm.internal.i.f(str2, "instruments");
        kotlin.jvm.internal.i.f(str3, "asset");
        kotlin.jvm.internal.i.f(str4, "openPrice");
        kotlin.jvm.internal.i.f(str5, "openTime");
        kotlin.jvm.internal.i.f(str6, "closePrice");
        kotlin.jvm.internal.i.f(str7, "closeTime");
        kotlin.jvm.internal.i.f(str8, "leverage");
        super();
        this.instrumentType = instrumentType;
        this.closeReason = str;
        this.dWB = str2;
        this.btr = str3;
        this.dWC = str4;
        this.dWD = str5;
        this.dWE = str6;
        this.dWF = str7;
        this.isBuy = z;
        this.dWG = str8;
    }
}
