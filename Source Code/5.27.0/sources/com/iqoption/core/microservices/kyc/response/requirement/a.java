package com.iqoption.core.microservices.kyc.response.requirement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/requirement/KycRequirement;", "Landroid/os/Parcelable;", "requirementId", "", "type", "Lcom/iqoption/core/microservices/kyc/response/requirement/RequirementType;", "headerText", "contentText", "buttonText", "section", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "(Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/requirement/RequirementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;)V", "getButtonText", "()Ljava/lang/String;", "getContentText", "getHeaderText", "getRequirementId", "getSection", "()Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "getType", "()Lcom/iqoption/core/microservices/kyc/response/requirement/RequirementType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycRequirement.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("requirement_id")
    private final String bvF;
    @SerializedName("type")
    private final RequirementType bvG;
    @SerializedName("header_text")
    private final String bvH;
    @SerializedName("content_text")
    private final String bvI;
    @SerializedName("button_text")
    private final String bvJ;
    @SerializedName("section")
    private final KycStepType bvK;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            KycStepType kycStepType;
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            RequirementType requirementType = (RequirementType) Enum.valueOf(RequirementType.class, parcel.readString());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                kycStepType = (KycStepType) Enum.valueOf(KycStepType.class, parcel.readString());
            } else {
                kycStepType = null;
            }
            return new a(readString, requirementType, readString2, readString3, readString4, kycStepType);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bvK, r3.bvK) != false) goto L_0x0047;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0047;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.requirement.a;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.requirement.a) r3;
        r0 = r2.bvF;
        r1 = r3.bvF;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0012:
        r0 = r2.bvG;
        r1 = r3.bvG;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r2.bvH;
        r1 = r3.bvH;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r2.bvI;
        r1 = r3.bvI;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0030:
        r0 = r2.bvJ;
        r1 = r3.bvJ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r2.bvK;
        r3 = r3.bvK;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0047;
    L_0x0045:
        r3 = 0;
        return r3;
    L_0x0047:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.requirement.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bvF;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RequirementType requirementType = this.bvG;
        hashCode = (hashCode + (requirementType != null ? requirementType.hashCode() : 0)) * 31;
        String str2 = this.bvH;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bvI;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bvJ;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        KycStepType kycStepType = this.bvK;
        if (kycStepType != null) {
            i = kycStepType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycRequirement(requirementId=");
        stringBuilder.append(this.bvF);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bvG);
        stringBuilder.append(", headerText=");
        stringBuilder.append(this.bvH);
        stringBuilder.append(", contentText=");
        stringBuilder.append(this.bvI);
        stringBuilder.append(", buttonText=");
        stringBuilder.append(this.bvJ);
        stringBuilder.append(", section=");
        stringBuilder.append(this.bvK);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bvF);
        parcel.writeString(this.bvG.name());
        parcel.writeString(this.bvH);
        parcel.writeString(this.bvI);
        parcel.writeString(this.bvJ);
        KycStepType kycStepType = this.bvK;
        if (kycStepType != null) {
            parcel.writeInt(1);
            parcel.writeString(kycStepType.name());
            return;
        }
        parcel.writeInt(0);
    }

    public a(String str, RequirementType requirementType, String str2, String str3, String str4, KycStepType kycStepType) {
        kotlin.jvm.internal.i.f(str, "requirementId");
        kotlin.jvm.internal.i.f(requirementType, "type");
        kotlin.jvm.internal.i.f(str2, "headerText");
        kotlin.jvm.internal.i.f(str3, "contentText");
        kotlin.jvm.internal.i.f(str4, "buttonText");
        this.bvF = str;
        this.bvG = requirementType;
        this.bvH = str2;
        this.bvI = str3;
        this.bvJ = str4;
        this.bvK = kycStepType;
    }

    public final String afv() {
        return this.bvF;
    }

    public final String afw() {
        return this.bvH;
    }

    public final String afx() {
        return this.bvI;
    }

    public final String afy() {
        return this.bvJ;
    }

    public final KycStepType afz() {
        return this.bvK;
    }
}
