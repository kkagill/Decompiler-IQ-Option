package com.iqoption.charttools.model.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.JsonObject;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.data.model.chart.ChartType;
import com.iqoption.core.ext.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BU\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\nHÖ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\u0006\u0010*\u001a\u00020\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\nHÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u000b\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\r\u0010\u0017R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u000f\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u000e\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0010\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00063"}, bng = {"Lcom/iqoption/charttools/model/chart/ChartConfig;", "Landroid/os/Parcelable;", "json", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)V", "type", "Lcom/iqoption/core/data/model/chart/ChartType;", "color", "Lcom/iqoption/core/data/model/chart/ChartColor;", "candleSize", "", "isAutoScaleEnabled", "", "isHeikenAshiEnabled", "isTradersMoodEnabled", "isLiveDealsEnabled", "isVolumeEnabled", "(Lcom/iqoption/core/data/model/chart/ChartType;Lcom/iqoption/core/data/model/chart/ChartColor;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCandleSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColor", "()Lcom/iqoption/core/data/model/chart/ChartColor;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Lcom/iqoption/core/data/model/chart/ChartType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/iqoption/core/data/model/chart/ChartType;Lcom/iqoption/core/data/model/chart/ChartColor;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/iqoption/charttools/model/chart/ChartConfig;", "describeContents", "equals", "other", "", "hashCode", "toJsonObject", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "techtools_release"})
/* compiled from: ChartConfig.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a aIO = new a();
    private final ChartType aIG;
    private final ChartColor aIH;
    private final Integer aII;
    private final Boolean aIJ;
    private final Boolean aIK;
    private final Boolean aIL;
    private final Boolean aIM;
    private final Boolean aIN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/charttools/model/chart/ChartConfig$Companion;", "", "()V", "AUTO_SCALE", "", "CANDLE_SIZE", "COLOR", "HEIKIN_ASHI", "LIVE_DEALS", "TRADERS_MOOD", "TYPE", "VOLUME", "techtools_release"})
    /* compiled from: ChartConfig.kt */
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
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            kotlin.jvm.internal.i.f(parcel, "in");
            ChartType chartType = parcel.readInt() != 0 ? (ChartType) Enum.valueOf(ChartType.class, parcel.readString()) : null;
            ChartColor chartColor = parcel.readInt() != 0 ? (ChartColor) Enum.valueOf(ChartColor.class, parcel.readString()) : null;
            Integer valueOf6 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z = true;
            if (parcel.readInt() != 0) {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf = null;
            }
            if (parcel.readInt() != 0) {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf2 = null;
            }
            if (parcel.readInt() != 0) {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf3 = null;
            }
            if (parcel.readInt() != 0) {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                valueOf4 = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf5 = Boolean.valueOf(z);
            } else {
                valueOf5 = null;
            }
            return new a(chartType, chartColor, valueOf6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:18:0x0056, code skipped:
            if (kotlin.jvm.internal.i.y(r2.aIN, r3.aIN) != false) goto L_0x005b;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x005b;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.charttools.model.a.a;
        if (r0 == 0) goto L_0x0059;
    L_0x0006:
        r3 = (com.iqoption.charttools.model.a.a) r3;
        r0 = r2.aIG;
        r1 = r3.aIG;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0012:
        r0 = r2.aIH;
        r1 = r3.aIH;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x001c:
        r0 = r2.aII;
        r1 = r3.aII;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0026:
        r0 = r2.aIJ;
        r1 = r3.aIJ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0030:
        r0 = r2.aIK;
        r1 = r3.aIK;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x003a:
        r0 = r2.aIL;
        r1 = r3.aIL;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0044:
        r0 = r2.aIM;
        r1 = r3.aIM;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x004e:
        r0 = r2.aIN;
        r3 = r3.aIN;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r3 = 0;
        return r3;
    L_0x005b:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.model.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ChartType chartType = this.aIG;
        int i = 0;
        int hashCode = (chartType != null ? chartType.hashCode() : 0) * 31;
        ChartColor chartColor = this.aIH;
        hashCode = (hashCode + (chartColor != null ? chartColor.hashCode() : 0)) * 31;
        Integer num = this.aII;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.aIJ;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.aIK;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.aIL;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.aIM;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.aIN;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChartConfig(type=");
        stringBuilder.append(this.aIG);
        stringBuilder.append(", color=");
        stringBuilder.append(this.aIH);
        stringBuilder.append(", candleSize=");
        stringBuilder.append(this.aII);
        stringBuilder.append(", isAutoScaleEnabled=");
        stringBuilder.append(this.aIJ);
        stringBuilder.append(", isHeikenAshiEnabled=");
        stringBuilder.append(this.aIK);
        stringBuilder.append(", isTradersMoodEnabled=");
        stringBuilder.append(this.aIL);
        stringBuilder.append(", isLiveDealsEnabled=");
        stringBuilder.append(this.aIM);
        stringBuilder.append(", isVolumeEnabled=");
        stringBuilder.append(this.aIN);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        ChartType chartType = this.aIG;
        if (chartType != null) {
            parcel.writeInt(1);
            parcel.writeString(chartType.name());
        } else {
            parcel.writeInt(0);
        }
        ChartColor chartColor = this.aIH;
        if (chartColor != null) {
            parcel.writeInt(1);
            parcel.writeString(chartColor.name());
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.aII;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.aIJ;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        bool = this.aIK;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        bool = this.aIL;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        bool = this.aIM;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
        } else {
            parcel.writeInt(0);
        }
        bool = this.aIN;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue());
            return;
        }
        parcel.writeInt(0);
    }

    public a(ChartType chartType, ChartColor chartColor, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.aIG = chartType;
        this.aIH = chartColor;
        this.aII = num;
        this.aIJ = bool;
        this.aIK = bool2;
        this.aIL = bool3;
        this.aIM = bool4;
        this.aIN = bool5;
    }

    public final ChartType NT() {
        return this.aIG;
    }

    public final ChartColor NU() {
        return this.aIH;
    }

    public final Integer NV() {
        return this.aII;
    }

    public final Boolean NW() {
        return this.aIJ;
    }

    public final Boolean NX() {
        return this.aIK;
    }

    public final Boolean NY() {
        return this.aIL;
    }

    public final Boolean NZ() {
        return this.aIM;
    }

    public final Boolean Oa() {
        return this.aIN;
    }

    public a(JsonObject jsonObject) {
        ChartType chartType;
        ChartColor chartColor;
        JsonObject jsonObject2 = jsonObject;
        kotlin.jvm.internal.i.f(jsonObject2, "json");
        String a = d.a(jsonObject2, "type", null, 2, null);
        if (a != null) {
            for (ChartType chartType2 : ChartType.values()) {
                if (kotlin.jvm.internal.i.y(chartType2.name(), a)) {
                    break;
                }
            }
            ChartType chartType22 = null;
            chartType = chartType22;
        } else {
            chartType = null;
        }
        Boolean a2 = d.a(jsonObject2, "color", null, 2, null);
        if (a2 != null) {
            chartColor = a2.booleanValue() ? ChartColor.redGreen : ChartColor.mono;
        } else {
            chartColor = null;
        }
        this(chartType, chartColor, d.a(jsonObject2, "candle_size", null, 2, null), d.a(jsonObject2, "auto_scale", null, 2, null), d.a(jsonObject2, "heikin_ashi", null, 2, null), d.a(jsonObject2, "traders_mood", null, 2, null), d.a(jsonObject2, "live_deals", null, 2, null), d.a(jsonObject2, "volume", null, 2, null));
    }

    public final JsonObject NS() {
        JsonObject jsonObject = new JsonObject();
        ChartType chartType = this.aIG;
        if (chartType != null) {
            jsonObject.addProperty("type", chartType.name());
        }
        ChartColor chartColor = this.aIH;
        if (chartColor != null) {
            jsonObject.addProperty("color", Boolean.valueOf(chartColor == ChartColor.redGreen));
        }
        Integer num = this.aII;
        if (num != null) {
            jsonObject.addProperty("candle_size", (Number) num);
        }
        Boolean bool = this.aIJ;
        if (bool != null) {
            jsonObject.addProperty("auto_scale", bool);
        }
        bool = this.aIK;
        if (bool != null) {
            jsonObject.addProperty("heikin_ashi", bool);
        }
        bool = this.aIL;
        if (bool != null) {
            jsonObject.addProperty("traders_mood", bool);
        }
        bool = this.aIM;
        if (bool != null) {
            jsonObject.addProperty("live_deals", bool);
        }
        bool = this.aIN;
        if (bool != null) {
            jsonObject.addProperty("volume", bool);
        }
        return jsonObject;
    }
}
