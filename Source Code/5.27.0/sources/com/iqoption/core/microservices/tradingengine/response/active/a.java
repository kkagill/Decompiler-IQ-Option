package com.iqoption.core.microservices.tradingengine.response.active;

import android.os.Parcelable;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 62\u00020\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0014H&J\b\u0010\u001c\u001a\u00020\u0004H&J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0014H&J\u000f\u0010 \u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H&J\b\u0010'\u001a\u00020\u0014H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H&J\b\u0010+\u001a\u00020%H&J\n\u0010,\u001a\u0004\u0018\u00010\u0004H&J\b\u0010-\u001a\u00020.H&J\u0010\u0010/\u001a\u00020.2\u0006\u0010&\u001a\u00020%H&J\b\u00100\u001a\u00020.H&J\b\u00101\u001a\u00020.H&J\b\u00102\u001a\u00020.H&J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0000H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006¨\u00067"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Landroid/os/Parcelable;", "()V", "currencyLeft", "", "getCurrencyLeft", "()Ljava/lang/String;", "currencyRight", "getCurrencyRight", "image", "getImage", "instrumentId", "getInstrumentId", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "setInstrumentType", "(Lcom/iqoption/core/data/model/InstrumentType;)V", "multiActiveId", "", "getMultiActiveId", "()I", "setMultiActiveId", "(I)V", "underlying", "getUnderlying", "getActiveId", "getActiveName", "getActiveType", "Lcom/iqoption/core/data/model/ActiveType;", "getCommission", "getGroupId", "()Ljava/lang/Integer;", "getIdentifier", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "getNextSchedule", "", "timeSync", "getPrecision", "getSchedule", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Schedule;", "getStartTime", "getTicker", "isBuybackEnabled", "", "isEnabled", "isExpired", "isSuspended", "isTopTradersEnabled", "update", "", "value", "Companion", "core_release"})
/* compiled from: Active.kt */
public abstract class a implements Parcelable {
    private static final h bzL = new h();
    public static final a bzM = new a();
    private int awv;
    public InstrumentType instrumentType;

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/Active$Companion;", "", "()V", "APPLE_ACTIVE_ID", "", "BASE_PRICE", "", "BINARY_ID", "BITCOIN_100X_ACTIVE_ID", "BITCOIN_ACTIVE_ID", "CFD_ID", "CRYPTO_ID", "DEFAULT_PRECISION", "DIGITAL_ID", "EMPTY", "Lcom/iqoption/core/microservices/tradingengine/response/active/EmptyActive;", "getEMPTY", "()Lcom/iqoption/core/microservices/tradingengine/response/active/EmptyActive;", "EURUSD_ACTIVE_ID", "FOREX_ID", "FX_ID", "OTN_ACTIVE_ID", "TIME_TO_CLOSE_NEVER", "", "TIME_TO_OPEN_NEVER", "TURBO_ID", "convertIdToInstrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "optionTypeId", "convertIdToOptionActiveType", "Lcom/iqoption/core/data/model/ActiveType;", "convertOptionTypeToId", "instrumentType", "core_release"})
    /* compiled from: Active.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final int S(InstrumentType instrumentType) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            int i = b.aob[instrumentType.ordinal()];
            if (i != 1) {
                return i != 2 ? -1 : 1;
            } else {
                return 3;
            }
        }

        public final InstrumentType eZ(int i) {
            if (i != 1) {
                return i != 3 ? null : InstrumentType.TURBO_INSTRUMENT;
            } else {
                return InstrumentType.BINARY_INSTRUMENT;
            }
        }
    }

    public static final int S(InstrumentType instrumentType) {
        return bzM.S(instrumentType);
    }

    public static final InstrumentType eZ(int i) {
        return bzM.eZ(i);
    }

    public abstract boolean aX(long j);

    public abstract long aY(long j);

    public abstract String adZ();

    public String agB() {
        return "";
    }

    public abstract String ahN();

    public abstract String ahO();

    public abstract String ahP();

    public abstract boolean ahQ();

    public abstract int ahR();

    public abstract Integer ahS();

    public abstract List<m> ahT();

    public abstract int getActiveId();

    public abstract String getImage();

    public String getInstrumentId() {
        return "";
    }

    public abstract int getPrecision();

    public abstract long getStartTime();

    public abstract boolean isExpired();

    public abstract boolean isSuspended();

    public abstract void y(a aVar);

    public final void M(InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "<set-?>");
        this.instrumentType = instrumentType;
    }

    public final InstrumentType getInstrumentType() {
        InstrumentType instrumentType = this.instrumentType;
        if (instrumentType == null) {
            kotlin.jvm.internal.i.lG("instrumentType");
        }
        return instrumentType;
    }

    public final int ahM() {
        return this.awv;
    }

    public final void eY(int i) {
        this.awv = i;
    }

    public ActiveType getActiveType() {
        InstrumentType instrumentType = this.instrumentType;
        if (instrumentType == null) {
            kotlin.jvm.internal.i.lG("instrumentType");
        }
        return instrumentType.toOptionActiveType();
    }

    public final f ahU() {
        InstrumentType instrumentType = this.instrumentType;
        if (instrumentType == null) {
            kotlin.jvm.internal.i.lG("instrumentType");
        }
        return new f(instrumentType, getActiveId());
    }
}
