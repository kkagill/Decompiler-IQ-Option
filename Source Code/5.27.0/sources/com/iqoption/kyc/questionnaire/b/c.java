package com.iqoption.kyc.questionnaire.b;

import com.iqoption.core.microservices.kyc.response.questionnaire.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002¨\u0006\u0005"}, bng = {"getQuestionsWithoutDependAnswers", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionsItem;", "questions", "", "kyc_release"})
/* compiled from: KycQuestionsState.kt */
public final class c {
    private static final List<f> bf(List<f> list) {
        if (list == null) {
            return new ArrayList();
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((f) next).afm().isEmpty()) {
                arrayList.add(next);
            }
        }
        list = com.iqoption.core.microservices.kyc.response.questionnaire.c.bvh.afa().sortedCopy((List) arrayList);
        kotlin.jvm.internal.i.e(list, "KycQuestionUtil.question…ionsWithoutDependAnswers)");
        return list;
    }
}
