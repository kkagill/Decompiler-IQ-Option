package com.iqoption.withdraw.fields;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.withdraw.response.l;
import com.iqoption.core.microservices.withdraw.response.q;
import com.iqoption.withdraw.k;
import io.reactivex.p;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.t;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019J\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u001cJ8\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\"\u0010#\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(j\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*`+R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0006*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006-"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "feeRequestProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/iqoption/withdraw/fields/FeeRequest;", "kotlin.jvm.PlatformType", "feeResultProcessor", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/withdraw/fields/FeeResult;", "selectedMethodProcessor", "Lcom/iqoption/withdraw/fields/WithdrawFieldsData;", "selectionViewModel", "Lcom/iqoption/withdraw/WithdrawSelectionViewModel;", "defaultFee", "oldFee", "", "commissions", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "formatFee", "amount", "total", "getCommission", "Landroidx/lifecycle/LiveData;", "getSelectedMethod", "requestCommission", "", "method", "Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "(Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;Ljava/lang/Double;)V", "selectMethod", "data", "showInfoPopup", "params", "Lcom/iqoption/withdraw/InfoPopupParams;", "subscribeOnCommissions", "withdrawal", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawResponse;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Companion", "withdraw_release"})
/* compiled from: WithdrawFieldsViewModel.kt */
public final class g extends com.iqoption.core.ui.f.d {
    public static final a erT = new a();
    private com.iqoption.withdraw.j erP;
    private final io.reactivex.processors.a<c> erQ;
    private final io.reactivex.processors.a<a> erR;
    private final io.reactivex.processors.a<com.iqoption.core.ui.d<b>> erS;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/withdraw/fields/WithdrawFieldsViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/withdraw/fields/WithdrawFieldsViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "withdraw_release"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g bB(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(com.iqoption.withdraw.f.epg.aj(fragment)).get(g.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ge…ldsViewModel::class.java]");
            g gVar = (g) viewModel;
            gVar.erP = com.iqoption.withdraw.j.epC.bz(fragment);
            return gVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lkotlin/Triple;", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "Lcom/iqoption/withdraw/fields/WithdrawFieldsData;", "Lcom/iqoption/withdraw/fields/FeeRequest;", "payoutSettings", "fieldsData", "feeRequest", "apply"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class b<T1, T2, T3, R> implements io.reactivex.b.h<com.iqoption.core.microservices.withdraw.response.i, c, a, Triple<? extends com.iqoption.core.microservices.withdraw.response.i, ? extends c, ? extends a>> {
        public static final b erU = new b();

        b() {
        }

        public final Triple<com.iqoption.core.microservices.withdraw.response.i, c, a> a(com.iqoption.core.microservices.withdraw.response.i iVar, c cVar, a aVar) {
            kotlin.jvm.internal.i.f(iVar, "payoutSettings");
            kotlin.jvm.internal.i.f(cVar, "fieldsData");
            kotlin.jvm.internal.i.f(aVar, "feeRequest");
            return new Triple(iVar, cVar, aVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/withdraw/fields/FeeResult;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "Lcom/iqoption/core/microservices/withdraw/response/UserPayoutSettings;", "Lcom/iqoption/withdraw/fields/WithdrawFieldsData;", "Lcom/iqoption/withdraw/fields/FeeRequest;", "apply"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ g erV;

        c(g gVar) {
            this.erV = gVar;
        }

        /* renamed from: b */
        public final p<b> apply(Triple<com.iqoption.core.microservices.withdraw.response.i, c, a> triple) {
            kotlin.jvm.internal.i.f(triple, "<name for destructuring parameter 0>");
            com.iqoption.core.microservices.withdraw.response.i iVar = (com.iqoption.core.microservices.withdraw.response.i) triple.bnj();
            c cVar = (c) triple.bnk();
            final a aVar = (a) triple.bnm();
            double ajB = cVar.bcf().ajB();
            final com.iqoption.core.microservices.configuration.a.d VM = cVar.VM();
            if (ajB > ((double) 0) && aVar.aPS() != null) {
                return p.cI(this.erV.a(aVar.aPS().doubleValue(), aVar.aPS().doubleValue() - ajB, VM));
            } else if (aVar.aPS() == null || k.epD.a(iVar, cVar.bcf())) {
                return p.cI(this.erV.a(ajB, cVar.bcf().ajC(), VM));
            } else {
                this.erV.erS.onNext(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
                return com.iqoption.core.microservices.withdraw.a.bDL.a(aVar.bcb(), aVar.aPS().doubleValue(), true).t(new io.reactivex.b.g<T, R>(this) {
                    final /* synthetic */ c erW;

                    /* renamed from: b */
                    public final b apply(com.iqoption.core.microservices.withdraw.response.g gVar) {
                        kotlin.jvm.internal.i.f(gVar, "response");
                        return this.erW.erV.a(aVar.aPS().doubleValue(), gVar.ZC(), VM);
                    }
                });
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/withdraw/fields/FeeResult;", "it", "apply"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        public static final d erY = new d();

        d() {
        }

        /* renamed from: a */
        public final com.iqoption.core.ui.d<b> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return com.iqoption.core.ui.d.bHb.bS(bVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/withdraw/fields/FeeResult;", "it", "", "apply"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class e<T, R> implements io.reactivex.b.g<Throwable, com.iqoption.core.ui.d<b>> {
        public static final e erZ = new e();

        e() {
        }

        /* renamed from: w */
        public final com.iqoption.core.ui.d<b> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/withdraw/fields/FeeResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<com.iqoption.core.ui.d<b>> {
        final /* synthetic */ g erV;

        f(g gVar) {
            this.erV = gVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.ui.d<b> dVar) {
            this.erV.erS.onNext(dVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ g erV;

        g(g gVar) {
            this.erV = gVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.erV.erS.onNext(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawResponse;", "it", "Lcom/iqoption/core/microservices/billing/response/BillingSession;", "apply"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ com.iqoption.core.microservices.withdraw.response.c esa;
        final /* synthetic */ HashMap esb;

        h(com.iqoption.core.microservices.withdraw.response.c cVar, HashMap hashMap) {
            this.esa = cVar;
            this.esb = hashMap;
        }

        /* renamed from: b */
        public final p<q> apply(com.iqoption.core.microservices.billing.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            if (this.esa instanceof l) {
                return com.iqoption.core.microservices.withdraw.a.bDL.a((l) this.esa, this.esb);
            }
            return com.iqoption.core.microservices.withdraw.a.bDL.a(com.iqoption.billing.a.Kh(), aVar.Zx(), this.esa, this.esb);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class i<T> implements io.reactivex.b.f<q> {
        final /* synthetic */ MutableLiveData $liveData;

        i(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: b */
        public final void accept(q qVar) {
            this.$liveData.setValue(qVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: WithdrawFieldsViewModel.kt */
    static final class j<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ MutableLiveData $liveData;

        j(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.$liveData.setValue(null);
        }
    }

    public g() {
        io.reactivex.processors.a bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create…ldsData>().toSerialized()");
        this.erQ = bmJ;
        bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create…Request>().toSerialized()");
        this.erR = bmJ;
        bmJ = PublishProcessor.bmK().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "PublishProcessor.create<…Result>>().toSerialized()");
        this.erS = bmJ;
    }

    public final void bcu() {
        com.iqoption.withdraw.j jVar = this.erP;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        io.reactivex.disposables.b a = io.reactivex.e.a((org.a.b) jVar.bbX(), (org.a.b) this.erQ, (org.a.b) io.reactivex.e.b((org.a.b) this.erR.bkV().bkO(), (org.a.b) this.erR.cR(1).i(500, TimeUnit.MILLISECONDS)), (io.reactivex.b.h) b.erU).c(com.iqoption.core.rx.i.aki()).bkT().l(new c(this)).g(d.erY).h(e.erZ).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new f(this), (io.reactivex.b.f) new g(this));
        kotlin.jvm.internal.i.e(a, "Flowable.combineLatest(\n…      }\n                )");
        b(a);
    }

    public final void d(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "data");
        this.erQ.onNext(cVar);
    }

    public final LiveData<c> bcv() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(this.erQ.c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…dProcessor.observeOn(ui))");
        return fromPublisher;
    }

    public final LiveData<q> a(com.iqoption.core.microservices.withdraw.response.c cVar, HashMap<String, Object> hashMap) {
        kotlin.jvm.internal.i.f(cVar, "method");
        kotlin.jvm.internal.i.f(hashMap, "params");
        MutableLiveData mutableLiveData = new MutableLiveData();
        io.reactivex.disposables.b a = com.iqoption.billing.repository.d.azu.Ki().f((io.reactivex.b.g) new h(cVar, hashMap)).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new i(mutableLiveData), (io.reactivex.b.f) new j(mutableLiveData));
        kotlin.jvm.internal.i.e(a, "SessionRepository.getSes… null }\n                )");
        b(a);
        return mutableLiveData;
    }

    public final LiveData<com.iqoption.core.ui.d<b>> bcw() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(this.erS.c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…tProcessor.observeOn(ui))");
        return fromPublisher;
    }

    private final b a(double d, com.iqoption.core.microservices.withdraw.response.j jVar, com.iqoption.core.microservices.configuration.a.d dVar) {
        return new b(h.b(d, jVar, dVar), com.iqoption.core.util.e.a(0.0d, dVar, false, 2, null));
    }

    private final b a(double d, double d2, com.iqoption.core.microservices.configuration.a.d dVar) {
        com.iqoption.core.microservices.configuration.a.d dVar2 = dVar;
        return new b(com.iqoption.core.util.e.a(d2 - d, dVar2, false, 2, null), com.iqoption.core.util.e.a(d2, dVar2, false, 2, null));
    }

    public final void a(com.iqoption.core.microservices.withdraw.response.c cVar, Double d) {
        kotlin.jvm.internal.i.f(cVar, "method");
        this.erR.onNext(new a(cVar.getId(), d));
    }

    public final void a(com.iqoption.withdraw.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "params");
        com.iqoption.withdraw.j jVar = this.erP;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.a(cVar);
    }
}
