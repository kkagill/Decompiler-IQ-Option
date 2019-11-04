package com.iqoption.core.microservices.kyc.response.restriction;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionDataChanged;", "", "user_id", "", "changeType", "Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionChangeType;", "restrictionId", "Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;", "updatedAt", "requirementAction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "(JLcom/iqoption/core/microservices/kyc/response/restriction/RestrictionChangeType;Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;JLcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;)V", "getChangeType", "()Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionChangeType;", "getRequirementAction", "()Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "getRestrictionId", "()Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;", "getUpdatedAt", "()J", "getUser_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: KycRestrictionDataChanged.kt */
public final class c {
    @SerializedName("user_id")
    private final long bvL;
    @SerializedName("restriction_id")
    private final RestrictionId bvQ;
    @SerializedName("requirement_action")
    private final a bvR;
    @SerializedName("change_type")
    private final RestrictionChangeType bvS;
    @SerializedName("updated_at")
    private final long bvT;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.bvL == cVar.bvL ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bvS, cVar.bvS) && kotlin.jvm.internal.i.y(this.bvQ, cVar.bvQ)) {
                    if ((this.bvT == cVar.bvT ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bvR, cVar.bvR)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bvL;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        RestrictionChangeType restrictionChangeType = this.bvS;
        int i2 = 0;
        i = (i + (restrictionChangeType != null ? restrictionChangeType.hashCode() : 0)) * 31;
        RestrictionId restrictionId = this.bvQ;
        i = (i + (restrictionId != null ? restrictionId.hashCode() : 0)) * 31;
        long j2 = this.bvT;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        a aVar = this.bvR;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycRestrictionDataChanged(user_id=");
        stringBuilder.append(this.bvL);
        stringBuilder.append(", changeType=");
        stringBuilder.append(this.bvS);
        stringBuilder.append(", restrictionId=");
        stringBuilder.append(this.bvQ);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.bvT);
        stringBuilder.append(", requirementAction=");
        stringBuilder.append(this.bvR);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final RestrictionChangeType afE() {
        return this.bvS;
    }

    public final RestrictionId afC() {
        return this.bvQ;
    }

    public final a afD() {
        return this.bvR;
    }
}
