package com.iqoption.core.microservices.kyc.response.document;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B=\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\b\u0010&\u001a\u0004\u0018\u00010\u0003J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006,"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "Landroid/os/Parcelable;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "createdAt", "updatedAt", "status", "Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;", "statusText", "isExpired", "", "comment", "(Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;Ljava/lang/String;ZLjava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getCreatedAt", "id", "getId", "()Z", "getStatus", "()Lcom/iqoption/core/microservices/kyc/response/document/DocumentStatus;", "getStatusText", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "createdAtFormatted", "describeContents", "", "equals", "other", "", "hashCode", "toString", "updatedAtFormatted", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycDocumentHistory.kt */
public final class c implements Parcelable, d<String> {
    public static final Creator CREATOR = new a();
    @SerializedName("created_at")
    private final String bmu;
    @SerializedName("comment")
    private final String bqD;
    @SerializedName("status")
    private final DocumentStatus buS;
    @SerializedName("is_expired")
    private final boolean buU;
    @SerializedName("updated_at")
    private final String buV;
    @SerializedName("statusText")
    private final String buW;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new c(parcel.readString(), parcel.readString(), (DocumentStatus) Enum.valueOf(DocumentStatus.class, parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
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
                if (kotlin.jvm.internal.i.y(this.bmu, cVar.bmu) && kotlin.jvm.internal.i.y(this.buV, cVar.buV) && kotlin.jvm.internal.i.y(this.buS, cVar.buS) && kotlin.jvm.internal.i.y(this.buW, cVar.buW)) {
                    if ((this.buU == cVar.buU ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bqD, cVar.bqD)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.bmu;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.buV;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DocumentStatus documentStatus = this.buS;
        hashCode = (hashCode + (documentStatus != null ? documentStatus.hashCode() : 0)) * 31;
        str2 = this.buW;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.buU;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.bqD;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycDocumentHistory(createdAt=");
        stringBuilder.append(this.bmu);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.buV);
        stringBuilder.append(", status=");
        stringBuilder.append(this.buS);
        stringBuilder.append(", statusText=");
        stringBuilder.append(this.buW);
        stringBuilder.append(", isExpired=");
        stringBuilder.append(this.buU);
        stringBuilder.append(", comment=");
        stringBuilder.append(this.bqD);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bmu);
        parcel.writeString(this.buV);
        parcel.writeString(this.buS.name());
        parcel.writeString(this.buW);
        parcel.writeInt(this.buU);
        parcel.writeString(this.bqD);
    }

    public c(String str, String str2, DocumentStatus documentStatus, String str3, boolean z, String str4) {
        kotlin.jvm.internal.i.f(documentStatus, NotificationCompat.CATEGORY_STATUS);
        this.bmu = str;
        this.buV = str2;
        this.buS = documentStatus;
        this.buW = str3;
        this.buU = z;
        this.bqD = str4;
    }

    public final DocumentStatus aeN() {
        return this.buS;
    }

    public final String aeS() {
        return this.buW;
    }

    public final boolean isExpired() {
        return this.buU;
    }

    public final String getComment() {
        return this.bqD;
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Document: ");
        stringBuilder.append(this.bmu);
        return stringBuilder.toString();
    }

    public final String aeQ() {
        return d.gL(this.bmu);
    }

    public final String aeR() {
        return d.gL(this.buV);
    }
}
