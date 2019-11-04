package com.iqoption.core.microservices.kyc.response.questionnaire;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionUtil;", "", "()V", "answerOrdering", "Lcom/google/common/collect/Ordering;", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswersItem;", "getAnswerOrdering", "()Lcom/google/common/collect/Ordering;", "orderQuestionById", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "orderQuestionByOrder", "questionOrdering", "getQuestionOrdering", "questionnaireOrdering", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "getQuestionnaireOrdering", "core_release"})
/* compiled from: KycQuestionUtil.kt */
public final class c {
    private static final Ordering<f> bvc;
    private static final Ordering<f> bvd;
    private static final Ordering<d> bve;
    private static final Ordering<f> bvf;
    private static final Ordering<b> bvg;
    public static final c bvh = new c();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "answer", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswersItem;", "apply", "(Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycAnswersItem;)Ljava/lang/Integer;"})
    /* compiled from: KycQuestionUtil.kt */
    static final class a<F, T> implements com.google.common.base.d<b, Integer> {
        public static final a bvi = new a();

        a() {
        }

        /* renamed from: a */
        public final Integer apply(b bVar) {
            return bVar == null ? null : Integer.valueOf(bVar.getOrder());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "question", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "apply", "(Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;)Ljava/lang/Integer;"})
    /* compiled from: KycQuestionUtil.kt */
    static final class b<F, T> implements com.google.common.base.d<f, Integer> {
        public static final b bvj = new b();

        b() {
        }

        /* renamed from: a */
        public final Integer apply(f fVar) {
            return fVar == null ? null : Integer.valueOf(fVar.afj());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "question", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "apply", "(Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;)Ljava/lang/Integer;"})
    /* compiled from: KycQuestionUtil.kt */
    static final class c<F, T> implements com.google.common.base.d<f, Integer> {
        public static final c bvk = new c();

        c() {
        }

        /* renamed from: a */
        public final Integer apply(f fVar) {
            return fVar == null ? null : Integer.valueOf(fVar.getOrder());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "questionnaire", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "apply", "(Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;)Ljava/lang/Integer;"})
    /* compiled from: KycQuestionUtil.kt */
    static final class d<F, T> implements com.google.common.base.d<d, Integer> {
        public static final d bvl = new d();

        d() {
        }

        /* renamed from: a */
        public final Integer apply(d dVar) {
            if ((dVar != null ? dVar.afc() : null) == null) {
                return null;
            }
            return dVar.afc().getServerValue();
        }
    }

    static {
        Ordering onResultOf = Ordering.natural().nullsFirst().onResultOf(c.bvk);
        kotlin.jvm.internal.i.e(onResultOf, "Ordering\n            .na…tion.order\n            })");
        bvc = onResultOf;
        onResultOf = Ordering.natural().onResultOf(b.bvj);
        kotlin.jvm.internal.i.e(onResultOf, "Ordering\n            .na…questionId\n            })");
        bvd = onResultOf;
        onResultOf = Ordering.natural().nullsFirst().onResultOf(d.bvl);
        kotlin.jvm.internal.i.e(onResultOf, "Ordering\n            .na…erverValue\n            })");
        bve = onResultOf;
        onResultOf = bvc.compound((Comparator) bvd);
        kotlin.jvm.internal.i.e(onResultOf, "orderQuestionByOrder\n   …mpound(orderQuestionById)");
        bvf = onResultOf;
        onResultOf = Ordering.natural().nullsFirst().onResultOf(a.bvi);
        kotlin.jvm.internal.i.e(onResultOf, "Ordering\n            .na…swer.order\n            })");
        bvg = onResultOf;
    }

    private c() {
    }

    public final Ordering<d> aeZ() {
        return bve;
    }

    public final Ordering<f> afa() {
        return bvf;
    }

    public final Ordering<b> afb() {
        return bvg;
    }
}
