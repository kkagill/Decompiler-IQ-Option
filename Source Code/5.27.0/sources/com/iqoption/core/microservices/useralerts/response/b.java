package com.iqoption.core.microservices.useralerts.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0016¢\u0006\u0002\u0010\u0002BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "", "()V", "id", "", "timestampSec", "userId", "assetId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "type", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "value", "", "(JJJILcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;D)V", "getAssetId", "()I", "getId", "()J", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "timestamp", "getTimestamp", "getTimestampSec", "getType", "()Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "getUserId", "getValue", "()D", "Response", "core_release"})
/* compiled from: AssetAlertTrigger.kt */
public final class b {
    @SerializedName("asset_id")
    private final int aqg;
    @SerializedName("type")
    private final AssetAlertType bCY;
    @SerializedName("timestamp")
    private final long bDe;
    @SerializedName("id")
    private final long id;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;
    @SerializedName("user_id")
    private final long userId;
    @SerializedName("value")
    private final double value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger$Response;", "", "()V", "total", "", "records", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertTrigger;", "(ILjava/util/List;)V", "getRecords", "()Ljava/util/List;", "getTotal", "()I", "core_release"})
    /* compiled from: AssetAlertTrigger.kt */
    public static final class a {
        @SerializedName("records")
        private final List<b> bDc;
        @SerializedName("total")
        private final int total;

        public a(int i, List<b> list) {
            kotlin.jvm.internal.i.f(list, "records");
            this.total = i;
            this.bDc = list;
        }

        public /* synthetic */ a(int i, List list, int i2, f fVar) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                list = m.emptyList();
            }
            this(i, list);
        }

        public final List<b> ajd() {
            return this.bDc;
        }

        public a() {
            this(0, null, 2, null);
        }
    }

    public b(long j, long j2, long j3, int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(assetAlertType, "type");
        this.id = j;
        this.bDe = j2;
        this.userId = j3;
        this.aqg = i;
        this.instrumentType = instrumentType;
        this.bCY = assetAlertType;
        this.value = d;
    }

    public final long getId() {
        return this.id;
    }

    public final long ajf() {
        return this.bDe;
    }

    public final int Bs() {
        return this.aqg;
    }

    public /* synthetic */ b(long j, long j2, long j3, int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d, int i2, f fVar) {
        long j4 = -1;
        long j5 = (i2 & 1) != 0 ? -1 : j;
        long j6 = (i2 & 2) != 0 ? 0 : j2;
        if ((i2 & 4) == 0) {
            j4 = j3;
        }
        this(j5, j6, j4, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? InstrumentType.UNKNOWN : instrumentType, (i2 & 32) != 0 ? AssetAlertType.UNKNOWN : assetAlertType, (i2 & 64) != 0 ? 0.0d : d);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final double getValue() {
        return this.value;
    }

    public final long getTimestamp() {
        return this.bDe * ((long) 1000);
    }

    public b() {
        this(-1, 0, 0, 0, null, null, 0.0d, 126, null);
    }
}
