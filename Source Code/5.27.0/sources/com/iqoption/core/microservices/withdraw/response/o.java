package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00108\u001a\u00020\u000eHÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010<J\t\u0010=\u001a\u00020>HÖ\u0001J\u0013\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020>HÖ\u0001J\t\u0010C\u001a\u00020\u000eHÖ\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020>HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0013\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"¨\u0006I"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "Landroid/os/Parcelable;", "id", "", "operationId", "status", "Lcom/iqoption/core/microservices/withdraw/response/Status;", "canСancel", "", "amount", "Ljava/math/BigDecimal;", "commissionAmount", "", "currency", "", "createdAt", "Ljava/util/Date;", "updatedAt", "paymentMethod", "cssName", "message", "card", "Lcom/iqoption/core/microservices/withdraw/response/PayoutCard;", "(JJLcom/iqoption/core/microservices/withdraw/response/Status;ZLjava/math/BigDecimal;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/withdraw/response/PayoutCard;)V", "getAmount", "()Ljava/math/BigDecimal;", "getCanСancel", "()Z", "getCard", "()Lcom/iqoption/core/microservices/withdraw/response/PayoutCard;", "getCommissionAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreatedAt", "()Ljava/util/Date;", "getCssName", "()Ljava/lang/String;", "getCurrency", "getId", "()J", "getMessage", "getOperationId", "getPaymentMethod", "getStatus", "()Lcom/iqoption/core/microservices/withdraw/response/Status;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLcom/iqoption/core/microservices/withdraw/response/Status;ZLjava/math/BigDecimal;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/withdraw/response/PayoutCard;)Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
/* compiled from: WithdrawPayout.kt */
public final class o implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("commission_amount")
    private final Double bCT;
    @SerializedName("operation_id")
    private final long bEj;
    @SerializedName("status")
    private final Status bEk;
    @SerializedName("can_cancel")
    private final boolean bEl;
    @SerializedName("created_at")
    @JsonAdapter(DateDeserializer.class)
    private final Date bEm;
    @SerializedName("updated_at")
    @JsonAdapter(DateDeserializer.class)
    private final Date bEn;
    @SerializedName("css_name")
    private final String bEo;
    @SerializedName("card")
    private final f bEp;
    @SerializedName("amount")
    private final BigDecimal bub;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("id")
    private final long id;
    @SerializedName("message")
    private final String message;
    @SerializedName("payment_method")
    private final String paymentMethod;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            kotlin.jvm.internal.i.f(parcel2, "in");
            return new o(parcel.readLong(), parcel.readLong(), (Status) Enum.valueOf(Status.class, parcel.readString()), parcel.readInt() != 0, (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (f) f.CREATOR.createFromParcel(parcel2) : null);
        }

        public final Object[] newArray(int i) {
            return new o[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if ((this.id == oVar.id ? 1 : null) != null) {
                    if ((this.bEj == oVar.bEj ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bEk, oVar.bEk)) {
                        if (!((this.bEl == oVar.bEl ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bub, oVar.bub) && kotlin.jvm.internal.i.y(this.bCT, oVar.bCT) && kotlin.jvm.internal.i.y(this.currency, oVar.currency) && kotlin.jvm.internal.i.y(this.bEm, oVar.bEm) && kotlin.jvm.internal.i.y(this.bEn, oVar.bEn) && kotlin.jvm.internal.i.y(this.paymentMethod, oVar.paymentMethod) && kotlin.jvm.internal.i.y(this.bEo, oVar.bEo) && kotlin.jvm.internal.i.y(this.message, oVar.message) && kotlin.jvm.internal.i.y(this.bEp, oVar.bEp))) {
                            return false;
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
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.bEj;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Status status = this.bEk;
        int i2 = 0;
        i = (i + (status != null ? status.hashCode() : 0)) * 31;
        int i3 = this.bEl;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        BigDecimal bigDecimal = this.bub;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        Double d = this.bCT;
        i = (i + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.currency;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Date date = this.bEm;
        i = (i + (date != null ? date.hashCode() : 0)) * 31;
        date = this.bEn;
        i = (i + (date != null ? date.hashCode() : 0)) * 31;
        str = this.paymentMethod;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bEo;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.message;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        f fVar = this.bEp;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawPayout(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", operationId=");
        stringBuilder.append(this.bEj);
        stringBuilder.append(", status=");
        stringBuilder.append(this.bEk);
        stringBuilder.append(", canСancel=");
        stringBuilder.append(this.bEl);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.bub);
        stringBuilder.append(", commissionAmount=");
        stringBuilder.append(this.bCT);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.bEm);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.bEn);
        stringBuilder.append(", paymentMethod=");
        stringBuilder.append(this.paymentMethod);
        stringBuilder.append(", cssName=");
        stringBuilder.append(this.bEo);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", card=");
        stringBuilder.append(this.bEp);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeLong(this.bEj);
        parcel.writeString(this.bEk.name());
        parcel.writeInt(this.bEl);
        parcel.writeSerializable(this.bub);
        Double d = this.bCT;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.currency);
        parcel.writeSerializable(this.bEm);
        parcel.writeSerializable(this.bEn);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.bEo);
        parcel.writeString(this.message);
        f fVar = this.bEp;
        if (fVar != null) {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public o(long j, long j2, Status status, boolean z, BigDecimal bigDecimal, Double d, String str, Date date, Date date2, String str2, String str3, String str4, f fVar) {
        Status status2 = status;
        BigDecimal bigDecimal2 = bigDecimal;
        String str5 = str;
        Date date3 = date;
        Date date4 = date2;
        String str6 = str2;
        String str7 = str3;
        kotlin.jvm.internal.i.f(status, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(bigDecimal2, "amount");
        kotlin.jvm.internal.i.f(str5, "currency");
        kotlin.jvm.internal.i.f(date3, "createdAt");
        kotlin.jvm.internal.i.f(date4, "updatedAt");
        kotlin.jvm.internal.i.f(str6, "paymentMethod");
        kotlin.jvm.internal.i.f(str7, "cssName");
        this.id = j;
        this.bEj = j2;
        this.bEk = status2;
        this.bEl = z;
        this.bub = bigDecimal2;
        this.bCT = d;
        this.currency = str5;
        this.bEm = date3;
        this.bEn = date4;
        this.paymentMethod = str6;
        this.bEo = str7;
        this.message = str4;
        this.bEp = fVar;
    }

    public final long getId() {
        return this.id;
    }

    public final Status ajR() {
        return this.bEk;
    }

    public final boolean ajS() {
        return this.bEl;
    }

    public final BigDecimal aeo() {
        return this.bub;
    }

    public final Double aiZ() {
        return this.bCT;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Date ajT() {
        return this.bEm;
    }

    public final String ajU() {
        return this.paymentMethod;
    }

    public final String getMessage() {
        return this.message;
    }

    public final f ajV() {
        return this.bEp;
    }
}
