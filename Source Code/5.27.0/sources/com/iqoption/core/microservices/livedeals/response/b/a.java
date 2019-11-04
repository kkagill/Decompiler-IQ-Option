package com.iqoption.core.microservices.livedeals.response.b;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.livedeals.ExpirationType;
import com.iqoption.core.microservices.livedeals.response.DirectionType;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00152\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0012\u001a\u00020\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0016X\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b\u0014\u0010*R\u0014\u0010,\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0016\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001f¨\u0006G"}, bng = {"Lcom/iqoption/core/microservices/livedeals/response/digital/LiveDealDigital;", "Lcom/iqoption/core/microservices/livedeals/response/LiveDeal;", "activeId", "", "positionId", "direction", "Lcom/iqoption/core/microservices/livedeals/response/DirectionType;", "amount", "", "createdAt", "", "expiration", "expirationType", "Lcom/iqoption/core/microservices/livedeals/ExpirationType;", "userId", "name", "", "countryId", "flag", "avatar", "isBig", "", "(ILjava/lang/Integer;Lcom/iqoption/core/microservices/livedeals/response/DirectionType;DJJLcom/iqoption/core/microservices/livedeals/ExpirationType;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getActiveId", "()I", "getAmount", "()D", "getAvatar", "()Ljava/lang/String;", "getCountryId", "getCreatedAt", "()J", "getDirection", "()Lcom/iqoption/core/microservices/livedeals/response/DirectionType;", "getExpiration", "getExpirationType", "()Lcom/iqoption/core/microservices/livedeals/ExpirationType;", "getFlag", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isCall", "()Z", "getName", "getPositionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Lcom/iqoption/core/microservices/livedeals/response/DirectionType;DJJLcom/iqoption/core/microservices/livedeals/ExpirationType;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/iqoption/core/microservices/livedeals/response/digital/LiveDealDigital;", "equals", "other", "", "hashCode", "toString", "core_release"})
@o
/* compiled from: LiveDealDigital.kt */
public final class a implements com.iqoption.core.microservices.livedeals.response.a {
    @SerializedName("instrument_active_id")
    private final int activeId;
    @SerializedName("created_at")
    private final long bmN;
    @SerializedName("amount_enrolled")
    private final double bmw;
    @SerializedName("position_id")
    private final Integer bwA;
    @SerializedName("instrument_dir")
    private final DirectionType bwB;
    @SerializedName("avatar")
    private final String bwC;
    @SerializedName("is_big")
    private final Boolean bwD;
    @SerializedName("country_id")
    private final int bwn;
    @SerializedName("expiration_type")
    private final ExpirationType bww;
    @SerializedName("expiration_time")
    private final long expiration;
    @SerializedName("flag")
    private final String flag;
    @SerializedName("name")
    private final String name;
    @SerializedName("user_id")
    private final long userId;

    public static /* synthetic */ a a(a aVar, int i, Integer num, DirectionType directionType, double d, long j, long j2, ExpirationType expirationType, long j3, String str, int i2, String str2, String str3, Boolean bool, int i3, Object obj) {
        a aVar2 = aVar;
        int i4 = i3;
        return aVar.a((i4 & 1) != 0 ? aVar.getActiveId() : i, (i4 & 2) != 0 ? aVar.agc() : num, (i4 & 4) != 0 ? aVar2.bwB : directionType, (i4 & 8) != 0 ? aVar.ZC() : d, (i4 & 16) != 0 ? aVar.ZU() : j, (i4 & 32) != 0 ? aVar2.expiration : j2, (i4 & 64) != 0 ? aVar2.bww : expirationType, (i4 & 128) != 0 ? aVar.getUserId() : j3, (i4 & 256) != 0 ? aVar.getName() : str, (i4 & 512) != 0 ? aVar.afY() : i2, (i4 & 1024) != 0 ? aVar.afZ() : str2, (i4 & 2048) != 0 ? aVar.aga() : str3, (i4 & 4096) != 0 ? aVar.agb() : bool);
    }

