package com.iqoption.core.data.repository;

import com.iqoption.core.e;
import io.reactivex.b.f;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/iqoption/core/IQAccount;", "invoke"})
/* compiled from: BalanceRepository.kt */
final class BalanceRepository$balancesStream$2$streamFactory$1 extends Lambda implements b<e, io.reactivex.e<List<? extends com.iqoption.core.microservices.internalbilling.a.b>>> {
    final /* synthetic */ io.reactivex.e $allUpdates;
    final /* synthetic */ io.reactivex.e $initial;
    final /* synthetic */ AtomicReference $list;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/internalbilling/response/Balance;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: BalanceRepository.kt */
    /* renamed from: com.iqoption.core.data.repository.BalanceRepository$balancesStream$2$streamFactory$1$1 */
    static final class AnonymousClass1<T> implements f<List<? extends com.iqoption.core.microservices.internalbilling.a.b>> {
        final /* synthetic */ BalanceRepository$balancesStream$2$streamFactory$1 bdu;

        AnonymousClass1(BalanceRepository$balancesStream$2$streamFactory$1 balanceRepository$balancesStream$2$streamFactory$1) {
            this.bdu = balanceRepository$balancesStream$2$streamFactory$1;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.internalbilling.a.b> list) {
            this.bdu.$list.set(list);
        }
    }

    BalanceRepository$balancesStream$2$streamFactory$1(io.reactivex.e eVar, io.reactivex.e eVar2, AtomicReference atomicReference) {
        this.$initial = eVar;
        this.$allUpdates = eVar2;
        this.$list = atomicReference;
        super(1);
    }

    /* renamed from: a */
    public final io.reactivex.e<List<com.iqoption.core.microservices.internalbilling.a.b>> invoke(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "<anonymous parameter 0>");
        return this.$initial.c((org.a.b) this.$allUpdates).c((f) new AnonymousClass1(this));
    }
}
