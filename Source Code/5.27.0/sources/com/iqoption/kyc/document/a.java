package com.iqoption.kyc.document;

import com.iqoption.core.microservices.kyc.response.document.g;
import com.jumio.MobileSDK;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, bng = {"Lcom/iqoption/kyc/document/DocsSdk;", "", "sdk", "Lcom/jumio/MobileSDK;", "config", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfigData;", "document", "Lcom/iqoption/core/microservices/kyc/response/VerificationDocument;", "(Lcom/jumio/MobileSDK;Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfigData;Lcom/iqoption/core/microservices/kyc/response/VerificationDocument;)V", "getConfig", "()Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfigData;", "getDocument", "()Lcom/iqoption/core/microservices/kyc/response/VerificationDocument;", "getSdk", "()Lcom/jumio/MobileSDK;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kyc_release"})
/* compiled from: KycDocumentViewModel.kt */
public final class a {
    private final MobileSDK dwP;
    private final g dwQ;
    private final com.iqoption.core.microservices.kyc.response.i dwR;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.dwR, r3.dwR) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.kyc.document.a;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.kyc.document.a) r3;
        r0 = r2.dwP;
        r1 = r3.dwP;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.dwQ;
        r1 = r3.dwQ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.dwR;
        r3 = r3.dwR;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.document.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        MobileSDK mobileSDK = this.dwP;
        int i = 0;
        int hashCode = (mobileSDK != null ? mobileSDK.hashCode() : 0) * 31;
        g gVar = this.dwQ;
        hashCode = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        com.iqoption.core.microservices.kyc.response.i iVar = this.dwR;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DocsSdk(sdk=");
        stringBuilder.append(this.dwP);
        stringBuilder.append(", config=");
        stringBuilder.append(this.dwQ);
        stringBuilder.append(", document=");
        stringBuilder.append(this.dwR);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(MobileSDK mobileSDK, g gVar, com.iqoption.core.microservices.kyc.response.i iVar) {
        kotlin.jvm.internal.i.f(mobileSDK, "sdk");
        kotlin.jvm.internal.i.f(gVar, "config");
        kotlin.jvm.internal.i.f(iVar, "document");
        this.dwP = mobileSDK;
        this.dwQ = gVar;
        this.dwR = iVar;
    }

    public final MobileSDK aKF() {
        return this.dwP;
    }

    public final com.iqoption.core.microservices.kyc.response.i aKG() {
        return this.dwR;
    }
}
