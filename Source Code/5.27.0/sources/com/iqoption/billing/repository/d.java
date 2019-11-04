package com.iqoption.billing.repository;

import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.processors.PublishProcessor;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00010\u00010\u0007X\u0004¢\u0006\u0002\n\u0000RO\u0010\t\u001a6\u0012\u0012\u0012\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u000b\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\nj\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f`\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, bng = {"Lcom/iqoption/billing/repository/SessionRepository;", "", "()V", "DISPOSE_DELAY_MILLIS", "", "SESSION_EXPIRED_TIMEOUT_MILLIS", "refreshProcessor", "Lio/reactivex/processors/PublishProcessor;", "kotlin.jvm.PlatformType", "sessionStream", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/billing/response/CreateSessionResult;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getSessionStream", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "sessionStream$delegate", "Lkotlin/Lazy;", "getSession", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "refreshSession", "", "billing_release"})
/* compiled from: SessionRepository.kt */
public final class d {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(d.class), "sessionStream", "getSessionStream()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};
    private static final long ayS = TimeUnit.MINUTES.toMillis(20);
    private static final long azr = TimeUnit.HOURS.toMillis(20);
    private static final PublishProcessor<Object> azs;
    private static final kotlin.d azt = g.c(SessionRepository$sessionStream$2.azx);
    public static final d azu = new d();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "it", "", "apply"})
    /* compiled from: SessionRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a azv = new a();

        a() {
        }

        /* renamed from: bz */
        public final com.iqoption.core.microservices.billing.response.a apply(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return com.iqoption.core.microservices.billing.response.b.Zy();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "it", "Lcom/iqoption/core/microservices/billing/response/CreateSessionResult;", "apply"})
    /* compiled from: SessionRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b azw = new b();

        b() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.billing.response.a apply(com.iqoption.core.microservices.billing.response.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return dVar.ZA();
        }
    }

    private final com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.billing.response.d>, com.iqoption.core.microservices.billing.response.d> KC() {
        kotlin.d dVar = azt;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    static {
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Any>()");
        azs = bmK;
    }

    private d() {
    }

    public final e<com.iqoption.core.microservices.billing.response.a> Ki() {
        c.azn.init();
        if (com.iqoption.core.d.EH().ej("billing-no-session")) {
            e<com.iqoption.core.microservices.billing.response.a> c = azs.cG("").g(a.azv).c(com.iqoption.core.rx.i.aki());
            kotlin.jvm.internal.i.e(c, "refreshProcessor.startWi…           .observeOn(bg)");
            return c;
        }
        e g = KC().ako().g(b.azw);
        kotlin.jvm.internal.i.e(g, "sessionStream.get().map { it.result }");
        return g;
    }

    public final void KD() {
        azs.onNext(new Object());
    }
}
