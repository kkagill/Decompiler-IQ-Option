package com.iqoption.kyc.navigator;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.util.ah;
import com.iqoption.kyc.KycCaller;
import com.iqoption.kyc.b.bq;
import com.iqoption.kyc.b.by;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020.H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\n\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u00020\u0004H\u0002J\b\u00104\u001a\u00020\u0004H\u0016J\b\u00105\u001a\u00020\u0004H\u0002J\b\u00106\u001a\u00020\u0004H\u0002J\b\u00107\u001a\u00020\u0004H\u0002J\u0012\u00108\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010;\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\u0012\u0010>\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J&\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u00020@2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010G\u001a\u00020+H&J\b\u0010H\u001a\u00020+H&J\u0010\u0010I\u001a\u00020+2\u0006\u0010J\u001a\u000200H\u0002J\b\u0010K\u001a\u00020+H\u0002J\u0010\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020\u0004H\u0002J\b\u0010N\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001eX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020%X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006P"}, bng = {"Lcom/iqoption/kyc/navigator/KycNavigatorFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "()V", "allStepsFinished", "", "binding", "Lcom/iqoption/kyc/databinding/FragmentKycNavigatorBinding;", "currentStep", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "isSkipInProgress", "Ljava/lang/Boolean;", "kycCaller", "Lcom/iqoption/kyc/KycCaller;", "getKycCaller", "()Lcom/iqoption/kyc/KycCaller;", "kycCaller$delegate", "Lkotlin/Lazy;", "onlyScreen", "Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "getOnlyScreen", "()Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;", "onlyScreen$delegate", "returnToParent", "getReturnToParent", "()Z", "returnToParent$delegate", "showDepositAfterFinish", "getShowDepositAfterFinish", "showDepositAfterFinish$delegate", "startSteps", "", "verificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "getVerificationContext", "()Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "verificationContext$delegate", "viewModel", "Lcom/iqoption/kyc/navigator/KycNavigatorViewModel;", "getViewModel", "()Lcom/iqoption/kyc/navigator/KycNavigatorViewModel;", "setViewModel", "(Lcom/iqoption/kyc/navigator/KycNavigatorViewModel;)V", "close", "", "collapseSearch", "getContainerId", "", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "getLastAnalyticsFragment", "Lcom/iqoption/kyc/analytics/KycAnalyticsFragmentInfo;", "goToFirstKycScreen", "handleBackPressed", "isSearchExpanded", "isSkipAllowed", "isSkipAllowedInToolbar", "observerData", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openDeposit", "openTraderoom", "showStepFragment", "entry", "updateInfoVisibility", "updateSearchVisibility", "expand", "updateSkipVisibility", "Companion", "kyc_release"})
/* compiled from: KycNavigatorFragment.kt */
public abstract class a extends com.iqoption.core.ui.d.b {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "returnToParent", "getReturnToParent()Z")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "showDepositAfterFinish", "getShowDepositAfterFinish()Z")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "onlyScreen", "getOnlyScreen()Lcom/iqoption/core/microservices/kyc/response/step/KycStepType;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "kycCaller", "getKycCaller()Lcom/iqoption/kyc/KycCaller;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "verificationContext", "getVerificationContext()Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;"))};
    public static final a dAF = new a();
    private HashMap apm;
    private final kotlin.d cGn = g.c(new KycNavigatorFragment$returnToParent$2(this));
    protected c dAA;
    private com.iqoption.kyc.b.u dAB;
    private com.iqoption.core.microservices.kyc.response.step.c dAC;
    private Boolean dAD;
    private boolean dAE;
    private final kotlin.d dAx = g.c(new KycNavigatorFragment$showDepositAfterFinish$2(this));
    private final kotlin.d dAy = g.c(new KycNavigatorFragment$onlyScreen$2(this));
    private final kotlin.d dAz = g.c(new KycNavigatorFragment$verificationContext$2(this));
    private final List<KycStepType> dsl;
    private final kotlin.d dxE = g.c(new KycNavigatorFragment$kycCaller$2(this));

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, bng = {"Lcom/iqoption/kyc/navigator/KycNavigatorFragment$Companion;", "", "()V", "ARG_KYC_CALLER", "", "ARG_NAV_KYC_START_STEPS", "ARG_NAV_ONLY_SCREEN", "ARG_NAV_RETURN_TO_PARENT", "ARG_NAV_SHOW_DEPOSIT_AFTER_FINISH", "ARG_VERIFICATION_CONTEXT", "TAG", "getTAG", "()Ljava/lang/String;", "closeKyc", "", "child", "Landroidx/fragment/app/Fragment;", "collapseSearch", "", "getOtherContainerId", "", "getOtherFragmentManager", "Landroidx/fragment/app/FragmentManager;", "goToFirstKycScreen", "openDeposit", "openTraderoom", "pop", "showStepFragment", "entry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "kyc_release"})
    /* compiled from: KycNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final void b(Fragment fragment, com.iqoption.core.ui.d.c cVar) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(cVar, "entry");
            ((a) com.iqoption.core.ext.a.a(fragment, a.class)).c(cVar);
        }

        public final boolean at(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return ((a) com.iqoption.core.ext.a.a(fragment, a.class)).aLH();
        }

        public final boolean au(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return ((a) com.iqoption.core.ext.a.a(fragment, a.class)).aLF();
        }

        public final boolean av(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return ((a) com.iqoption.core.ext.a.a(fragment, a.class)).alE().alG();
        }

        public final void aw(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            ((a) com.iqoption.core.ext.a.a(fragment, a.class)).close();
        }

        public final int aLI() {
            return com.iqoption.kyc.o.d.kycOtherFragment;
        }

        public final FragmentManager ax(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return com.iqoption.core.ext.a.u(com.iqoption.core.ext.a.a(fragment, a.class));
        }

        public final void ay(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            ((a) com.iqoption.core.ext.a.a(fragment, a.class)).Ao();
        }

        public final void az(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            ((a) com.iqoption.core.ext.a.a(fragment, a.class)).aLG();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class w implements Runnable {
        final /* synthetic */ a this$0;

        w(a aVar) {
            this.this$0 = aVar;
        }

        public final void run() {
            a.d(this.this$0).dvj.dwK.requestFocus();
            com.iqoption.core.util.v.ad(a.d(this.this$0).dvj.dwK);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class b<T> implements Observer<String> {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            TextView textView = a.d(this.this$0).dvj.dwO;
            kotlin.jvm.internal.i.e(textView, "binding.kycToolbarLayout.kycTitle");
            textView.setText(str);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class c<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            String str = "binding.kycBottomBar.kycNextProgress";
            String str2 = "binding.kycBottomBar.kycNext";
            TextView textView;
            ContentLoadingProgressBar contentLoadingProgressBar;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                textView = a.d(this.this$0).dvg.dwz;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.al(textView);
                contentLoadingProgressBar = a.d(this.this$0).dvg.dwA;
                kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
                contentLoadingProgressBar.setVisibility(0);
                return;
            }
            textView = a.d(this.this$0).dvg.dwz;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.ak(textView);
            contentLoadingProgressBar = a.d(this.this$0).dvg.dwA;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class d<T> implements Observer<com.iqoption.core.microservices.kyc.response.step.c> {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: d */
        public final void onChanged(com.iqoption.core.microservices.kyc.response.step.c cVar) {
            this.this$0.dAC = cVar;
            this.this$0.aLB();
            this.this$0.aLC();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "message", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class e<T> implements Observer<String> {
        public static final e dAG = new e();

        e() {
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.core.d.a(str, 0, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class f<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            this.this$0.dAD = bool;
            this.this$0.aLB();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class g<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        g(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            bq bqVar = a.d(this.this$0).dvg;
            kotlin.jvm.internal.i.e(bqVar, "binding.kycBottomBar");
            String str = "bottomBar.kycPrev";
            TextView textView;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                textView = bqVar.dwB;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.al(textView);
                return;
            }
            textView = bqVar.dwB;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class h<T> implements Observer<Object> {
        public static final h dAH = new h();

        h() {
        }

        public final void onChanged(Object obj) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "step", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class i<T> implements Observer<Optional<com.iqoption.core.microservices.kyc.response.step.c>> {
        final /* synthetic */ a this$0;

        i(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Optional<com.iqoption.core.microservices.kyc.response.step.c> optional) {
            com.iqoption.core.ui.d.c cVar = null;
            com.iqoption.core.microservices.kyc.response.step.c cVar2 = optional != null ? (com.iqoption.core.microservices.kyc.response.step.c) optional.pN() : null;
            KycStepType afH = cVar2 != null ? cVar2.afH() : null;
            if (afH != null) {
                switch (afH) {
                    case PROFILE:
                        cVar = com.iqoption.kyc.profile.b.dBp.f(cVar2);
                        break;
                    case TIN:
                        cVar = com.iqoption.kyc.tin.a.dEu.f(cVar2);
                        break;
                    case PHONE:
                        cVar = com.iqoption.kyc.phone.navigator.a.dBe.e(cVar2);
                        break;
                    case KYC_DOCUMENTS_POI:
                        cVar = com.iqoption.kyc.document.b.dxc.c(cVar2);
                        break;
                    case KYC_DOCUMENTS_POA:
                        cVar = com.iqoption.kyc.document.b.dxc.b(cVar2, false);
                        break;
                    case KYC_QUESTIONNAIRE:
                        cVar = com.iqoption.kyc.questionnaire.a.dCC.g(cVar2);
                        break;
                }
            }
            boolean z = true;
            if (cVar != null) {
                this.this$0.dAE = false;
            } else if (this.this$0.aLy() != null) {
                this.this$0.close();
                return;
            } else {
                this.this$0.dAE = true;
                EditText editText = a.d(this.this$0).dvj.dwK;
                kotlin.jvm.internal.i.e(editText, "binding.kycToolbarLayout.kycSearchEdit");
                com.iqoption.core.ext.a.al(editText);
                ImageView imageView = a.d(this.this$0).dvj.dwJ;
                kotlin.jvm.internal.i.e(imageView, "binding.kycToolbarLayout.kycSearchClear");
                com.iqoption.core.ext.a.al(imageView);
                this.this$0.aLB();
                this.this$0.aLC();
                cVar = com.iqoption.kyc.finish.a.dxH.b(this.this$0.aIG());
            }
            FragmentManager u = com.iqoption.core.ext.a.u(this.this$0);
            if (this.this$0.alE().alH().findFragmentById(this.this$0.KW()) != null) {
                z = false;
            }
            if (u.findFragmentByTag(cVar.getName()) == null) {
                this.this$0.alE().a(cVar, z);
            }
            if (!z) {
                com.iqoption.kyc.a.b b = this.this$0.aLE();
                if (b != null) {
                    com.iqoption.kyc.a.a.dtL.i("kyc_next", b.aKn(), b.aKo(), this.this$0.aLz().Er());
                }
            }
            this.this$0.aLz().eq(false);
            this.this$0.aLz().eu(false);
            this.this$0.aLB();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class j<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        j(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            this.this$0.eN(false);
            String str = "binding.kycToolbarLayout.kycSearchIcon";
            ImageView imageView;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                imageView = a.d(this.this$0).dvj.dwL;
                kotlin.jvm.internal.i.e(imageView, str);
                com.iqoption.core.ext.a.ak(imageView);
                EditText editText = a.d(this.this$0).dvj.dwK;
                kotlin.jvm.internal.i.e(editText, "binding.kycToolbarLayout.kycSearchEdit");
                editText.setText((CharSequence) null);
                return;
            }
            imageView = a.d(this.this$0).dvj.dwL;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.al(imageView);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "progress", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class k<T> implements Observer<Integer> {
        final /* synthetic */ a this$0;

        k(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                int intValue = num.intValue();
                ProgressBar progressBar = a.d(this.this$0).dvj.dwI;
                kotlin.jvm.internal.i.e(progressBar, "binding.kycToolbarLayout.kycProgress");
                progressBar.setSecondaryProgress(intValue);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class l<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        l(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            String str = "binding.kycToolbarLayout.kycProgress";
            ProgressBar progressBar;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                progressBar = a.d(this.this$0).dvj.dwI;
                kotlin.jvm.internal.i.e(progressBar, str);
                com.iqoption.core.ext.a.ak(progressBar);
                return;
            }
            progressBar = a.d(this.this$0).dvj.dwI;
            kotlin.jvm.internal.i.e(progressBar, str);
            com.iqoption.core.ext.a.hide(progressBar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class m<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        m(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            String str = "binding.kycBottomBar.root";
            String str2 = "binding.kycBottomBar";
            bq bqVar;
            View root;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                bqVar = a.d(this.this$0).dvg;
                kotlin.jvm.internal.i.e(bqVar, str2);
                root = bqVar.getRoot();
                kotlin.jvm.internal.i.e(root, str);
                com.iqoption.core.ext.a.ak(root);
                return;
            }
            bqVar = a.d(this.this$0).dvg;
            kotlin.jvm.internal.i.e(bqVar, str2);
            root = bqVar.getRoot();
            kotlin.jvm.internal.i.e(root, str);
            com.iqoption.core.ext.a.al(root);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: KycNavigatorFragment.kt */
    static final class n<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        n(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            TextView textView = a.d(this.this$0).dvg.dwz;
            boolean y = kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true));
            textView.setEnabled(y);
            textView.setAlpha(y ? 1.0f : 0.5f);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class o extends com.iqoption.core.ext.g {
        final /* synthetic */ View aBq;
        final /* synthetic */ a this$0;

        public o(a aVar, View view) {
            this.this$0 = aVar;
            this.aBq = view;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            FragmentManager alH = this.this$0.alE().alH();
            int i = 0;
            if (this.this$0.aLA()) {
                this.this$0.eN(false);
                com.iqoption.core.util.v.az(this.aBq);
            } else if (alH.getBackStackEntryCount() <= 0 || alH.isStateSaved() || alH.isDestroyed()) {
                this.this$0.close();
            } else {
                com.iqoption.kyc.a.b b = this.this$0.aLE();
                if (b != null) {
                    com.iqoption.kyc.a.a.dtL.i("kyc_verification-flow", b.aKn(), b.aKo(), this.this$0.aLz().Er());
                }
                int backStackEntryCount = alH.getBackStackEntryCount();
                while (i < backStackEntryCount) {
                    alH.popBackStack();
                    i++;
                }
                alH.executePendingTransactions();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class p extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public p(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            EditText editText = a.d(this.this$0).dvj.dwK;
            kotlin.jvm.internal.i.e(editText, "binding.kycToolbarLayout.kycSearchEdit");
            editText.setText((CharSequence) null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class q extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public q(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.eN(true);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class r extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public r(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.microservices.kyc.response.step.c e = this.this$0.dAC;
            if (e != null) {
                this.this$0.aLz().g(e.afH());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class s extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public s(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.microservices.kyc.response.step.c e = this.this$0.dAC;
            if (e != null) {
                int i;
                if (e.afH() == KycStepType.KYC_DOCUMENTS_POI) {
                    i = com.iqoption.kyc.o.f.poi_link;
                } else {
                    i = com.iqoption.kyc.o.f.poa_link;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("https://vimeo.com/");
                stringBuilder.append(this.this$0.getString(i));
                Uri parse = Uri.parse(stringBuilder.toString());
                Context q = com.iqoption.core.ext.a.q(this.this$0);
                kotlin.jvm.internal.i.e(parse, "link");
                com.iqoption.core.util.b.d.a(q, parse, Integer.valueOf(268435456), null, 8, null);
            }
            com.iqoption.kyc.a.a aVar = com.iqoption.kyc.a.a.dtL;
            com.iqoption.core.microservices.kyc.response.step.c e2 = this.this$0.dAC;
            aVar.p("IdentityProving", (e2 != null ? e2.afH() : null) == KycStepType.KYC_DOCUMENTS_POI ? "ProofOfIdentity" : "AddressDocument", this.this$0.aLz().Er());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/kyc/navigator/KycNavigatorFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class t extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public t(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.aLH();
            com.iqoption.kyc.a.b b = this.this$0.aLE();
            if (b != null) {
                com.iqoption.kyc.a.a.dtL.i("kyc_previous", b.aKn(), b.aKo(), this.this$0.aLz().Er());
            }
            this.this$0.aLz().aJi();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/kyc/navigator/KycNavigatorFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class u extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public u(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.aLH();
            this.this$0.aLz().aJk();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/kyc/navigator/KycNavigatorFragment$onViewCreated$2", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "kyc_release"})
    /* compiled from: KycNavigatorFragment.kt */
    public static final class v extends ah {
        final /* synthetic */ a this$0;

        v(a aVar) {
            this.this$0 = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            this.this$0.aLz().iI(editable.toString());
        }
    }

    private final KycCaller aIG() {
        kotlin.d dVar = this.dxE;
        kotlin.reflect.j jVar = anY[3];
        return (KycCaller) dVar.getValue();
    }

    private final KycVerificationContext aIJ() {
        kotlin.d dVar = this.dAz;
        kotlin.reflect.j jVar = anY[4];
        return (KycVerificationContext) dVar.getValue();
    }

    private final KycStepType aLy() {
        kotlin.d dVar = this.dAy;
        kotlin.reflect.j jVar = anY[2];
        return (KycStepType) dVar.getValue();
    }

    public abstract void Ao();

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public com.iqoption.core.ui.d.c KX() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean aIL() {
        kotlin.d dVar = this.dAx;
        kotlin.reflect.j jVar = anY[1];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public abstract void aLG();

    /* Access modifiers changed, original: protected|final */
    public final boolean asT() {
        kotlin.d dVar = this.cGn;
        kotlin.reflect.j jVar = anY[0];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public abstract void close();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ com.iqoption.kyc.b.u d(a aVar) {
        com.iqoption.kyc.b.u uVar = aVar.dAB;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return uVar;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* Access modifiers changed, original: protected|final */
    public final c aLz() {
        c cVar = this.dAA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return cVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dAA = c.dAJ.aA(this);
        c cVar = this.dAA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        cVar.a(aLy(), this.dsl);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dAB = (com.iqoption.kyc.b.u) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.kyc.o.e.fragment_kyc_navigator, viewGroup, false, 4, null);
        com.iqoption.kyc.b.u uVar = this.dAB;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return uVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.kyc.b.u uVar = this.dAB;
        String str = "binding";
        if (uVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = uVar.dvj.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.kycToolbarLayout.toolbarBack");
        imageView.setOnClickListener(new o(this, view));
        com.iqoption.kyc.b.u uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        uVar2.dvj.dwK.addTextChangedListener(new v(this));
        uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bq bqVar = uVar2.dvg;
        TextView textView = bqVar.dwB;
        String str2 = "kycPrev";
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.a(textView, com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.kyc.o.c.ic_arrow_left));
        textView = bqVar.dwz;
        String str3 = "kycNext";
        kotlin.jvm.internal.i.e(textView, str3);
        com.iqoption.core.ext.a.b(textView, com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.kyc.o.c.ic_arrow_right));
        textView = bqVar.dwB;
        kotlin.jvm.internal.i.e(textView, str2);
        textView.setOnClickListener(new t(this));
        TextView textView2 = bqVar.dwz;
        kotlin.jvm.internal.i.e(textView2, str3);
        textView2.setOnClickListener(new u(this));
        uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView2 = uVar2.dvj.dwJ;
        kotlin.jvm.internal.i.e(imageView2, "binding.kycToolbarLayout.kycSearchClear");
        imageView2.setOnClickListener(new p(this));
        uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        imageView2 = uVar2.dvj.dwL;
        kotlin.jvm.internal.i.e(imageView2, "binding.kycToolbarLayout.kycSearchIcon");
        imageView2.setOnClickListener(new q(this));
        uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ProgressBar progressBar = uVar2.dvj.dwI;
        kotlin.jvm.internal.i.e(progressBar, "binding.kycToolbarLayout.kycProgress");
        progressBar.setMax(com.iqoption.core.microservices.kyc.response.step.f.afP());
        uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView2 = uVar2.dvj.dwM;
        kotlin.jvm.internal.i.e(textView2, "binding.kycToolbarLayout.kycSkip");
        textView2.setOnClickListener(new r(this));
        uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        imageView2 = uVar2.dvj.dwH;
        kotlin.jvm.internal.i.e(imageView2, "binding.kycToolbarLayout.kycInfoIcon");
        imageView2.setOnClickListener(new s(this));
        S(bundle);
    }

    private final boolean aLA() {
        com.iqoption.kyc.b.u uVar = this.dAB;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        EditText editText = uVar.dvj.dwK;
        kotlin.jvm.internal.i.e(editText, "binding.kycToolbarLayout.kycSearchEdit");
        return com.iqoption.core.ext.a.af(editText);
    }

    private final void S(Bundle bundle) {
        c cVar = this.dAA;
        String str = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        cVar.MK().observe(lifecycleOwner, new b(this));
        cVar = this.dAA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.aJr().observe(lifecycleOwner, new g(this));
        if (aLy() == null) {
            alE().a(com.iqoption.kyc.steps.b.dEd.aLM(), true);
        }
        KycVerificationContext aIJ = bundle == null ? aIJ() : null;
        cVar = this.dAA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar.a(aLy(), this.dsl, aIJ).observe(lifecycleOwner, h.dAH);
        c cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJg().observe(lifecycleOwner, new i(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJn().observe(lifecycleOwner, new j(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJl().observe(lifecycleOwner, new k(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJm().observe(lifecycleOwner, new l(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJq().observe(lifecycleOwner, new m(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJs().observe(lifecycleOwner, new n(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJt().observe(lifecycleOwner, new c(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJf().observe(lifecycleOwner, new d(this));
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJv().observe(lifecycleOwner, e.dAG);
        cVar2 = this.dAA;
        if (cVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        cVar2.aJp().observe(lifecycleOwner, new f(this));
    }

    private final void eN(boolean z) {
        com.iqoption.kyc.b.u uVar = this.dAB;
        String str = "binding";
        if (uVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        uVar.dvj.dwO.setBackgroundColor(0);
        AutoTransition autoTransition = new AutoTransition();
        com.iqoption.kyc.b.u uVar2 = this.dAB;
        if (uVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        by byVar = uVar2.dvj;
        kotlin.jvm.internal.i.e(byVar, "binding.kycToolbarLayout");
        View root = byVar.getRoot();
        if (root != null) {
            TransitionManager.beginDelayedTransition((ViewGroup) root, autoTransition);
            String str2 = "binding.kycToolbarLayout.kycTitle";
            String str3 = "binding.kycToolbarLayout.kycSearchClear";
            String str4 = "binding.kycToolbarLayout.kycSearchIcon";
            String str5 = "binding.kycToolbarLayout.kycSearchEdit";
            com.iqoption.kyc.b.u uVar3;
            ImageView imageView;
            EditText editText;
            TextView textView;
            if (z) {
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                imageView = uVar3.dvj.dwL;
                kotlin.jvm.internal.i.e(imageView, str4);
                com.iqoption.core.ext.a.al(imageView);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                editText = uVar3.dvj.dwK;
                kotlin.jvm.internal.i.e(editText, str5);
                com.iqoption.core.ext.a.ak(editText);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                imageView = uVar3.dvj.dwJ;
                kotlin.jvm.internal.i.e(imageView, str3);
                com.iqoption.core.ext.a.ak(imageView);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = uVar3.dvj.dwO;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.al(textView);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                uVar3.dvj.dwK.postDelayed(new w(this), 300);
            } else {
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                imageView = uVar3.dvj.dwL;
                kotlin.jvm.internal.i.e(imageView, str4);
                com.iqoption.core.ext.a.ak(imageView);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                editText = uVar3.dvj.dwK;
                kotlin.jvm.internal.i.e(editText, str5);
                com.iqoption.core.ext.a.al(editText);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                editText = uVar3.dvj.dwK;
                kotlin.jvm.internal.i.e(editText, str5);
                editText.setText((CharSequence) null);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                imageView = uVar3.dvj.dwJ;
                kotlin.jvm.internal.i.e(imageView, str3);
                com.iqoption.core.ext.a.al(imageView);
                uVar3 = this.dAB;
                if (uVar3 == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                textView = uVar3.dvj.dwO;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.ak(textView);
            }
            aLB();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    private final void aLB() {
        com.iqoption.kyc.b.u uVar = this.dAB;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        by byVar = uVar.dvj;
        String str = "kycSkipProgress";
        String str2 = "kycSkip";
        TextView textView;
        ContentLoadingProgressBar contentLoadingProgressBar;
        if (!afJ() || aLA() || this.dAE) {
            textView = byVar.dwM;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
            contentLoadingProgressBar = byVar.dwN;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        } else if (kotlin.jvm.internal.i.y(this.dAD, Boolean.valueOf(true))) {
            textView = byVar.dwM;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
            contentLoadingProgressBar = byVar.dwN;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            contentLoadingProgressBar.setVisibility(0);
        } else if (aLD()) {
            textView = byVar.dwM;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.ak(textView);
            contentLoadingProgressBar = byVar.dwN;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        } else {
            textView = byVar.dwM;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
            contentLoadingProgressBar = byVar.dwN;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, str);
            com.iqoption.core.ext.a.al(contentLoadingProgressBar);
        }
    }

    private final void aLC() {
        com.iqoption.kyc.b.u uVar;
        ImageView imageView;
        com.iqoption.core.microservices.kyc.response.step.c cVar = this.dAC;
        String str = "binding";
        String str2 = "binding.kycToolbarLayout.kycInfoIcon";
        if (cVar != null) {
            Object afH = cVar.afH();
            if (afH != null) {
                if (com.iqoption.core.ext.c.b(afH, KycStepType.KYC_DOCUMENTS_POI, KycStepType.KYC_DOCUMENTS_POA) && !this.dAE) {
                    uVar = this.dAB;
                    if (uVar == null) {
                        kotlin.jvm.internal.i.lG(str);
                    }
                    imageView = uVar.dvj.dwH;
                    kotlin.jvm.internal.i.e(imageView, str2);
                    com.iqoption.core.ext.a.ak(imageView);
                    return;
                }
            }
        }
        uVar = this.dAB;
        if (uVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        imageView = uVar.dvj.dwH;
        kotlin.jvm.internal.i.e(imageView, str2);
        com.iqoption.core.ext.a.al(imageView);
    }

    private final boolean afJ() {
        com.iqoption.core.microservices.kyc.response.step.c cVar = this.dAC;
        return cVar != null && cVar.afJ();
    }

    private final boolean aLD() {
        if (afJ()) {
            Iterable afN = com.iqoption.core.microservices.kyc.response.step.d.afN();
            com.iqoption.core.microservices.kyc.response.step.c cVar = this.dAC;
            if (!u.b(afN, cVar != null ? cVar.afH() : null) && aLy() == null) {
                return true;
            }
        }
        return false;
    }

    public boolean aly() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && !com.iqoption.core.util.n.bQH.a(fragmentManager, TAG)) {
            return false;
        }
        com.iqoption.kyc.a.b aLE = aLE();
        if (aLE != null) {
            com.iqoption.kyc.a.a aVar = com.iqoption.kyc.a.a.dtL;
            String aKn = aLE.aKn();
            String aKo = aLE.aKo();
            c cVar = this.dAA;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            aVar.i("kyc_back", aKn, aKo, cVar.Er());
        }
        return super.aly();
    }

    private final com.iqoption.kyc.a.b aLE() {
        Fragment findFragmentById = alE().alH().findFragmentById(KW());
        if (!(findFragmentById instanceof com.iqoption.kyc.a.b)) {
            findFragmentById = null;
        }
        return (com.iqoption.kyc.a.b) findFragmentById;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        if (com.iqoption.core.ext.a.u(this).findFragmentById(com.iqoption.kyc.o.d.kycOtherFragment) == null) {
            return aLF();
        }
        com.iqoption.core.ext.a.u(this).popBackStack();
        return true;
    }

    private final boolean aLF() {
        FragmentManager alH = alE().alH();
        int backStackEntryCount = alH.getBackStackEntryCount();
        int i = 0;
        if (backStackEntryCount <= 0) {
            return false;
        }
        while (i < backStackEntryCount) {
            alH.popBackStackImmediate();
            i++;
        }
        return true;
    }

    public int KW() {
        return com.iqoption.kyc.o.d.kycNavigatorContainer;
    }

    private final void c(com.iqoption.core.ui.d.c cVar) {
        alE().a(cVar, false);
    }

    private final boolean aLH() {
        if (!aLA()) {
            return false;
        }
        eN(false);
        com.iqoption.core.util.v.az(getView());
        return true;
    }
}
