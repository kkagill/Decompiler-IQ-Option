package com.iqoption.core.microservices.tradingengine.response.active;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.d;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b<\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001vBé\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÂ\u0003J\t\u0010?\u001a\u00020\u0003HÂ\u0003J\t\u0010@\u001a\u00020\u0005HÄ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÄ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014HÂ\u0003J\u001d\u0010D\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0018\u00010\u0019HÂ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014HÂ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÄ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010J\u001a\u0004\u0018\u00010\bHÄ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u000bHÄ\u0003J\t\u0010M\u001a\u00020\u000bHÂ\u0003J\t\u0010N\u001a\u00020\u0003HÄ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000e\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u0003J\u0002\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010SJ\t\u0010T\u001a\u00020\u0005HÖ\u0001J\u000e\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u000bJ\u0013\u0010X\u001a\u00020\u000b2\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\b\u0010[\u001a\u00020\u0005H\u0016J\b\u0010\\\u001a\u00020\u0003H\u0016J\n\u0010]\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010^\u001a\u00020\u0005H\u0016J\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014J\r\u0010`\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010)J\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020bH\u0016J\b\u0010d\u001a\u00020\u0005H\u0016J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010f\u001a\u00020bH\u0016J\u0010\u0010g\u001a\u0004\u0018\u00010\u00002\u0006\u0010h\u001a\u00020\u0005J\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014J\n\u0010j\u001a\u0004\u0018\u00010\u0003H\u0016J\t\u0010k\u001a\u00020\u0005HÖ\u0001J\b\u0010l\u001a\u00020\u000bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020bH\u0016J\b\u0010m\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010n\u001a\u00020\u000bH\u0016J\t\u0010o\u001a\u00020\u0003HÖ\u0001J\u0010\u0010p\u001a\u00020V2\u0006\u0010q\u001a\u00020\u0001H\u0016J\u0019\u0010r\u001a\u00020V2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0004@\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010\u000f\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u00038\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0011\u001a\u00020\u00058\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u001a\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0014\u0010.\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010%R\u0010\u0010\u0010\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010%R\u001e\u0010\n\u001a\u00020\u000b8\u0004@\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u00102\"\u0004\b3\u00104R\u0012\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010%\"\u0004\b6\u00107R&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0018\u00010\u00198\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%¨\u0006w"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentActive;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "id", "", "_activeId", "", "activeGroupId", "_activeType", "Lcom/iqoption/core/data/model/ActiveType;", "underlying", "isEnabled", "", "isSuspended", "_name", "localizationKey", "_image", "imagePrefix", "_precision", "_ticker", "schedules", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Schedule;", "expirations", "Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentActive$CfdExpiration;", "tags", "", "subActiveList", "currencyLeft", "currencyRight", "(Ljava/lang/String;ILjava/lang/Integer;Lcom/iqoption/core/data/model/ActiveType;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "get_activeId", "()I", "get_activeType", "()Lcom/iqoption/core/data/model/ActiveType;", "set_activeType", "(Lcom/iqoption/core/data/model/ActiveType;)V", "get_name", "()Ljava/lang/String;", "get_precision", "get_ticker", "getActiveGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrencyLeft", "getCurrencyRight", "getId", "image", "getImage", "instrumentId", "getInstrumentId", "()Z", "setEnabled", "(Z)V", "getLocalizationKey", "setLocalizationKey", "(Ljava/lang/String;)V", "getSchedules", "()Ljava/util/List;", "setSchedules", "(Ljava/util/List;)V", "getUnderlying", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "containsTag", "tag", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Lcom/iqoption/core/data/model/ActiveType;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentActive;", "describeContents", "enabledExpiration", "", "isCfdExpirationEnabled", "equals", "other", "", "getActiveId", "getActiveName", "getActiveType", "getCommission", "getExpirations", "getGroupId", "getNextSchedule", "", "timeSync", "getPrecision", "getSchedule", "getStartTime", "getSubActive", "activeId", "getSubActiveList", "getTicker", "hashCode", "isBuybackEnabled", "isExpired", "isTopTradersEnabled", "toString", "update", "value", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "CfdExpiration", "core_release"})
@o
/* compiled from: InstrumentActive.kt */
public final class j extends a {
    public static final Creator CREATOR = new b();
    @SerializedName("active_group_id")
    private final Integer bAa;
    @SerializedName("active_type")
    private ActiveType bAb;
    @SerializedName("is_suspended")
    private boolean bAc;
    @SerializedName("localization_key")
    private String bAd;
    @SerializedName("image")
    private final String bAe;
    @SerializedName("image_prefix")
    private final String bAf;
    @SerializedName("precision")
    private final int bAg;
    @SerializedName("ticker")
    private final String bAh;
    @SerializedName("schedule")
    private List<m> bAi;
    @SerializedName("expirations")
    private List<a> bAj;
    @SerializedName("subunderlying")
    private final List<j> bAk;
    @SerializedName("name")
    private final String bnS;
    @SerializedName("currency_left_side")
    private final String bzX;
    @SerializedName("currency_right_side")
    private final String bzY;
    @SerializedName("active_id")
    private final int bzZ;
    @SerializedName("id")
    private final String id;
    @SerializedName("is_enabled")
    private boolean isEnabled;
    @SerializedName("tags")
    private final Map<String, List<String>> tags;
    @SerializedName("underlying")
    private final String underlying;

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentActive$CfdExpiration;", "Landroid/os/Parcelable;", "expiration", "", "deadtime", "(JJ)V", "getDeadtime", "()J", "getExpiration", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
    /* compiled from: InstrumentActive.kt */
    public static final class a implements Parcelable {
        public static final Creator CREATOR = new a();
        @SerializedName("deadtime")
        private final long bAl;
        @SerializedName("expiration")
        private final long expiration;

        @i(bne = {1, 1, 15})
        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "in");
                return new a(parcel.readLong(), parcel.readLong());
            }

            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.expiration == aVar.expiration ? 1 : null) != null) {
                        if ((this.bAl == aVar.bAl ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.expiration;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.bAl;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CfdExpiration(expiration=");
            stringBuilder.append(this.expiration);
            stringBuilder.append(", deadtime=");
            stringBuilder.append(this.bAl);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            parcel.writeLong(this.expiration);
            parcel.writeLong(this.bAl);
        }

        public a(long j, long j2) {
            this.expiration = j;
            this.bAl = j2;
        }

        public final long getExpiration() {
            return this.expiration;
        }

        public final long aid() {
            return this.bAl;
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            int readInt;
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String str;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList4;
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            ActiveType activeType = parcel.readInt() != 0 ? (ActiveType) Enum.valueOf(ActiveType.class, parcel.readString()) : null;
            String readString2 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    i = readInt3;
                    arrayList.add((m) m.CREATOR.createFromParcel(parcel2));
                    readInt--;
                    readInt3 = i;
                }
                i = readInt3;
                arrayList2 = arrayList;
            } else {
                i = readInt3;
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((a) a.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
                arrayList3 = arrayList;
            } else {
                arrayList3 = null;
            }
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    str = readString6;
                    linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
                    readInt--;
                    readString6 = str;
                }
                str = readString6;
                linkedHashMap = linkedHashMap2;
            } else {
                str = readString6;
                linkedHashMap = null;
            }
            if (parcel.readInt() != 0) {
                readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((j) j.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
                arrayList4 = arrayList;
            } else {
                arrayList4 = null;
            }
            return new j(readString, readInt2, valueOf, activeType, readString2, z2, z, readString3, readString4, readString5, str, i, readString7, arrayList2, arrayList3, linkedHashMap, arrayList4, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new j[i];
        }
    }

    public boolean ahQ() {
        return true;
    }

    public int ahR() {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (kotlin.jvm.internal.i.y(this.id, jVar.id)) {
                    if ((this.bzZ == jVar.bzZ ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bAa, jVar.bAa) && kotlin.jvm.internal.i.y(this.bAb, jVar.bAb) && kotlin.jvm.internal.i.y(agB(), jVar.agB())) {
                        if ((this.isEnabled == jVar.isEnabled ? 1 : null) != null) {
                            if ((this.bAc == jVar.bAc ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bnS, jVar.bnS) && kotlin.jvm.internal.i.y(this.bAd, jVar.bAd) && kotlin.jvm.internal.i.y(this.bAe, jVar.bAe) && kotlin.jvm.internal.i.y(this.bAf, jVar.bAf)) {
                                if (!((this.bAg == jVar.bAg ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bAh, jVar.bAh) && kotlin.jvm.internal.i.y(this.bAi, jVar.bAi) && kotlin.jvm.internal.i.y(this.bAj, jVar.bAj) && kotlin.jvm.internal.i.y(this.tags, jVar.tags) && kotlin.jvm.internal.i.y(this.bAk, jVar.bAk) && kotlin.jvm.internal.i.y(ahN(), jVar.ahN()) && kotlin.jvm.internal.i.y(ahO(), jVar.ahO()))) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public long getStartTime() {
        return 0;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.bzZ) * 31;
        Integer num = this.bAa;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        ActiveType activeType = this.bAb;
        hashCode = (hashCode + (activeType != null ? activeType.hashCode() : 0)) * 31;
        String agB = agB();
        hashCode = (hashCode + (agB != null ? agB.hashCode() : 0)) * 31;
        int i2 = this.isEnabled;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bAc;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        agB = this.bnS;
        hashCode = (hashCode + (agB != null ? agB.hashCode() : 0)) * 31;
        agB = this.bAd;
        hashCode = (hashCode + (agB != null ? agB.hashCode() : 0)) * 31;
        agB = this.bAe;
        hashCode = (hashCode + (agB != null ? agB.hashCode() : 0)) * 31;
        agB = this.bAf;
        hashCode = (((hashCode + (agB != null ? agB.hashCode() : 0)) * 31) + this.bAg) * 31;
        agB = this.bAh;
        hashCode = (hashCode + (agB != null ? agB.hashCode() : 0)) * 31;
        List list = this.bAi;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.bAj;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map map = this.tags;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        list = this.bAk;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        agB = ahN();
        hashCode = (hashCode + (agB != null ? agB.hashCode() : 0)) * 31;
        agB = ahO();
        if (agB != null) {
            i = agB.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstrumentActive(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", _activeId=");
        stringBuilder.append(this.bzZ);
        stringBuilder.append(", activeGroupId=");
        stringBuilder.append(this.bAa);
        stringBuilder.append(", _activeType=");
        stringBuilder.append(this.bAb);
        stringBuilder.append(", underlying=");
        stringBuilder.append(agB());
        stringBuilder.append(", isEnabled=");
        stringBuilder.append(this.isEnabled);
        stringBuilder.append(", isSuspended=");
        stringBuilder.append(this.bAc);
        stringBuilder.append(", _name=");
        stringBuilder.append(this.bnS);
        stringBuilder.append(", localizationKey=");
        stringBuilder.append(this.bAd);
        stringBuilder.append(", _image=");
        stringBuilder.append(this.bAe);
        stringBuilder.append(", imagePrefix=");
        stringBuilder.append(this.bAf);
        stringBuilder.append(", _precision=");
        stringBuilder.append(this.bAg);
        stringBuilder.append(", _ticker=");
        stringBuilder.append(this.bAh);
        stringBuilder.append(", schedules=");
        stringBuilder.append(this.bAi);
        stringBuilder.append(", expirations=");
        stringBuilder.append(this.bAj);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.tags);
        stringBuilder.append(", subActiveList=");
        stringBuilder.append(this.bAk);
        stringBuilder.append(", currencyLeft=");
        stringBuilder.append(ahN());
        stringBuilder.append(", currencyRight=");
        stringBuilder.append(ahO());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.bzZ);
        Integer num = this.bAa;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        ActiveType activeType = this.bAb;
        if (activeType != null) {
            parcel.writeInt(1);
            parcel.writeString(activeType.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.underlying);
        parcel.writeInt(this.isEnabled);
        parcel.writeInt(this.bAc);
        parcel.writeString(this.bnS);
        parcel.writeString(this.bAd);
        parcel.writeString(this.bAe);
        parcel.writeString(this.bAf);
        parcel.writeInt(this.bAg);
        parcel.writeString(this.bAh);
        List<m> list = this.bAi;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (m writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<a> list2 = this.bAj;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (a writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Map map = this.tags;
        if (map != null) {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Object next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeStringList((List) next.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        List<j> list3 = this.bAk;
        if (list3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (j writeToParcel3 : list3) {
                writeToParcel3.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.bzX);
        parcel.writeString(this.bzY);
    }

    public String agB() {
        return this.underlying;
    }

    public final String aic() {
        return this.bAd;
    }

    public String ahN() {
        return this.bzX;
    }

    public String ahO() {
        return this.bzY;
    }

    public j(String str, int i, Integer num, ActiveType activeType, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, int i2, String str7, List<m> list, List<a> list2, Map<String, ? extends List<String>> map, List<j> list3, String str8, String str9) {
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        kotlin.jvm.internal.i.f(str2, "underlying");
        kotlin.jvm.internal.i.f(str3, "_name");
        kotlin.jvm.internal.i.f(str12, "localizationKey");
        kotlin.jvm.internal.i.f(str13, "_image");
        kotlin.jvm.internal.i.f(str14, "imagePrefix");
        this.id = str;
        this.bzZ = i;
        this.bAa = num;
        this.bAb = activeType;
        this.underlying = str10;
        this.isEnabled = z;
        this.bAc = z2;
        this.bnS = str11;
        this.bAd = str12;
        this.bAe = str13;
        this.bAf = str14;
        this.bAg = i2;
        this.bAh = str7;
        this.bAi = list;
        this.bAj = list2;
        this.tags = map;
        this.bAk = list3;
        this.bzX = str8;
        this.bzY = str9;
    }

    public String getInstrumentId() {
        String str = this.id;
        if (str == null) {
            str = agB();
        }
        return str != null ? str : super.getInstrumentId();
    }

    public String getImage() {
        return d.EE().fz(this.bAe);
    }

    public ActiveType getActiveType() {
        ActiveType activeType = this.bAb;
        return activeType != null ? activeType : super.getActiveType();
    }

    public int getActiveId() {
        return this.bzZ;
    }

    public String ahP() {
        return this.bnS;
    }

    public String adZ() {
        return this.bAh;
    }

    public int getPrecision() {
        return this.bAg;
    }

    public Integer ahS() {
        Integer num = this.bAa;
        return Integer.valueOf(num != null ? num.intValue() : -1);
    }

    public long aY(long j) {
        List<m> list = this.bAi;
        if (list != null) {
            try {
                Long l = (Long) null;
                for (m aih : list) {
                    long aih2 = aih.aih() * 1000;
                    if (j < aih2) {
                        l = Long.valueOf(aih2);
                        break;
                    }
                }
                if (l == null) {
                    l = Long.valueOf(Long.MAX_VALUE);
                }
                return l.longValue();
            } catch (Exception unused) {
            }
        }
        return Long.MAX_VALUE;
    }

    public boolean aX(long j) {
        if (this.isEnabled) {
            List<m> list = this.bAi;
            if (!(list == null || list == null)) {
                for (m mVar : list) {
                    if (j > mVar.aih() * 1000 && j < mVar.aii() * 1000) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List<m> ahT() {
        List<m> list = this.bAi;
        return list != null ? list : m.emptyList();
    }

    public void y(a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.VALUE);
        if (aVar instanceof j) {
            j jVar = (j) aVar;
            this.bAi = jVar.bAi;
            this.isEnabled = jVar.isEnabled;
            this.bAj = jVar.bAj;
            this.bAc = jVar.bAc;
            List<j> list = this.bAk;
            if (list != null) {
                for (j y : list) {
                    y.y(aVar);
                }
            }
        }
    }

    public boolean isSuspended() {
        return this.bAc;
    }

    public boolean isExpired() {
        int i = k.aob[getInstrumentType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        List list = this.bAj;
        if (list == null || (list.isEmpty() ^ 1) != 1) {
            return false;
        }
        return true;
    }

    public final List<a> aia() {
        List<a> list = this.bAj;
        return list != null ? list : m.emptyList();
    }

    public final List<j> aib() {
        List<j> list = this.bAk;
        return list != null ? list : m.emptyList();
    }

    public final j fa(int i) {
        for (Object next : aib()) {
            Object obj;
            if (((j) next).getActiveId() == i) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        return (j) next2;
    }
}
