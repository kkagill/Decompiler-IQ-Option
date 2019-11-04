package com.iqoption.core.microservices.kyc.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.kyc.response.step.c;
import com.iqoption.core.microservices.kyc.response.step.d;
import com.iqoption.core.util.o;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.sequences.h;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001c\u001a\u0004\u0018\u00010\nJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "", "userId", "", "level", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevel;", "levelIndicator", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelIndicator;", "requiredSteps", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "(JLcom/iqoption/core/microservices/kyc/response/VerificationLevel;Lcom/iqoption/core/microservices/kyc/response/VerificationLevelIndicator;Ljava/util/List;)V", "getLevel", "()Lcom/iqoption/core/microservices/kyc/response/VerificationLevel;", "getLevelIndicator", "()Lcom/iqoption/core/microservices/kyc/response/VerificationLevelIndicator;", "getRequiredSteps", "()Ljava/util/List;", "getUserId", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getActualStep", "hashCode", "", "toString", "", "core_release"})
@o
/* compiled from: VerificationLevelData.kt */
public final class k {
    @SerializedName("level")
    private final VerificationLevel buM;
    @SerializedName("level_indicator")
    private final VerificationLevelIndicator buN;
    @SerializedName("required_steps")
    private final List<c> buO;
    @SerializedName("user_id")
    private final long userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (!((this.userId == kVar.userId ? 1 : null) != null && kotlin.jvm.internal.i.y(this.buM, kVar.buM) && kotlin.jvm.internal.i.y(this.buN, kVar.buN) && kotlin.jvm.internal.i.y(this.buO, kVar.buO))) {
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
        VerificationLevel verificationLevel = this.buM;
        int i2 = 0;
        i = (i + (verificationLevel != null ? verificationLevel.hashCode() : 0)) * 31;
        VerificationLevelIndicator verificationLevelIndicator = this.buN;
        i = (i + (verificationLevelIndicator != null ? verificationLevelIndicator.hashCode() : 0)) * 31;
        List list = this.buO;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerificationLevelData(userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", level=");
        stringBuilder.append(this.buM);
        stringBuilder.append(", levelIndicator=");
        stringBuilder.append(this.buN);
        stringBuilder.append(", requiredSteps=");
        stringBuilder.append(this.buO);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final VerificationLevel aeK() {
        return this.buM;
    }

    public final VerificationLevelIndicator aeL() {
        return this.buN;
    }

    public final c aeJ() {
        List list = this.buO;
        if (list != null) {
            h Z = u.Z(list);
            if (Z != null) {
                Z = n.b(Z, (b) VerificationLevelData$getActualStep$1.buP);
                if (Z != null) {
                    Z = n.a(Z, d.afL());
                    if (Z != null) {
                        return (c) n.d(Z);
                    }
                }
            }
        }
        return null;
    }
}
