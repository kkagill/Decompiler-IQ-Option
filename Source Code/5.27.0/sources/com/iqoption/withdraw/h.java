package com.iqoption.withdraw;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import com.iqoption.core.microservices.withdraw.response.o;
import com.iqoption.core.util.z;
import io.reactivex.p;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/withdraw/WithdrawRepository;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getCardsAndPayoutMethods", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "withdrawHistory", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "withdraw_release"})
/* compiled from: WithdrawRepository.kt */
public final class h {
    private static final String TAG;
    public static final h epl = new h();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "kotlin.jvm.PlatformType", "billingSession", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "apply"})
    /* compiled from: WithdrawRepository.kt */
    static final class a<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        public static final a epm = new a();

        a() {
        }

        /* renamed from: b */
        public final p<i> apply(com.iqoption.core.microservices.billing.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "billingSession");
            return p.a(com.iqoption.core.microservices.withdraw.a.bDL.aq(com.iqoption.billing.a.Kh(), aVar.Zx()), com.iqoption.core.microservices.withdraw.a.bDL.ajv(), com.iqoption.core.microservices.withdraw.a.bDL.ajw(), com.iqoption.core.data.repository.a.bds.WN().bkV().q(AnonymousClass1.epn), AnonymousClass2.epp).q(AnonymousClass3.epq);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "it", "apply"})
    /* compiled from: WithdrawRepository.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        public static final b eps = new b();

        b() {
        }

        /* renamed from: a */
        public final z<i> apply(i iVar) {
            kotlin.jvm.internal.i.f(iVar, "it");
            return z.bRg.bX(iVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawRepositoryMethodsData;", "it", "", "apply"})
    /* compiled from: WithdrawRepository.kt */
    static final class c<T, R> implements io.reactivex.b.g<Throwable, z<i>> {
        public static final c ept = new c();

        c() {
        }

        /* renamed from: M */
        public final z<i> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return z.bRg.any();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "it", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "apply"})
    /* compiled from: WithdrawRepository.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        public static final d epu = new d();

        d() {
        }

        /* renamed from: b */
        public final p<List<o>> apply(com.iqoption.core.microservices.billing.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return com.iqoption.core.microservices.withdraw.a.a(com.iqoption.core.microservices.withdraw.a.bDL, null, null, 3, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "payouts", "", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawPayout;", "currencies", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "apply"})
    /* compiled from: WithdrawRepository.kt */
    static final class e<T1, T2, R> implements io.reactivex.b.c<List<? extends o>, List<? extends com.iqoption.core.microservices.configuration.a.d>, l> {
        public static final e epv = new e();

        e() {
        }

        /* renamed from: n */
        public final l apply(List<o> list, List<com.iqoption.core.microservices.configuration.a.d> list2) {
            kotlin.jvm.internal.i.f(list, "payouts");
            kotlin.jvm.internal.i.f(list2, "currencies");
            Iterable<com.iqoption.core.microservices.configuration.a.d> iterable = list2;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (com.iqoption.core.microservices.configuration.a.d dVar : iterable) {
                arrayList.add(j.x(dVar.getName(), dVar));
            }
            return new l(list, af.ac((List) arrayList));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "it", "apply"})
    /* compiled from: WithdrawRepository.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f epw = new f();

        f() {
        }

        /* renamed from: a */
        public final z<l> apply(l lVar) {
            kotlin.jvm.internal.i.f(lVar, "it");
            return z.bRg.bX(lVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/withdraw/WithdrawalHistoryData;", "it", "", "apply"})
    /* compiled from: WithdrawRepository.kt */
    static final class g<T, R> implements io.reactivex.b.g<Throwable, z<l>> {
        public static final g epx = new g();

        g() {
        }

        /* renamed from: M */
        public final z<l> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return z.bRg.any();
        }
    }

    static {
        String name = h.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    private h() {
    }

    public final LiveData<z<i>> bbT() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.billing.repository.d.azu.Ki().f((io.reactivex.b.g) a.epm).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).g(b.eps).h(c.ept));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…ional.empty() }\n        )");
        return fromPublisher;
    }

    public final LiveData<z<l>> bbU() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(io.reactivex.e.a((org.a.b) com.iqoption.billing.repository.d.azu.Ki().f((io.reactivex.b.g) d.epu), (org.a.b) com.iqoption.core.data.repository.c.bdy.WS().bkV().bkO(), (io.reactivex.b.c) e.epv).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).g(f.epw).h(g.epx));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…ional.empty() }\n        )");
        return fromPublisher;
    }
}
