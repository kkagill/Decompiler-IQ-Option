package com.iqoption.core.microservices.kyc.response.questionnaire.governance;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/ProductGovernance;", "", "userId", "", "value", "Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;", "(JLcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;)V", "getUserId", "()J", "getValue", "()Lcom/iqoption/core/microservices/kyc/response/questionnaire/governance/GovernanceStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: ProductGovernance.kt */
public final class a {
    @SerializedName("value")
    private final GovernanceStatus bvE;
    @SerializedName("user_id")
    private final long userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.userId == aVar.userId ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bvE, aVar.bvE)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.userId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        GovernanceStatus governanceStatus = this.bvE;
        return i + (governanceStatus != null ? governanceStatus.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProductGovernance(userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", value=");
        stringBuilder.append(this.bvE);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final GovernanceStatus afu() {
        return this.bvE;
    }
}
