package com.iqoption.core.microservices.kyc.response.restriction;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0006\u0010)\u001a\u00020\u0003J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020(HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020(HÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00065"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "Landroid/os/Parcelable;", "requirementId", "", "type", "Lcom/iqoption/core/microservices/kyc/response/restriction/RequirementType;", "headerText", "contentText", "buttonText", "actionText", "actionIndicator", "Lcom/iqoption/core/microservices/kyc/response/restriction/RequirementActionIndicator;", "relativeUrl", "section", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "(Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/restriction/RequirementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/restriction/RequirementActionIndicator;Ljava/lang/String;Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;)V", "getActionIndicator", "()Lcom/iqoption/core/microservices/kyc/response/restriction/RequirementActionIndicator;", "getActionText", "()Ljava/lang/String;", "getButtonText", "getContentText", "getHeaderText", "getRelativeUrl", "getRequirementId", "getSection", "()Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "getType", "()Lcom/iqoption/core/microservices/kyc/response/restriction/RequirementType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "description", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycRequirementAction.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("action_text")
    private final String actionText;
    @SerializedName("requirement_id")
    private final String bvF;
    @SerializedName("header_text")
    private final String bvH;
    @SerializedName("content_text")
    private final String bvI;
    @SerializedName("button_text")
    private final String bvJ;
    @SerializedName("section")
    private final KycStepType bvK;
    @SerializedName("type")
    private final RequirementType bvN;
    @SerializedName("action_indicator")
    private final RequirementActionIndicator bvO;
    @SerializedName("relative_url")
    private final String bvP;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new a(parcel.readString(), (RequirementType) Enum.valueOf(RequirementType.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (RequirementActionIndicator) Enum.valueOf(RequirementActionIndicator.class, parcel.readString()), parcel.readString(), (KycStepType) Enum.valueOf(KycStepType.class, parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:20:0x0060, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bvK, r3.bvK) != false) goto L_0x0065;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0065;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.restriction.a;
        if (r0 == 0) goto L_0x0063;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.restriction.a) r3;
        r0 = r2.bvF;
        r1 = r3.bvF;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0012:
        r0 = r2.bvN;
        r1 = r3.bvN;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x001c:
        r0 = r2.bvH;
        r1 = r3.bvH;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0026:
        r0 = r2.bvI;
        r1 = r3.bvI;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0030:
        r0 = r2.bvJ;
        r1 = r3.bvJ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x003a:
        r0 = r2.actionText;
        r1 = r3.actionText;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0044:
        r0 = r2.bvO;
        r1 = r3.bvO;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x004e:
        r0 = r2.bvP;
        r1 = r3.bvP;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0058:
        r0 = r2.bvK;
        r3 = r3.bvK;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0065;
    L_0x0063:
        r3 = 0;
        return r3;
    L_0x0065:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.restriction.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bvF;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RequirementType requirementType = this.bvN;
        hashCode = (hashCode + (requirementType != null ? requirementType.hashCode() : 0)) * 31;
        String str2 = this.bvH;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bvI;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bvJ;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.actionText;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        RequirementActionIndicator requirementActionIndicator = this.bvO;
        hashCode = (hashCode + (requirementActionIndicator != null ? requirementActionIndicator.hashCode() : 0)) * 31;
        str2 = this.bvP;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        KycStepType kycStepType = this.bvK;
        if (kycStepType != null) {
            i = kycStepType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycRequirementAction(requirementId=");
        stringBuilder.append(this.bvF);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bvN);
        stringBuilder.append(", headerText=");
        stringBuilder.append(this.bvH);
        stringBuilder.append(", contentText=");
        stringBuilder.append(this.bvI);
        stringBuilder.append(", buttonText=");
        stringBuilder.append(this.bvJ);
        stringBuilder.append(", actionText=");
        stringBuilder.append(this.actionText);
        stringBuilder.append(", actionIndicator=");
        stringBuilder.append(this.bvO);
        stringBuilder.append(", relativeUrl=");
        stringBuilder.append(this.bvP);
        stringBuilder.append(", section=");
        stringBuilder.append(this.bvK);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bvF);
        parcel.writeString(this.bvN.name());
        parcel.writeString(this.bvH);
        parcel.writeString(this.bvI);
        parcel.writeString(this.bvJ);
        parcel.writeString(this.actionText);
        parcel.writeString(this.bvO.name());
        parcel.writeString(this.bvP);
        parcel.writeString(this.bvK.name());
    }

    public a(String str, RequirementType requirementType, String str2, String str3, String str4, String str5, RequirementActionIndicator requirementActionIndicator, String str6, KycStepType kycStepType) {
        kotlin.jvm.internal.i.f(str, "requirementId");
        kotlin.jvm.internal.i.f(requirementType, "type");
        kotlin.jvm.internal.i.f(str2, "headerText");
        kotlin.jvm.internal.i.f(str3, "contentText");
        kotlin.jvm.internal.i.f(requirementActionIndicator, "actionIndicator");
        kotlin.jvm.internal.i.f(kycStepType, "section");
        this.bvF = str;
        this.bvN = requirementType;
        this.bvH = str2;
        this.bvI = str3;
        this.bvJ = str4;
        this.actionText = str5;
        this.bvO = requirementActionIndicator;
        this.bvP = str6;
        this.bvK = kycStepType;
    }

    public final String afw() {
        return this.bvH;
    }

    public final String afy() {
        return this.bvJ;
    }

    public final String afB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.bvI);
        stringBuilder.append(" \n");
        stringBuilder.append(this.actionText);
        return stringBuilder.toString();
    }
}
