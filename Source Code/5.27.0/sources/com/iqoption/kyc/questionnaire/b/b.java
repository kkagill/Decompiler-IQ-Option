package com.iqoption.kyc.questionnaire.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.iqoption.core.microservices.kyc.response.questionnaire.d;
import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 02\u00020\u0001:\u00010BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÂ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JP\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\bHÖ\u0001J\u0013\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\bHÖ\u0001J\t\u0010+\u001a\u00020\u001fHÖ\u0001J\u0019\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\bHÖ\u0001R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, bng = {"Lcom/iqoption/kyc/questionnaire/state/KycQuestionsState;", "Landroid/os/Parcelable;", "rawQuestions", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "questionsToDisplay", "", "lastAnsweredQuestion", "", "answeredQuestions", "Ljava/util/HashMap;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswer;", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/HashMap;)V", "getAnsweredQuestions", "()Ljava/util/HashMap;", "isNextQuestionExist", "", "()Z", "getLastAnsweredQuestion", "()Ljava/lang/Integer;", "setLastAnsweredQuestion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "nextQuestion", "getNextQuestion", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "answer", "", "kycQuestionsItem", "answerIds", "answerText", "", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/HashMap;)Lcom/iqoption/kyc/questionnaire/state/KycQuestionsState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "kyc_release"})
/* compiled from: KycQuestionsState.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new b();
    public static final a dDA = new a();
    private final List<f> dDw;
    private final List<f> dDx;
    private Integer dDy;
    private final HashMap<f, com.iqoption.core.microservices.kyc.response.questionnaire.a> dDz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/questionnaire/state/KycQuestionsState$Companion;", "", "()V", "create", "Lcom/iqoption/kyc/questionnaire/state/KycQuestionsState;", "questionnaire", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "kyc_release"})
    /* compiled from: KycQuestionsState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b b(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "questionnaire");
            return new b(dVar.afd(), c.bf(dVar.afd()), null, null, 8, null);
        }
    }

    @i(bne = {1, 1, 15})
    public static class b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((f) parcel.readParcelable(b.class.getClassLoader()));
                readInt--;
            }
            readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList2.add((f) parcel.readParcelable(b.class.getClassLoader()));
                readInt--;
            }
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int readInt2 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt2);
            while (readInt2 != 0) {
                hashMap.put((f) parcel.readParcelable(b.class.getClassLoader()), (com.iqoption.core.microservices.kyc.response.questionnaire.a) parcel.readParcelable(b.class.getClassLoader()));
                readInt2--;
            }
            return new b(arrayList, arrayList2, valueOf, hashMap);
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dDz, r3.dDz) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.kyc.questionnaire.b.b;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.iqoption.kyc.questionnaire.b.b) r3;
        r0 = r2.dDw;
        r1 = r3.dDw;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.dDx;
        r1 = r3.dDx;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.dDy;
        r1 = r3.dDy;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.dDz;
        r3 = r3.dDz;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.questionnaire.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List list = this.dDw;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.dDx;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Integer num = this.dDy;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        HashMap hashMap = this.dDz;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycQuestionsState(rawQuestions=");
        stringBuilder.append(this.dDw);
        stringBuilder.append(", questionsToDisplay=");
        stringBuilder.append(this.dDx);
        stringBuilder.append(", lastAnsweredQuestion=");
        stringBuilder.append(this.dDy);
        stringBuilder.append(", answeredQuestions=");
        stringBuilder.append(this.dDz);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        kotlin.jvm.internal.i.f(parcel, "parcel");
        List<f> list = this.dDw;
        parcel.writeInt(list.size());
        for (f writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        list = this.dDx;
        parcel.writeInt(list.size());
        for (f writeParcelable2 : list) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        Integer num = this.dDy;
        if (num != null) {
            parcel.writeInt(1);
            intValue = num.intValue();
        } else {
            intValue = 0;
        }
        parcel.writeInt(intValue);
        HashMap hashMap = this.dDz;
        parcel.writeInt(hashMap.size());
        for (Object next : hashMap.entrySet()) {
            parcel.writeParcelable((f) next.getKey(), i);
            parcel.writeParcelable((com.iqoption.core.microservices.kyc.response.questionnaire.a) next.getValue(), i);
        }
    }

    public b(List<f> list, List<f> list2, Integer num, HashMap<f, com.iqoption.core.microservices.kyc.response.questionnaire.a> hashMap) {
        kotlin.jvm.internal.i.f(list, "rawQuestions");
        kotlin.jvm.internal.i.f(list2, "questionsToDisplay");
        kotlin.jvm.internal.i.f(hashMap, "answeredQuestions");
        this.dDw = list;
        this.dDx = list2;
        this.dDy = num;
        this.dDz = hashMap;
    }

    public final Integer aMN() {
        return this.dDy;
    }

    public /* synthetic */ b(List list, List list2, Integer num, HashMap hashMap, int i, f fVar) {
        if ((i & 8) != 0) {
            hashMap = new LinkedHashMap();
        }
        this(list, list2, num, hashMap);
    }

    public final HashMap<f, com.iqoption.core.microservices.kyc.response.questionnaire.a> aMG() {
        return this.dDz;
    }

    public final boolean aMF() {
        Integer num = this.dDy;
        return (num != null ? num.intValue() : 0) < this.dDx.size() - 1;
    }

    public final f aMH() {
        Integer num = this.dDy;
        this.dDy = Integer.valueOf(num != null ? num.intValue() + 1 : 0);
        List list = this.dDx;
        Integer num2 = this.dDy;
        if (num2 == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return (f) list.get(num2.intValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x011c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0163  */
    public final void a(com.iqoption.core.microservices.kyc.response.questionnaire.f r11, java.util.List<java.lang.Integer> r12, java.lang.String r13) {
        /*
        r10 = this;
        r0 = "kycQuestionsItem";
        kotlin.jvm.internal.i.f(r11, r0);
        r0 = "answerIds";
        kotlin.jvm.internal.i.f(r12, r0);
        r0 = r10.dDx;
        r0 = r0.indexOf(r11);
        r0 = java.lang.Integer.valueOf(r0);
        r10.dDy = r0;
        r0 = r10.dDz;
        r0 = r0.containsKey(r11);
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x008a;
    L_0x0020:
        r3 = r10.dDz;
        r3 = r3.keySet();
        r4 = "answeredQuestions.keys";
        kotlin.jvm.internal.i.e(r3, r4);
        r3 = (java.lang.Iterable) r3;
        r3 = kotlin.collections.u.c(r3, r11);
        r5 = r10.dDz;
        r5 = r5.keySet();
        kotlin.jvm.internal.i.e(r5, r4);
        r5 = (java.lang.Iterable) r5;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r4 = (java.util.Collection) r4;
        r5 = r5.iterator();
        r6 = 0;
    L_0x0048:
        r7 = r5.hasNext();
        if (r7 == 0) goto L_0x006a;
    L_0x004e:
        r7 = r5.next();
        r8 = r6 + 1;
        if (r6 >= 0) goto L_0x0059;
    L_0x0056:
        kotlin.collections.m.bno();
    L_0x0059:
        r9 = r7;
        r9 = (com.iqoption.core.microservices.kyc.response.questionnaire.f) r9;
        r9 = r3 + 1;
        if (r6 <= r9) goto L_0x0062;
    L_0x0060:
        r6 = 1;
        goto L_0x0063;
    L_0x0062:
        r6 = 0;
    L_0x0063:
        if (r6 == 0) goto L_0x0068;
    L_0x0065:
        r4.add(r7);
    L_0x0068:
        r6 = r8;
        goto L_0x0048;
    L_0x006a:
        r4 = (java.util.List) r4;
        r4 = (java.lang.Iterable) r4;
        r3 = kotlin.collections.u.T(r4);
        r3 = (java.lang.Iterable) r3;
        r3 = r3.iterator();
    L_0x0078:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x008a;
    L_0x007e:
        r4 = r3.next();
        r4 = (com.iqoption.core.microservices.kyc.response.questionnaire.f) r4;
        r5 = r10.dDz;
        r5.remove(r4);
        goto L_0x0078;
    L_0x008a:
        if (r13 == 0) goto L_0x0099;
    L_0x008c:
        r3 = r10.dDz;
        r3 = (java.util.Map) r3;
        r4 = new com.iqoption.core.microservices.kyc.response.questionnaire.i;
        r4.<init>(r13);
        r3.put(r11, r4);
        goto L_0x00a5;
    L_0x0099:
        r13 = r10.dDz;
        r13 = (java.util.Map) r13;
        r3 = new com.iqoption.core.microservices.kyc.response.questionnaire.h;
        r3.<init>(r12);
        r13.put(r11, r3);
    L_0x00a5:
        r11 = 0;
        if (r0 == 0) goto L_0x0175;
    L_0x00a8:
        r13 = r10.dDz;
        r13 = (java.util.Map) r13;
        r0 = new java.util.ArrayList;
        r3 = r13.size();
        r0.<init>(r3);
        r0 = (java.util.Collection) r0;
        r13 = r13.entrySet();
        r13 = r13.iterator();
    L_0x00bf:
        r3 = r13.hasNext();
        if (r3 == 0) goto L_0x00da;
    L_0x00c5:
        r3 = r13.next();
        r3 = (java.util.Map.Entry) r3;
        r3 = r3.getValue();
        r4 = r3 instanceof com.iqoption.core.microservices.kyc.response.questionnaire.h;
        if (r4 != 0) goto L_0x00d4;
    L_0x00d3:
        r3 = r11;
    L_0x00d4:
        r3 = (com.iqoption.core.microservices.kyc.response.questionnaire.h) r3;
        r0.add(r3);
        goto L_0x00bf;
    L_0x00da:
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r13 = kotlin.collections.u.P(r0);
        r13 = (java.lang.Iterable) r13;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r13 = r13.iterator();
    L_0x00ef:
        r3 = r13.hasNext();
        if (r3 == 0) goto L_0x0105;
    L_0x00f5:
        r3 = r13.next();
        r3 = (com.iqoption.core.microservices.kyc.response.questionnaire.h) r3;
        r3 = r3.aft();
        r3 = (java.lang.Iterable) r3;
        kotlin.collections.r.a(r0, r3);
        goto L_0x00ef;
    L_0x0105:
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r13 = kotlin.collections.u.V(r0);
        r0 = r10.dDx;
        r0 = (java.lang.Iterable) r0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3 = (java.util.Collection) r3;
        r0 = r0.iterator();
    L_0x011c:
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x0167;
    L_0x0122:
        r4 = r0.next();
        r5 = r4;
        r5 = (com.iqoption.core.microservices.kyc.response.questionnaire.f) r5;
        r6 = r5.afm();
        r7 = r10.dDz;
        r7 = (java.util.Map) r7;
        r5 = r7.containsKey(r5);
        if (r5 != 0) goto L_0x0160;
    L_0x0137:
        r5 = r6.isEmpty();
        if (r5 != 0) goto L_0x0160;
    L_0x013d:
        r6 = (java.lang.Iterable) r6;
        r5 = r6.iterator();
    L_0x0143:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x015a;
    L_0x0149:
        r6 = r5.next();
        r7 = r6;
        r7 = (java.lang.Integer) r7;
        r8 = r13;
        r8 = (java.lang.Iterable) r8;
        r7 = kotlin.collections.u.b(r8, r7);
        if (r7 == 0) goto L_0x0143;
    L_0x0159:
        goto L_0x015b;
    L_0x015a:
        r6 = r11;
    L_0x015b:
        if (r6 == 0) goto L_0x015e;
    L_0x015d:
        goto L_0x0160;
    L_0x015e:
        r5 = 0;
        goto L_0x0161;
    L_0x0160:
        r5 = 1;
    L_0x0161:
        if (r5 == 0) goto L_0x011c;
    L_0x0163:
        r3.add(r4);
        goto L_0x011c;
    L_0x0167:
        r3 = (java.util.List) r3;
        r13 = r10.dDx;
        r13.clear();
        r13 = r10.dDx;
        r3 = (java.util.Collection) r3;
        r13.addAll(r3);
    L_0x0175:
        r13 = r10.dDw;
        r13 = (java.lang.Iterable) r13;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r13 = r13.iterator();
    L_0x0184:
        r3 = r13.hasNext();
        if (r3 == 0) goto L_0x01be;
    L_0x018a:
        r3 = r13.next();
        r4 = r3;
        r4 = (com.iqoption.core.microservices.kyc.response.questionnaire.f) r4;
        r4 = r4.afm();
        r4 = (java.lang.Iterable) r4;
        r4 = r4.iterator();
    L_0x019b:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x01b2;
    L_0x01a1:
        r5 = r4.next();
        r6 = r5;
        r6 = (java.lang.Integer) r6;
        r7 = r12;
        r7 = (java.lang.Iterable) r7;
        r6 = kotlin.collections.u.b(r7, r6);
        if (r6 == 0) goto L_0x019b;
    L_0x01b1:
        goto L_0x01b3;
    L_0x01b2:
        r5 = r11;
    L_0x01b3:
        if (r5 == 0) goto L_0x01b7;
    L_0x01b5:
        r4 = 1;
        goto L_0x01b8;
    L_0x01b7:
        r4 = 0;
    L_0x01b8:
        if (r4 == 0) goto L_0x0184;
    L_0x01ba:
        r0.add(r3);
        goto L_0x0184;
    L_0x01be:
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r11 = (java.util.Collection) r11;
        r12 = r0.iterator();
    L_0x01cd:
        r13 = r12.hasNext();
        if (r13 == 0) goto L_0x01e9;
    L_0x01d3:
        r13 = r12.next();
        r0 = r13;
        r0 = (com.iqoption.core.microservices.kyc.response.questionnaire.f) r0;
        r1 = r10.dDz;
        r1 = (java.util.Map) r1;
        r0 = r1.containsKey(r0);
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x01cd;
    L_0x01e5:
        r11.add(r13);
        goto L_0x01cd;
    L_0x01e9:
        r11 = (java.util.List) r11;
        r11 = (java.lang.Iterable) r11;
        r12 = new java.util.ArrayList;
        r12.<init>();
        r12 = (java.util.Collection) r12;
        r11 = r11.iterator();
    L_0x01f8:
        r13 = r11.hasNext();
        if (r13 == 0) goto L_0x0212;
    L_0x01fe:
        r13 = r11.next();
        r0 = r13;
        r0 = (com.iqoption.core.microservices.kyc.response.questionnaire.f) r0;
        r1 = r10.dDx;
        r0 = r1.contains(r0);
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x01f8;
    L_0x020e:
        r12.add(r13);
        goto L_0x01f8;
    L_0x0212:
        r12 = (java.util.List) r12;
        r12 = (java.lang.Iterable) r12;
        r11 = kotlin.collections.u.T(r12);
        r12 = r10.dDx;
        r11 = (java.util.Collection) r11;
        r12.addAll(r11);
        r11 = r10.dDx;
        r12 = com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh;
        r12 = r12.afa();
        r12 = (java.util.Comparator) r12;
        java.util.Collections.sort(r11, r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.questionnaire.b.b.a(com.iqoption.core.microservices.kyc.response.questionnaire.f, java.util.List, java.lang.String):void");
    }
}
