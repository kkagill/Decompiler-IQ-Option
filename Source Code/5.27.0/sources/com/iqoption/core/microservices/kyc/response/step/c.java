package com.iqoption.core.microservices.kyc.response.step;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.plus.PlusShare;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006&"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "Landroid/os/Parcelable;", "stepType", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "kycStepState", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepState;", "isSkipAllowed", "", "title", "", "reason", "(Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;Lcom/iqoption/core/microservices/kyc/response/step/KycStepState;ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getKycStepState", "()Lcom/iqoption/core/microservices/kyc/response/step/KycStepState;", "getReason", "()Ljava/lang/String;", "getStepType", "()Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycCustomerStep.kt */
public final class c implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("step_id")
    private final KycStepType bvW;
    @SerializedName("state")
    private final KycStepState bvX;
    @SerializedName("is_skip_allowed")
    private final boolean bvY;
    @SerializedName("reason")
    private final String bvZ;
    @SerializedName("title")
    private final String title;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new c((KycStepType) Enum.valueOf(KycStepType.class, parcel.readString()), (KycStepState) Enum.valueOf(KycStepState.class, parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
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
                if (kotlin.jvm.internal.i.y(this.bvW, cVar.bvW) && kotlin.jvm.internal.i.y(this.bvX, cVar.bvX)) {
                    if (!((this.bvY == cVar.bvY ? 1 : null) != null && kotlin.jvm.internal.i.y(this.title, cVar.title) && kotlin.jvm.internal.i.y(this.bvZ, cVar.bvZ))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        KycStepType kycStepType = this.bvW;
        int i = 0;
        int hashCode = (kycStepType != null ? kycStepType.hashCode() : 0) * 31;
        KycStepState kycStepState = this.bvX;
        hashCode = (hashCode + (kycStepState != null ? kycStepState.hashCode() : 0)) * 31;
        int i2 = this.bvY;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.title;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.bvZ;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycCustomerStep(stepType=");
        stringBuilder.append(this.bvW);
        stringBuilder.append(", kycStepState=");
        stringBuilder.append(this.bvX);
        stringBuilder.append(", isSkipAllowed=");
        stringBuilder.append(this.bvY);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", reason=");
        stringBuilder.append(this.bvZ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bvW.name());
        parcel.writeString(this.bvX.name());
        parcel.writeInt(this.bvY);
        parcel.writeString(this.title);
        parcel.writeString(this.bvZ);
    }

    public c(KycStepType kycStepType, KycStepState kycStepState, boolean z, String str, String str2) {
        kotlin.jvm.internal.i.f(kycStepType, "stepType");
        kotlin.jvm.internal.i.f(kycStepState, "kycStepState");
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        this.bvW = kycStepType;
        this.bvX = kycStepState;
        this.bvY = z;
        this.title = str;
        this.bvZ = str2;
    }

    public final KycStepType afH() {
        return this.bvW;
    }

    public final KycStepState afI() {
        return this.bvX;
    }

    public final boolean afJ() {
        return this.bvY;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getReason() {
        return this.bvZ;
    }
}
