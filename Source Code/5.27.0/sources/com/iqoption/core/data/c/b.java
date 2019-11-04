package com.iqoption.core.data.c;

import com.google.android.gms.common.Scopes;
import io.reactivex.b.g;
import io.reactivex.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/data/mediators/BalanceMediator;", "", "()V", "NOT_EMPTY_PREDICATE", "Lio/reactivex/functions/Predicate;", "Lcom/iqoption/core/data/mediators/BalanceData;", "observeBalances", "Lio/reactivex/Flowable;", "", "observeRealBalance", "observeSelectedBalance", "observeSelectedBalanceId", "", "selectBalance", "Lio/reactivex/Completable;", "balance", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "core_release"})
/* compiled from: BalanceMediator.kt */
public final class b {
    private static final l<a> bcR = a.bcT;
    public static final b bcS = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "balanceData", "Lcom/iqoption/core/data/mediators/BalanceData;", "test"})
    /* compiled from: BalanceMediator.kt */
    static final class a<T> implements l<a> {
        public static final a bcT = new a();

        a() {
        }

        /* renamed from: a */
        public final boolean test(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "balanceData");
            return kotlin.jvm.internal.i.y(aVar, a.bcQ.VP()) ^ 1;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/data/mediators/BalanceData;", "balances", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "currencies", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "apply"})
    /* compiled from: BalanceMediator.kt */
    static final class b<T1, T2, R> implements io.reactivex.b.c<List<? extends com.iqoption.core.microservices.internalbilling.a.b>, List<? extends com.iqoption.core.microservices.configuration.a.d>, List<? extends a>> {
        public static final b bcU = new b();

        b() {
        }

        /* renamed from: f */
        public final List<a> apply(List<com.iqoption.core.microservices.internalbilling.a.b> list, List<com.iqoption.core.microservices.configuration.a.d> list2) {
            List<com.iqoption.core.microservices.internalbilling.a.b> list3 = list;
            List<com.iqoption.core.microservices.configuration.a.d> list4 = list2;
            kotlin.jvm.internal.i.f(list3, "balances");
            kotlin.jvm.internal.i.f(list4, "currencies");
            Collection arrayList = new ArrayList();
            for (com.iqoption.core.microservices.internalbilling.a.b bVar : list3) {
                Object obj;
                Object obj2;
                Iterator it = list4.iterator();
                do {
                    obj2 = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                } while (!kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.configuration.a.d) obj).getName(), bVar.getCurrency()));
                com.iqoption.core.microservices.configuration.a.d dVar = (com.iqoption.core.microservices.configuration.a.d) obj;
                if (dVar != null) {
                    boolean z = true;
                    if (bVar.getType() != 1) {
                        z = false;
                    }
                    obj2 = new a(bVar, dVar, z, com.iqoption.core.util.e.a(bVar.aeo(), dVar.getMinorUnits(), dVar.getMask(), false, false, null, 28, null));
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            return (List) arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/mediators/BalanceData;", "balances", "", "apply"})
    /* compiled from: BalanceMediator.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c bcV = new c();

        c() {
        }

        /* renamed from: ao */
        public final a apply(List<a> list) {
            kotlin.jvm.internal.i.f(list, "balances");
            for (Object next : list) {
                if (((a) next).isReal()) {
                    break;
                }
            }
            Object next2 = null;
            a aVar = (a) next2;
            return aVar != null ? aVar : a.bcQ.VP();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/mediators/BalanceData;", "balances", "", "balanceId", "", "apply"})
    /* compiled from: BalanceMediator.kt */
    static final class d<T1, T2, R> implements io.reactivex.b.c<List<? extends a>, Long, a> {
        public static final d bcW = new d();

        d() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return a((List) obj, ((Number) obj2).longValue());
        }

        public final a a(List<a> list, long j) {
            kotlin.jvm.internal.i.f(list, "balances");
            for (Object next : list) {
                Object obj;
                if (((a) next).VL().getId() == j) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            a aVar = (a) next2;
            return aVar != null ? aVar : a.bcQ.VP();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "profile", "Lcom/iqoption/core/IQAccount;", "apply"})
    /* compiled from: BalanceMediator.kt */
    static final class e<T, R> implements g<T, R> {
        public static final e bcX = new e();

        e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(b((com.iqoption.core.e) obj));
        }

        public final long b(com.iqoption.core.e eVar) {
            kotlin.jvm.internal.i.f(eVar, Scopes.PROFILE);
            return eVar.DH();
        }
    }

    private b() {
    }

    public final io.reactivex.e<List<a>> VQ() {
        io.reactivex.e a = io.reactivex.e.a((org.a.b) com.iqoption.core.data.repository.a.bds.WN(), (org.a.b) com.iqoption.core.data.repository.c.bdy.WS(), (io.reactivex.b.c) b.bcU);
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(\n…     }\n                })");
        return a;
    }

    private final io.reactivex.e<Long> VR() {
        io.reactivex.e bkT = com.iqoption.core.manager.i.bjd.Yi().g(e.bcX).bkT();
        kotlin.jvm.internal.i.e(bkT, "AuthManager.account\n    …  .distinctUntilChanged()");
        return bkT;
    }

    public final io.reactivex.e<a> VS() {
        io.reactivex.e bkT = io.reactivex.e.a((org.a.b) VQ(), (org.a.b) VR(), (io.reactivex.b.c) d.bcW).b(bcR).bkT();
        kotlin.jvm.internal.i.e(bkT, "Flowable.combineLatest(\n…  .distinctUntilChanged()");
        return bkT;
    }

    public final io.reactivex.e<a> VT() {
        io.reactivex.e bkT = VQ().g(c.bcV).b(bcR).bkT();
        kotlin.jvm.internal.i.e(bkT, "observeBalances()\n      …  .distinctUntilChanged()");
        return bkT;
    }
}
