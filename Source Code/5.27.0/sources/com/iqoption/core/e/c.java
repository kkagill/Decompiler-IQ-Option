package com.iqoption.core.e;

import com.iqoption.core.microservices.kyc.response.d;
import com.iqoption.core.microservices.kyc.response.e;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.p;
import io.reactivex.t;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0006J\u0018\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/phone/PhoneManager;", "", "()V", "TAG", "", "confirmPhone", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/kyc/response/ConfirmPhoneResult;", "code", "resendPhoneConfirmation", "Lcom/iqoption/core/microservices/ResponseStatus;", "setPhoneAndSendConfirmation", "newPhone", "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "core_release"})
/* compiled from: PhoneManager.kt */
public final class c {
    private static final String TAG;
    public static final c bEr = new c();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/ConfirmPhoneResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneManager.kt */
    static final class a<T> implements f<com.iqoption.core.microservices.kyc.response.a> {
        public static final a bEs = new a();

        a() {
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.a aVar) {
            com.iqoption.core.data.d.b.bdk.WB().aG(0);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/SendPhoneConfirmationResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneManager.kt */
    static final class b<T> implements f<e> {
        public static final b bEt = new b();

        b() {
        }

        /* renamed from: a */
        public final void accept(e eVar) {
            if (eVar.isSuccessful()) {
                com.iqoption.core.data.d.b.bdk.WB().aG(System.currentTimeMillis());
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/ResponseStatus;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/core/microservices/kyc/response/SavePhoneResult;", "apply"})
    /* compiled from: PhoneManager.kt */
    static final class c<T, R> implements g<T, t<? extends R>> {
        public static final c bEu = new c();

        c() {
        }

        /* renamed from: b */
        public final p<? extends com.iqoption.core.microservices.c> apply(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            if (dVar.isSuccessful()) {
                return c.bEr.ajW();
            }
            p cI = p.cI(dVar);
            kotlin.jvm.internal.i.e(cI, "Single.just(it)");
            return cI;
        }
    }

    static {
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    private c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Missing block: B:18:0x0061, code skipped:
            if (r1.longValue() != r4) goto L_0x0064;
     */
    public final io.reactivex.p<? extends com.iqoption.core.microservices.c> e(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber r10) {
        /*
        r9 = this;
        r0 = com.iqoption.core.d.EA();
        r0 = r0.getPhone();
        r1 = 0;
        if (r0 == 0) goto L_0x001d;
    L_0x000b:
        r2 = r0;
        r2 = (java.lang.CharSequence) r2;
        r0 = " ";
        r3 = new java.lang.String[]{r0};
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        r0 = kotlin.text.v.b(r2, r3, r4, r5, r6, r7);
        goto L_0x001e;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        r2 = 0;
        r3 = 1;
        if (r10 == 0) goto L_0x0063;
    L_0x0022:
        if (r0 == 0) goto L_0x0042;
    L_0x0024:
        r4 = r0.size();
        if (r4 <= r3) goto L_0x0042;
    L_0x002a:
        r1 = r0.get(r2);
        r1 = (java.lang.String) r1;
        r1 = kotlin.text.t.mW(r1);
        r0 = r0.get(r3);
        r0 = (java.lang.String) r0;
        r0 = kotlin.text.t.mX(r0);
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x0047;
    L_0x0042:
        r0 = r1;
        r0 = (java.lang.Integer) r0;
        r1 = (java.lang.Long) r1;
    L_0x0047:
        r4 = r10.xK();
        if (r0 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0064;
    L_0x004e:
        r0 = r0.intValue();
        if (r0 != r4) goto L_0x0064;
    L_0x0054:
        r4 = r10.yj();
        if (r1 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0064;
    L_0x005b:
        r0 = r1.longValue();
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0064;
    L_0x0063:
        r2 = 1;
    L_0x0064:
        r0 = com.iqoption.core.data.d.b.bdk;
        r0 = r0.WB();
        r0 = r0.Wz();
        r0 = com.iqoption.core.e.b.bf(r0);
        if (r2 != 0) goto L_0x009b;
    L_0x0074:
        if (r10 != 0) goto L_0x0079;
    L_0x0076:
        kotlin.jvm.internal.i.bnJ();
    L_0x0079:
        r0 = r10.xK();
        r0 = java.lang.String.valueOf(r0);
        r1 = r10.yj();
        r10 = java.lang.String.valueOf(r1);
        r10 = com.iqoption.core.microservices.kyc.d.ao(r0, r10);
        r0 = com.iqoption.core.e.c.c.bEu;
        r0 = (io.reactivex.b.g) r0;
        r10 = r10.q(r0);
        r0 = "PhoneRequests.savePhone(…                        }";
        kotlin.jvm.internal.i.e(r10, r0);
        goto L_0x00b6;
    L_0x009b:
        r10 = com.iqoption.core.e.b.bg(r0);
        if (r10 == 0) goto L_0x00a6;
    L_0x00a1:
        r10 = r9.ajW();
        goto L_0x00b6;
    L_0x00a6:
        r10 = new com.iqoption.core.microservices.kyc.response.e;
        r0 = "";
        r10.<init>(r3, r0);
        r10 = io.reactivex.p.cI(r10);
        r0 = "Single.just(SendPhoneCon…mationResponse(true, \"\"))";
        kotlin.jvm.internal.i.e(r10, r0);
    L_0x00b6:
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.e.c.e(com.google.i18n.phonenumbers.Phonenumber$PhoneNumber):io.reactivex.p");
    }

    public final p<? extends com.iqoption.core.microservices.c> ajW() {
        p h = com.iqoption.core.microservices.kyc.d.buw.aeG().h((f) b.bEt);
        kotlin.jvm.internal.i.e(h, "PhoneRequests.sendPhoneC…)\n            }\n        }");
        return h;
    }

    public final p<com.iqoption.core.microservices.kyc.response.a> gH(String str) {
        kotlin.jvm.internal.i.f(str, "code");
        p h = com.iqoption.core.microservices.kyc.d.gH(str).h((f) a.bEs);
        kotlin.jvm.internal.i.e(h, "PhoneRequests.confirmPho…irm = 0\n                }");
        return h;
    }
}
