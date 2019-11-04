package com.iqoption.core.microservices.fininfo.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÂ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/microservices/fininfo/response/DataActive;", "", "fininfo", "Lcom/iqoption/core/microservices/fininfo/response/FinInfo;", "type", "Lcom/iqoption/core/microservices/fininfo/response/FinInfoType;", "link", "", "leftSide", "rightSide", "(Lcom/iqoption/core/microservices/fininfo/response/FinInfo;Lcom/iqoption/core/microservices/fininfo/response/FinInfoType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFininfo", "()Lcom/iqoption/core/microservices/fininfo/response/FinInfo;", "getLink", "()Ljava/lang/String;", "getType", "()Lcom/iqoption/core/microservices/fininfo/response/FinInfoType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getBase", "getSecond", "hashCode", "", "toString", "core_release"})
/* compiled from: ActiveFinInfoResult.kt */
public final class d {
    @SerializedName("fininfo")
    private final f btC;
    @SerializedName("type")
    private final FinInfoType btD;
    @SerializedName("link")
    private final String btE;
    @SerializedName("currencyLeftSide")
    private final String btF;
    @SerializedName("currencyRightSide")
    private final String btG;

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.btG, r3.btG) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.fininfo.response.d;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.fininfo.response.d) r3;
        r0 = r2.btC;
        r1 = r3.btC;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.btD;
        r1 = r3.btD;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.btE;
        r1 = r3.btE;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.btF;
        r1 = r3.btF;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.btG;
        r3 = r3.btG;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.fininfo.response.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        f fVar = this.btC;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        FinInfoType finInfoType = this.btD;
        hashCode = (hashCode + (finInfoType != null ? finInfoType.hashCode() : 0)) * 31;
        String str = this.btE;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.btF;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.btG;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataActive(fininfo=");
        stringBuilder.append(this.btC);
        stringBuilder.append(", type=");
        stringBuilder.append(this.btD);
        stringBuilder.append(", link=");
        stringBuilder.append(this.btE);
        stringBuilder.append(", leftSide=");
        stringBuilder.append(this.btF);
        stringBuilder.append(", rightSide=");
        stringBuilder.append(this.btG);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final f adV() {
        return this.btC;
    }

    public final FinInfoType adW() {
        return this.btD;
    }

    public final String adX() {
        return this.btE;
    }

    public final String adT() {
        FinInfoType finInfoType = this.btD;
        if (finInfoType != null && e.aob[finInfoType.ordinal()] == 1) {
            return this.btF;
        }
        return null;
    }

    public final String adU() {
        FinInfoType finInfoType = this.btD;
        if (finInfoType != null && e.axg[finInfoType.ordinal()] == 1) {
            return this.btG;
        }
        return null;
    }
}
