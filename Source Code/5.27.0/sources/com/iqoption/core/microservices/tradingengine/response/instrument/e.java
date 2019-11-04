package com.iqoption.core.microservices.tradingengine.response.instrument;

import androidx.core.app.NotificationCompat;
import com.google.common.collect.Ordering;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import java.util.Comparator;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 >2\u00020\u0001:\u0002>?BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u00100\u001a\u00020\u0003HÂ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003JY\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00109\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\nHÖ\u0001R\u000e\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001fR\u001a\u0010 \u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R\u0011\u0010*\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010.\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b/\u0010\"¨\u0006@"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "", "_value", "", "call", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Value;", "put", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "underlying", "", "expirationMillis", "periodSec", "isSpot", "", "(JLcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Value;Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Value;Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;JJZ)V", "_expirationSec", "_periodMillis", "_strikeKey", "_valueAsDouble", "", "getCall", "()Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Value;", "setCall", "(Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Value;)V", "getExpirationMillis", "()J", "expirationSec", "getExpirationSec", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "()Z", "lastSpotValue", "getLastSpotValue", "()D", "setLastSpotValue", "(D)V", "periodMillis", "getPeriodMillis", "getPeriodSec", "getPut", "setPut", "strikeKey", "getStrikeKey", "()Ljava/lang/String;", "getUnderlying", "value", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "Value", "core_release"})
/* compiled from: Strike.kt */
public final class e {
    public static final Ordering<e> ORDERING = new b();
    private static final d bBb = g.c(Strike$Companion$COMPARATOR$2.bBd);
    public static final a bBc = new a();
    @SerializedName("isSpot")
    private final boolean bAP;
    private volatile long bAR = -1;
    private volatile long bAS = -1;
    private volatile double bAT = -1.0d;
    private volatile String bAU = "";
    private volatile double bAV;
    @SerializedName("value")
    private final long bAW;
    @SerializedName("call")
    private c bAX;
    @SerializedName("put")
    private c bAY;
    @SerializedName("expiration")
    private final long bAZ;
    @SerializedName("period")
    private final long bBa;
    @SerializedName("instrumentType")
    private final InstrumentType instrumentType;
    @SerializedName("underlying")
    private final String underlying;

