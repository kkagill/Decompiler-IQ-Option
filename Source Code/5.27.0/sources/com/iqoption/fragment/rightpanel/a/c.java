package com.iqoption.fragment.rightpanel.a;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.p;
import com.iqoption.mobbtech.connect.response.options.OptionEvents.q;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.b.h;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.t;
import java.util.List;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005H\u0007J\b\u0010&\u001a\u00020\u0018H\u0014J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010*\u001a\u00020\u0018R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00160\u00160\u0012X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00180\u00180\u0012X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiRightPanelViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "blockingCallPutButton", "Landroidx/lifecycle/LiveData;", "", "getBlockingCallPutButton", "()Landroidx/lifecycle/LiveData;", "blockingCallPutButtonData", "Landroidx/lifecycle/MutableLiveData;", "eventHandler", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiRightPanelViewModel$EventHandler;", "items", "", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapterItem;", "getItems", "itemsData", "processorActiveId", "Lio/reactivex/processors/PublishProcessor;", "", "kotlin.jvm.PlatformType", "processorOpenOptionGroup", "Lcom/iqoption/mobbtech/connect/response/options/OpenOptionGroup;", "processorTick", "", "tryShowFAQ", "getTryShowFAQ", "tryShowFAQdata", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "callRequest", "openOptionGroup", "strike", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "amount", "", "isCall", "onCleared", "postActiveId", "currentActiveId", "postOpenOptionGroup", "tick", "Companion", "EventHandler", "app_optionXRelease"})
/* compiled from: MultiSelectorViewModel.kt */
public final class c extends com.iqoption.core.ui.f.d {
    private static final String TAG = c.class.getSimpleName();
    public static final a dpX = new a();
    private final MutableLiveData<List<e>> apB = new MutableLiveData();
    private final LiveData<List<e>> apC = this.apB;
    private final MutableLiveData<Boolean> dpP = new MutableLiveData();
    private final LiveData<Boolean> dpQ = this.dpP;
    private final com.iqoption.core.data.b.b<l> dpR = new com.iqoption.core.data.b.b();
    private final LiveData<l> dpS = this.dpR;
    private final PublishProcessor<com.iqoption.mobbtech.connect.response.options.b> dpT;
    private final PublishProcessor<l> dpU;
    private final PublishProcessor<Integer> dpV;
    private final b dpW;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiRightPanelViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiRightPanelViewModel;", "f", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: MultiSelectorViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c ag(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragment);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(f)");
            ViewModel viewModel = of.get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (c) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapterItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: MultiSelectorViewModel.kt */
    /* renamed from: com.iqoption.fragment.rightpanel.a.c$2 */
    static final class AnonymousClass2<T> implements f<List<e>> {
        final /* synthetic */ c dpZ;

        AnonymousClass2(c cVar) {
            this.dpZ = cVar;
        }

        /* renamed from: v */
        public final void accept(List<e> list) {
            this.dpZ.apB.postValue(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: MultiSelectorViewModel.kt */
    /* renamed from: com.iqoption.fragment.rightpanel.a.c$3 */
    static final class AnonymousClass3<T> implements f<Throwable> {
        final /* synthetic */ c dpZ;

        AnonymousClass3(c cVar) {
            this.dpZ = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dpZ.apB.postValue(m.emptyList());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiRightPanelViewModel$EventHandler;", "Lcom/iqoption/system/event/EventHandlerBase;", "(Lcom/iqoption/fragment/rightpanel/multiselector/MultiRightPanelViewModel;)V", "onUpdateStarted", "", "event", "Lcom/iqoption/mobbtech/connect/response/options/OptionEvents$UpdateStated;", "onUpdateStoped", "Lcom/iqoption/mobbtech/connect/response/options/OptionEvents$UpdateEnded;", "app_optionXRelease"})
    /* compiled from: MultiSelectorViewModel.kt */
    private final class b extends com.iqoption.system.a.d {
        @com.google.common.b.e
        public final void onUpdateStarted(q qVar) {
            kotlin.jvm.internal.i.f(qVar, "event");
            c.this.dpP.postValue(Boolean.valueOf(true));
        }

        @com.google.common.b.e
        public final void onUpdateStoped(p pVar) {
            kotlin.jvm.internal.i.f(pVar, "event");
            com.iqoption.app.managers.c GS = com.iqoption.app.managers.c.GS();
            kotlin.jvm.internal.i.e(GS, "OptionManager.instance()");
            if (!GS.Hb()) {
                c.this.dpP.postValue(Boolean.valueOf(false));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/mobbtech/connect/response/options/OpenOptionGroup;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/core/microservices/tradingengine/response/order/PlaceOrderResult;", "apply"})
    /* compiled from: MultiSelectorViewModel.kt */
    static final class c<T, R> implements g<T, t<? extends R>> {
        final /* synthetic */ io.reactivex.p dqa;

        c(io.reactivex.p pVar) {
            this.dqa = pVar;
        }

        /* renamed from: b */
        public final io.reactivex.p<com.iqoption.mobbtech.connect.response.options.b> apply(com.iqoption.core.microservices.tradingengine.response.order.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return this.dqa;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/mobbtech/connect/response/options/OpenOptionGroup;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: MultiSelectorViewModel.kt */
    static final class d<T> implements f<com.iqoption.mobbtech.connect.response.options.b> {
        final /* synthetic */ c dpZ;

        d(c cVar) {
            this.dpZ = cVar;
        }

        /* renamed from: d */
        public final void accept(com.iqoption.mobbtech.connect.response.options.b bVar) {
            this.dpZ.dpP.postValue(Boolean.valueOf(false));
            this.dpZ.dpR.postValue(l.eVB);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: MultiSelectorViewModel.kt */
    static final class e<T> implements f<Throwable> {
        final /* synthetic */ c dpZ;

        e(c cVar) {
            this.dpZ = cVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dpZ.dpP.postValue(Boolean.valueOf(false));
        }
    }

    public static final c ag(Fragment fragment) {
        return dpX.ag(fragment);
    }

    public c() {
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<OpenOptionGroup>()");
        this.dpT = bmK;
        bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Unit>()");
        this.dpU = bmK;
        bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Int>()");
        this.dpV = bmK;
        this.dpW = new b();
        com.iqoption.app.managers.c GS = com.iqoption.app.managers.c.GS();
        kotlin.jvm.internal.i.e(GS, "OptionManager.instance()");
        if (GS.Ha()) {
            this.dpP.setValue(Boolean.valueOf(true));
        }
        this.dpW.register();
        io.reactivex.disposables.b a = io.reactivex.e.a((org.a.b) this.dpT, (org.a.b) this.dpV, (org.a.b) this.dpU, (h) AnonymousClass1.dpY).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.aki()).a((f) new AnonymousClass2(this), (f) new AnonymousClass3(this));
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(p…      }\n                )");
        b(a);
    }

    public final LiveData<List<e>> Bo() {
        return this.apC;
    }

    public final LiveData<Boolean> aHQ() {
        return this.dpQ;
    }

    public final LiveData<l> aHR() {
        return this.dpS;
    }

    public final void gi(int i) {
        this.dpV.onNext(Integer.valueOf(i));
    }

    public final void aul() {
        this.dpU.onNext(l.eVB);
    }

    public final void c(com.iqoption.mobbtech.connect.response.options.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "openOptionGroup");
        this.dpT.onNext(bVar);
    }

    @MainThread
    public final void a(com.iqoption.mobbtech.connect.response.options.b bVar, com.iqoption.core.microservices.tradingengine.response.instrument.e eVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar, double d, boolean z) {
        io.reactivex.p a;
        this.dpP.setValue(Boolean.valueOf(true));
        if (bVar == null) {
            a = com.iqoption.mobbtech.connect.request.api.a.b.a(eVar, aVar, d, z);
        } else {
            com.iqoption.mobbtech.connect.response.options.c aQa = bVar.aQa();
            kotlin.jvm.internal.i.e(aQa, "openOptionGroup.first()");
            Long id = aQa.getId();
            kotlin.jvm.internal.i.e(id, "openOptionGroup.first().id");
            a = com.iqoption.mobbtech.connect.request.api.a.b.a(eVar, aVar, id.longValue(), z);
        }
        io.reactivex.disposables.b a2 = a.q(new c(this.dpT.bkV())).h(com.iqoption.core.rx.i.aki()).a((f) new d(this), (f) new e(this));
        kotlin.jvm.internal.i.e(a2, "placeOrder\n             …              }\n        )");
        b(a2);
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.dpW.unregister();
    }
}
