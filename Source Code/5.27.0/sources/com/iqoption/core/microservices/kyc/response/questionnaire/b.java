package com.iqoption.core.microservices.kyc.response.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswersItem;", "Landroid/os/Parcelable;", "answerId", "", "cancelAnswers", "", "answerKey", "", "order", "(ILjava/util/List;Ljava/lang/String;I)V", "getAnswerId", "()I", "getAnswerKey", "()Ljava/lang/String;", "getCancelAnswers", "()Ljava/util/List;", "getOrder", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycAnswersItem.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("answerId")
    private final int buZ;
    @SerializedName("cancelAnswers")
    private final List<Integer> bva;
    @SerializedName("answerKey")
    private final String bvb;
    @SerializedName("order")
    private final int order;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                readInt2--;
            }
            return new b(readInt, arrayList, parcel.readString(), parcel.readInt());
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
                if ((this.buZ == bVar.buZ ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bva, bVar.bva) && kotlin.jvm.internal.i.y(this.bvb, bVar.bvb)) {
                    if ((this.order == bVar.order ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.buZ * 31;
        List list = this.bva;
        int i2 = 0;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.bvb;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i + i2) * 31) + this.order;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycAnswersItem(answerId=");
        stringBuilder.append(this.buZ);
        stringBuilder.append(", cancelAnswers=");
        stringBuilder.append(this.bva);
        stringBuilder.append(", answerKey=");
        stringBuilder.append(this.bvb);
        stringBuilder.append(", order=");
        stringBuilder.append(this.order);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeInt(this.buZ);
        List<Integer> list = this.bva;
        parcel.writeInt(list.size());
        for (Integer num : list) {
            int intValue;
            if (num != null) {
                parcel.writeInt(1);
                intValue = num.intValue();
            } else {
                intValue = 0;
            }
            parcel.writeInt(intValue);
        }
        parcel.writeString(this.bvb);
        parcel.writeInt(this.order);
    }

    public b(int i, List<Integer> list, String str, int i2) {
        kotlin.jvm.internal.i.f(list, "cancelAnswers");
        kotlin.jvm.internal.i.f(str, "answerKey");
        this.buZ = i;
        this.bva = list;
        this.bvb = str;
        this.order = i2;
    }

    public final int aeW() {
        return this.buZ;
    }

    public final List<Integer> aeX() {
        return this.bva;
    }

    public final String aeY() {
        return this.bvb;
    }

    public final int getOrder() {
        return this.order;
    }
}
