package com.iqoption.core.microservices.kyc.response.step;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, bng = {"Lcom/iqoption/core/microservices/kyc/response/step/CustomerStepsEvent;", "", "steps", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "updatedAt", "", "userId", "flowId", "", "(Ljava/util/List;JLjava/lang/Long;Ljava/lang/String;)V", "getFlowId", "()Ljava/lang/String;", "getSteps", "()Ljava/util/List;", "getUpdatedAt", "()J", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;JLjava/lang/Long;Ljava/lang/String;)Lcom/iqoption/core/microservices/kyc/response/step/CustomerStepsEvent;", "equals", "", "other", "hashCode", "", "toString", "core_release"})
@o
/* compiled from: CustomerStepsEvent.kt */
public final class a {
    @SerializedName("updated_at")
    private final long bvT;
    @SerializedName("steps")
    private final List<c> bvU;
    @SerializedName("flow_id")
    private final String bvV;
    @SerializedName("user_id")
    private final Long userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.bvU, aVar.bvU)) {
                    if (!((this.bvT == aVar.bvT ? 1 : null) != null && kotlin.jvm.internal.i.y(this.userId, aVar.userId) && kotlin.jvm.internal.i.y(this.bvV, aVar.bvV))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.bvU;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long j = this.bvT;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.userId;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.bvV;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustomerStepsEvent(steps=");
        stringBuilder.append(this.bvU);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.bvT);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", flowId=");
        stringBuilder.append(this.bvV);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final List<c> afF() {
        return this.bvU;
    }

    public final String afG() {
        return this.bvV;
    }
}
