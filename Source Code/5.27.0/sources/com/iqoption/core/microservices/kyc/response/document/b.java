package com.iqoption.core.microservices.kyc.response.document;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/document/KycDocument;", "Landroid/os/Parcelable;", "reference", "", "status", "Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;", "comment", "verificationType", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "isExpired", "", "expiryDate", "(Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/VerificationType;ZLjava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getExpiryDate", "()Z", "getReference", "getStatus", "()Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;", "getVerificationType", "()Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycDocument.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("comment")
    private final String bqD;
    @SerializedName("reference")
    private final String buR;
    @SerializedName("status")
    private final DocumentStatus buS;
    @SerializedName("verification_type")
    private final VerificationType buT;
    @SerializedName("is_expired")
    private final boolean buU;
    @SerializedName("expiry_date")
    private final String expiryDate;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b(parcel.readString(), (DocumentStatus) Enum.valueOf(DocumentStatus.class, parcel.readString()), parcel.readString(), (VerificationType) Enum.valueOf(VerificationType.class, parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.buR, bVar.buR) && kotlin.jvm.internal.i.y(this.buS, bVar.buS) && kotlin.jvm.internal.i.y(this.bqD, bVar.bqD) && kotlin.jvm.internal.i.y(this.buT, bVar.buT)) {
                    if ((this.buU == bVar.buU ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.expiryDate, bVar.expiryDate)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.buR;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DocumentStatus documentStatus = this.buS;
        hashCode = (hashCode + (documentStatus != null ? documentStatus.hashCode() : 0)) * 31;
        String str2 = this.bqD;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        VerificationType verificationType = this.buT;
        hashCode = (hashCode + (verificationType != null ? verificationType.hashCode() : 0)) * 31;
        int i2 = this.buU;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.expiryDate;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycDocument(reference=");
        stringBuilder.append(this.buR);
        stringBuilder.append(", status=");
        stringBuilder.append(this.buS);
        stringBuilder.append(", comment=");
        stringBuilder.append(this.bqD);
        stringBuilder.append(", verificationType=");
        stringBuilder.append(this.buT);
        stringBuilder.append(", isExpired=");
        stringBuilder.append(this.buU);
        stringBuilder.append(", expiryDate=");
        stringBuilder.append(this.expiryDate);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.buR);
        parcel.writeString(this.buS.name());
        parcel.writeString(this.bqD);
        parcel.writeString(this.buT.name());
        parcel.writeInt(this.buU);
        parcel.writeString(this.expiryDate);
    }

    public b(String str, DocumentStatus documentStatus, String str2, VerificationType verificationType, boolean z, String str3) {
        kotlin.jvm.internal.i.f(str, "reference");
        kotlin.jvm.internal.i.f(documentStatus, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(verificationType, "verificationType");
        this.buR = str;
        this.buS = documentStatus;
        this.bqD = str2;
        this.buT = verificationType;
        this.buU = z;
        this.expiryDate = str3;
    }

    public final DocumentStatus aeN() {
        return this.buS;
    }

    public final String getComment() {
        return this.bqD;
    }

    public final VerificationType aeO() {
        return this.buT;
    }

    public final String aeP() {
        return this.expiryDate;
    }
}
