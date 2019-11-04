package com.iqoption.core.microservices.pricemovements.a;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\b\b\u0018\u0000 52\u00020\u0001:\u00015By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00066"}, bng = {"Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "", "id", "", "activeId", "", "type", "instruments", "", "", "startTime", "finishTime", "startValue", "", "finishValue", "created", "percent", "isHigh", "", "(JIILjava/util/List;JJDDJDZ)V", "getActiveId", "()I", "createTime", "getCreateTime", "()J", "getCreated", "getFinishTime", "getFinishValue", "()D", "getId", "getInstruments", "()Ljava/util/List;", "()Z", "getPercent", "getStartTime", "getStartValue", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "core_release"})
/* compiled from: Signal.kt */
public final class a {
    public static final a bxm = new a();
    @SerializedName("instruments")
    private final List<String> aKz;
    @SerializedName("underline_asset_id")
    private final int activeId;
    @SerializedName("finish_time")
    private final long amw;
    @SerializedName("percent")
    private final double aug;
    @SerializedName("start_value")
    private final double bxj;
    @SerializedName("finish_value")
    private final double bxk;
    @SerializedName("high")
    private final boolean bxl;
    @SerializedName("created")
    private final long created;
    @SerializedName("id")
    private final long id;
    @SerializedName("start_time")
    private final long startTime;
    @SerializedName("type")
    private final int type;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/microservices/pricemovements/response/Signal$Companion;", "", "()V", "TYPE_GAP", "", "TYPE_SHARP_JUMP", "core_release"})
    /* compiled from: Signal.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public a() {
        this(0, 0, 0, null, 0, 0, 0.0d, 0.0d, 0, 0.0d, false, 2047, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.id == aVar.id ? 1 : null) != null) {
                    if ((this.activeId == aVar.activeId ? 1 : null) != null) {
                        if ((this.type == aVar.type ? 1 : null) != null && kotlin.jvm.internal.i.y(this.aKz, aVar.aKz)) {
                            if ((this.startTime == aVar.startTime ? 1 : null) != null) {
                                if ((this.amw == aVar.amw ? 1 : null) != null && Double.compare(this.bxj, aVar.bxj) == 0 && Double.compare(this.bxk, aVar.bxk) == 0) {
                                    if ((this.created == aVar.created ? 1 : null) != null && Double.compare(this.aug, aVar.aug) == 0) {
                                        if ((this.bxl == aVar.bxl ? 1 : null) != null) {
                                            return true;
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
        long j = this.id;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.activeId) * 31) + this.type) * 31;
        List list = this.aKz;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        long j2 = this.startTime;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.amw;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.bxj);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.bxk);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.created;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = Double.doubleToLongBits(this.aug);
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i2 = this.bxl;
        if (i2 != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Signal(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", activeId=");
        stringBuilder.append(this.activeId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", instruments=");
        stringBuilder.append(this.aKz);
        stringBuilder.append(", startTime=");
        stringBuilder.append(this.startTime);
        stringBuilder.append(", finishTime=");
        stringBuilder.append(this.amw);
        stringBuilder.append(", startValue=");
        stringBuilder.append(this.bxj);
        stringBuilder.append(", finishValue=");
        stringBuilder.append(this.bxk);
        stringBuilder.append(", created=");
        stringBuilder.append(this.created);
        stringBuilder.append(", percent=");
        stringBuilder.append(this.aug);
        stringBuilder.append(", isHigh=");
        stringBuilder.append(this.bxl);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(long j, int i, int i2, List<String> list, long j2, long j3, double d, double d2, long j4, double d3, boolean z) {
        List<String> list2 = list;
        kotlin.jvm.internal.i.f(list, "instruments");
        this.id = j;
        this.activeId = i;
        this.type = i2;
        this.aKz = list2;
        this.startTime = j2;
        this.amw = j3;
        this.bxj = d;
        this.bxk = d2;
        this.created = j4;
        this.aug = d3;
        this.bxl = z;
    }

    public final long getId() {
        return this.id;
    }

    public final int getActiveId() {
        return this.activeId;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ a(long j, int i, int i2, List list, long j2, long j3, double d, double d2, long j4, double d3, boolean z, int i3, f fVar) {
        int i4 = i3;
        long j5 = (i4 & 1) != 0 ? -1 : j;
        int i5 = (i4 & 2) != 0 ? -1 : i;
        int i6 = (i4 & 4) != 0 ? 1 : i2;
        List emptyList = (i4 & 8) != 0 ? m.emptyList() : list;
        long j6 = 0;
        long j7 = (i4 & 16) != 0 ? 0 : j2;
        long j8 = (i4 & 32) != 0 ? 0 : j3;
        double d4 = 0.0d;
        double d5 = (i4 & 64) != 0 ? 0.0d : d;
        double d6 = (i4 & 128) != 0 ? 0.0d : d2;
        if ((i4 & 256) == 0) {
            j6 = j4;
        }
        if ((i4 & 512) == 0) {
            d4 = d3;
        }
        this(j5, i5, i6, emptyList, j7, j8, d5, d6, j6, d4, (i4 & 1024) != 0 ? false : z);
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long agu() {
        return this.amw;
    }

    public final double agv() {
        return this.bxj;
    }

    public final double agw() {
        return this.bxk;
    }

    public final long getCreated() {
        return this.created;
    }

    public final double agx() {
        return this.aug;
    }

    public final boolean agy() {
        return this.bxl;
    }

    public final long getCreateTime() {
        return this.created * ((long) 1000);
    }
}
