package com.iqoption.kyc;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.plus.PlusShare;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.kyc.response.step.KycStepState;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.b.l;
import io.reactivex.k;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.PublishProcessor;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b&\u0018\u0000 }2\u00020\u0001:\u0001}B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u001eJ\u0006\u0010Z\u001a\u00020XJ\u000e\u0010[\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u001eJ\u0016\u0010\\\u001a\u00020X2\u0006\u0010]\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u001eJ\u0006\u0010^\u001a\u00020XJ\u0018\u0010_\u001a\u00020X2\u0006\u0010`\u001a\u00020I2\u0006\u0010Y\u001a\u00020\u001eH\u0002J \u0010a\u001a\u00020X2\b\u00104\u001a\u0004\u0018\u0001052\u000e\u0010S\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\rJ\u0006\u0010b\u001a\u00020\u001eJ\u0012\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\u0006J\b\u0010d\u001a\u00020XH\u0002J\u000e\u0010e\u001a\u00020X2\u0006\u0010f\u001a\u00020\u0007J\u0014\u0010g\u001a\u00020X2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0010\u0010i\u001a\u00020X2\b\u0010]\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010j\u001a\u00020X2\u000e\u0010h\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rJ\u000e\u0010k\u001a\u00020X2\u0006\u0010l\u001a\u00020\u001eJ\u000e\u0010m\u001a\u00020X2\u0006\u0010n\u001a\u00020\u001eJ\u000e\u0010o\u001a\u00020X2\u0006\u0010p\u001a\u00020\u001eJ\u0016\u0010q\u001a\u00020X2\u0006\u0010r\u001a\u0002052\u0006\u0010s\u001a\u00020:J\u000e\u0010t\u001a\u00020X2\u0006\u0010u\u001a\u00020\u0019J\u000e\u0010v\u001a\u00020X2\u0006\u0010p\u001a\u00020\u001eJ\u000e\u0010w\u001a\u00020X2\u0006\u0010p\u001a\u00020\u001eJ\u000e\u0010x\u001a\u00020X2\u0006\u0010p\u001a\u00020\u001eJ\u000e\u0010y\u001a\u00020X2\u0006\u00109\u001a\u00020\u001eJ\u000e\u0010z\u001a\u00020X2\u0006\u0010T\u001a\u00020\u0019J\u000e\u0010{\u001a\u00020X2\u0006\u0010|\u001a\u000205R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0004¢\u0006\u0002\n\u0000R4\u0010\u0014\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r \u0017*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u00160\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\tR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\tR\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\tR\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020-01¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020-0\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\tR\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020-0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\tR\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:0>X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010?\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010-0-0@X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001901¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u001c\u0010C\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00190\u00190@X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\tR\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010G\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010I0I0HX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\tR\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\tR\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\tR\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010S\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\tR\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006~"}, bng = {"Lcom/iqoption/kyc/KycSelectionViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "activityResult", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/fragment/ActivityResult;", "getActivityResult", "()Landroidx/lifecycle/LiveData;", "activityResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "allSteps", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "getAllSteps", "allStepsLiveData", "currentStep", "getCurrentStep", "currentStepLiveData", "editableStepsProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/google/common/base/Optional;", "kotlin.jvm.PlatformType", "errorMessages", "", "getErrorMessages", "errorMessagesLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "firstSubStep", "", "getFirstSubStep", "firstSubStepLiveData", "isRegulatedByCountry", "()Ljava/lang/Boolean;", "setRegulatedByCountry", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "nextEnabled", "getNextEnabled", "nextEnabledLiveData", "nextProgress", "getNextProgress", "nextProgressLiveData", "nextScreen", "", "getNextScreen", "nextScreenLiveData", "observeRefreshSteps", "Lio/reactivex/Flowable;", "getObserveRefreshSteps", "()Lio/reactivex/Flowable;", "onlyScreen", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "prevScreen", "getPrevScreen", "prevScreenLiveData", "progress", "", "getProgress", "progressLiveData", "progressMap", "Ljava/util/concurrent/ConcurrentHashMap;", "refreshStepsProcessor", "Lio/reactivex/processors/FlowableProcessor;", "search", "getSearch", "searchProcessor", "showBottomBar", "getShowBottomBar", "showBottomBarLiveData", "showNextStepProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lcom/iqoption/kyc/StepInvoke;", "showProgress", "getShowProgress", "showProgressLiveData", "showSearch", "getShowSearch", "showSearchLiveData", "skipProgress", "getSkipProgress", "skipProgressLiveData", "startSteps", "title", "getTitle", "titleLiveData", "goToFirstStep", "", "refresh", "goToNextScreen", "goToNextStep", "goToParticularStep", "step", "goToPrevScreen", "goToStep", "stepInvoke", "initStepConstraints", "isRegulated", "nextStep", "refreshSteps", "setActivityResult", "result", "setAllSteps", "steps", "setCurrentStep", "setEditableSteps", "setFirstSubStep", "first", "setNextEnabled", "enabled", "setNextProgress", "show", "setProgress", "kycStepType", "stepProgress", "setSearch", "text", "setShowBottomBar", "setShowProgress", "setShowSearch", "setSkipProgress", "setTitle", "skipStep", "stepType", "Companion", "kyc_release"})
/* compiled from: KycSelectionViewModel.kt */
public final class j extends com.iqoption.core.ui.f.c {
    public static final a dsW = new a();
    private final LiveData<String> aES;
    private final io.reactivex.e<String> aVh;
    private final MutableLiveData<Integer> dsA;
    private final LiveData<Integer> dsB;
    private final MutableLiveData<Boolean> dsC;
    private final LiveData<Boolean> dsD;
    private final MutableLiveData<String> dsE;
    private final MutableLiveData<Boolean> dsF;
    private final io.reactivex.processors.a<String> dsG;
    private final LiveData<Boolean> dsH;
    private final MutableLiveData<Boolean> dsI;
    private final LiveData<Boolean> dsJ;
    private final MutableLiveData<Boolean> dsK;
    private final LiveData<Boolean> dsL;
    private final MutableLiveData<Boolean> dsM;
    private final LiveData<Boolean> dsN;
    private final MutableLiveData<Boolean> dsO;
    private final LiveData<Boolean> dsP;
    private final MutableLiveData<Boolean> dsQ;
    private final LiveData<Boolean> dsR;
    private final MutableLiveData<com.iqoption.core.ui.fragment.a> dsS;
    private final LiveData<com.iqoption.core.ui.fragment.a> dsT;
    private final com.iqoption.core.data.b.b<String> dsU;
    private final LiveData<String> dsV;
    private KycStepType dsk;
    private List<? extends KycStepType> dsl;
    private Boolean dsm;
    private final MutableLiveData<List<com.iqoption.core.microservices.kyc.response.step.c>> dsn = new MutableLiveData();
    private final LiveData<List<com.iqoption.core.microservices.kyc.response.step.c>> dso = this.dsn;
    private final io.reactivex.processors.a<Object> dsp;
    private final io.reactivex.e<Object> dsq;
    private final BehaviorProcessor<Optional<List<com.iqoption.core.microservices.kyc.response.step.c>>> dsr;
    private final MutableLiveData<com.iqoption.core.microservices.kyc.response.step.c> dss;
    private final LiveData<com.iqoption.core.microservices.kyc.response.step.c> dst;
    private final PublishProcessor<p> dsu;
    private final com.iqoption.core.data.b.b<Object> dsv;
    private final LiveData<Object> dsw;
    private final com.iqoption.core.data.b.b<Object> dsx;
    private final LiveData<Object> dsy;
    private final ConcurrentHashMap<KycStepType, Integer> dsz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/KycSelectionViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/KycSelectionViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycSelectionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final j am(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(f.dsb.aj(fragment)).get(j.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ho…ionViewModel::class.java)");
            return (j) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/kyc/StepInvoke;", "apply"})
    /* compiled from: KycSelectionViewModel.kt */
    static final class b<T, R> implements g<T, k<? extends R>> {
        final /* synthetic */ j dsX;

        b(j jVar) {
            this.dsX = jVar;
        }

        /* renamed from: a */
        public final io.reactivex.i<Optional<com.iqoption.core.microservices.kyc.response.step.c>> apply(final p pVar) {
            kotlin.jvm.internal.i.f(pVar, "it");
            return this.dsX.dsr.c(com.iqoption.core.rx.i.aki()).b((l) AnonymousClass1.dsY).bkU().p(new g<T, R>(this) {
                final /* synthetic */ b dsZ;

                /* renamed from: f */
                public final Optional<com.iqoption.core.microservices.kyc.response.step.c> apply(Optional<List<com.iqoption.core.microservices.kyc.response.step.c>> optional) {
                    kotlin.jvm.internal.i.f(optional, "editableSteps");
                    p pVar = pVar;
                    Object obj = optional.get();
                    kotlin.jvm.internal.i.e(obj, "editableSteps.get()");
                    return Optional.an(pVar.a((List) obj, this.dsZ.dsX.dsk, this.dsZ.dsX.dsl));
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: KycSelectionViewModel.kt */
    static final class c<T, R> implements g<Throwable, Optional<com.iqoption.core.microservices.kyc.response.step.c>> {
        public static final c dtb = new c();

        c() {
        }

        /* renamed from: x */
        public final Optional<com.iqoption.core.microservices.kyc.response.step.c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return Optional.pW();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycSelectionViewModel.kt */
    static final class d implements io.reactivex.b.a {
        final /* synthetic */ j dsX;

        d(j jVar) {
            this.dsX = jVar;
        }

        public final void run() {
            this.dsX.en(true);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycSelectionViewModel.kt */
    static final class e<T> implements f<Throwable> {
        final /* synthetic */ j dsX;

        e(j jVar) {
            this.dsX = jVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.dsX.eq(false);
            this.dsX.dsU.postValue(this.dsX.getApplication().getString(o.f.unknown_error_occurred));
        }
    }

    public j(Application application) {
        kotlin.jvm.internal.i.f(application, "application");
        super(application);
        io.reactivex.processors.a bmJ = PublishProcessor.bmK().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "PublishProcessor.create<Any>().toSerialized()");
        this.dsp = bmJ;
        io.reactivex.e c = this.dsp.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "refreshStepsProcessor.observeOn(bg)");
        this.dsq = c;
        BehaviorProcessor bmG = BehaviorProcessor.bmG();
        kotlin.jvm.internal.i.e(bmG, "BehaviorProcessor.create…List<KycCustomerStep>>>()");
        this.dsr = bmG;
        this.dss = new MutableLiveData();
        this.dst = this.dss;
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<StepInvoke>()");
        this.dsu = bmK;
        this.dsv = new com.iqoption.core.data.b.b();
        this.dsw = this.dsv;
        this.dsx = new com.iqoption.core.data.b.b();
        this.dsy = this.dsx;
        this.dsz = new ConcurrentHashMap();
        this.dsA = new MutableLiveData();
        this.dsB = this.dsA;
        this.dsC = new MutableLiveData();
        this.dsD = this.dsC;
        this.dsE = new MutableLiveData();
        this.aES = this.dsE;
        this.dsF = new MutableLiveData();
        bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create<String>().toSerialized()");
        this.dsG = bmJ;
        this.dsH = this.dsF;
        c = this.dsG.c(com.iqoption.core.rx.i.aki());
        kotlin.jvm.internal.i.e(c, "searchProcessor.observeOn(bg)");
        this.aVh = c;
        this.dsI = new MutableLiveData();
        this.dsJ = this.dsI;
        this.dsK = new MutableLiveData();
        this.dsL = this.dsK;
        this.dsM = new MutableLiveData();
        this.dsN = this.dsM;
        this.dsO = new MutableLiveData();
        this.dsP = this.dsO;
        this.dsQ = new MutableLiveData();
        this.dsR = this.dsQ;
        this.dsS = new MutableLiveData();
        this.dsT = this.dsS;
        this.dsU = new com.iqoption.core.data.b.b();
        this.dsV = this.dsU;
    }

    public final void a(KycStepType kycStepType, List<? extends KycStepType> list) {
        this.dsk = kycStepType;
        this.dsl = list;
    }

    public final void t(Boolean bool) {
        this.dsm = bool;
    }

    public final boolean Er() {
        Boolean bool = this.dsm;
        return bool != null ? bool.booleanValue() : com.iqoption.core.d.EA().Er();
    }

    public final LiveData<List<com.iqoption.core.microservices.kyc.response.step.c>> aJc() {
        return this.dso;
    }

    public final void ba(List<com.iqoption.core.microservices.kyc.response.step.c> list) {
        kotlin.jvm.internal.i.f(list, "steps");
        this.dsn.postValue(list);
    }

    public final io.reactivex.e<Object> aJd() {
        return this.dsq;
    }

    private final void aJe() {
        bb(null);
        this.dsp.onNext("");
    }

    public final void bb(List<com.iqoption.core.microservices.kyc.response.step.c> list) {
        this.dsr.onNext(Optional.an(list));
    }

    public final LiveData<com.iqoption.core.microservices.kyc.response.step.c> aJf() {
        return this.dst;
    }

    public final void b(com.iqoption.core.microservices.kyc.response.step.c cVar) {
        this.dss.postValue(cVar);
    }

    public final LiveData<Optional<com.iqoption.core.microservices.kyc.response.step.c>> aJg() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(this.dsu.c(com.iqoption.core.rx.i.aki()).e((g) new b(this)).h(c.dtb).c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.… .observeOn(ui)\n        )");
        return fromPublisher;
    }

    public final void em(boolean z) {
        a((p) m.dtc, z);
    }

    public final void en(boolean z) {
        a((p) m.dtc, z);
    }

    public final void a(com.iqoption.core.microservices.kyc.response.step.c cVar, boolean z) {
        kotlin.jvm.internal.i.f(cVar, "step");
        a((p) new n(cVar), z);
    }

    private final void a(p pVar, boolean z) {
        if (z) {
            aJe();
        }
        this.dsu.onNext(pVar);
    }

    public final LiveData<Object> aJh() {
        return this.dsw;
    }

    public final void aJi() {
        this.dsv.postValue("");
    }

    public final LiveData<Object> aJj() {
        return this.dsy;
    }

    public final void aJk() {
        this.dsx.postValue("");
    }

    public final LiveData<Integer> aJl() {
        return this.dsB;
    }

    public final LiveData<Boolean> aJm() {
        return this.dsD;
    }

    public final void eo(boolean z) {
        this.dsC.postValue(Boolean.valueOf(z));
    }

    public final LiveData<String> MK() {
        return this.aES;
    }

    public final void setTitle(String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        this.dsE.postValue(str);
    }

    public final LiveData<Boolean> aJn() {
        return this.dsH;
    }

    public final io.reactivex.e<String> aJo() {
        return this.aVh;
    }

    public final void ep(boolean z) {
        this.dsF.postValue(Boolean.valueOf(z));
    }

    public final void iI(String str) {
        kotlin.jvm.internal.i.f(str, "text");
        this.dsG.onNext(str);
    }

    public final LiveData<Boolean> aJp() {
        return this.dsJ;
    }

    public final void eq(boolean z) {
        this.dsI.postValue(Boolean.valueOf(z));
    }

    public final LiveData<Boolean> aJq() {
        return this.dsL;
    }

    public final void er(boolean z) {
        this.dsK.postValue(Boolean.valueOf(z));
    }

    public final LiveData<Boolean> aJr() {
        return this.dsN;
    }

    public final void es(boolean z) {
        this.dsM.postValue(Boolean.valueOf(z));
    }

    public final LiveData<Boolean> aJs() {
        return this.dsP;
    }

    public final void et(boolean z) {
        this.dsO.postValue(Boolean.valueOf(z));
    }

    public final LiveData<Boolean> aJt() {
        return this.dsR;
    }

    public final void eu(boolean z) {
        this.dsQ.postValue(Boolean.valueOf(z));
    }

    public final LiveData<com.iqoption.core.ui.fragment.a> aJu() {
        return this.dsT;
    }

    public final void b(com.iqoption.core.ui.fragment.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "result");
        this.dsS.setValue(aVar);
    }

    public final void a(KycStepType kycStepType, int i) {
        kotlin.jvm.internal.i.f(kycStepType, "kycStepType");
        this.dsz.put(kycStepType, Integer.valueOf(i));
        List<com.iqoption.core.microservices.kyc.response.step.c> list = (List) this.dso.getValue();
        if (list != null) {
            kotlin.jvm.internal.i.e(list, "allSteps.value ?: return");
            float f = 0.0f;
            for (com.iqoption.core.microservices.kyc.response.step.c cVar : list) {
                float f2;
                KycStepType afH = cVar.afH();
                if (cVar.afI() == KycStepState.PASSED) {
                    f2 = 1.0f;
                } else {
                    Integer num = (Integer) this.dsz.get(afH);
                    if (num == null) {
                        num = Integer.valueOf(0);
                    }
                    f2 = ((float) num.intValue()) / 100.0f;
                }
                Integer num2 = (Integer) com.iqoption.core.microservices.kyc.response.step.f.afO().get(afH);
                f += (num2 != null ? (float) num2.intValue() : 0.0f) * f2;
            }
            this.dsA.postValue(Integer.valueOf(com.iqoption.core.microservices.kyc.response.step.f.N(f)));
        }
    }

    public final LiveData<String> aJv() {
        return this.dsV;
    }

    public final void g(KycStepType kycStepType) {
        kotlin.jvm.internal.i.f(kycStepType, "stepType");
        com.iqoption.core.d.EC().di("kyc_skip");
        eq(true);
        io.reactivex.disposables.b a = com.iqoption.core.microservices.kyc.c.bur.a(kycStepType).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new d(this), new e(this));
        kotlin.jvm.internal.i.e(a, "KycRequests.skipVerifica…      }\n                )");
        b(a);
    }
}
