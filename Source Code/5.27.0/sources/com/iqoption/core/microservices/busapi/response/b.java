package com.iqoption.core.microservices.busapi.response;

import com.google.gson.annotations.JsonAdapter;
import kotlin.i;

@JsonAdapter(PersonalDataPolicyJsonDeserializer.class)
@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u0004J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "", "()V", "agreement", "", "email", "push", "call", "thirdPartyAccepted", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAgreement", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCall", "getEmail", "getPush", "getThirdPartyAccepted", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/iqoption/core/microservices/busapi/response/PersonalDataPolicy;", "createWithUpdatedStatuses", "jsonObject", "Lcom/google/gson/JsonObject;", "equals", "other", "hashCode", "", "isMarketingSetup", "toString", "", "core_release"})
/* compiled from: PersonalDataPolicy.kt */
public final class b {
    private final Boolean bpp;
    private final Boolean bpq;
    private final Boolean bpr;
    private final Boolean bps;
    private final Boolean bpt;

    public final b a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        return new b(bool, bool2, bool3, bool4, bool5);
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bpt, r3.bpt) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.busapi.response.b;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.busapi.response.b) r3;
        r0 = r2.bpp;
        r1 = r3.bpp;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.bpq;
        r1 = r3.bpq;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.bpr;
        r1 = r3.bpr;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.bps;
        r1 = r3.bps;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.bpt;
        r3 = r3.bpt;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.busapi.response.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Boolean bool = this.bpp;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.bpq;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.bpr;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.bps;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.bpt;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PersonalDataPolicy(agreement=");
        stringBuilder.append(this.bpp);
        stringBuilder.append(", email=");
        stringBuilder.append(this.bpq);
        stringBuilder.append(", push=");
        stringBuilder.append(this.bpr);
        stringBuilder.append(", call=");
        stringBuilder.append(this.bps);
        stringBuilder.append(", thirdPartyAccepted=");
        stringBuilder.append(this.bpt);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.bpp = bool;
        this.bpq = bool2;
        this.bpr = bool3;
        this.bps = bool4;
        this.bpt = bool5;
    }

    public /* synthetic */ b(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, f fVar) {
        if ((i & 1) != 0) {
            bool = (Boolean) null;
        }
        if ((i & 2) != 0) {
            bool2 = (Boolean) null;
        }
        Boolean bool6 = bool2;
        if ((i & 4) != 0) {
            bool3 = (Boolean) null;
        }
        Boolean bool7 = bool3;
        if ((i & 8) != 0) {
            bool4 = (Boolean) null;
        }
        Boolean bool8 = bool4;
        if ((i & 16) != 0) {
            bool5 = (Boolean) null;
        }
        this(bool, bool6, bool7, bool8, bool5);
    }

    public final Boolean abv() {
        return this.bpp;
    }

    public final Boolean abw() {
        return this.bpq;
    }

    public final Boolean abx() {
        return this.bpr;
    }

    public final Boolean aby() {
        return this.bps;
    }

    public final Boolean abz() {
        return this.bpt;
    }

    public b() {
        this(null, null, null, null, null, 30, null);
    }

    /* JADX WARNING: Missing block: B:3:0x001b, code skipped:
            if (r0 != null) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:8:0x0025, code skipped:
            if (r0 != null) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:13:0x002f, code skipped:
            if (r0 != null) goto L_0x0034;
     */
    /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:23:0x0043, code skipped:
            if (r8 != null) goto L_0x0048;
     */
    public final com.iqoption.core.microservices.busapi.response.b g(com.google.gson.JsonObject r8) {
        /*
        r7 = this;
        r0 = "jsonObject";
        kotlin.jvm.internal.i.f(r8, r0);
        r8 = (com.google.gson.JsonElement) r8;
        r0 = com.iqoption.core.d.Um();
        r0 = r0.Ez();
        r1 = com.iqoption.core.microservices.busapi.response.b.class;
        r8 = r0.fromJson(r8, r1);
        r8 = (com.iqoption.core.microservices.busapi.response.b) r8;
        if (r8 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r8.bpp;
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        r0 = r7.bpp;
    L_0x0020:
        r2 = r0;
        if (r8 == 0) goto L_0x0028;
    L_0x0023:
        r0 = r8.bpq;
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        goto L_0x002a;
    L_0x0028:
        r0 = r7.bpq;
    L_0x002a:
        r3 = r0;
        if (r8 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r8.bpr;
        if (r0 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0034;
    L_0x0032:
        r0 = r7.bpr;
    L_0x0034:
        r4 = r0;
        if (r8 == 0) goto L_0x003c;
    L_0x0037:
        r0 = r8.bps;
        if (r0 == 0) goto L_0x003c;
    L_0x003b:
        goto L_0x003e;
    L_0x003c:
        r0 = r7.bps;
    L_0x003e:
        r5 = r0;
        if (r8 == 0) goto L_0x0046;
    L_0x0041:
        r8 = r8.bpt;
        if (r8 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0048;
    L_0x0046:
        r8 = r7.bpt;
    L_0x0048:
        r6 = r8;
        r1 = r7;
        r8 = r1.a(r2, r3, r4, r5, r6);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.busapi.response.b.g(com.google.gson.JsonObject):com.iqoption.core.microservices.busapi.response.b");
    }
}
