package com.iqoption.kyc.questionnaire;

import com.iqoption.core.microservices.kyc.response.questionnaire.d;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, bng = {"Lcom/iqoption/kyc/questionnaire/QuestionsResult;", "", "questionnaires", "", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnaire;", "isReanswerNeed", "", "(Ljava/util/List;Z)V", "()Z", "getQuestionnaires", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kyc_release"})
/* compiled from: KycQuestionnaireContainerViewModel.kt */
public final class e {
    private final boolean bvo;
    private final List<d> dCZ;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (kotlin.jvm.internal.i.y(this.dCZ, eVar.dCZ)) {
                    if ((this.bvo == eVar.bvo ? 1 : null) != null) {
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
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        int i = this.bvo;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("QuestionsResult(questionnaires=");
        stringBuilder.append(this.dCZ);
        stringBuilder.append(", isReanswerNeed=");
        stringBuilder.append(this.bvo);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(List<d> list, boolean z) {
        kotlin.jvm.internal.i.f(list, "questionnaires");
        this.dCZ = list;
        this.bvo = z;
    }

    public final List<d> aMy() {
        return this.dCZ;
    }

    public final boolean aff() {
        return this.bvo;
    }
}
