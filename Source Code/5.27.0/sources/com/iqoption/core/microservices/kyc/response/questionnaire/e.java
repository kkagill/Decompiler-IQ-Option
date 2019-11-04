package com.iqoption.core.microservices.kyc.response.questionnaire;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/KycQuestionnairesItem;", "", "isReanswerNeed", "", "isAnswered", "type", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "action", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction;", "(ZZLcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction;)V", "getAction", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireAction;", "()Z", "getType", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/QuestionnaireType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: KycQuestionnairesItem.kt */
public final class e {
    @SerializedName("type")
    private final QuestionnaireType bvm;
    @SerializedName("isReanswerNeed")
    private final boolean bvo;
    @SerializedName("isAnswered")
    private final boolean bvp;
    @SerializedName("action")
    private final QuestionnaireAction bvq;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if ((this.bvo == eVar.bvo ? 1 : null) != null) {
                    if (!((this.bvp == eVar.bvp ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bvm, eVar.bvm) && kotlin.jvm.internal.i.y(this.bvq, eVar.bvq))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.bvo;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.bvp;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        QuestionnaireType questionnaireType = this.bvm;
        int i3 = 0;
        i = (i + (questionnaireType != null ? questionnaireType.hashCode() : 0)) * 31;
        QuestionnaireAction questionnaireAction = this.bvq;
        if (questionnaireAction != null) {
            i3 = questionnaireAction.hashCode();
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycQuestionnairesItem(isReanswerNeed=");
        stringBuilder.append(this.bvo);
        stringBuilder.append(", isAnswered=");
        stringBuilder.append(this.bvp);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bvm);
        stringBuilder.append(", action=");
        stringBuilder.append(this.bvq);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean aff() {
        return this.bvo;
    }

    public final boolean afg() {
        return this.bvp;
    }

    public final QuestionnaireType afc() {
        return this.bvm;
    }

    public final QuestionnaireAction afh() {
        return this.bvq;
    }
}