    @i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R+\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Companion;", "", "()V", "COMPARATOR", "Ljava/util/Comparator;", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "Lkotlin/Comparator;", "getCOMPARATOR", "()Ljava/util/Comparator;", "COMPARATOR$delegate", "Lkotlin/Lazy;", "ORDERING", "Lcom/google/common/collect/Ordering;", "key", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "underlying", "expiration", "", "value", "period", "isSpot", "", "core_release"})
    /* compiled from: Strike.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "COMPARATOR", "getCOMPARATOR()Ljava/util/Comparator;"))};

        private final Comparator<e> aiF() {
            d aiE = e.bBb;
            a aVar = e.bBc;
            j jVar = anY[0];
            return (Comparator) aiE.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String a(InstrumentType instrumentType, String str, long j, long j2, long j3, boolean z) {
            kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
            String str2 = z ? "_SPT" : "";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(instrumentType);
            stringBuilder.append(str);
            stringBuilder.append(j);
            stringBuilder.append('_');
            stringBuilder.append(j2);
            stringBuilder.append('_');
            stringBuilder.append(j3);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike$Value;", "", "id", "", "multiplier", "", "minCount", "", "currency", "cfi", "isEnabled", "", "period", "", "(Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;ZJ)V", "getCfi", "()Ljava/lang/String;", "getCurrency", "getId", "()Z", "getMinCount", "()D", "getMultiplier", "()I", "getPeriod", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "core_release"})
    /* compiled from: Strike.kt */
    public static final class c {
        @SerializedName("multiplier")
        private final int bBe;
        @SerializedName("minCount")
        private final double bBf;
        @SerializedName("cfi")
        private final String bBg;
        @SerializedName("currency")
        private final String currency;
        @SerializedName("id")
        private final String id;
        @SerializedName("isEnabled")
        private final boolean isEnabled;
        @SerializedName("period")
        private final long period;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (kotlin.jvm.internal.i.y(this.id, cVar.id)) {
                        if ((this.bBe == cVar.bBe ? 1 : null) != null && Double.compare(this.bBf, cVar.bBf) == 0 && kotlin.jvm.internal.i.y(this.currency, cVar.currency) && kotlin.jvm.internal.i.y(this.bBg, cVar.bBg)) {
                            if ((this.isEnabled == cVar.isEnabled ? 1 : null) != null) {
                                if ((this.period == cVar.period ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.id;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.bBe) * 31;
            long doubleToLongBits = Double.doubleToLongBits(this.bBf);
            hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            String str2 = this.currency;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.bBg;
            if (str2 != null) {
                i = str2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.isEnabled;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            long j = this.period;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Value(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", multiplier=");
            stringBuilder.append(this.bBe);
            stringBuilder.append(", minCount=");
            stringBuilder.append(this.bBf);
            stringBuilder.append(", currency=");
            stringBuilder.append(this.currency);
            stringBuilder.append(", cfi=");
            stringBuilder.append(this.bBg);
            stringBuilder.append(", isEnabled=");
            stringBuilder.append(this.isEnabled);
            stringBuilder.append(", period=");
            stringBuilder.append(this.period);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public c(String str, int i, double d, String str2, String str3, boolean z, long j) {
            kotlin.jvm.internal.i.f(str, "id");
            kotlin.jvm.internal.i.f(str2, "currency");
            this.id = str;
            this.bBe = i;
            this.bBf = d;
            this.currency = str2;
            this.bBg = str3;
            this.isEnabled = z;
            this.period = j;
        }

        public final String getId() {
            return this.id;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final long aix() {
            return this.period;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/core/microservices/tradingengine/response/instrument/Strike$Companion$ORDERING$1", "Lcom/google/common/collect/Ordering;", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "compare", "", "left", "right", "core_release"})
    /* compiled from: Strike.kt */
    public static final class b extends Ordering<e> {
        b() {
        }

        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            return e.bBc.aiF().compare(eVar, eVar2);
        }
    }

    public static final String a(InstrumentType instrumentType, String str, long j, long j2, long j3, boolean z) {
        return bBc.a(instrumentType, str, j, j2, j3, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if ((this.bAW == eVar.bAW ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bAX, eVar.bAX) && kotlin.jvm.internal.i.y(this.bAY, eVar.bAY) && kotlin.jvm.internal.i.y(this.instrumentType, eVar.instrumentType) && kotlin.jvm.internal.i.y(this.underlying, eVar.underlying)) {
                    if ((this.bAZ == eVar.bAZ ? 1 : null) != null) {
                        if ((this.bBa == eVar.bBa ? 1 : null) != null) {
                            if ((this.bAP == eVar.bAP ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bAW;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        c cVar = this.bAX;
        int i2 = 0;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        cVar = this.bAY;
        i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        InstrumentType instrumentType = this.instrumentType;
        i = (i + (instrumentType != null ? instrumentType.hashCode() : 0)) * 31;
        String str = this.underlying;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        long j2 = this.bAZ;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.bBa;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i3 = this.bAP;
        if (i3 != 0) {
            i3 = 1;
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Strike(_value=");
        stringBuilder.append(this.bAW);
        stringBuilder.append(", call=");
        stringBuilder.append(this.bAX);
        stringBuilder.append(", put=");
        stringBuilder.append(this.bAY);
        stringBuilder.append(", instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(", underlying=");
        stringBuilder.append(this.underlying);
        stringBuilder.append(", expirationMillis=");
        stringBuilder.append(this.bAZ);
        stringBuilder.append(", periodSec=");
        stringBuilder.append(this.bBa);
        stringBuilder.append(", isSpot=");
        stringBuilder.append(this.bAP);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(long j, c cVar, c cVar2, InstrumentType instrumentType, String str, long j2, long j3, boolean z) {
        kotlin.jvm.internal.i.f(cVar, NotificationCompat.CATEGORY_CALL);
        kotlin.jvm.internal.i.f(cVar2, "put");
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(str, "underlying");
        this.bAW = j;
        this.bAX = cVar;
        this.bAY = cVar2;
        this.instrumentType = instrumentType;
        this.underlying = str;
        this.bAZ = j2;
        this.bBa = j3;
        this.bAP = z;
    }

    public final c aiA() {
        return this.bAX;
    }

    public final c aiB() {
        return this.bAY;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final long aiC() {
        return this.bBa;
    }

    public final boolean aiD() {
        return this.bAP;
    }

    public final long Jx() {
        if (this.bAR == -1) {
            this.bAR = this.bAZ / ((long) 1000);
        }
        return this.bAR;
    }

    public final double getValue() {
        if (this.bAT == -1.0d) {
            double d = (double) this.bAW;
            Double.isNaN(d);
            this.bAT = d / 1000000.0d;
        }
        return this.bAT;
    }

    public final String aiy() {
        if ((((CharSequence) this.bAU).length() == 0 ? 1 : null) != null) {
            this.bAU = bBc.a(this.instrumentType, this.underlying, this.bAZ, this.bAW, this.bBa, this.bAP);
        }
        return this.bAU;
    }

    public final double aiz() {
        return this.bAV;
    }

    public final void o(double d) {
        this.bAV = d;
    }
}
