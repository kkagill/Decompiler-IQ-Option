package com.iqoption.core.data.repository;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.manager.ac;
import com.iqoption.core.util.z;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0013J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0013J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00142\u0006\u0010\u0019\u001a\u00020\u001aJC\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\u001e0\u001c\"\u0004\b\u0000\u0010\u001f\"\u000e\b\u0001\u0010\u001d*\b\u0012\u0004\u0012\u0002H\u001f0 2\u0006\u0010\u0015\u001a\u0002H\u001fH\u0002¢\u0006\u0002\u0010!JN\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\u00060\u0013\"\f\b\u0000\u0010\u001d*\u0006\u0012\u0002\b\u00030 2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\u00060\u00112\u0018\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0%0\u00060\u0013Jh\u0010&\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\u00060\u0004\"\f\b\u0000\u0010\u001d*\u0006\u0012\u0002\b\u00030 2\u0006\u0010'\u001a\u00020\u001a2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\u00060\u00112\u0018\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0%0\u00060\u0013R9\u0010\u0003\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR9\u0010\f\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\t¨\u0006("}, bng = {"Lcom/iqoption/core/data/repository/GeneralRepository;", "", "()V", "countriesStreamSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "getCountriesStreamSupplier", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "countriesStreamSupplier$delegate", "Lkotlin/Lazy;", "currenciesStream", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "getCurrenciesStream", "currenciesStream$delegate", "getCountriesHttp", "Lio/reactivex/Single;", "getCountry", "Lio/reactivex/Flowable;", "Lio/reactivex/Maybe;", "id", "", "getCurrencies", "getCurrency", "name", "", "makeByIdMaybeMapper", "Lio/reactivex/functions/Function;", "T", "Lio/reactivex/MaybeSource;", "ID", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "(Ljava/lang/Object;)Lio/reactivex/functions/Function;", "makeStream", "initialRequest", "updatesStream", "Lcom/iqoption/core/microservices/Event;", "makeStreamSupplier", "tag", "core_release"})
/* compiled from: GeneralRepository.kt */
public final class c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(c.class), "countriesStreamSupplier", "getCountriesStreamSupplier()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;")), k.a(new PropertyReference1Impl(k.G(c.class), "currenciesStream", "getCurrenciesStream()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};
    private static final kotlin.d bdw = g.c(GeneralRepository$countriesStreamSupplier$2.bdz);
    private static final kotlin.d bdx = g.c(GeneralRepository$currenciesStream$2.bdA);
    public static final c bdy = new c();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "currencies", "", "apply"})
    /* compiled from: GeneralRepository.kt */
    static final class a<T, R> implements g<T, R> {
        final /* synthetic */ String $name;

        a(String str) {
            this.$name = str;
        }

        /* renamed from: as */
        public final z<com.iqoption.core.microservices.configuration.a.d> apply(List<com.iqoption.core.microservices.configuration.a.d> list) {
            kotlin.jvm.internal.i.f(list, "currencies");
            com.iqoption.core.util.z.a aVar = z.bRg;
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.configuration.a.d) next).getName(), this.$name)) {
                    break;
                }
            }
            Object next2 = null;
            return aVar.bX(next2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0004\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lio/reactivex/MaybeSource;", "T", "kotlin.jvm.PlatformType", "ID", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "it", "", "apply"})
    /* compiled from: GeneralRepository.kt */
    static final class b<T, R> implements g<List<? extends T>, io.reactivex.k<T>> {
        final /* synthetic */ Object bdB;

        b(Object obj) {
            this.bdB = obj;
        }

        /* renamed from: at */
        public final io.reactivex.k<T> apply(List<? extends T> list) {
            kotlin.jvm.internal.i.f(list, "it");
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.ui.widget.recyclerview.adapter.a.d) next).getId(), this.bdB)) {
                    break;
                }
            }
            Object next2 = null;
            com.iqoption.core.ui.widget.recyclerview.adapter.a.d dVar = (com.iqoption.core.ui.widget.recyclerview.adapter.a.d) next2;
            if (dVar != null) {
                return io.reactivex.i.cH(dVar);
            }
            return io.reactivex.i.bld();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0006*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "T", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: GeneralRepository.kt */
    static final class c<T> implements f<List<? extends T>> {
        final /* synthetic */ AtomicReference $list;

        c(AtomicReference atomicReference) {
            this.$list = atomicReference;
        }

        /* renamed from: v */
        public final void accept(List<? extends T> list) {
            this.$list.set(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "T", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "events", "", "Lcom/iqoption/core/microservices/Event;", "apply"})
    /* compiled from: GeneralRepository.kt */
    static final class d<T, R> implements g<T, R> {
        final /* synthetic */ AtomicReference $list;

        d(AtomicReference atomicReference) {
            this.$list = atomicReference;
        }

        public final List<T> apply(List<com.iqoption.core.microservices.b<T>> list) {
            kotlin.jvm.internal.i.f(list, "events");
            Object obj = this.$list.get();
            kotlin.jvm.internal.i.e(obj, "list.get()");
            List<com.iqoption.core.ui.widget.recyclerview.adapter.a.d> I = u.I((Collection) obj);
            for (com.iqoption.core.microservices.b bVar : list) {
                int type = bVar.getType();
                int i = 0;
                com.iqoption.core.ui.widget.recyclerview.adapter.a.d dVar;
                if (type == 1) {
                    com.iqoption.core.ui.widget.recyclerview.adapter.a.d dVar2 = (com.iqoption.core.ui.widget.recyclerview.adapter.a.d) bVar.getData();
                    for (com.iqoption.core.ui.widget.recyclerview.adapter.a.d id : I) {
                        if (kotlin.jvm.internal.i.y(id.getId(), dVar2.getId())) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        I.add(bVar.getData());
                    }
                } else if (type == 2) {
                    dVar = (com.iqoption.core.ui.widget.recyclerview.adapter.a.d) bVar.getData();
                    for (com.iqoption.core.ui.widget.recyclerview.adapter.a.d id2 : I) {
                        if (kotlin.jvm.internal.i.y(id2.getId(), dVar.getId())) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        I.add(dVar);
                    } else {
                        I.set(i, dVar);
                    }
                } else if (type == 3) {
                    dVar = (com.iqoption.core.ui.widget.recyclerview.adapter.a.d) bVar.getData();
                    for (com.iqoption.core.ui.widget.recyclerview.adapter.a.d id22 : I) {
                        if (kotlin.jvm.internal.i.y(id22.getId(), dVar.getId())) {
                            break;
                        }
                        i++;
                    }
                    i = -1;
                    if (i != -1) {
                        I.remove(i);
                    }
                }
            }
            return I;
        }
    }

    private final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.configuration.a.c>>, List<com.iqoption.core.microservices.configuration.a.c>> WO() {
        kotlin.d dVar = bdw;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    private final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.configuration.a.d>>, List<com.iqoption.core.microservices.configuration.a.d>> WR() {
        kotlin.d dVar = bdx;
        j jVar = anY[1];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    private c() {
    }

    public final <T extends com.iqoption.core.ui.widget.recyclerview.adapter.a.d<?>> com.iqoption.core.rx.a.a<z<List<T>>, List<T>> a(String str, p<List<T>> pVar, e<List<com.iqoption.core.microservices.b<T>>> eVar) {
        kotlin.jvm.internal.i.f(str, "tag");
        kotlin.jvm.internal.i.f(pVar, "initialRequest");
        kotlin.jvm.internal.i.f(eVar, "updatesStream");
        return ac.a(ac.bkp, str, a(pVar, eVar), 0, null, 12, null);
    }

    public final <T extends com.iqoption.core.ui.widget.recyclerview.adapter.a.d<?>> e<List<T>> a(p<List<T>> pVar, e<List<com.iqoption.core.microservices.b<T>>> eVar) {
        kotlin.jvm.internal.i.f(pVar, "initialRequest");
        kotlin.jvm.internal.i.f(eVar, "updatesStream");
        AtomicReference atomicReference = new AtomicReference(m.emptyList());
        e bkO = pVar.bkO();
        e g = eVar.g(new d(atomicReference));
        kotlin.jvm.internal.i.e(g, "updatesStream\n          …mutable\n                }");
        bkO = bkO.c((org.a.b) g).c((f) new c(atomicReference));
        kotlin.jvm.internal.i.e(bkO, "initial.concatWith(updat…doOnNext { list.set(it) }");
        return bkO;
    }

    private final <ID, T extends com.iqoption.core.ui.widget.recyclerview.adapter.a.d<ID>> g<List<T>, io.reactivex.k<T>> bI(ID id) {
        return new b(id);
    }

    public final p<List<com.iqoption.core.microservices.configuration.a.c>> WP() {
        return com.iqoption.core.microservices.configuration.a.brg.WP();
    }

    public final e<List<com.iqoption.core.microservices.configuration.a.c>> WQ() {
        return WO().ako();
    }

    public final io.reactivex.i<com.iqoption.core.microservices.configuration.a.c> aJ(long j) {
        io.reactivex.i m = WO().ako().bkU().m(bI(Long.valueOf(j)));
        kotlin.jvm.internal.i.e(m, "countriesStreamSupplier.…(makeByIdMaybeMapper(id))");
        return m;
    }

    public final e<List<com.iqoption.core.microservices.configuration.a.d>> WS() {
        return WR().ako();
    }

    public final io.reactivex.i<z<com.iqoption.core.microservices.configuration.a.d>> fO(String str) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        io.reactivex.i p = WR().ako().bkU().p(new a(str));
        kotlin.jvm.internal.i.e(p, "currenciesStream.get()\n …name })\n                }");
        return p;
    }
}
