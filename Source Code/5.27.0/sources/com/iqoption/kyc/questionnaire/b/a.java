package com.iqoption.kyc.questionnaire.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.d;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 82\u00020\u0001:\u00018B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u001f\u001a\u00020\nJ&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\u0010$\u001a\u0004\u0018\u00010%J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÂ\u0003J\t\u0010)\u001a\u00020\nHÂ\u0003J=\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010+\u001a\u00020\nJ\t\u0010,\u001a\u00020\nHÖ\u0001J\u0013\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\u0006\u00100\u001a\u00020\u0006J\t\u00101\u001a\u00020\nHÖ\u0001J\u0006\u00102\u001a\u00020!J\t\u00103\u001a\u00020%HÖ\u0001J\u0019\u00104\u001a\u00020!2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\nHÖ\u0001R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00069"}, bng = {"Lcom/iqoption/kyc/questionnaire/state/KycQuestionsDictionaryState;", "Landroid/os/Parcelable;", "questionnaires", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "isReanswerNeeded", "", "states", "Lcom/iqoption/kyc/questionnaire/state/KycQuestionsState;", "currentQuestionnaire", "", "(Ljava/util/List;ZLjava/util/List;I)V", "answeredQuestions", "Ljava/util/HashMap;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "getAnsweredQuestions", "()Ljava/util/HashMap;", "currentQuestionnaireType", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "getCurrentQuestionnaireType", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "currentQuestionnaireValue", "getCurrentQuestionnaireValue", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "isNextQuestionExist", "()Z", "isNextQuestionExistForCurrentType", "nextQuestion", "getNextQuestion", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "allQuestionsQuantity", "answer", "", "kycQuestionsItem", "answerIds", "answerText", "", "component1", "component2", "component3", "component4", "copy", "currentProgress", "describeContents", "equals", "other", "", "hasNextQuestionnaire", "hashCode", "switchToNextQuestionnaire", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "kyc_release"})
/* compiled from: KycQuestionsDictionaryState.kt */
public final class a implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a dDv = new a();
    private final List<b> bhm;
    private final List<d> dCZ;
    private final boolean dDt;
    private int dDu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, bng = {"Lcom/iqoption/kyc/questionnaire/state/KycQuestionsDictionaryState$Companion;", "", "()V", "create", "Lcom/iqoption/kyc/questionnaire/state/KycQuestionsDictionaryState;", "questionnaires", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "isReanswerNeeded", "", "kyc_release"})
    /* compiled from: KycQuestionsDictionaryState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a c(List<d> list, boolean z) {
            kotlin.jvm.internal.i.f(list, "questionnaires");
            Iterable<d> iterable = list;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (d b : iterable) {
                arrayList.add(b.dDA.b(b));
            }
            return new a(list, z, (List) arrayList, 0);
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((d) parcel.readParcelable(a.class.getClassLoader()));
                readInt--;
            }
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add((b) b.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new a(arrayList, z, arrayList2, parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.dCZ, aVar.dCZ)) {
                    if ((this.dDt == aVar.dDt ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bhm, aVar.bhm)) {
                        if ((this.dDu == aVar.dDu ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.dCZ;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        int i2 = this.dDt;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        List list2 = this.bhm;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((hashCode + i) * 31) + this.dDu;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycQuestionsDictionaryState(questionnaires=");
        stringBuilder.append(this.dCZ);
        stringBuilder.append(", isReanswerNeeded=");
        stringBuilder.append(this.dDt);
        stringBuilder.append(", states=");
        stringBuilder.append(this.bhm);
        stringBuilder.append(", currentQuestionnaire=");
        stringBuilder.append(this.dDu);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        List<d> list = this.dCZ;
        parcel.writeInt(list.size());
        for (d writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.dDt);
        List<b> list2 = this.bhm;
        parcel.writeInt(list2.size());
        for (b writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.dDu);
    }

    public a(List<d> list, boolean z, List<b> list2, int i) {
        kotlin.jvm.internal.i.f(list, "questionnaires");
        kotlin.jvm.internal.i.f(list2, "states");
        this.dCZ = list;
        this.dDt = z;
        this.bhm = list2;
        this.dDu = i;
    }

    public final boolean aMM() {
        return this.dDt;
    }

    public final d aMC() {
        return (d) this.dCZ.get(this.dDu);
    }

    public final QuestionnaireType aMD() {
        return aMC().afc();
    }

    public final boolean aME() {
        return ((b) this.bhm.get(this.dDu)).aMF();
    }

    public final boolean aMF() {
        if (aME()) {
            return true;
        }
        if (this.dDu + 1 >= this.bhm.size()) {
            return false;
        }
        return ((b) this.bhm.get(this.dDu + 1)).aMF();
    }

    public final HashMap<f, com.iqoption.core.microservices.kyc.response.questionnaire.a> aMG() {
        return ((b) this.bhm.get(this.dDu)).aMG();
    }

    public final f aMH() {
        b bVar = (b) this.bhm.get(this.dDu);
        if (bVar.aMF()) {
            return bVar.aMH();
        }
        this.dDu++;
        return ((b) this.bhm.get(this.dDu)).aMH();
    }

    public final void a(f fVar, List<Integer> list, String str) {
        kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
        kotlin.jvm.internal.i.f(list, "answerIds");
        ((b) this.bhm.get(this.dDu)).a(fVar, list, str);
    }

    public final boolean aMI() {
        return this.dDu < this.bhm.size() - 1;
    }

    public final void aMJ() {
        c.h(this.bhm, Integer.valueOf(this.dDu));
    }

    public final int aMK() {
        Iterable<d> iterable = this.dCZ;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (d afd : iterable) {
            arrayList.add(Integer.valueOf(afd.afd().size()));
        }
        return u.aa((List) arrayList);
    }

    public final int aML() {
        Collection arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object next : this.dCZ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                m.bno();
            }
            d dVar = (d) next;
            if ((i2 < this.dDu ? 1 : null) != null) {
                arrayList.add(next);
            }
            i2 = i3;
        }
        Iterable<d> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(n.e(iterable, 10));
        for (d afd : iterable) {
            arrayList2.add(Integer.valueOf(afd.afd().size()));
        }
        int aa = u.aa((List) arrayList2);
        Integer aMN = ((b) this.bhm.get(this.dDu)).aMN();
        if (aMN != null) {
            i = aMN.intValue();
        }
        return aa + i;
    }
}
