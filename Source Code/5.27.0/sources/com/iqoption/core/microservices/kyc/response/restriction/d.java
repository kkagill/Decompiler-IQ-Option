package com.iqoption.core.microservices.kyc.response.restriction;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionsData;", "", "user_id", "", "restrictions", "", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "(JLjava/util/List;)V", "getRestrictions", "()Ljava/util/List;", "getUser_id", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: KycRestrictionsData.kt */
public final class d {
    @SerializedName("restrictions")
    private final List<b> bdG;
    @SerializedName("user_id")
    private final long bvL;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if ((this.bvL == dVar.bvL ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bdG, dVar.bdG)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.bvL;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        List list = this.bdG;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycRestrictionsData(user_id=");
        stringBuilder.append(this.bvL);
        stringBuilder.append(", restrictions=");
        stringBuilder.append(this.bdG);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final List<b> WZ() {
        return this.bdG;
    }
}
