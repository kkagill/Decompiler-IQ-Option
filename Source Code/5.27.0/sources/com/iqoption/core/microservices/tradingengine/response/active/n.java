package com.iqoption.core.microservices.tradingengine.response.active;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0016\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 ^2\u00020\u0001:\u0003^_`B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0002\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÂ\u0003J\t\u0010.\u001a\u00020\u0011HÂ\u0003J\t\u0010/\u001a\u00020\u0005HÂ\u0003J\t\u00100\u001a\u00020\u000bHÂ\u0003J\t\u00101\u001a\u00020\u000bHÂ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÂ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\u0003HÂ\u0003J\t\u0010:\u001a\u00020\u0005HÂ\u0003J\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\b\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u0003H\u0016J\b\u0010B\u001a\u00020\u0005H\u0016J\r\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010CJ\u0006\u0010D\u001a\u00020\u0011J\u000e\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0011J\u0010\u0010G\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0011H\u0016J\b\u0010H\u001a\u00020\u0005H\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0016H\u0016J\b\u0010K\u001a\u00020\u0011H\u0016J\b\u0010L\u001a\u00020\u0003H\u0016J\t\u0010M\u001a\u00020\u0005HÖ\u0001J\b\u0010N\u001a\u00020\u000bH\u0016J\u0010\u0010O\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u0011H\u0016J\b\u0010P\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010Q\u001a\u00020\u000bH\u0016J\u000e\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0005J\u000e\u0010U\u001a\u00020S2\u0006\u0010V\u001a\u00020\u0017J\t\u0010W\u001a\u00020\u0003HÖ\u0001J\u0010\u0010X\u001a\u00020S2\u0006\u0010Y\u001a\u00020\u0001H\u0016J\u0019\u0010Z\u001a\u00020S2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0010\u0010\u0012\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0010\u0010\u000e\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0010\u0010\u000f\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "_image", "", "id", "", "groupId", "option", "Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option;", "deadTime", "enabled", "", "minmax", "Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$MinMax;", "name", "precision", "startTime", "", "isBuyback", "isSuspended", "topTradersEnabled", "schedule", "", "", "(Ljava/lang/String;IILcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option;IZLcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$MinMax;Ljava/lang/String;IJIZZLjava/util/List;)V", "currencyLeft", "currencyLeft$annotations", "()V", "getCurrencyLeft", "()Ljava/lang/String;", "currencyRight", "currencyRight$annotations", "getCurrencyRight", "getDeadTime", "()I", "getEnabled", "()Z", "getGroupId", "getId", "image", "getImage", "getMinmax", "()Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$MinMax;", "getOption", "()Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getActiveId", "getActiveName", "getCommission", "()Ljava/lang/Integer;", "getLastScheduleTime", "getNextCloseTime", "timeSync", "getNextSchedule", "getPrecision", "getSchedule", "Lcom/iqoption/core/microservices/tradingengine/response/active/Schedule;", "getStartTime", "getTicker", "hashCode", "isBuybackEnabled", "isEnabled", "isExpired", "isTopTradersEnabled", "setCommission", "", "commission", "setSchedule", "interval", "toString", "update", "value", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "MinMax", "Option", "core_release"})
@o
/* compiled from: TurboBinaryActive.kt */
public final class n extends a {
    public static final Creator CREATOR = new b();
    public static final a bAw = new a();
    @SerializedName("precision")
    private final int akR;
    @SerializedName("is_suspended")
    private final boolean bAc;
    @SerializedName("image")
    private final String bAe;
    @SerializedName("option")
    private final d bAq;
    @SerializedName("deadtime")
    private final int bAr;
    @SerializedName("minmax")
    private final c bAs;
    @SerializedName("is_buyback")
    private final int bAt;
    @SerializedName("top_traders_enabled")
    private final boolean bAu;
    @SerializedName("schedule")
    private volatile List<long[]> bAv;
    private final String bzX;
    private final String bzY;
    @SerializedName("enabled")
    private final boolean enabled;
    @SerializedName("group_id")
    private final int groupId;
    @SerializedName("id")
    private final int id;
    @SerializedName("name")
    private final String name;
    @SerializedName("start_time")
    private final long startTime;

    @i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u000267BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003JQ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\bHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u00068"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option;", "Landroid/os/Parcelable;", "profit", "Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option$Profit;", "expTime", "", "startTime", "count", "", "specials", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option$Special;", "startExpTime", "(Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option$Profit;JJILjava/util/Map;J)V", "getCount", "()I", "setCount", "(I)V", "getExpTime", "()J", "setExpTime", "(J)V", "getProfit", "()Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option$Profit;", "setProfit", "(Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option$Profit;)V", "getSpecials", "()Ljava/util/Map;", "setSpecials", "(Ljava/util/Map;)V", "getStartExpTime", "setStartExpTime", "getStartTime", "setStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Profit", "Special", "core_release"})
    @o
    /* compiled from: TurboBinaryActive.kt */
    public static final class d implements Parcelable {
        public static final Creator CREATOR = new a();
        private volatile long bAA;
        @SerializedName("profit")
        private volatile b bAx;
        @SerializedName("exp_time")
        private volatile long bAy;
        @SerializedName("special")
        private volatile Map<Long, c> bAz;
        @SerializedName("count")
        private volatile int count;
        @SerializedName("start_time")
        private volatile long startTime;

        @i(bne = {1, 1, 15})
        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "in");
                b bVar = (b) b.CREATOR.createFromParcel(parcel);
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                while (readInt2 != 0) {
                    linkedHashMap.put(Long.valueOf(parcel.readLong()), (c) c.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
                return new d(bVar, readLong, readLong2, readInt, linkedHashMap, parcel.readLong());
            }

            public final Object[] newArray(int i) {
                return new d[i];
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option$Profit;", "Landroid/os/Parcelable;", "commissionDefault", "", "commission", "refundMin", "refundMax", "(IIII)V", "getCommission", "()I", "getCommissionDefault", "getRefundMax", "getRefundMin", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
        /* compiled from: TurboBinaryActive.kt */
        public static final class b implements Parcelable {
            public static final Creator CREATOR = new a();
            @SerializedName("commission_default")
            private final int bAB;
            @SerializedName("commission")
            private final int commission;
            @SerializedName("refund_max")
            private final int refundMax;
            @SerializedName("refund_min")
            private final int refundMin;

            @i(bne = {1, 1, 15})
            public static class a implements Creator {
                public final Object createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.i.f(parcel, "in");
                    return new b(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }

                public final Object[] newArray(int i) {
                    return new b[i];
                }
            }

            public static /* synthetic */ b a(b bVar, int i, int i2, int i3, int i4, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    i = bVar.bAB;
                }
                if ((i5 & 2) != 0) {
                    i2 = bVar.commission;
                }
                if ((i5 & 4) != 0) {
                    i3 = bVar.refundMin;
                }
                if ((i5 & 8) != 0) {
                    i4 = bVar.refundMax;
                }
                return bVar.h(i, i2, i3, i4);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if ((this.bAB == bVar.bAB ? 1 : null) != null) {
                            if ((this.commission == bVar.commission ? 1 : null) != null) {
                                if ((this.refundMin == bVar.refundMin ? 1 : null) != null) {
                                    if ((this.refundMax == bVar.refundMax ? 1 : null) != null) {
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

            public final b h(int i, int i2, int i3, int i4) {
                return new b(i, i2, i3, i4);
            }

            public int hashCode() {
                return (((((this.bAB * 31) + this.commission) * 31) + this.refundMin) * 31) + this.refundMax;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Profit(commissionDefault=");
                stringBuilder.append(this.bAB);
                stringBuilder.append(", commission=");
                stringBuilder.append(this.commission);
                stringBuilder.append(", refundMin=");
                stringBuilder.append(this.refundMin);
                stringBuilder.append(", refundMax=");
                stringBuilder.append(this.refundMax);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                kotlin.jvm.internal.i.f(parcel, "parcel");
                parcel.writeInt(this.bAB);
                parcel.writeInt(this.commission);
                parcel.writeInt(this.refundMin);
                parcel.writeInt(this.refundMax);
            }

            public b(int i, int i2, int i3, int i4) {
                this.bAB = i;
                this.commission = i2;
                this.refundMin = i3;
                this.refundMax = i4;
            }

            public final int ahR() {
                return this.commission;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Option$Special;", "Landroid/os/Parcelable;", "enabled", "", "title", "", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
        @o
        /* compiled from: TurboBinaryActive.kt */
        public static final class c implements Parcelable {
            public static final Creator CREATOR = new a();
            @SerializedName("enabled")
            private final boolean enabled;
            @SerializedName("title")
            private final String title;

            @i(bne = {1, 1, 15})
            public static class a implements Creator {
                public final Object createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.i.f(parcel, "in");
                    return new c(parcel.readInt() != 0, parcel.readString());
                }

                public final Object[] newArray(int i) {
                    return new c[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if ((this.enabled == cVar.enabled ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.title, cVar.title)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                int i = this.enabled;
                if (i != 0) {
                    i = 1;
                }
                i *= 31;
                String str = this.title;
                return i + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Special(enabled=");
                stringBuilder.append(this.enabled);
                stringBuilder.append(", title=");
                stringBuilder.append(this.title);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                kotlin.jvm.internal.i.f(parcel, "parcel");
                parcel.writeInt(this.enabled);
                parcel.writeString(this.title);
            }

            public c(boolean z, String str) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                this.enabled = z;
                this.title = str;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final String getTitle() {
                return this.title;
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (kotlin.jvm.internal.i.y(this.bAx, dVar.bAx)) {
                        if ((this.bAy == dVar.bAy ? 1 : null) != null) {
                            if ((this.startTime == dVar.startTime ? 1 : null) != null) {
                                if ((this.count == dVar.count ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bAz, dVar.bAz)) {
                                    if ((this.bAA == dVar.bAA ? 1 : null) != null) {
                                        return true;
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

        public int hashCode() {
            b bVar = this.bAx;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            long j = this.bAy;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            j = this.startTime;
            hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.count) * 31;
            Map map = this.bAz;
            if (map != null) {
                i = map.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j2 = this.bAA;
            return hashCode + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Option(profit=");
            stringBuilder.append(this.bAx);
            stringBuilder.append(", expTime=");
            stringBuilder.append(this.bAy);
            stringBuilder.append(", startTime=");
            stringBuilder.append(this.startTime);
            stringBuilder.append(", count=");
            stringBuilder.append(this.count);
            stringBuilder.append(", specials=");
            stringBuilder.append(this.bAz);
            stringBuilder.append(", startExpTime=");
            stringBuilder.append(this.bAA);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            this.bAx.writeToParcel(parcel, 0);
            parcel.writeLong(this.bAy);
            parcel.writeLong(this.startTime);
            parcel.writeInt(this.count);
            Map map = this.bAz;
            parcel.writeInt(map.size());
            for (Object next : map.entrySet()) {
                parcel.writeLong(((Long) next.getKey()).longValue());
                ((c) next.getValue()).writeToParcel(parcel, 0);
            }
            parcel.writeLong(this.bAA);
        }

        public d(b bVar, long j, long j2, int i, Map<Long, c> map, long j3) {
            kotlin.jvm.internal.i.f(bVar, "profit");
            kotlin.jvm.internal.i.f(map, "specials");
            this.bAx = bVar;
            this.bAy = j;
            this.startTime = j2;
            this.count = i;
            this.bAz = map;
            this.bAA = j3;
        }

        public final void a(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "<set-?>");
            this.bAx = bVar;
        }

        public final b ail() {
            return this.bAx;
        }

        public final void aZ(long j) {
            this.bAy = j;
        }

        public final long aim() {
            return this.bAy;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final void setStartTime(long j) {
            this.startTime = j;
        }

        public final int getCount() {
            return this.count;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final Map<Long, c> ain() {
            return this.bAz;
        }

        public final long aio() {
            return this.bAA;
        }

        public final void ba(long j) {
            this.bAA = j;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$Companion;", "", "()V", "DEFAULT_PRECISION", "", "core_release"})
    /* compiled from: TurboBinaryActive.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            d dVar = (d) d.CREATOR.createFromParcel(parcel2);
            int readInt3 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            c cVar = (c) c.CREATOR.createFromParcel(parcel2);
            String readString2 = parcel.readString();
            int readInt4 = parcel.readInt();
            long readLong = parcel.readLong();
            int readInt5 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt6);
                while (readInt6 != 0) {
                    arrayList2.add(parcel.createLongArray());
                    readInt6--;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new n(readString, readInt, readInt2, dVar, readInt3, z, cVar, readString2, readInt4, readLong, readInt5, z2, z3, arrayList);
        }

        public final Object[] newArray(int i) {
            return new n[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/active/TurboBinaryActive$MinMax;", "Landroid/os/Parcelable;", "min", "", "max", "(II)V", "getMax", "()I", "getMin", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
    /* compiled from: TurboBinaryActive.kt */
    public static final class c implements Parcelable {
        public static final Creator CREATOR = new a();
        @SerializedName("max")
        private final int max;
        @SerializedName("min")
        private final int min;

        @i(bne = {1, 1, 15})
        public static class a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.i.f(parcel, "in");
                return new c(parcel.readInt(), parcel.readInt());
            }

            public final Object[] newArray(int i) {
                return new c[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if ((this.min == cVar.min ? 1 : null) != null) {
                        if ((this.max == cVar.max ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.min * 31) + this.max;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MinMax(min=");
            stringBuilder.append(this.min);
            stringBuilder.append(", max=");
            stringBuilder.append(this.max);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            kotlin.jvm.internal.i.f(parcel, "parcel");
            parcel.writeInt(this.min);
            parcel.writeInt(this.max);
        }

        public c(int i, int i2) {
            this.min = i;
            this.max = i2;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (kotlin.jvm.internal.i.y(this.bAe, nVar.bAe)) {
                    if ((this.id == nVar.id ? 1 : null) != null) {
                        if ((this.groupId == nVar.groupId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bAq, nVar.bAq)) {
                            if ((this.bAr == nVar.bAr ? 1 : null) != null) {
                                if ((this.enabled == nVar.enabled ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bAs, nVar.bAs) && kotlin.jvm.internal.i.y(this.name, nVar.name)) {
                                    if ((this.akR == nVar.akR ? 1 : null) != null) {
                                        if ((this.startTime == nVar.startTime ? 1 : null) != null) {
                                            if ((this.bAt == nVar.bAt ? 1 : null) != null) {
                                                if ((this.bAc == nVar.bAc ? 1 : null) != null) {
                                                    if ((this.bAu == nVar.bAu ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bAv, nVar.bAv)) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
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

    public int hashCode() {
        String str = this.bAe;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.id) * 31) + this.groupId) * 31;
        d dVar = this.bAq;
        hashCode = (((hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.bAr) * 31;
        int i2 = this.enabled;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        c cVar = this.bAs;
        hashCode = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str2 = this.name;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.akR) * 31;
        long j = this.startTime;
        hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.bAt) * 31;
        i2 = this.bAc;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bAu;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        List list = this.bAv;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public boolean isExpired() {
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TurboBinaryActive(_image=");
        stringBuilder.append(this.bAe);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", groupId=");
        stringBuilder.append(this.groupId);
        stringBuilder.append(", option=");
        stringBuilder.append(this.bAq);
        stringBuilder.append(", deadTime=");
        stringBuilder.append(this.bAr);
        stringBuilder.append(", enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(", minmax=");
        stringBuilder.append(this.bAs);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", precision=");
        stringBuilder.append(this.akR);
        stringBuilder.append(", startTime=");
        stringBuilder.append(this.startTime);
        stringBuilder.append(", isBuyback=");
        stringBuilder.append(this.bAt);
        stringBuilder.append(", isSuspended=");
        stringBuilder.append(this.bAc);
        stringBuilder.append(", topTradersEnabled=");
        stringBuilder.append(this.bAu);
        stringBuilder.append(", schedule=");
        stringBuilder.append(this.bAv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bAe);
        parcel.writeInt(this.id);
        parcel.writeInt(this.groupId);
        this.bAq.writeToParcel(parcel, 0);
        parcel.writeInt(this.bAr);
        parcel.writeInt(this.enabled);
        this.bAs.writeToParcel(parcel, 0);
        parcel.writeString(this.name);
        parcel.writeInt(this.akR);
        parcel.writeLong(this.startTime);
        parcel.writeInt(this.bAt);
        parcel.writeInt(this.bAc);
        parcel.writeInt(this.bAu);
        List<long[]> list = this.bAv;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (long[] writeLongArray : list) {
                parcel.writeLongArray(writeLongArray);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public void y(a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.VALUE);
    }

    public final d aij() {
        return this.bAq;
    }

    public final int aik() {
        return this.bAr;
    }

    public n(String str, int i, int i2, d dVar, int i3, boolean z, c cVar, String str2, int i4, long j, int i5, boolean z2, boolean z3, List<long[]> list) {
        String str3 = str;
        d dVar2 = dVar;
        c cVar2 = cVar;
        String str4 = str2;
        kotlin.jvm.internal.i.f(str, "_image");
        kotlin.jvm.internal.i.f(dVar, "option");
        kotlin.jvm.internal.i.f(cVar, "minmax");
        kotlin.jvm.internal.i.f(str2, ConditionalUserProperty.NAME);
        this.bAe = str3;
        this.id = i;
        this.groupId = i2;
        this.bAq = dVar2;
        this.bAr = i3;
        this.enabled = z;
        this.bAs = cVar2;
        this.name = str4;
        this.akR = i4;
        this.startTime = j;
        this.bAt = i5;
        this.bAc = z2;
        this.bAu = z3;
        this.bAv = list;
    }

    public String ahN() {
        return this.bzX;
    }

    public String ahO() {
        return this.bzY;
    }

    public String getImage() {
        return com.iqoption.core.d.EE().fz(this.bAe);
    }

    public Integer ahS() {
        return Integer.valueOf(this.groupId);
    }

    public String adZ() {
        return this.name;
    }

    public int getActiveId() {
        return this.id;
    }

    public String ahP() {
        return this.name;
    }

    public boolean ahQ() {
        return this.bAt > 0;
    }

    public int ahR() {
        return this.bAq.ail().ahR();
    }

    public int getPrecision() {
        return this.akR;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long aY(long j) {
        List<long[]> list = this.bAv;
        if (list != null) {
            for (long[] jArr : list) {
                if (((jArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                    long j2 = jArr[0] * 1000;
                    if (j < j2) {
                        return j2;
                    }
                }
            }
        }
        return Long.MAX_VALUE;
    }

    public boolean aX(long j) {
        List<long[]> list = this.bAv;
        if (list != null) {
            for (long[] jArr : list) {
                if (jArr.length >= 2 && j >= jArr[0] * 1000 && j <= jArr[1] * 1000) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<m> ahT() {
        List list = this.bAv;
        if (list == null) {
            return m.emptyList();
        }
        Iterable<long[]> iterable = list;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (long[] jArr : iterable) {
            arrayList.add(new m(jArr[0], jArr[1]));
        }
        return (List) arrayList;
    }

    public final void fb(int i) {
        d dVar = this.bAq;
        dVar.a(b.a(dVar.ail(), 0, i, 0, 0, 13, null));
    }

    public boolean isSuspended() {
        return this.bAc;
    }
}
