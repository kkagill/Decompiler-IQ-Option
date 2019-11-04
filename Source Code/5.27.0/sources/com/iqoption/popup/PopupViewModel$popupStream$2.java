package com.iqoption.popup;

import io.reactivex.b.g;
import io.reactivex.b.l;
import io.reactivex.e;
import io.reactivex.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "invoke"})
/* compiled from: PopupViewModel.kt */
final class PopupViewModel$popupStream$2 extends Lambda implements kotlin.jvm.a.a<e<List<? extends com.iqoption.core.microservices.popupserver.response.a>>> {
    final /* synthetic */ c this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "it", "apply"})
    /* compiled from: PopupViewModel.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a dKS = new a();

        a() {
        }

        /* renamed from: o */
        public final com.iqoption.core.microservices.b<com.iqoption.core.microservices.popupserver.response.a> apply(com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return new com.iqoption.core.microservices.b(1, aVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "it", "apply"})
    /* compiled from: PopupViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b dKT = new b();

        b() {
        }

        /* renamed from: o */
        public final com.iqoption.core.microservices.b<com.iqoption.core.microservices.popupserver.response.a> apply(com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return new com.iqoption.core.microservices.b(3, aVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/Event;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "it", "apply"})
    /* compiled from: PopupViewModel.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c dKU = new c();

        c() {
        }

        /* renamed from: o */
        public final com.iqoption.core.microservices.b<com.iqoption.core.microservices.popupserver.response.a> apply(com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return new com.iqoption.core.microservices.b(3, aVar);
        }
    }

    PopupViewModel$popupStream$2(c cVar) {
        this.this$0 = cVar;
        super(0);
    }

    /* renamed from: abK */
    public final e<List<com.iqoption.core.microservices.popupserver.response.a>> invoke() {
        kotlin.jvm.internal.i.e(com.iqoption.core.microservices.popupserver.a.bwG.agf().g(a.dKS), "PopupServerRequests.getP…Event.TYPE_CREATED, it) }");
        kotlin.jvm.internal.i.e(com.iqoption.core.microservices.popupserver.a.bwG.agg().g(c.dKU), "PopupServerRequests.getP…Event.TYPE_DELETED, it) }");
        kotlin.jvm.internal.i.e(this.this$0.dKE.g(b.dKT), "deleteSubject\n          …Event.TYPE_DELETED, it) }");
        com.iqoption.core.data.repository.c cVar = com.iqoption.core.data.repository.c.bdy;
        p age = com.iqoption.core.microservices.popupserver.a.bwG.age();
        e b = e.H(m.listOf(b, r1, r2)).h(1, TimeUnit.SECONDS).b((l) AnonymousClass1.dKR);
        kotlin.jvm.internal.i.e(b, "Flowable.merge(listOf(cr…ilter { it.isNotEmpty() }");
        return cVar.a("Popups", age, b).ako();
    }
}
