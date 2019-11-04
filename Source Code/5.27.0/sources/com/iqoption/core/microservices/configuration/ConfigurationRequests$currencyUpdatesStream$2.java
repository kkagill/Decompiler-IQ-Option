package com.iqoption.core.microservices.configuration;

import com.iqoption.core.microservices.configuration.a.d;
import io.reactivex.b.g;
import io.reactivex.b.l;
import io.reactivex.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0001\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u0002 \u0005*F\u0012@\u0012>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "kotlin.jvm.PlatformType", "", "invoke"})
/* compiled from: ConfigurationRequests.kt */
final class ConfigurationRequests$currencyUpdatesStream$2 extends Lambda implements kotlin.jvm.a.a<e<List<com.iqoption.core.microservices.b<d>>>> {
    public static final ConfigurationRequests$currencyUpdatesStream$2 brm = new ConfigurationRequests$currencyUpdatesStream$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "it", "apply"})
    /* compiled from: ConfigurationRequests.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a bro = new a();

        a() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.b<d> apply(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return new com.iqoption.core.microservices.b(1, dVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "it", "apply"})
    /* compiled from: ConfigurationRequests.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b brp = new b();

        b() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.b<d> apply(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return new com.iqoption.core.microservices.b(3, dVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "it", "apply"})
    /* compiled from: ConfigurationRequests.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c brq = new c();

        c() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.b<d> apply(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return new com.iqoption.core.microservices.b(2, dVar);
        }
    }

    ConfigurationRequests$currencyUpdatesStream$2() {
        super(0);
    }

    /* renamed from: abK */
    public final e<List<com.iqoption.core.microservices.b<d>>> invoke() {
        kotlin.jvm.internal.i.e(com.iqoption.core.d.EW().b("currency-created", d.class).HO().HQ().g(a.bro), "eventBuilderFactory\n    …Event.TYPE_CREATED, it) }");
        kotlin.jvm.internal.i.e(com.iqoption.core.d.EW().b("currency-updated", d.class).HO().HQ().g(c.brq), "eventBuilderFactory\n    …Event.TYPE_UPDATED, it) }");
        kotlin.jvm.internal.i.e(com.iqoption.core.d.EW().b("currency-deleted", d.class).HO().HQ().g(b.brp), "eventBuilderFactory\n    …Event.TYPE_DELETED, it) }");
        return e.H(m.listOf(r0, r1, r2)).h(5, TimeUnit.SECONDS).b((l) AnonymousClass1.brn).blb();
    }
}
