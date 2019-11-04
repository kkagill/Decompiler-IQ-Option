package com.iqoption.billing;

import com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus;
import io.reactivex.b.g;
import io.reactivex.b.h;
import io.reactivex.p;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/billing/CashBoxMediator;", "", "()V", "lastPermissions", "Lcom/iqoption/billing/KycDepositPermissions;", "getCashboxDisplayData", "Lio/reactivex/Flowable;", "Lcom/iqoption/billing/CashboxDisplayData;", "getCounting", "Lcom/iqoption/billing/CashboxData;", "useCashboxCache", "", "getKycDepositPermissions", "getSession", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "billing_release"})
/* compiled from: CashBoxMediator.kt */
public final class d {
    private static volatile h ayw;
    public static final d ayx = new d();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "Lcom/iqoption/billing/KycDepositPermissions;", "Lcom/iqoption/billing/CashboxData;", "kotlin.jvm.PlatformType", "permissions", "apply"})
    /* compiled from: CashBoxMediator.kt */
    static final class a<T, R> implements g<T, org.a.b<? extends R>> {
        public static final a ayy = new a();

        a() {
        }

        /* renamed from: a */
        public final io.reactivex.e<Pair<h, e>> apply(final h hVar) {
            kotlin.jvm.internal.i.f(hVar, "permissions");
            h a = d.ayw;
            d.ayw = hVar;
            return d.ayx.bJ(kotlin.jvm.internal.i.y(a, hVar)).g(new g<T, R>() {
                /* renamed from: a */
                public final Pair<h, e> apply(e eVar) {
                    kotlin.jvm.internal.i.f(eVar, "it");
                    return new Pair(hVar, eVar);
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "it", "", "apply"})
    /* compiled from: CashBoxMediator.kt */
    static final class b<T, R> implements g<Throwable, List<? extends com.iqoption.core.microservices.billing.response.crypto.a>> {
        public static final b ayA = new b();

        b() {
        }

        /* renamed from: r */
        public final List<com.iqoption.core.microservices.billing.response.crypto.a> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "", "apply"})
    /* compiled from: CashBoxMediator.kt */
    static final class c<T, R> implements g<Throwable, Boolean> {
        public static final c ayB = new c();

        c() {
        }

        public final boolean s(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return false;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(s((Throwable) obj));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, bng = {"<anonymous>", "Lcom/iqoption/billing/CashboxDisplayData;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/billing/KycDepositPermissions;", "Lcom/iqoption/billing/CashboxData;", "cryptoDeposits", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "isGooglePlayEnabled", "", "apply", "(Lkotlin/Pair;Ljava/util/List;Ljava/lang/Boolean;)Lcom/iqoption/billing/CashboxDisplayData;"})
    /* compiled from: CashBoxMediator.kt */
    static final class d<T1, T2, T3, R> implements h<Pair<? extends h, ? extends e>, List<? extends com.iqoption.core.microservices.billing.response.crypto.a>, Boolean, f> {
        public static final d ayC = new d();

        d() {
        }

        public final f a(Pair<h, e> pair, List<com.iqoption.core.microservices.billing.response.crypto.a> list, Boolean bool) {
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 0>");
            kotlin.jvm.internal.i.f(list, "cryptoDeposits");
            kotlin.jvm.internal.i.f(bool, "isGooglePlayEnabled");
            h hVar = (h) pair.bnj();
            e eVar = (e) pair.bnk();
            ArrayList XA = eVar.Km().XA();
            Object obj = null;
            Object obj2 = (XA != null ? XA.size() : 0) > 1 ? 1 : null;
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if ((((com.iqoption.core.microservices.billing.response.crypto.a) next).ZR() == CryptoDepositStatus.SUCCESS ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            if (((List) arrayList).size() == 1) {
                obj = 1;
            }
            if (!(obj2 == null || obj == null)) {
                com.iqoption.billing.repository.a.ayY.Kx();
            }
            Collection arrayList2 = new ArrayList();
            for (Object obj3 : iterable) {
                if (((com.iqoption.core.microservices.billing.response.crypto.a) obj3).ZJ()) {
                    arrayList2.add(obj3);
                }
            }
            return new f(eVar, (List) arrayList2, bool.booleanValue(), hVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/iqoption/billing/CashboxData;", "kotlin.jvm.PlatformType", "session", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "apply"})
    /* compiled from: CashBoxMediator.kt */
    static final class e<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ boolean ayD;

        e(boolean z) {
            this.ayD = z;
        }

        /* renamed from: a */
        public final io.reactivex.e<e> apply(final com.iqoption.core.microservices.billing.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "session");
            return com.iqoption.billing.repository.a.ayY.c(a.Kh(), aVar.Zx(), this.ayD).f((g) new g<T, t<? extends R>>() {
                /* renamed from: a */
                public final p<e> apply(final com.iqoption.core.microservices.billing.response.c cVar) {
                    p bkV;
                    kotlin.jvm.internal.i.f(cVar, "cashBoxResult");
                    com.iqoption.core.microservices.billing.response.deposit.b Zz = cVar.Zz();
                    if (Zz == null || !Zz.aan()) {
                        bkV = com.iqoption.core.data.repository.c.bdy.WS().bkV();
                    } else {
                        bkV = p.cI(m.emptyList());
                    }
                    return bkV.t(new g<T, R>(this) {
                        final /* synthetic */ AnonymousClass1 ayF;

                        /* renamed from: I */
                        public final e apply(List<com.iqoption.core.microservices.configuration.a.d> list) {
                            kotlin.jvm.internal.i.f(list, "currenciesWithRate");
                            com.iqoption.core.microservices.billing.response.deposit.b Zz = cVar.Zz();
                            Object aaq = Zz != null ? Zz.aaq() : null;
                            if (aaq != null) {
                                ArrayList XA = Zz.XA();
                                if (XA == null) {
                                    XA = new ArrayList();
                                    XA.add(aaq);
                                    Zz.g(XA);
                                } else if (!XA.contains(aaq)) {
                                    XA.add(aaq);
                                }
                            }
                            com.iqoption.core.microservices.billing.response.a aVar = aVar;
                            kotlin.jvm.internal.i.e(aVar, "session");
                            if (Zz == null) {
                                kotlin.jvm.internal.i.bnJ();
                            }
                            return new e(aVar, Zz, list);
                        }
                    });
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/billing/KycDepositPermissions;", "steps", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "restrictions", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "apply"})
    /* compiled from: CashBoxMediator.kt */
    static final class f<T1, T2, R> implements io.reactivex.b.c<List<? extends com.iqoption.core.microservices.kyc.response.step.c>, List<? extends com.iqoption.core.microservices.kyc.response.restriction.b>, h> {
        public static final f ayH = new f();

        f() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
        /* renamed from: c */
        public final com.iqoption.billing.h apply(java.util.List<com.iqoption.core.microservices.kyc.response.step.c> r10, java.util.List<com.iqoption.core.microservices.kyc.response.restriction.b> r11) {
            /*
            r9 = this;
            r0 = "steps";
            kotlin.jvm.internal.i.f(r10, r0);
            r0 = "restrictions";
            kotlin.jvm.internal.i.f(r11, r0);
            r0 = com.iqoption.core.d.EA();
            r0 = r0.Er();
            r11 = (java.lang.Iterable) r11;
            r1 = r11.iterator();
        L_0x0018:
            r2 = r1.hasNext();
            r3 = 0;
            r4 = 1;
            r5 = 0;
            if (r2 == 0) goto L_0x0036;
        L_0x0021:
            r2 = r1.next();
            r6 = r2;
            r6 = (com.iqoption.core.microservices.kyc.response.restriction.b) r6;
            r6 = r6.afC();
            r7 = com.iqoption.core.microservices.kyc.response.restriction.RestrictionId.AML_LIMIT_DEPOSUM_AMOUNT;
            if (r6 != r7) goto L_0x0032;
        L_0x0030:
            r6 = 1;
            goto L_0x0033;
        L_0x0032:
            r6 = 0;
        L_0x0033:
            if (r6 == 0) goto L_0x0018;
        L_0x0035:
            goto L_0x0037;
        L_0x0036:
            r2 = r3;
        L_0x0037:
            if (r2 == 0) goto L_0x003b;
        L_0x0039:
            r1 = 1;
            goto L_0x003c;
        L_0x003b:
            r1 = 0;
        L_0x003c:
            r2 = com.iqoption.core.d.EH();
            r6 = "kyc-show-after-registration";
            r2 = r2.ei(r6);
            if (r2 == 0) goto L_0x004d;
        L_0x0048:
            r2 = r2.getStatus();
            goto L_0x004e;
        L_0x004d:
            r2 = r3;
        L_0x004e:
            r6 = "enabled-before-dep";
            r7 = "enabled";
            r8 = "enabled-without-skip";
            r6 = new java.lang.String[]{r6, r7, r8};
            r2 = com.iqoption.core.ext.c.b(r2, r6);
            if (r2 == 0) goto L_0x008e;
        L_0x005e:
            if (r0 == 0) goto L_0x008e;
        L_0x0060:
            r0 = com.iqoption.core.d.EA();
            r0 = r0.Ej();
            if (r0 != 0) goto L_0x008e;
        L_0x006a:
            r11 = r11.iterator();
        L_0x006e:
            r0 = r11.hasNext();
            if (r0 == 0) goto L_0x0089;
        L_0x0074:
            r0 = r11.next();
            r2 = r0;
            r2 = (com.iqoption.core.microservices.kyc.response.restriction.b) r2;
            r2 = r2.afC();
            r6 = com.iqoption.core.microservices.kyc.response.restriction.RestrictionId.BLOCK_DEPOSIT;
            if (r2 != r6) goto L_0x0085;
        L_0x0083:
            r2 = 1;
            goto L_0x0086;
        L_0x0085:
            r2 = 0;
        L_0x0086:
            if (r2 == 0) goto L_0x006e;
        L_0x0088:
            goto L_0x008a;
        L_0x0089:
            r0 = r3;
        L_0x008a:
            if (r0 == 0) goto L_0x008e;
        L_0x008c:
            r11 = 1;
            goto L_0x008f;
        L_0x008e:
            r11 = 0;
        L_0x008f:
            r10 = (java.lang.Iterable) r10;
            r10 = r10.iterator();
        L_0x0095:
            r0 = r10.hasNext();
            if (r0 == 0) goto L_0x00bd;
        L_0x009b:
            r0 = r10.next();
            r2 = r0;
            r2 = (com.iqoption.core.microservices.kyc.response.step.c) r2;
            r2 = r2.afI();
            r6 = 3;
            r6 = new com.iqoption.core.microservices.kyc.response.step.KycStepState[r6];
            r7 = com.iqoption.core.microservices.kyc.response.step.KycStepState.NOT_FILLED;
            r6[r5] = r7;
            r7 = com.iqoption.core.microservices.kyc.response.step.KycStepState.NEED_ACTION;
            r6[r4] = r7;
            r7 = 2;
            r8 = com.iqoption.core.microservices.kyc.response.step.KycStepState.DECLINED;
            r6[r7] = r8;
            r2 = com.iqoption.core.ext.c.b(r2, r6);
            if (r2 == 0) goto L_0x0095;
        L_0x00bc:
            goto L_0x00be;
        L_0x00bd:
            r0 = r3;
        L_0x00be:
            if (r0 == 0) goto L_0x00c1;
        L_0x00c0:
            goto L_0x00c2;
        L_0x00c1:
            r4 = 0;
        L_0x00c2:
            r10 = new com.iqoption.billing.h;
            r10.<init>(r1, r11, r4);
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.billing.d$f.apply(java.util.List, java.util.List):com.iqoption.billing.h");
        }
    }

    private d() {
    }

    public final io.reactivex.e<com.iqoption.core.microservices.billing.response.a> Ki() {
        return com.iqoption.billing.repository.d.azu.Ki();
    }

    public final io.reactivex.e<f> Kj() {
        io.reactivex.e a = io.reactivex.e.a((org.a.b) Kk().d((g) a.ayy), (org.a.b) com.iqoption.billing.repository.a.ayY.Kw().h(b.ayA), (org.a.b) com.iqoption.billing.wallet.a.azB.KH().u(c.ayB).bkO(), (h) d.ayC);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(\n…              }\n        )");
        return a;
    }

    public final io.reactivex.e<e> bJ(boolean z) {
        io.reactivex.e d = Ki().d((g) new e(z));
        kotlin.jvm.internal.i.e(d, "getSession().flatMap { s…              }\n        }");
        return d;
    }

    private final io.reactivex.e<h> Kk() {
        io.reactivex.e a = io.reactivex.e.a((org.a.b) com.iqoption.core.data.repository.d.bdF.a(null), (org.a.b) com.iqoption.core.data.repository.d.bdF.WX(), (io.reactivex.b.c) f.ayH);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(\n…              }\n        )");
        return a;
    }
}
