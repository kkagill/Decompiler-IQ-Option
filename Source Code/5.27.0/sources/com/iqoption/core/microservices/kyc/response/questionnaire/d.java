package com.iqoption.core.microservices.kyc.response.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "Landroid/os/Parcelable;", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "name", "", "questions", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "(Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getQuestions", "()Ljava/util/List;", "getType", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycQuestionnaire.kt */
public final class d implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("type")
    private final QuestionnaireType bvm;
    @SerializedName("questions")
    private final List<f> bvn;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            QuestionnaireType questionnaireType = (QuestionnaireType) Enum.valueOf(QuestionnaireType.class, parcel.readString());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((f) f.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new d(questionnaireType, readString, arrayList);
        }

        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    public final List<f> afe() {
        return this.bvn;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bvn, r3.bvn) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.questionnaire.d;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.questionnaire.d) r3;
        r0 = r2.bvm;
        r1 = r3.bvm;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.name;
        r1 = r3.name;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.bvn;
        r3 = r3.bvn;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.questionnaire.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        QuestionnaireType questionnaireType = this.bvm;
        int i = 0;
        int hashCode = (questionnaireType != null ? questionnaireType.hashCode() : 0) * 31;
        String str = this.name;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.bvn;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycQuestionnaire(type=");
        stringBuilder.append(this.bvm);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", questions=");
        stringBuilder.append(this.bvn);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bvm.name());
        parcel.writeString(this.name);
        List<f> list = this.bvn;
        parcel.writeInt(list.size());
        for (f writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public d(QuestionnaireType questionnaireType, String str, List<f> list) {
        kotlin.jvm.internal.i.f(questionnaireType, "type");
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(list, "questions");
        this.bvm = questionnaireType;
        this.name = str;
        this.bvn = list;
    }

    public final QuestionnaireType afc() {
        return this.bvm;
    }

    public final String getName() {
        return this.name;
    }

    public final List<f> afd() {
        return this.bvn;
    }
}
