package com.iqoption.core.microservices.useralerts.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001,B\u0007\b\u0016¢\u0006\u0002\u0010\u0002Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0002\u0010\u0012J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010+\u001a\u00020\u0007H\u0016R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006-"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "", "()V", "id", "", "userId", "assetId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "type", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "value", "", "activations", "timeoutSec", "deadlineSec", "createdAtSec", "(JJILcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;DIJJJ)V", "getActivations", "()I", "getAssetId", "createdAt", "getCreatedAt", "()J", "getCreatedAtSec", "deadline", "getDeadline", "getDeadlineSec", "getId", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "timeout", "getTimeout", "getTimeoutSec", "getType", "()Lcom/iqoption/core/microservices/useralerts/response/AssetAlertType;", "getUserId", "getValue", "()D", "equals", "", "other", "hashCode", "Response", "core_release"})
/* compiled from: AssetAlert.kt */
public class a {
    @SerializedName("activations")
    private final int activations;
    @SerializedName("asset_id")
    private final int aqg;
    @SerializedName("type")
    private final AssetAlertType bCY;
    @SerializedName("timeout")
    private final long bCZ;
    @SerializedName("deadline")
    private final long bDa;
    @SerializedName("created_at")
    private final long bDb;
    @SerializedName("id")
    private final long id;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;
    @SerializedName("user_id")
    private final long userId;
    @SerializedName("value")
    private final double value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/useralerts/response/AssetAlert$Response;", "", "()V", "total", "", "records", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "(ILjava/util/List;)V", "getRecords", "()Ljava/util/List;", "getTotal", "()I", "core_release"})
    /* compiled from: AssetAlert.kt */
    public static final class a {
        @SerializedName("records")
        private final List<a> bDc;
        @SerializedName("total")
        private final int total;

        public a(int i, List<? extends a> list) {
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

        public final List<a> ajd() {
            return this.bDc;
        }

        public a() {
            this(0, null, 2, null);
        }
    }

    public a(long j, long j2, int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d, int i2, long j3, long j4, long j5) {
        InstrumentType instrumentType2 = instrumentType;
        AssetAlertType assetAlertType2 = assetAlertType;
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(assetAlertType, "type");
        this.id = j;
        this.userId = j2;
        this.aqg = i;
        this.instrumentType = instrumentType2;
        this.bCY = assetAlertType2;
        this.value = d;
        this.activations = i2;
        this.bCZ = j3;
        this.bDa = j4;
        this.bDb = j5;
    }

    public final long getId() {
        return this.id;
    }

    public final int Bs() {
        return this.aqg;
    }

    public /* synthetic */ a(long j, long j2, int i, InstrumentType instrumentType, AssetAlertType assetAlertType, double d, int i2, long j3, long j4, long j5, int i3, f fVar) {
        int i4 = i3;
        long j6 = -1;
        long j7 = (i4 & 1) != 0 ? -1 : j;
        if ((i4 & 2) == 0) {
            j6 = j2;
        }
        int i5 = (i4 & 4) != 0 ? -1 : i;
        InstrumentType instrumentType2 = (i4 & 8) != 0 ? InstrumentType.UNKNOWN : instrumentType;
        AssetAlertType assetAlertType2 = (i4 & 16) != 0 ? AssetAlertType.UNKNOWN : assetAlertType;
        double d2 = (i4 & 32) != 0 ? 0.0d : d;
        int i6 = (i4 & 64) != 0 ? 1 : i2;
        long j8 = 0;
        long j9 = (i4 & 128) != 0 ? 0 : j3;
        long j10 = (i4 & 256) != 0 ? 0 : j4;
        if ((i4 & 512) == 0) {
            j8 = j5;
        }
        this(j7, j6, i5, instrumentType2, assetAlertType2, d2, i6, j9, j10, j8);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final AssetAlertType ajb() {
        return this.bCY;
    }

    public final double getValue() {
        return this.value;
    }

    public final int getActivations() {
        return this.activations;
    }

    public final long ajc() {
        return this.bDb;
    }

    public a() {
        this(0, 0, 0, null, null, 0.0d, 0, 0, 0, 0, 1022, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            if (this.id == aVar.id && this.userId == aVar.userId && this.aqg == aVar.aqg && this.instrumentType == aVar.instrumentType && this.bCY == aVar.bCY && this.value == aVar.value && this.activations == aVar.activations && this.bCZ == aVar.bCZ && this.bDa == aVar.bDa && this.bDb == aVar.bDb) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.useralerts.response.AssetAlert");
    }

    public int hashCode() {
        return (((((((((((((((((Long.valueOf(this.id).hashCode() * 31) + Long.valueOf(this.userId).hashCode()) * 31) + this.aqg) * 31) + this.instrumentType.hashCode()) * 31) + this.bCY.hashCode()) * 31) + Double.valueOf(this.value).hashCode()) * 31) + this.activations) * 31) + Long.valueOf(this.bCZ).hashCode()) * 31) + Long.valueOf(this.bDa).hashCode()) * 31) + Long.valueOf(this.bDb).hashCode();
    }
}
