package com.iqoption.kyc.navigator;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.step.KycStepState;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.kyc.j;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0001:B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J \u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010+J\u0006\u0010,\u001a\u00020\u000eJ\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070.0\u0006J0\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00062\b\u0010(\u001a\u0004\u0018\u00010)2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010+2\b\u00102\u001a\u0004\u0018\u000103J\u000e\u00104\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\u000bJ\u000e\u00107\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020)R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010\t¨\u0006;"}, bng = {"Lcom/iqoption/kyc/navigator/KycNavigatorViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "currentStep", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getCurrentStep", "()Landroidx/lifecycle/LiveData;", "errorMessages", "", "getErrorMessages", "firstSubStep", "", "getFirstSubStep", "initialStepSelected", "nextEnabled", "getNextEnabled", "nextProgress", "getNextProgress", "progress", "", "getProgress", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "showBottomBar", "getShowBottomBar", "showProgress", "getShowProgress", "showSearch", "getShowSearch", "skipProgress", "getSkipProgress", "title", "getTitle", "goToNextScreen", "", "goToPrevScreen", "initStepConstraints", "onlyScreen", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "startSteps", "", "isRegulated", "nextStep", "Lcom/google/common/base/Optional;", "observeSteps", "", "startStepsInput", "newVerificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "setNextProgress", "setSearch", "text", "setSkipProgress", "skipStep", "stepType", "Companion", "kyc_release"})
/* compiled from: KycNavigatorViewModel.kt */
public final class c extends com.iqoption.core.ui.f.c {
    public static final a dAJ = new a();
    private boolean dAI;
    private j drN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/navigator/KycNavigatorViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/navigator/KycNavigatorViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycNavigatorViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aA(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…torViewModel::class.java)");
            c cVar = (c) viewModel;
            cVar.drN = j.dsW.am(fragment);
            return cVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "it", "", "apply"})
    /* compiled from: KycNavigatorViewModel.kt */
    static final class b<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ KycVerificationContext dAK;

        b(KycVerificationContext kycVerificationContext) {
            this.dAK = kycVerificationContext;
        }

        /* renamed from: bN */
        public final e<List<com.iqoption.core.microservices.kyc.response.step.c>> apply(Object obj) {
            kotlin.jvm.internal.i.f(obj, "it");
            return com.iqoption.core.data.repository.d.bdF.a(this.dAK);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycNavigatorViewModel.kt */
    static final class c<T> implements f<List<? extends com.iqoption.core.microservices.kyc.response.step.c>> {
        final /* synthetic */ c dAL;
        final /* synthetic */ KycStepType dAM;
        final /* synthetic */ List dAN;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
        /* compiled from: KycNavigatorViewModel.kt */
        /* renamed from: com.iqoption.kyc.navigator.c$c$1 */
        static final class AnonymousClass1 implements io.reactivex.b.a {
            final /* synthetic */ c dAO;

            AnonymousClass1(c cVar) {
                this.dAO = cVar;
            }

            public final void run() {
                c.a(this.dAO.dAL).em(false);
            }
        }

        c(c cVar, KycStepType kycStepType, List list) {
            this.dAL = cVar;
            this.dAM = kycStepType;
            this.dAN = list;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.kyc.response.step.c> list) {
            j a = c.a(this.dAL);
            kotlin.jvm.internal.i.e(list, "it");
            a.ba(list);
            a = c.a(this.dAL);
            Collection arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                com.iqoption.core.microservices.kyc.response.step.c cVar = (com.iqoption.core.microservices.kyc.response.step.c) next;
                if (cVar.afI() != KycStepState.PASSED || com.iqoption.core.microservices.kyc.response.step.d.afM().contains(cVar.afH())) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            a.bb((List) arrayList);
            if (!this.dAL.dAI) {
                this.dAL.dAI = true;
                if (this.dAM != null) {
                    c.a(this.dAL).em(false);
                } else if (this.dAN != null) {
                    io.reactivex.a.bkL().e(500, TimeUnit.MILLISECONDS).d(new AnonymousClass1(this));
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "it", "", "apply"})
    /* compiled from: KycNavigatorViewModel.kt */
    static final class d<T, R> implements g<Throwable, List<? extends com.iqoption.core.microservices.kyc.response.step.c>> {
        public static final d dAP = new d();

        d() {
        }

        /* renamed from: r */
        public final List<com.iqoption.core.microservices.kyc.response.step.c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    public c(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public static final /* synthetic */ j a(c cVar) {
        j jVar = cVar.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar;
    }

    public final LiveData<Boolean> aJp() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJp();
    }

    public final LiveData<String> aJv() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJv();
    }

    public final LiveData<Object> a(KycStepType kycStepType, List<? extends KycStepType> list, KycVerificationContext kycVerificationContext) {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(jVar.aJd().cG("").d((g) new b(kycVerificationContext)).c((f) new c(this, kycStepType, list)).h(d.dAP).D(Object.class).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…          .observeOn(ui))");
        return fromPublisher;
    }

    public final void g(KycStepType kycStepType) {
        kotlin.jvm.internal.i.f(kycStepType, "stepType");
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.g(kycStepType);
    }

    public final LiveData<Optional<com.iqoption.core.microservices.kyc.response.step.c>> aJg() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJg();
    }

    public final void aJi() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.aJi();
    }

    public final void aJk() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.aJk();
    }

    public final LiveData<Boolean> aJr() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJr();
    }

    public final void iI(String str) {
        kotlin.jvm.internal.i.f(str, "text");
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.iI(str);
    }

    public final LiveData<Boolean> aJn() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJn();
    }

    public final LiveData<String> MK() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.MK();
    }

    public final LiveData<Integer> aJl() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJl();
    }

    public final LiveData<Boolean> aJm() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJm();
    }

    public final LiveData<Boolean> aJq() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJq();
    }

    public final LiveData<Boolean> aJs() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJs();
    }

    public final LiveData<Boolean> aJt() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJt();
    }

    public final LiveData<com.iqoption.core.microservices.kyc.response.step.c> aJf() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.aJf();
    }

    public final void eq(boolean z) {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.eq(z);
    }

    public final void eu(boolean z) {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.eu(z);
    }

    public final boolean Er() {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        return jVar.Er();
    }

    public final void a(KycStepType kycStepType, List<? extends KycStepType> list) {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.a(kycStepType, (List) list);
    }
}
