package com.iqoption.microservice.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.s;
import com.iqoption.core.microservices.kyc.response.questionnaire.QuestionnaireType;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import com.iqoption.core.microservices.kyc.response.questionnaire.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ.\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\u0010 \u001a\u0004\u0018\u00010!J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÂ\u0003JI\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001J\u0013\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H\u0002J\t\u0010-\u001a\u00020\fHÖ\u0001J\u001e\u0010.\u001a\u00020\u001c2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010/\u001a\u00020\fH\u0002J\t\u00100\u001a\u00020!HÖ\u0001J\u0019\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\fHÖ\u0001R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, bng = {"Lcom/iqoption/microservice/kyc/questionnaire/KycQuestionnaireState;", "Landroid/os/Parcelable;", "questionnaires", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "questionsToDisplay", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "answeredQuestions", "Ljava/util/HashMap;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "currentQuestionnaire", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/HashMap;I)V", "getAnsweredQuestions", "()Ljava/util/HashMap;", "currentQuestionnaireType", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "getCurrentQuestionnaireType", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "isCurrentQuestionnaireFinish", "", "()Z", "isNextQuestionExist", "nextQuestion", "getNextQuestion", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "answer", "", "questionType", "kycQuestionsItem", "answerIds", "answerText", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "getQuestionsWithoutDependAnswers", "questions", "hashCode", "initQuestionToDisplay", "questionnaire", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "app_optionXRelease"})
/* compiled from: KycQuestionnaireState.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    private final List<com.iqoption.core.microservices.kyc.response.questionnaire.d> dCZ;
    private int dDu;
    private List<f> dDx;
    private final HashMap<f, com.iqoption.core.microservices.kyc.response.questionnaire.a> dDz;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((com.iqoption.core.microservices.kyc.response.questionnaire.d) parcel.readParcelable(b.class.getClassLoader()));
                readInt--;
            }
            readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList2.add((f) parcel.readParcelable(b.class.getClassLoader()));
                readInt--;
            }
            readInt = parcel.readInt();
            HashMap hashMap = new HashMap(readInt);
            while (readInt != 0) {
                hashMap.put((f) parcel.readParcelable(b.class.getClassLoader()), (com.iqoption.core.microservices.kyc.response.questionnaire.a) parcel.readParcelable(b.class.getClassLoader()));
                readInt--;
            }
            return new b(arrayList, arrayList2, hashMap, parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "questionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "apply"})
    /* compiled from: KycQuestionnaireState.kt */
    static final class b<T> implements j<f> {
        final /* synthetic */ List dGG;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "dependedAnswer", "", "apply", "(Ljava/lang/Integer;)Z"})
        /* compiled from: KycQuestionnaireState.kt */
        /* renamed from: com.iqoption.microservice.b.a.b$b$1 */
        static final class AnonymousClass1<T> implements j<Integer> {
            final /* synthetic */ b dGH;

            AnonymousClass1(b bVar) {
                this.dGH = bVar;
            }

            /* renamed from: p */
            public final boolean apply(Integer num) {
                return u.b((Iterable) this.dGH.dGG, (Object) num);
            }
        }

        b(List list) {
            this.dGG = list;
        }

        /* renamed from: e */
        public final boolean apply(f fVar) {
            return (fVar != null ? fVar.afm() : null) != null ? com.google.common.collect.i.b((Iterable) fVar.afm()).c((j) new AnonymousClass1(this)) : false;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "questionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "apply"})
    /* compiled from: KycQuestionnaireState.kt */
    static final class c<T> implements j<f> {
        final /* synthetic */ b dGI;

        c(b bVar) {
            this.dGI = bVar;
        }

        /* renamed from: e */
        public final boolean apply(f fVar) {
            return this.dGI.aMG().containsKey(fVar) ^ 1;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "questionsItem", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "apply"})
    /* compiled from: KycQuestionnaireState.kt */
    static final class d<T> implements j<T> {
        public static final d dGJ = new d();

        d() {
        }

        /* renamed from: e */
        public final boolean apply(f fVar) {
            if (fVar != null) {
                List afm = fVar.afm();
                if (afm != null) {
                    return afm.isEmpty();
                }
            }
            return true;
        }
    }

    public b(List<com.iqoption.core.microservices.kyc.response.questionnaire.d> list) {
        this(list, null, null, 0, 14, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.dCZ, bVar.dCZ) && kotlin.jvm.internal.i.y(this.dDx, bVar.dDx) && kotlin.jvm.internal.i.y(this.dDz, bVar.dDz)) {
                    if ((this.dDu == bVar.dDu ? 1 : null) != null) {
                        return true;
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
        List list2 = this.dDx;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        HashMap hashMap = this.dDz;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return ((hashCode + i) * 31) + this.dDu;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycQuestionnaireState(questionnaires=");
        stringBuilder.append(this.dCZ);
        stringBuilder.append(", questionsToDisplay=");
        stringBuilder.append(this.dDx);
        stringBuilder.append(", answeredQuestions=");
        stringBuilder.append(this.dDz);
        stringBuilder.append(", currentQuestionnaire=");
        stringBuilder.append(this.dDu);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        List<com.iqoption.core.microservices.kyc.response.questionnaire.d> list = this.dCZ;
        parcel.writeInt(list.size());
        for (com.iqoption.core.microservices.kyc.response.questionnaire.d writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<f> list2 = this.dDx;
        parcel.writeInt(list2.size());
        for (f writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        HashMap hashMap = this.dDz;
        parcel.writeInt(hashMap.size());
        for (Object next : hashMap.entrySet()) {
            parcel.writeParcelable((f) next.getKey(), i);
            parcel.writeParcelable((com.iqoption.core.microservices.kyc.response.questionnaire.a) next.getValue(), i);
        }
        parcel.writeInt(this.dDu);
    }

    public b(List<com.iqoption.core.microservices.kyc.response.questionnaire.d> list, List<f> list2, HashMap<f, com.iqoption.core.microservices.kyc.response.questionnaire.a> hashMap, int i) {
        kotlin.jvm.internal.i.f(list, "questionnaires");
        kotlin.jvm.internal.i.f(list2, "questionsToDisplay");
        kotlin.jvm.internal.i.f(hashMap, "answeredQuestions");
        this.dCZ = list;
        this.dDx = list2;
        this.dDz = hashMap;
        this.dDu = i;
        if (!this.dCZ.isEmpty()) {
            c(this.dCZ, 0);
        }
    }

    public /* synthetic */ b(List list, List list2, HashMap hashMap, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            hashMap = new LinkedHashMap();
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        this(list, list2, hashMap, i);
    }

    public final HashMap<f, com.iqoption.core.microservices.kyc.response.questionnaire.a> aMG() {
        return this.dDz;
    }

    public final QuestionnaireType aMD() {
        return ((com.iqoption.core.microservices.kyc.response.questionnaire.d) this.dCZ.get(this.dDu)).afc();
    }

    public final boolean aOg() {
        return this.dDx.isEmpty();
    }

    public final boolean aMF() {
        if (!this.dDx.isEmpty()) {
            return true;
        }
        if (this.dDu >= this.dCZ.size() - 1 || bf(((com.iqoption.core.microservices.kyc.response.questionnaire.d) this.dCZ.get(this.dDu + 1)).afd()).isEmpty()) {
            return false;
        }
        return true;
    }

    public final f aMH() {
        com.google.common.base.i.checkState(aMF(), "no any questions", new Object[0]);
        if (this.dDx.isEmpty()) {
            c(this.dCZ, this.dDu + 1);
        }
        return (f) this.dDx.get(0);
    }

    private final void c(List<com.iqoption.core.microservices.kyc.response.questionnaire.d> list, int i) {
        com.google.common.base.i.checkArgument(i < list.size());
        this.dDz.clear();
        this.dDu = i;
        this.dDx = bf(((com.iqoption.core.microservices.kyc.response.questionnaire.d) list.get(this.dDu)).afe());
    }

    private final List<f> bf(List<f> list) {
        if (list == null) {
            return new ArrayList();
        }
        list = com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh.afa().sortedCopy(s.a((Iterable) list, (j) d.dGJ));
        kotlin.jvm.internal.i.e(list, "KycQuestionUtil.question…ionsWithoutDependAnswers)");
        return list;
    }

    public final void b(QuestionnaireType questionnaireType, f fVar, List<Integer> list, String str) {
        kotlin.jvm.internal.i.f(questionnaireType, "questionType");
        kotlin.jvm.internal.i.f(fVar, "kycQuestionsItem");
        kotlin.jvm.internal.i.f(list, "answerIds");
        boolean containsKey = this.dDz.containsKey(fVar);
        boolean z = containsKey || kotlin.jvm.internal.i.y((f) this.dDx.get(0), fVar);
        com.google.common.base.i.checkArgument(z);
        boolean z2 = containsKey || questionnaireType == ((com.iqoption.core.microservices.kyc.response.questionnaire.d) this.dCZ.get(this.dDu)).afc();
        com.google.common.base.i.checkArgument(z2);
        if (!containsKey) {
            this.dDx.remove(0);
        } else if (str == null) {
            Set keySet = this.dDz.keySet();
            kotlin.jvm.internal.i.e(keySet, "answeredQuestions.keys");
            ImmutableList<f> sC = com.google.common.collect.i.b((Iterable) this.dDz.keySet()).bO(u.c((Iterable) keySet, (Object) fVar) + 1).sC();
            kotlin.jvm.internal.i.e(sC, "questionToReanswer");
            for (f remove : sC) {
                this.dDz.remove(remove);
            }
        }
        if (str != null) {
            this.dDz.put(fVar, new com.iqoption.core.microservices.kyc.response.questionnaire.i(str));
        } else {
            this.dDz.put(fVar, new h(list));
        }
        ImmutableList sC2 = com.google.common.collect.i.b((Iterable) ((com.iqoption.core.microservices.kyc.response.questionnaire.d) this.dCZ.get(this.dDu)).afe()).b((j) new b(list)).b((j) new c(this)).sC();
        List list2 = this.dDx;
        kotlin.jvm.internal.i.e(sC2, "newQuestions");
        list2.addAll(sC2);
        Collections.sort(this.dDx, com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh.afa());
    }
}
