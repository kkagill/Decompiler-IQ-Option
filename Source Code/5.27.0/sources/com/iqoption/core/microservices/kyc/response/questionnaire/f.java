package com.iqoption.core.microservices.kyc.response.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tHÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u00063"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "Landroid/os/Parcelable;", "questionKey", "", "isRequired", "", "questionId", "", "answers", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswersItem;", "isMultiChoiceAvailable", "dependsOnAnswers", "order", "controlElement", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycControlElement;", "regexp", "(Ljava/lang/String;ZILjava/util/List;ZLjava/util/List;ILcom/iqoption/core/microservices/kyc/response/questionnaire/KycControlElement;Ljava/lang/String;)V", "getAnswers", "()Ljava/util/List;", "getControlElement", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycControlElement;", "getDependsOnAnswers", "()Z", "getOrder", "()I", "getQuestionId", "getQuestionKey", "()Ljava/lang/String;", "getRegexp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycQuestionsItem.kt */
public final class f implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("answers")
    private final List<b> answers;
    @SerializedName("questionKey")
    private final String bvr;
    @SerializedName("isRequired")
    private final boolean bvs;
    @SerializedName("questionId")
    private final int bvt;
    @SerializedName("isMultiChoiceAvailable")
    private final boolean bvu;
    @SerializedName("dependsOnAnswers")
    private final List<Integer> bvv;
    @SerializedName("controlElement")
    private final KycControlElement bvw;
    @SerializedName("regexp")
    private final String bvx;
    @SerializedName("order")
    private final int order;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add((b) b.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            boolean z2 = parcel.readInt() != 0;
            readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                readInt2--;
            }
            return new f(readString, z, readInt, arrayList, z2, arrayList2, parcel.readInt(), (KycControlElement) Enum.valueOf(KycControlElement.class, parcel.readString()), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new f[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (kotlin.jvm.internal.i.y(this.bvr, fVar.bvr)) {
                    if ((this.bvs == fVar.bvs ? 1 : null) != null) {
                        if ((this.bvt == fVar.bvt ? 1 : null) != null && kotlin.jvm.internal.i.y(this.answers, fVar.answers)) {
                            if ((this.bvu == fVar.bvu ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bvv, fVar.bvv)) {
                                if (!((this.order == fVar.order ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bvw, fVar.bvw) && kotlin.jvm.internal.i.y(this.bvx, fVar.bvx))) {
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
        String str = this.bvr;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.bvs;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (((hashCode + i2) * 31) + this.bvt) * 31;
        List list = this.answers;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        i2 = this.bvu;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        list = this.bvv;
        hashCode = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.order) * 31;
        KycControlElement kycControlElement = this.bvw;
        hashCode = (hashCode + (kycControlElement != null ? kycControlElement.hashCode() : 0)) * 31;
        String str2 = this.bvx;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycQuestionsItem(questionKey=");
        stringBuilder.append(this.bvr);
        stringBuilder.append(", isRequired=");
        stringBuilder.append(this.bvs);
        stringBuilder.append(", questionId=");
        stringBuilder.append(this.bvt);
        stringBuilder.append(", answers=");
        stringBuilder.append(this.answers);
        stringBuilder.append(", isMultiChoiceAvailable=");
        stringBuilder.append(this.bvu);
        stringBuilder.append(", dependsOnAnswers=");
        stringBuilder.append(this.bvv);
        stringBuilder.append(", order=");
        stringBuilder.append(this.order);
        stringBuilder.append(", controlElement=");
        stringBuilder.append(this.bvw);
        stringBuilder.append(", regexp=");
        stringBuilder.append(this.bvx);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bvr);
        parcel.writeInt(this.bvs);
        parcel.writeInt(this.bvt);
        List<b> list = this.answers;
        parcel.writeInt(list.size());
        for (b writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.bvu);
        List<Integer> list2 = this.bvv;
        parcel.writeInt(list2.size());
        for (Integer num : list2) {
            if (num != null) {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.order);
        parcel.writeString(this.bvw.name());
        parcel.writeString(this.bvx);
    }

    public f(String str, boolean z, int i, List<b> list, boolean z2, List<Integer> list2, int i2, KycControlElement kycControlElement, String str2) {
        kotlin.jvm.internal.i.f(str, "questionKey");
        kotlin.jvm.internal.i.f(list, "answers");
        kotlin.jvm.internal.i.f(list2, "dependsOnAnswers");
        kotlin.jvm.internal.i.f(kycControlElement, "controlElement");
        this.bvr = str;
        this.bvs = z;
        this.bvt = i;
        this.answers = list;
        this.bvu = z2;
        this.bvv = list2;
        this.order = i2;
        this.bvw = kycControlElement;
        this.bvx = str2;
    }

    public final String afi() {
        return this.bvr;
    }

    public final boolean wo() {
        return this.bvs;
    }

    public final int afj() {
        return this.bvt;
    }

    public final List<b> afk() {
        return this.answers;
    }

    public final boolean afl() {
        return this.bvu;
    }

    public final List<Integer> afm() {
        return this.bvv;
    }

    public final int getOrder() {
        return this.order;
    }

    public final KycControlElement afn() {
        return this.bvw;
    }

    public final String afo() {
        return this.bvx;
    }
}
