package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import io.card.payment.CardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\t\u00108\u001a\u00020\u0011HÆ\u0003J\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010:J\t\u0010;\u001a\u00020<HÖ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020<HÖ\u0001J\b\u0010B\u001a\u00020\u0005H\u0016J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\b\u0010D\u001a\u00020EH\u0016J\u0019\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020<HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006K"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/CardWithdrawMethod;", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "id", "", "name", "", "commission", "", "commissions", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "fields", "", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "cardId", "refundAmount", "iqOptionPaymentMethodId", "cardType", "Lio/card/payment/CardType;", "limits", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "maxLimit", "Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "(JLjava/lang/String;DLcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;Ljava/util/List;JDLjava/lang/Long;Lio/card/payment/CardType;Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;)V", "getCardId", "()J", "getCardType", "()Lio/card/payment/CardType;", "getCommission", "()D", "getCommissions", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "getFields", "()Ljava/util/List;", "getId", "getIqOptionPaymentMethodId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLimits", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "getMaxLimit", "()Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "setMaxLimit", "(Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;)V", "getName", "()Ljava/lang/String;", "getRefundAmount", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;DLcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;Ljava/util/List;JDLjava/lang/Long;Lio/card/payment/CardType;Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;)Lcom/iqoption/core/microservices/withdraw/response/CardWithdrawMethod;", "describeContents", "", "equals", "", "other", "", "hashCode", "payoutMethodIdentifier", "toString", "type", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: WithdrawMethod.kt */
public final class e implements c {
    public static final Creator CREATOR = new a();
    private final double bCr;
    private final double bDS;
    private final Long bDT;
    private final j bDU;
    private final List<h> bDV;
    private final CardType bDW;
    private final k bDX;
    private a bDY;
    private final long bnQ;
    private final long id;
    private final String name;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            double readDouble = parcel.readDouble();
            j jVar = parcel.readInt() != 0 ? (j) j.CREATOR.createFromParcel(parcel2) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((h) h.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
            return new e(readLong, readString, readDouble, jVar, arrayList, parcel.readLong(), parcel.readDouble(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (CardType) Enum.valueOf(CardType.class, parcel.readString()), parcel.readInt() != 0 ? (k) k.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (a) a.CREATOR.createFromParcel(parcel2) : null);
        }

        public final Object[] newArray(int i) {
            return new e[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if ((getId() == eVar.getId() ? 1 : null) != null && kotlin.jvm.internal.i.y(getName(), eVar.getName()) && Double.compare(ajB(), eVar.ajB()) == 0 && kotlin.jvm.internal.i.y(ajC(), eVar.ajC()) && kotlin.jvm.internal.i.y(ajD(), eVar.ajD())) {
                    if (!((this.bnQ == eVar.bnQ ? 1 : null) != null && Double.compare(this.bDS, eVar.bDS) == 0 && kotlin.jvm.internal.i.y(this.bDT, eVar.bDT) && kotlin.jvm.internal.i.y(this.bDW, eVar.bDW) && kotlin.jvm.internal.i.y(ajE(), eVar.ajE()) && kotlin.jvm.internal.i.y(ajF(), eVar.ajF()))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long id = getId();
        int i = ((int) (id ^ (id >>> 32))) * 31;
        String name = getName();
        int i2 = 0;
        i = (i + (name != null ? name.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(ajB());
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        j ajC = ajC();
        i = (i + (ajC != null ? ajC.hashCode() : 0)) * 31;
        List ajD = ajD();
        i = (i + (ajD != null ? ajD.hashCode() : 0)) * 31;
        doubleToLongBits = this.bnQ;
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.bDS);
        i = (i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        Long l = this.bDT;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        CardType cardType = this.bDW;
        i = (i + (cardType != null ? cardType.hashCode() : 0)) * 31;
        k ajE = ajE();
        i = (i + (ajE != null ? ajE.hashCode() : 0)) * 31;
        a ajF = ajF();
        if (ajF != null) {
            i2 = ajF.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CardWithdrawMethod(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", name=");
        stringBuilder.append(getName());
        stringBuilder.append(", commission=");
        stringBuilder.append(ajB());
        stringBuilder.append(", commissions=");
        stringBuilder.append(ajC());
        stringBuilder.append(", fields=");
        stringBuilder.append(ajD());
        stringBuilder.append(", cardId=");
        stringBuilder.append(this.bnQ);
        stringBuilder.append(", refundAmount=");
        stringBuilder.append(this.bDS);
        stringBuilder.append(", iqOptionPaymentMethodId=");
        stringBuilder.append(this.bDT);
        stringBuilder.append(", cardType=");
        stringBuilder.append(this.bDW);
        stringBuilder.append(", limits=");
        stringBuilder.append(ajE());
        stringBuilder.append(", maxLimit=");
        stringBuilder.append(ajF());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeDouble(this.bCr);
        j jVar = this.bDU;
        if (jVar != null) {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<h> list = this.bDV;
        parcel.writeInt(list.size());
        for (h writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeLong(this.bnQ);
        parcel.writeDouble(this.bDS);
        Long l = this.bDT;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.bDW.name());
        k kVar = this.bDX;
        if (kVar != null) {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        a aVar = this.bDY;
        if (aVar != null) {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public e(long j, String str, double d, j jVar, List<h> list, long j2, double d2, Long l, CardType cardType, k kVar, a aVar) {
        String str2 = str;
        List<h> list2 = list;
        CardType cardType2 = cardType;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(list, "fields");
        kotlin.jvm.internal.i.f(cardType2, "cardType");
        this.id = j;
        this.name = str2;
        this.bCr = d;
        this.bDU = jVar;
        this.bDV = list2;
        this.bnQ = j2;
        this.bDS = d2;
        this.bDT = l;
        this.bDW = cardType2;
        this.bDX = kVar;
        this.bDY = aVar;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double ajB() {
        return this.bCr;
    }

    public j ajC() {
        return this.bDU;
    }

    public List<h> ajD() {
        return this.bDV;
    }

    public final long aaB() {
        return this.bnQ;
    }

    public final double ajG() {
        return this.bDS;
    }

    public final Long ajH() {
        return this.bDT;
    }

    public final CardType getCardType() {
        return this.bDW;
    }

    public k ajE() {
        return this.bDX;
    }

    public a ajF() {
        return this.bDY;
    }

    public WithdrawMethodType ajz() {
        return WithdrawMethodType.CARD;
    }

    public String ajA() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append('-');
        stringBuilder.append(this.bnQ);
        return stringBuilder.toString();
    }
}
