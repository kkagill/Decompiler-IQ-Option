package com.iqoption.signals;

import androidx.annotation.MainThread;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.model.InstrumentType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.f;
import io.reactivex.g;
import io.reactivex.processors.PublishProcessor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/signals/SignalsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "newSignals", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/signals/SignalItem;", "getNewSignals", "()Landroidx/lifecycle/LiveData;", "newSignalsData", "Landroidx/lifecycle/MutableLiveData;", "signalFilterProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lcom/iqoption/signals/SignalFilter;", "kotlin.jvm.PlatformType", "state", "Lcom/iqoption/signals/SignalsViewState;", "getState", "stateData", "viewStateStream", "Lio/reactivex/Flowable;", "onCleared", "", "reload", "setFilter", "filter", "Companion", "signals_release"})
/* compiled from: SignalsViewModel.kt */
public final class r extends ViewModel {
    private static final String TAG = r.class.getName();
    public static final c dTN = new c();
    private final MutableLiveData<t> aKM;
    private final io.reactivex.disposables.a aqB = new io.reactivex.disposables.a();
    private final MutableLiveData<f> dTK = new MutableLiveData();
    private final io.reactivex.e<t> dTL;
    private final PublishProcessor<SignalFilter> dTM;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/signals/SignalsViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/signals/SignalsViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "Action", "signals_release"})
    /* compiled from: SignalsViewModel.kt */
    public static final class c {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/signals/SignalsViewModel$Companion$Action;", "", "()V", "SignalGenerated", "SignalsReloaded", "Lcom/iqoption/signals/SignalsViewModel$Companion$Action$SignalsReloaded;", "Lcom/iqoption/signals/SignalsViewModel$Companion$Action$SignalGenerated;", "signals_release"})
        /* compiled from: SignalsViewModel.kt */
        private static abstract class a {

            @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/signals/SignalsViewModel$Companion$Action$SignalGenerated;", "Lcom/iqoption/signals/SignalsViewModel$Companion$Action;", "signal", "Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "(Lcom/iqoption/core/microservices/pricemovements/response/Signal;)V", "getSignal", "()Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "signals_release"})
            /* compiled from: SignalsViewModel.kt */
            public static final class a extends a {
                private final com.iqoption.core.microservices.pricemovements.a.a dTf;

                public a(com.iqoption.core.microservices.pricemovements.a.a aVar) {
                    kotlin.jvm.internal.i.f(aVar, "signal");
                    super();
                    this.dTf = aVar;
                }

                public final com.iqoption.core.microservices.pricemovements.a.a aUd() {
                    return this.dTf;
                }
            }

            @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/signals/SignalsViewModel$Companion$Action$SignalsReloaded;", "Lcom/iqoption/signals/SignalsViewModel$Companion$Action;", "filter", "Lcom/iqoption/signals/SignalFilter;", "signals", "", "Lcom/iqoption/core/microservices/pricemovements/response/Signal;", "(Lcom/iqoption/signals/SignalFilter;Ljava/util/List;)V", "getFilter", "()Lcom/iqoption/signals/SignalFilter;", "getSignals", "()Ljava/util/List;", "signals_release"})
            /* compiled from: SignalsViewModel.kt */
            public static final class b extends a {
                private final SignalFilter dTX;
                private final List<com.iqoption.core.microservices.pricemovements.a.a> dTY;

                public b(SignalFilter signalFilter, List<com.iqoption.core.microservices.pricemovements.a.a> list) {
                    kotlin.jvm.internal.i.f(signalFilter, "filter");
                    kotlin.jvm.internal.i.f(list, "signals");
                    super();
                    this.dTX = signalFilter;
                    this.dTY = list;
                }

                public final SignalFilter aUr() {
                    return this.dTX;
                }

                public final List<com.iqoption.core.microservices.pricemovements.a.a> aUs() {
                    return this.dTY;
                }
            }

            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }
        }

        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }

        public final r E(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(r.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…alsViewModel::class.java]");
            return (r) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SignalsViewModel.kt */
    static final class d implements Runnable {
        final /* synthetic */ r dTO;

        d(r rVar) {
            this.dTO = rVar;
        }

        /* JADX WARNING: Missing block: B:3:0x0018, code skipped:
            if (r1 != null) goto L_0x001d;
     */
        public final void run() {
            /*
            r2 = this;
            r0 = r2.dTO;
            r0 = r0.dTM;
            r1 = r2.dTO;
            r1 = r1.aKM;
            r1 = r1.getValue();
            r1 = (com.iqoption.signals.t) r1;
            if (r1 == 0) goto L_0x001b;
        L_0x0014:
            r1 = r1.aUr();
            if (r1 == 0) goto L_0x001b;
        L_0x001a:
            goto L_0x001d;
        L_0x001b:
            r1 = com.iqoption.signals.SignalFilter.ALL;
        L_0x001d:
            r0.onNext(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.signals.r$d.run():void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SignalsViewModel.kt */
    static final class e implements Runnable {
        final /* synthetic */ r dTO;
        final /* synthetic */ SignalFilter dTZ;

        e(r rVar, SignalFilter signalFilter) {
            this.dTO = rVar;
            this.dTZ = signalFilter;
        }

        public final void run() {
            this.dTO.dTM.onNext(this.dTZ);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "subscriber", "Lio/reactivex/FlowableEmitter;", "Lcom/iqoption/signals/SignalsViewModel$Companion$Action;", "kotlin.jvm.PlatformType", "subscribe"})
    /* compiled from: SignalsViewModel.kt */
    /* renamed from: com.iqoption.signals.r$1 */
    static final class AnonymousClass1<T> implements g<T> {
        final /* synthetic */ r dTO;

        AnonymousClass1(r rVar) {
            this.dTO = rVar;
        }

        public final void a(final f<a> fVar) {
            kotlin.jvm.internal.i.f(fVar, "subscriber");
            this.dTO.aqB.e(this.dTO.dTM.blb().c(com.iqoption.core.rx.i.aki()).g(AnonymousClass1.dTP).a((io.reactivex.b.f) new io.reactivex.b.f<b>() {
                /* renamed from: a */
                public final void accept(b bVar) {
                    fVar.onNext(bVar);
                }
            }, (io.reactivex.b.f) AnonymousClass3.dTR));
            this.dTO.dTM.onNext(SignalFilter.ALL);
            this.dTO.aqB.e(com.iqoption.core.microservices.pricemovements.a.bxh.agt().g(AnonymousClass4.dTS).c(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new io.reactivex.b.f<a>() {
                /* renamed from: a */
                public final void accept(a aVar) {
                    fVar.onNext(aVar);
                }
            }, (io.reactivex.b.f) AnonymousClass6.dTT));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/signals/SignalsViewState;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/signals/SignalsViewModel$4$1"})
    /* compiled from: SignalsViewModel.kt */
    static final class a<T> implements io.reactivex.b.f<t> {
        final /* synthetic */ r dTO;

        a(r rVar) {
            this.dTO = rVar;
        }

        /* renamed from: b */
        public final void accept(t tVar) {
            this.dTO.aKM.setValue(tVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: SignalsViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<Throwable> {
        public static final b dTW = new b();

        b() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public static final r E(FragmentActivity fragmentActivity) {
        return dTN.E(fragmentActivity);
    }

    public r() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(t.dUb.aUx());
        this.aKM = mutableLiveData;
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<SignalFilter>()");
        this.dTM = bmK;
        final AtomicReference atomicReference = new AtomicReference();
        io.reactivex.e d = io.reactivex.e.a((org.a.b) io.reactivex.e.a((g) new AnonymousClass1(this), BackpressureStrategy.LATEST), (org.a.b) com.iqoption.asset.b.a.awZ.JQ(), (io.reactivex.b.c) AnonymousClass2.dTU).k(new io.reactivex.b.g<T, org.a.b<? extends R>>(this) {
            final /* synthetic */ r dTO;

            /* renamed from: g */
            public final io.reactivex.e<t> apply(Pair<? extends a, ? extends Map<InstrumentType, ? extends Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>> pair) {
                kotlin.jvm.internal.i.f(pair, "it");
                a aVar = (a) pair.getFirst();
                Map map = (Map) pair.bni();
                t tVar;
                if (aVar instanceof b) {
                    b bVar = (b) aVar;
                    tVar = new t(bVar.aUr(), bVar.aUs(), map);
                    atomicReference.set(tVar);
                    return io.reactivex.e.cD(tVar);
                } else if (aVar instanceof a) {
                    tVar = (t) atomicReference.get();
                    if (tVar == null) {
                        return io.reactivex.e.bkQ();
                    }
                    Object obj;
                    com.iqoption.core.microservices.tradingengine.response.active.a aVar2;
                    a aVar3 = (a) aVar;
                    int activeId = aVar3.aUd().getActiveId();
                    Iterator it = map.values().iterator();
                    do {
                        aVar2 = null;
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                    } while (!((Map) obj).containsKey(Integer.valueOf(activeId)));
                    Map map2 = (Map) obj;
                    if (map2 != null) {
                        aVar2 = (com.iqoption.core.microservices.tradingengine.response.active.a) map2.get(Integer.valueOf(activeId));
                    }
                    if (aVar2 != null) {
                        this.dTO.dTK.postValue(t.dUb.a(aVar3.aUd(), aVar2));
                    }
                    t a = tVar.a(aVar3.aUd(), map);
                    atomicReference.set(a);
                    return io.reactivex.e.cD(a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }).c(com.iqoption.core.rx.i.akj()).d(com.iqoption.core.rx.i.aki());
        this.aqB.e(d.a((io.reactivex.b.f) new a(this), (io.reactivex.b.f) b.dTW));
        kotlin.jvm.internal.i.e(d, "Flowable.combineLatest(F…    }))\n                }");
        this.dTL = d;
    }

    public final LiveData<t> getState() {
        return this.aKM;
    }

    public final LiveData<f> aUq() {
        return this.dTK;
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.aqB.clear();
    }

    @MainThread
    public final void b(SignalFilter signalFilter) {
        kotlin.jvm.internal.i.f(signalFilter, "filter");
        t tVar = (t) this.aKM.getValue();
        Object obj = null;
        if (signalFilter != (tVar != null ? tVar.aUr() : null)) {
            MutableLiveData mutableLiveData = this.aKM;
            t tVar2 = (t) mutableLiveData.getValue();
            if (tVar2 != null) {
                obj = tVar2.d(signalFilter);
            }
            mutableLiveData.setValue(obj);
            com.iqoption.core.rx.i.aki().m(new e(this, signalFilter));
        }
    }

    @MainThread
    public final void reload() {
        com.iqoption.core.rx.i.aki().m(new d(this));
    }
}
