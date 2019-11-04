package com.iqoption.core.microservices.billing.response;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0005\"#$%&B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001e\u001a\u00020\u0005J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0002\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, bng = {"Lcom/iqoption/core/microservices/billing/response/PayResponse;", "", "isSuccessful", "", "message", "", "data", "Lcom/iqoption/core/microservices/billing/response/PayResponse$Data;", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/PayResponse$Data;)V", "getData", "()Lcom/iqoption/core/microservices/billing/response/PayResponse$Data;", "setData", "(Lcom/iqoption/core/microservices/billing/response/PayResponse$Data;)V", "errors", "Lcom/iqoption/core/microservices/billing/response/PayResponse$Errors;", "getErrors", "()Lcom/iqoption/core/microservices/billing/response/PayResponse$Errors;", "setErrors", "(Lcom/iqoption/core/microservices/billing/response/PayResponse$Errors;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/iqoption/core/microservices/billing/response/PayResponse$Data;)Lcom/iqoption/core/microservices/billing/response/PayResponse;", "equals", "other", "errorMessage", "hashCode", "", "toString", "CryptoToFiat", "Data", "Errors", "Redirect", "Validation", "core_release"})
/* compiled from: PayResponse.kt */
public final class f {
    @SerializedName("data")
    private b bmz;
    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;
    @SerializedName("message")
    private final String message;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/microservices/billing/response/PayResponse$CryptoToFiat;", "", "billingId", "", "(J)V", "getBillingId", "()J", "setBillingId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
    /* compiled from: PayResponse.kt */
    public static final class a {
        @SerializedName("billing_id")
        private long bmA;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    if ((this.bmA == ((a) obj).bmA ? 1 : null) != null) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.bmA;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CryptoToFiat(billingId=");
            stringBuilder.append(this.bmA);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public final long ZF() {
            return this.bmA;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, bng = {"Lcom/iqoption/core/microservices/billing/response/PayResponse$Data;", "", "redirect", "Lcom/iqoption/core/microservices/billing/response/PayResponse$Redirect;", "cryptoToFiat", "Lcom/iqoption/core/microservices/billing/response/PayResponse$CryptoToFiat;", "errorSession", "", "(Lcom/iqoption/core/microservices/billing/response/PayResponse$Redirect;Lcom/iqoption/core/microservices/billing/response/PayResponse$CryptoToFiat;Ljava/lang/String;)V", "getCryptoToFiat", "()Lcom/iqoption/core/microservices/billing/response/PayResponse$CryptoToFiat;", "setCryptoToFiat", "(Lcom/iqoption/core/microservices/billing/response/PayResponse$CryptoToFiat;)V", "getErrorSession", "()Ljava/lang/String;", "setErrorSession", "(Ljava/lang/String;)V", "getRedirect", "()Lcom/iqoption/core/microservices/billing/response/PayResponse$Redirect;", "setRedirect", "(Lcom/iqoption/core/microservices/billing/response/PayResponse$Redirect;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "session", "toString", "core_release"})
    /* compiled from: PayResponse.kt */
    public static final class b {
        @SerializedName("redirect")
        private c bmB;
        @SerializedName("crypto_to_fiat")
        private a bmC;
        @SerializedName("sess_id")
        private String bmD;

        public b() {
            this(null, null, null, 7, null);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bmD, r3.bmD) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.billing.response.f.b;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.billing.response.f.b) r3;
            r0 = r2.bmB;
            r1 = r3.bmB;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.bmC;
            r1 = r3.bmC;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.bmD;
            r3 = r3.bmD;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.f$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            c cVar = this.bmB;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            a aVar = this.bmC;
            hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            String str = this.bmD;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(redirect=");
            stringBuilder.append(this.bmB);
            stringBuilder.append(", cryptoToFiat=");
            stringBuilder.append(this.bmC);
            stringBuilder.append(", errorSession=");
            stringBuilder.append(this.bmD);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(c cVar, a aVar, String str) {
            this.bmB = cVar;
            this.bmC = aVar;
            this.bmD = str;
        }

        public /* synthetic */ b(c cVar, a aVar, String str, int i, f fVar) {
            if ((i & 1) != 0) {
                cVar = (c) null;
            }
            if ((i & 2) != 0) {
                aVar = (a) null;
            }
            if ((i & 4) != 0) {
                str = (String) null;
            }
            this(cVar, aVar, str);
        }

        public final c ZH() {
            return this.bmB;
        }

        public final a ZI() {
            return this.bmC;
        }

        public final String ZG() {
            String str = this.bmD;
            if (str != null) {
                return str;
            }
            c cVar = this.bmB;
            if (cVar != null) {
                HashMap HU = cVar.HU();
                if (HU != null) {
                    return (String) HU.get("sess_id");
                }
            }
            return null;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR,\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/billing/response/PayResponse$Redirect;", "", "method", "", "url", "params", "Ljava/util/HashMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"})
    /* compiled from: PayResponse.kt */
    public static final class c {
        @SerializedName("params")
        private HashMap<String, String> ava;
        @SerializedName("method")
        private String method;
        @SerializedName("url")
        private String url;

        public c() {
            this(null, null, null, 7, null);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.ava, r3.ava) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.billing.response.f.c;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.billing.response.f.c) r3;
            r0 = r2.method;
            r1 = r3.method;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.url;
            r1 = r3.url;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.ava;
            r3 = r3.ava;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.f$c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.method;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.url;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            HashMap hashMap = this.ava;
            if (hashMap != null) {
                i = hashMap.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Redirect(method=");
            stringBuilder.append(this.method);
            stringBuilder.append(", url=");
            stringBuilder.append(this.url);
            stringBuilder.append(", params=");
            stringBuilder.append(this.ava);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public c(String str, String str2, HashMap<String, String> hashMap) {
            this.method = str;
            this.url = str2;
            this.ava = hashMap;
        }

        public /* synthetic */ c(String str, String str2, HashMap hashMap, int i, f fVar) {
            if ((i & 1) != 0) {
                str = (String) null;
            }
            if ((i & 2) != 0) {
                str2 = (String) null;
            }
            if ((i & 4) != 0) {
                hashMap = (HashMap) null;
            }
            this(str, str2, hashMap);
        }

        public final String getMethod() {
            return this.method;
        }

        public final String getUrl() {
            return this.url;
        }

        public final HashMap<String, String> HU() {
            return this.ava;
        }
    }

    public f() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bmz, r3.bmz) != false) goto L_0x0029;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.f;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.f) r3;
        r0 = r2.isSuccessful;
        r1 = r3.isSuccessful;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.message;
        r1 = r3.message;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.bmz;
        r3 = r3.bmz;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Boolean bool = this.isSuccessful;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.message;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        b bVar = this.bmz;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PayResponse(isSuccessful=");
        stringBuilder.append(this.isSuccessful);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", data=");
        stringBuilder.append(this.bmz);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(Boolean bool, String str, b bVar) {
        this.isSuccessful = bool;
        this.message = str;
        this.bmz = bVar;
    }

    public /* synthetic */ f(Boolean bool, String str, b bVar, int i, f fVar) {
        if ((i & 1) != 0) {
            bool = Boolean.valueOf(false);
        }
        if ((i & 2) != 0) {
            str = (String) null;
        }
        if ((i & 4) != 0) {
            bVar = (b) null;
        }
        this(bool, str, bVar);
    }

    public final Boolean ZD() {
        return this.isSuccessful;
    }

    public final b ZE() {
        return this.bmz;
    }
}
