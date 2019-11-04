package com.iqoption.core.microservices.kyc.response.questionnaire;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/PutKycQuestionnaireItem;", "", "questionId", "", "answers", "", "answerText", "", "(ILjava/util/List;Ljava/lang/String;)V", "getAnswerText", "()Ljava/lang/String;", "getAnswers", "()Ljava/util/List;", "getQuestionId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_release"})
/* compiled from: PutKycQuestionnaireItem.kt */
public final class j {
    @SerializedName("answers")
    private final List<Integer> answers;
    @SerializedName("answer_text")
    private final String bvD;
    @SerializedName("questionId")
    private final int bvt;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!((this.bvt == jVar.bvt ? 1 : null) != null && kotlin.jvm.internal.i.y(this.answers, jVar.answers) && kotlin.jvm.internal.i.y(this.bvD, jVar.bvD))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.bvt * 31;
        List list = this.answers;
        int i2 = 0;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.bvD;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PutKycQuestionnaireItem(questionId=");
        stringBuilder.append(this.bvt);
        stringBuilder.append(", answers=");
        stringBuilder.append(this.answers);
        stringBuilder.append(", answerText=");
        stringBuilder.append(this.bvD);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public j(int i, List<Integer> list, String str) {
        kotlin.jvm.internal.i.f(list, "answers");
        this.bvt = i;
        this.answers = list;
        this.bvD = str;
    }
}
