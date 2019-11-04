package com.iqoption.core.microservices.kyc.response.restriction;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "Landroid/os/Parcelable;", "restrictionId", "Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;", "requirementAction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "(Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;)V", "getRequirementAction", "()Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "getRestrictionId", "()Lcom/iqoption/core/microservices/kyc/response/restriction/RestrictionId;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"})
@o
/* compiled from: KycRestriction.kt */
public final class b implements Parcelable {
    public static final Creator CREATOR = new a();
    @SerializedName("restriction_id")
    private final RestrictionId bvQ;
    @SerializedName("requirement_action")
    private final a bvR;

    @i(bne = {1, 1, 15})
    public static class a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.f(parcel, "in");
            return new b((RestrictionId) Enum.valueOf(RestrictionId.class, parcel.readString()), parcel.readInt() != 0 ? (a) a.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public static /* synthetic */ b a(b bVar, RestrictionId restrictionId, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            restrictionId = bVar.bvQ;
        }
        if ((i & 2) != 0) {
            aVar = bVar.bvR;
        }
        return bVar.a(restrictionId, aVar);
    }

    public final b a(RestrictionId restrictionId, a aVar) {
        kotlin.jvm.internal.i.f(restrictionId, "restrictionId");
        return new b(restrictionId, aVar);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bvR, r3.bvR) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.kyc.response.restriction.b;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.kyc.response.restriction.b) r3;
        r0 = r2.bvQ;
        r1 = r3.bvQ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bvR;
        r3 = r3.bvR;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.kyc.response.restriction.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        RestrictionId restrictionId = this.bvQ;
        int i = 0;
        int hashCode = (restrictionId != null ? restrictionId.hashCode() : 0) * 31;
        a aVar = this.bvR;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KycRestriction(restrictionId=");
        stringBuilder.append(this.bvQ);
        stringBuilder.append(", requirementAction=");
        stringBuilder.append(this.bvR);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.f(parcel, "parcel");
        parcel.writeString(this.bvQ.name());
        a aVar = this.bvR;
        if (aVar != null) {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public b(RestrictionId restrictionId, a aVar) {
        kotlin.jvm.internal.i.f(restrictionId, "restrictionId");
        this.bvQ = restrictionId;
        this.bvR = aVar;
    }

    public final RestrictionId afC() {
        return this.bvQ;
    }

    public final a afD() {
        return this.bvR;
    }
}
