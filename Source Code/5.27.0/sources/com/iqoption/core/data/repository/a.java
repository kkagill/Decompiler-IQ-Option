package com.iqoption.core.data.repository;

import com.iqoption.core.microservices.internalbilling.a.b;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0013J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00142\u0006\u0010\u0015\u001a\u00020\u0016Rs\u0010\u0003\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0004j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006`\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/data/repository/BalanceRepository;", "", "()V", "balancesStream", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getBalancesStream", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "balancesStream$delegate", "Lkotlin/Lazy;", "getBalance", "Lio/reactivex/Maybe;", "id", "", "getBalances", "Lio/reactivex/Flowable;", "Lio/reactivex/Single;", "type", "", "core_release"})
/* compiled from: BalanceRepository.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "balancesStream", "getBalancesStream()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};
    private static final d bdr = g.c(BalanceRepository$balancesStream$2.bdt);
    public static final a bds = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: BalanceRepository.kt */
    static final class a<T, R> implements g<T, io.reactivex.k<? extends R>> {
        final /* synthetic */ long aCI;

        a(long j) {
            this.aCI = j;
        }

        /* renamed from: ar */
        public final io.reactivex.i<b> apply(List<b> list) {
            kotlin.jvm.internal.i.f(list, "it");
            for (Object next : list) {
                Object obj;
                if (((b) next).getId() == this.aCI) {
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
            b bVar = (b) next2;
            if (bVar != null) {
                return io.reactivex.i.cH(bVar);
            }
            return io.reactivex.i.bld();
        }
    }

    private final com.iqoption.core.rx.a.a<z<List<b>>, List<b>> WM() {
        d dVar = bdr;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    private a() {
    }

    public final e<List<b>> WN() {
        return WM().ako();
    }

    public final io.reactivex.i<b> aI(long j) {
        io.reactivex.i m = WM().ako().bkU().m(new a(j));
        kotlin.jvm.internal.i.e(m, "balancesStream.get()\n   …      }\n                }");
        return m;
    }
}
