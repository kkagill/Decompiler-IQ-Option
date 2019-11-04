package com.iqoption.alerts.data;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.useralerts.response.AssetAlertChanged;
import com.iqoption.core.util.z;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0001j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003`\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "kotlin.jvm.PlatformType", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "invoke"})
/* compiled from: AlertsRepository.kt */
final class AlertsRepository$alertsStreamSupplier$2 extends Lambda implements kotlin.jvm.a.a<com.iqoption.core.rx.a.a<z<List<? extends com.iqoption.core.microservices.useralerts.response.a>>, List<? extends com.iqoption.core.microservices.useralerts.response.a>>> {
    public static final AlertsRepository$alertsStreamSupplier$2 aoc = new AlertsRepository$alertsStreamSupplier$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "it", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert$Response;", "apply"})
    /* compiled from: AlertsRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a aod = new a();

        a() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.useralerts.response.a> apply(com.iqoption.core.microservices.useralerts.response.a.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.ajd();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lkotlin/Function1;", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "event", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlertChanged;", "apply"})
    /* compiled from: AlertsRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b aoe = new b();

        b() {
        }

        /* renamed from: a */
        public final kotlin.jvm.a.b<List<? extends com.iqoption.core.microservices.useralerts.response.a>, List<com.iqoption.core.microservices.useralerts.response.a>> apply(AssetAlertChanged assetAlertChanged) {
            kotlin.jvm.internal.i.f(assetAlertChanged, "event");
            return new AlertsRepository$alertsStreamSupplier$2$stream$2$1(assetAlertChanged);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "kotlin.jvm.PlatformType", "list", "mutator", "Lkotlin/Function1;", "apply"})
    /* compiled from: AlertsRepository.kt */
    static final class c<T1, T2, R> implements io.reactivex.b.c<R, T, R> {
        public static final c aof = new c();

        c() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.useralerts.response.a> apply(List<? extends com.iqoption.core.microservices.useralerts.response.a> list, kotlin.jvm.a.b<? super List<? extends com.iqoption.core.microservices.useralerts.response.a>, ? extends List<? extends com.iqoption.core.microservices.useralerts.response.a>> bVar) {
            kotlin.jvm.internal.i.f(list, "list");
            kotlin.jvm.internal.i.f(bVar, "mutator");
            return (List) bVar.invoke(list);
        }
    }

    AlertsRepository$alertsStreamSupplier$2() {
        super(0);
    }

    /* renamed from: AX */
    public final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.useralerts.response.a>>, List<com.iqoption.core.microservices.useralerts.response.a>> invoke() {
        e bkO = com.iqoption.core.microservices.useralerts.a.a(com.iqoption.core.microservices.useralerts.a.bCX, null, null, 3, null).t(a.aod).bkO();
        kotlin.jvm.internal.i.e(bkO, "UserAlertsRequests.getAl…            .toFlowable()");
        e a = com.iqoption.core.rx.g.f(bkO).c((org.a.b) com.iqoption.core.microservices.useralerts.a.a(com.iqoption.core.microservices.useralerts.a.bCX, 0, 1, null).g(b.aoe)).a(m.emptyList(), (io.reactivex.b.c) c.aof);
        kotlin.jvm.internal.i.e(a, "UserAlertsRequests.getAl…r(list)\n                }");
        return ac.a(ac.bkp, "Alerts", a, 0, null, 12, null);
    }
}
