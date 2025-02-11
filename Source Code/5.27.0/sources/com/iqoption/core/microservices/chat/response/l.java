package com.iqoption.core.microservices.chat.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007\b\u0016¢\u0006\u0002\u0010\u0002Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u001b\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0011HÆ\u0003J{\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0011HÆ\u0001J\u0013\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006-"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatState;", "", "()V", "isModerator", "", "isBanned", "isBannedDialog", "isRegulated", "currency", "", "tradingVolume", "", "tradingVolumeNeed", "banDuration", "", "", "banReason", "", "(ZZZZLjava/lang/String;DDLjava/util/List;Ljava/util/Map;)V", "getBanDuration", "()Ljava/util/List;", "getBanReason", "()Ljava/util/Map;", "getCurrency", "()Ljava/lang/String;", "()Z", "getTradingVolume", "()D", "getTradingVolumeNeed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "core_release"})
/* compiled from: ChatState.kt */
public final class l {
    private static final l bqW = new l();
    public static final a bqX = new a();
    @SerializedName("is_banned")
    private final boolean aSv;
    @SerializedName("is_regulated")
    private final boolean aZy;
    @SerializedName("is_moderator")
    private final boolean bqQ;
    @SerializedName("is_banned_dialog")
    private final boolean bqR;
    @SerializedName("tradingvolume")
    private final double bqS;
    @SerializedName("tradingvolume_need")
    private final double bqT;
    @SerializedName("ban_duration")
    private final List<Long> bqU;
    @SerializedName("ban_reason")
    private final Map<String, List<String>> bqV;
    @SerializedName("currency")
    private final String currency;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatState$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "getEMPTY", "()Lcom/iqoption/core/microservices/chat/response/ChatState;", "core_release"})
    /* compiled from: ChatState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final l acG() {
            return l.bqW;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if ((this.bqQ == lVar.bqQ ? 1 : null) != null) {
                    if ((this.aSv == lVar.aSv ? 1 : null) != null) {
                        if ((this.bqR == lVar.bqR ? 1 : null) != null) {
                            if (!((this.aZy == lVar.aZy ? 1 : null) != null && kotlin.jvm.internal.i.y(this.currency, lVar.currency) && Double.compare(this.bqS, lVar.bqS) == 0 && Double.compare(this.bqT, lVar.bqT) == 0 && kotlin.jvm.internal.i.y(this.bqU, lVar.bqU) && kotlin.jvm.internal.i.y(this.bqV, lVar.bqV))) {
                                return false;
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
        int i = this.bqQ;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.aSv;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.bqR;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.aZy;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        String str = this.currency;
        i3 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bqS);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bqT);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        List list = this.bqU;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        Map map = this.bqV;
        if (map != null) {
            i3 = map.hashCode();
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChatState(isModerator=");
        stringBuilder.append(this.bqQ);
        stringBuilder.append(", isBanned=");
        stringBuilder.append(this.aSv);
        stringBuilder.append(", isBannedDialog=");
        stringBuilder.append(this.bqR);
        stringBuilder.append(", isRegulated=");
        stringBuilder.append(this.aZy);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", tradingVolume=");
        stringBuilder.append(this.bqS);
        stringBuilder.append(", tradingVolumeNeed=");
        stringBuilder.append(this.bqT);
        stringBuilder.append(", banDuration=");
        stringBuilder.append(this.bqU);
        stringBuilder.append(", banReason=");
        stringBuilder.append(this.bqV);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public l(boolean z, boolean z2, boolean z3, boolean z4, String str, double d, double d2, List<Long> list, Map<String, ? extends List<String>> map) {
        kotlin.jvm.internal.i.f(str, "currency");
        kotlin.jvm.internal.i.f(list, "banDuration");
        kotlin.jvm.internal.i.f(map, "banReason");
        this.bqQ = z;
        this.aSv = z2;
        this.bqR = z3;
        this.aZy = z4;
        this.currency = str;
        this.bqS = d;
        this.bqT = d2;
        this.bqU = list;
        this.bqV = map;
    }

    public final boolean acC() {
        return this.aSv;
    }

    public final double acD() {
        return this.bqS;
    }

    public final double acE() {
        return this.bqT;
    }

    public /* synthetic */ l(boolean z, boolean z2, boolean z3, boolean z4, String str, double d, double d2, List list, Map map, int i, f fVar) {
        int i2 = i;
        boolean z5 = false;
        boolean z6 = (i2 & 1) != 0 ? false : z;
        boolean z7 = (i2 & 2) != 0 ? false : z2;
        boolean z8 = (i2 & 4) != 0 ? false : z3;
        if ((i2 & 8) == 0) {
            z5 = z4;
        }
        String str2 = (i2 & 16) != 0 ? "" : str;
        double d3 = 0.0d;
        double d4 = (i2 & 32) != 0 ? 0.0d : d;
        if ((i2 & 64) == 0) {
            d3 = d2;
        }
        this(z6, z7, z8, z5, str2, d4, d3, (i2 & 128) != 0 ? m.emptyList() : list, (i2 & 256) != 0 ? af.emptyMap() : map);
    }

    public l() {
        this(false, false, false, false, null, 0.0d, 0.0d, null, null, 510, null);
    }
}
