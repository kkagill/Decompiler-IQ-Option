package com.iqoption.core.microservices.kyc.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/VerificationLevelDataUpdate;", "", "userId", "", "data", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "updatedAt", "(JLcom/iqoption/core/microservices/kyc/response/VerificationLevelData;Ljava/lang/Long;)V", "getData", "()Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "getUpdatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "()J", "component1", "component2", "component3", "copy", "(JLcom/iqoption/core/microservices/kyc/response/VerificationLevelData;Ljava/lang/Long;)Lcom/iqoption/core/microservices/kyc/response/VerificationLevelDataUpdate;", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: VerificationLevelDataUpdate.kt */
public final class l {
    @SerializedName("updated_at")
    private final Long bsK;
    @SerializedName("data")
    private final k buQ;
    @SerializedName("user_id")
    private final long userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!((this.userId == lVar.userId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.buQ, lVar.buQ) && kotlin.jvm.internal.i.y(this.bsK, lVar.bsK))) {
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
        k kVar = this.buQ;
        int i2 = 0;
        i = (i + (kVar != null ? kVar.hashCode() : 0)) * 31;
        Long l = this.bsK;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerificationLevelDataUpdate(userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", data=");
        stringBuilder.append(this.buQ);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.bsK);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final k aeM() {
        return this.buQ;
    }
}