    public final a a(int i, Integer num, DirectionType directionType, double d, long j, long j2, ExpirationType expirationType, long j3, String str, int i2, String str2, String str3, Boolean bool) {
        int i3 = i;
        Integer num2 = num;
        DirectionType directionType2 = directionType;
        double d2 = d;
        long j4 = j;
        long j5 = j2;
        ExpirationType expirationType2 = expirationType;
        long j6 = j3;
        String str4 = str;
        int i4 = i2;
        String str5 = str2;
        String str6 = str3;
        Boolean bool2 = bool;
        kotlin.jvm.internal.i.f(directionType, "direction");
        kotlin.jvm.internal.i.f(expirationType, "expirationType");
        kotlin.jvm.internal.i.f(str2, "flag");
        return new a(i, num2, directionType2, d2, j4, j5, expirationType2, j6, str4, i4, str5, str6, bool2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((getActiveId() == aVar.getActiveId() ? 1 : null) != null && kotlin.jvm.internal.i.y(agc(), aVar.agc()) && kotlin.jvm.internal.i.y(this.bwB, aVar.bwB) && Double.compare(ZC(), aVar.ZC()) == 0) {
                    if ((ZU() == aVar.ZU() ? 1 : null) != null) {
                        if ((this.expiration == aVar.expiration ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bww, aVar.bww)) {
                            if ((getUserId() == aVar.getUserId() ? 1 : null) != null && kotlin.jvm.internal.i.y(getName(), aVar.getName())) {
                                if (!((afY() == aVar.afY() ? 1 : null) != null && kotlin.jvm.internal.i.y(afZ(), aVar.afZ()) && kotlin.jvm.internal.i.y(aga(), aVar.aga()) && kotlin.jvm.internal.i.y(agb(), aVar.agb()))) {
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

    public int hashCode() {
        int activeId = getActiveId() * 31;
        Integer agc = agc();
        int i = 0;
        activeId = (activeId + (agc != null ? agc.hashCode() : 0)) * 31;
        DirectionType directionType = this.bwB;
        activeId = (activeId + (directionType != null ? directionType.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(ZC());
        activeId = (activeId + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = ZU();
        activeId = (activeId + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = this.expiration;
        activeId = (activeId + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        ExpirationType expirationType = this.bww;
        activeId = (activeId + (expirationType != null ? expirationType.hashCode() : 0)) * 31;
        doubleToLongBits = getUserId();
        activeId = (activeId + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String name = getName();
        activeId = (((activeId + (name != null ? name.hashCode() : 0)) * 31) + afY()) * 31;
        name = afZ();
        activeId = (activeId + (name != null ? name.hashCode() : 0)) * 31;
        name = aga();
        activeId = (activeId + (name != null ? name.hashCode() : 0)) * 31;
        Boolean agb = agb();
        if (agb != null) {
            i = agb.hashCode();
        }
        return activeId + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LiveDealDigital(activeId=");
        stringBuilder.append(getActiveId());
        stringBuilder.append(", positionId=");
        stringBuilder.append(agc());
        stringBuilder.append(", direction=");
        stringBuilder.append(this.bwB);
        stringBuilder.append(", amount=");
        stringBuilder.append(ZC());
        stringBuilder.append(", createdAt=");
        stringBuilder.append(ZU());
        stringBuilder.append(", expiration=");
        stringBuilder.append(this.expiration);
        stringBuilder.append(", expirationType=");
        stringBuilder.append(this.bww);
        stringBuilder.append(", userId=");
        stringBuilder.append(getUserId());
        stringBuilder.append(", name=");
        stringBuilder.append(getName());
        stringBuilder.append(", countryId=");
        stringBuilder.append(afY());
        stringBuilder.append(", flag=");
        stringBuilder.append(afZ());
        stringBuilder.append(", avatar=");
        stringBuilder.append(aga());
        stringBuilder.append(", isBig=");
        stringBuilder.append(agb());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(int i, Integer num, DirectionType directionType, double d, long j, long j2, ExpirationType expirationType, long j3, String str, int i2, String str2, String str3, Boolean bool) {
        DirectionType directionType2 = directionType;
        ExpirationType expirationType2 = expirationType;
        String str4 = str2;
        kotlin.jvm.internal.i.f(directionType, "direction");
        kotlin.jvm.internal.i.f(expirationType2, "expirationType");
        kotlin.jvm.internal.i.f(str4, "flag");
        this.activeId = i;
        this.bwA = num;
        this.bwB = directionType2;
        this.bmw = d;
        this.bmN = j;
        this.expiration = j2;
        this.bww = expirationType2;
        this.userId = j3;
        this.name = str;
        this.bwn = i2;
        this.flag = str4;
        this.bwC = str3;
        this.bwD = bool;
    }

    public int getActiveId() {
        return this.activeId;
    }

    public Integer agc() {
        return this.bwA;
    }

    public double ZC() {
        return this.bmw;
    }

    public long ZU() {
        return this.bmN;
    }

    public long getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

    public int afY() {
        return this.bwn;
    }

    public String afZ() {
        return this.flag;
    }

    public String aga() {
        return this.bwC;
    }

    public Boolean agb() {
        return this.bwD;
    }

    public InstrumentType getInstrumentType() {
        return InstrumentType.DIGITAL_INSTRUMENT;
    }

    public boolean isCall() {
        return this.bwB == DirectionType.CALL;
    }
}
