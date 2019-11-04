package com.iqoption.billing.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.billing.response.d;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.p;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import org.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a6\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001j\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003`\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/billing/response/CreateSessionResult;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: SessionRepository.kt */
final class SessionRepository$sessionStream$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.rx.a.a<z<d>, d>> {
    public static final SessionRepository$sessionStream$2 azx = new SessionRepository$sessionStream$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/billing/response/CreateSessionResult;", "it", "", "apply"})
    /* compiled from: SessionRepository.kt */
    static final class a<T, R> implements g<T, t<? extends R>> {
        public static final a azy = new a();

        a() {
        }

        /* renamed from: bA */
        public final p<d> apply(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return com.iqoption.core.microservices.billing.a.bmi.Zr();
        }
    }

    SessionRepository$sessionStream$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<d>, d> invoke() {
        e c = com.iqoption.core.microservices.billing.a.bmi.Zr().bkO().c((b) d.azs.d((b) e.a(d.azr, d.azr, TimeUnit.MILLISECONDS)).c(com.iqoption.core.rx.i.aki()).f((g) a.azy));
        kotlin.jvm.internal.i.e(c, "init.concatWith(updates)");
        return ac.bkp.a("CashBox session", c, d.ayS, TimeUnit.MILLISECONDS);
    }
}
