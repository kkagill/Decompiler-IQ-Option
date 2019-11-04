package com.iqoption.billing.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.util.z;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.p;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002()B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r\u0012\u0004\u0012\u00020\u001b0\fj\b\u0012\u0004\u0012\u00020\u001b`\u00112\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001fJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000Rs\u0010\u000b\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\fj\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e`\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013RV\u0010\u0016\u001aJ\u0012F\u0012D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e \u0010*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\u0018j\u0004\u0018\u0001`\u00190\u0018j\u0002`\u00190\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, bng = {"Lcom/iqoption/billing/repository/CashBoxRepository;", "", "()V", "CASHBOX_EXPIRED_FIRST_TIMEOUT_MILLIS", "", "CASHBOX_EXPIRED_TIMEOUT_MILLIS", "DISPOSE_DELAY_MILLIS", "TAG", "", "countingCache", "Lcom/iqoption/billing/repository/CashBoxRepository$CountingCash;", "cryptoDepositsSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getCryptoDepositsSupplier", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "cryptoDepositsSupplier$delegate", "Lkotlin/Lazy;", "mutatorProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lkotlin/Function1;", "Lcom/iqoption/billing/repository/CryptoDepositMutator;", "createCountingLiveStream", "Lcom/iqoption/core/microservices/billing/response/CashboxResult;", "sessionHost", "sessionId", "getCounting", "Lio/reactivex/Flowable;", "useCache", "", "getCryptoDeposits", "getPaymentStatus", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "refreshCashbox", "", "CountingArguments", "CountingCash", "billing_release"})
/* compiled from: CashBoxRepository.kt */
public final class a {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "cryptoDepositsSupplier", "getCryptoDepositsSupplier()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};
    private static final long ayS = TimeUnit.MINUTES.toMillis(20);
    private static final long ayT = TimeUnit.MINUTES.toMillis(30);
    private static final long ayU = TimeUnit.HOURS.toMillis(1);
    private static b ayV;
    private static final PublishProcessor<kotlin.jvm.a.b<List<com.iqoption.core.microservices.billing.response.crypto.a>, List<com.iqoption.core.microservices.billing.response.crypto.a>>> ayW;
    private static final kotlin.d ayX = g.c(CashBoxRepository$cryptoDepositsSupplier$2.azd);
    public static final a ayY = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, bng = {"Lcom/iqoption/billing/repository/CashBoxRepository$CountingArguments;", "", "sessionHost", "", "sessionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getSessionHost", "()Ljava/lang/String;", "getSessionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "billing_release"})
    /* compiled from: CashBoxRepository.kt */
    private static final class a {
        private final String ayZ;
        private final String qO;

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.qO, r3.qO) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.billing.repository.a.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.billing.repository.a.a) r3;
            r0 = r2.ayZ;
            r1 = r3.ayZ;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.qO;
            r3 = r3.qO;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.billing.repository.a$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.ayZ;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.qO;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CountingArguments(sessionHost=");
            stringBuilder.append(this.ayZ);
            stringBuilder.append(", sessionId=");
            stringBuilder.append(this.qO);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(String str, String str2) {
            kotlin.jvm.internal.i.f(str, "sessionHost");
            kotlin.jvm.internal.i.f(str2, "sessionId");
            this.ayZ = str;
            this.qO = str2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J%\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR-\u0010\u0004\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, bng = {"Lcom/iqoption/billing/repository/CashBoxRepository$CountingCash;", "", "arguments", "Lcom/iqoption/billing/repository/CashBoxRepository$CountingArguments;", "stream", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/billing/response/CashboxResult;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "(Lcom/iqoption/billing/repository/CashBoxRepository$CountingArguments;Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;)V", "getArguments", "()Lcom/iqoption/billing/repository/CashBoxRepository$CountingArguments;", "getStream", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "billing_release"})
    /* compiled from: CashBoxRepository.kt */
    private static final class b {
        private final a aza;
        private final com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.billing.response.c>, com.iqoption.core.microservices.billing.response.c> azb;

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.azb, r3.azb) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.billing.repository.a.b;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.billing.repository.a.b) r3;
            r0 = r2.aza;
            r1 = r3.aza;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.azb;
            r3 = r3.azb;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.billing.repository.a$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            a aVar = this.aza;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            com.iqoption.core.rx.a.a aVar2 = this.azb;
            if (aVar2 != null) {
                i = aVar2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CountingCash(arguments=");
            stringBuilder.append(this.aza);
            stringBuilder.append(", stream=");
            stringBuilder.append(this.azb);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(a aVar, com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.billing.response.c>, com.iqoption.core.microservices.billing.response.c> aVar2) {
            kotlin.jvm.internal.i.f(aVar, "arguments");
            kotlin.jvm.internal.i.f(aVar2, "stream");
            this.aza = aVar;
            this.azb = aVar2;
        }

        public final a Ky() {
            return this.aza;
        }

        public final com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.billing.response.c>, com.iqoption.core.microservices.billing.response.c> Kz() {
            return this.azb;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/billing/response/CashboxResult;", "it", "", "apply", "(Ljava/lang/Long;)Lio/reactivex/Single;"})
    /* compiled from: CashBoxRepository.kt */
    static final class c<T, R> implements g<T, t<? extends R>> {
        final /* synthetic */ p azc;

        c(p pVar) {
            this.azc = pVar;
        }

        /* renamed from: l */
        public final p<com.iqoption.core.microservices.billing.response.c> apply(Long l) {
            kotlin.jvm.internal.i.f(l, "it");
            return this.azc;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "newDeposits", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CashBoxRepository.kt */
    static final class d<T> implements f<List<? extends com.iqoption.core.microservices.billing.response.crypto.a>> {
        public static final d azg = new d();

        d() {
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.billing.response.crypto.a> list) {
            a.ayW.onNext(new CashBoxRepository$refreshCashbox$1$1(list));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CashBoxRepository.kt */
    static final class e<T> implements f<Throwable> {
        public static final e azh = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.billing.response.crypto.a>>, List<com.iqoption.core.microservices.billing.response.crypto.a>> Kv() {
        kotlin.d dVar = ayX;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    static {
        String simpleName = a.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "CashBoxRepository::class.java.simpleName");
        TAG = simpleName;
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<CryptoDepositMutator>()");
        ayW = bmK;
    }

    private a() {
    }

    public final io.reactivex.e<com.iqoption.core.microservices.billing.response.c> c(String str, String str2, boolean z) {
        kotlin.jvm.internal.i.f(str, "sessionHost");
        kotlin.jvm.internal.i.f(str2, "sessionId");
        a aVar = new a(str, str2);
        b bVar = ayV;
        if (z) {
            if (kotlin.jvm.internal.i.y(bVar != null ? bVar.Ky() : null, aVar)) {
                return bVar.Kz().ako();
            }
        }
        com.iqoption.core.rx.a.a Z = Z(str, str2);
        ayV = new b(aVar, Z);
        return Z.ako();
    }

    public final p<com.iqoption.core.microservices.billing.response.failure.a> ev(String str) {
        kotlin.jvm.internal.i.f(str, "sessionId");
        return com.iqoption.core.microservices.billing.a.bmi.ak(str, com.iqoption.core.d.getLocale());
    }

    private final com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.billing.response.c>, com.iqoption.core.microservices.billing.response.c> Z(String str, String str2) {
        p a = com.iqoption.core.microservices.billing.a.a(com.iqoption.core.microservices.billing.a.bmi, str, str2, false, 4, null);
        io.reactivex.e c = a.bkO().c((org.a.b) io.reactivex.e.a(ayT, ayU, TimeUnit.MILLISECONDS).f((g) new c(a)));
        kotlin.jvm.internal.i.e(c, "init.concatWith(updates)");
        return ac.bkp.a("CashBox", c, ayS, TimeUnit.MILLISECONDS);
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.billing.response.crypto.a>> Kw() {
        return Kv().ako();
    }

    public final void Kx() {
        d.azu.KD();
        com.iqoption.core.microservices.billing.a.bmi.Zu().h(com.iqoption.core.rx.i.aki()).a((f) d.azg, (f) e.azh);
    }
}
