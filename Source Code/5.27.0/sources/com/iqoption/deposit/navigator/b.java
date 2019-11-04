package com.iqoption.deposit.navigator;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.v;
import com.iqoption.deposit.b.r;
import com.iqoption.deposit.l;
import com.iqoption.kyc.KycCaller;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#H\u0002J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001cH\u0002J\u0012\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0012\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00103\u001a\u00020\u001cH\u0016J\"\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020\u001cH\u0016J\u0010\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020=H\u0016J\u001a\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010@\u001a\u00020\u001cH&J\u0010\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u0015H&J\u001a\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J0\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020%2\u0006\u0010M\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u001fH\u0002J\b\u0010O\u001a\u00020\u0015H\u0002J\u001a\u0010P\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\u000e\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u00020\u001cH\u0002J\"\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\u00152\u0006\u0010W\u001a\u00020\u00152\b\u0010X\u001a\u0004\u0018\u00010YH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000¨\u0006["}, bng = {"Lcom/iqoption/deposit/navigator/DepositNavigatorFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "Lcom/iqoption/deposit/web/BaseRedirectWebPaymentFragment$OnFragmentInteractionListener;", "Lcom/iqoption/core/ui/fragment/FragmentNewIntent;", "()V", "binding", "Lcom/iqoption/deposit/databinding/FragmentDepositNavigatorBinding;", "getBinding", "()Lcom/iqoption/deposit/databinding/FragmentDepositNavigatorBinding;", "setBinding", "(Lcom/iqoption/deposit/databinding/FragmentDepositNavigatorBinding;)V", "initSelection", "Lcom/iqoption/deposit/InitSelectOption;", "kotlin.jvm.PlatformType", "getInitSelection", "()Lcom/iqoption/deposit/InitSelectOption;", "initSelection$delegate", "Lkotlin/Lazy;", "loadingEvent", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "returnToParent", "", "getReturnToParent", "()Z", "returnToParent$delegate", "viewModel", "Lcom/iqoption/deposit/navigator/DepositNavigatorViewModel;", "closeDeposit", "", "isDepSucceed", "getContainerId", "", "getDepositPreset", "Ljava/util/ArrayList;", "Lcom/iqoption/core/features/limit/CurrencyValue;", "Lkotlin/collections/ArrayList;", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "observeSelectedMethodIfNeeded", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDepositPageWebPaymentHold", "onDepositPageWebPaymentResult", "isSuccess", "depositParams", "Lcom/iqoption/deposit/DepositParams;", "session", "", "onDepositPageWebPaymentStartAgain", "onNewIntent", "intent", "Landroid/content/Intent;", "onViewCreated", "view", "openSupport", "performClose", "navigateToParent", "prepareKycBeforeDep", "Lcom/iqoption/kyc/KycBuilder;", "showCysecScreen", "verificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "setupFragment", "fm", "ft", "Landroidx/fragment/app/FragmentTransaction;", "navigationEntry", "show", "containerId", "shouldSelectFirstMethod", "showKycBeforeDep", "showKycScreenForHold", "kycData", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "showMethodsScreen", "updateFragmentsVisibility", "showMaster", "showDetails", "selectedItem", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "Companion", "deposit_release"})
/* compiled from: DepositNavigatorFragment.kt */
public abstract class b extends com.iqoption.core.ui.d.b implements com.iqoption.core.ui.fragment.c, com.iqoption.deposit.web.a.b {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "returnToParent", "getReturnToParent()Z")), k.a(new PropertyReference1Impl(k.G(b.class), "initSelection", "getInitSelection()Lcom/iqoption/deposit/InitSelectOption;"))};
    private static final ConcurrentHashMap<String, com.iqoption.core.features.b.a> bhq = new ConcurrentHashMap();
    public static final a cGp = new a();
    private HashMap apm;
    protected r cGk;
    private d cGl;
    private com.iqoption.core.analytics.b cGm;
    private final kotlin.d cGn = g.c(new DepositNavigatorFragment$returnToParent$2(this));
    private final kotlin.d cGo = g.c(new DepositNavigatorFragment$initSelection$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/deposit/navigator/DepositNavigatorFragment$Companion;", "", "()V", "ARG_INIT_SELECTION", "", "ARG_RETURN_TO_PARENT", "TAG", "getTAG", "()Ljava/lang/String;", "paramsCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/iqoption/core/features/deposit/DefaultPresetParams;", "closeDeposit", "", "child", "Landroidx/fragment/app/Fragment;", "isDepSucceed", "", "findInstance", "Lcom/iqoption/deposit/navigator/DepositNavigatorFragment;", "getNavigator", "Lcom/iqoption/core/ui/navigation/StackNavigator;", "initSelection", "Lcom/iqoption/deposit/InitSelectOption;", "openSupport", "prepareArguments", "Landroid/os/Bundle;", "selectOption", "returnToParent", "shouldSelectFirstMethod", "showKycBeforeDep", "showCysecScreen", "verificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "showKycScreenForHold", "kycData", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "showMethodsScreen", "deposit_release"})
    /* compiled from: DepositNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.g P(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return ((b) com.iqoption.core.ext.a.a(fragment, b.class)).alE();
        }

        public final Bundle a(l lVar, boolean z) {
            Bundle bundle = new Bundle();
            if (lVar != null) {
                bundle.putParcelable("ARG_INIT_SELECTION", lVar);
            }
            bundle.putBoolean("ARG_RETURN_TO_PARENT", z);
            return bundle;
        }

        public final void b(Fragment fragment, boolean z) {
            kotlin.jvm.internal.i.f(fragment, "child");
            b U = U(fragment);
            FragmentActivity activity = U.getActivity();
            if (activity != null) {
                v.j(activity);
            }
            U.cR(z);
        }

        public final void a(Fragment fragment, boolean z, KycVerificationContext kycVerificationContext) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(kycVerificationContext, "verificationContext");
            U(fragment).a(z, kycVerificationContext);
        }

        public final void Q(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            U(fragment).apL();
        }

        public final boolean R(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return U(fragment).asj();
        }

        public final l S(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            return U(fragment).asU();
        }

        public final void a(Fragment fragment, com.iqoption.core.microservices.kyc.response.k kVar) {
            kotlin.jvm.internal.i.f(fragment, "child");
            kotlin.jvm.internal.i.f(kVar, "kycData");
            U(fragment).b(kVar);
        }

        public final void T(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "child");
            U(fragment).asW();
        }

        private final b U(Fragment fragment) {
            return (b) com.iqoption.core.ext.a.a(fragment, b.class);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/ext/GsonExt$parseGson$$inlined$typeOf$4"})
    /* compiled from: GsonExtensions.kt */
    public static final class b extends TypeToken<com.iqoption.core.features.b.a> {
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "selectedMethod", "Lcom/iqoption/core/microservices/billing/response/deposit/cashboxitem/CashboxItem;", "onChanged"})
    /* compiled from: DepositNavigatorFragment.kt */
    static final class c<T> implements Observer<com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a> {
        final /* synthetic */ b this$0;

        c(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: k */
        public final void onChanged(com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar) {
            if (aVar != null) {
                this.this$0.a(false, true, aVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/billing/CashboxDisplayData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositNavigatorFragment.kt */
    static final class d<T> implements Observer<com.iqoption.core.ui.d<com.iqoption.billing.f>> {
        final /* synthetic */ b this$0;

        d(b bVar) {
            this.this$0 = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
        /* JADX WARNING: Missing block: B:16:0x0035, code skipped:
            if ((r2.isEmpty() ^ 1) == 1) goto L_0x0048;
     */
        /* JADX WARNING: Missing block: B:21:0x0046, code skipped:
            if ((r1.isEmpty() ^ 1) == 1) goto L_0x0048;
     */
        /* JADX WARNING: Missing block: B:22:0x0048, code skipped:
            com.iqoption.deposit.navigator.b.a(r4.this$0).a((com.iqoption.billing.f) r5.getData());
            r5 = com.iqoption.deposit.navigator.b.b(r4.this$0);
     */
        /* JADX WARNING: Missing block: B:23:0x005d, code skipped:
            if (r5 == null) goto L_?;
     */
        /* JADX WARNING: Missing block: B:24:0x005f, code skipped:
            r5.a((java.lang.Number) java.lang.Integer.valueOf(1));
            r5.Cc();
            com.iqoption.deposit.navigator.b.a(r4.this$0, (com.iqoption.core.analytics.b) null);
     */
        /* JADX WARNING: Missing block: B:29:?, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:30:?, code skipped:
            return;
     */
        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<com.iqoption.billing.f> r5) {
            /*
            r4 = this;
            r0 = 0;
            if (r5 == 0) goto L_0x0016;
        L_0x0003:
            r1 = r5.getData();
            r1 = (com.iqoption.billing.f) r1;
            if (r1 == 0) goto L_0x0016;
        L_0x000b:
            r1 = r1.Kp();
            if (r1 == 0) goto L_0x0016;
        L_0x0011:
            r1 = r1.Km();
            goto L_0x0017;
        L_0x0016:
            r1 = r0;
        L_0x0017:
            if (r5 == 0) goto L_0x0073;
        L_0x0019:
            r2 = r5.isSuccess();
            r3 = 1;
            if (r2 != r3) goto L_0x0073;
        L_0x0020:
            r2 = r5.getData();
            r2 = (com.iqoption.billing.f) r2;
            if (r2 == 0) goto L_0x0037;
        L_0x0028:
            r2 = r2.Ko();
            if (r2 == 0) goto L_0x0037;
        L_0x002e:
            r2 = (java.util.Collection) r2;
            r2 = r2.isEmpty();
            r2 = r2 ^ r3;
            if (r2 == r3) goto L_0x0048;
        L_0x0037:
            if (r1 == 0) goto L_0x0073;
        L_0x0039:
            r1 = r1.aao();
            if (r1 == 0) goto L_0x0073;
        L_0x003f:
            r1 = (java.util.Collection) r1;
            r1 = r1.isEmpty();
            r1 = r1 ^ r3;
            if (r1 != r3) goto L_0x0073;
        L_0x0048:
            r1 = r4.this$0;
            r1 = com.iqoption.deposit.navigator.b.a(r1);
            r5 = r5.getData();
            r5 = (com.iqoption.billing.f) r5;
            r1.a(r5);
            r5 = r4.this$0;
            r5 = r5.cGm;
            if (r5 == 0) goto L_0x0098;
        L_0x005f:
            r1 = java.lang.Integer.valueOf(r3);
            r1 = (java.lang.Number) r1;
            r5.a(r1);
            r5.Cc();
            r5 = r4.this$0;
            r0 = (com.iqoption.core.analytics.b) r0;
            r5.cGm = r0;
            goto L_0x0098;
        L_0x0073:
            r5 = r4.this$0;
            r5 = com.iqoption.deposit.navigator.b.a(r5);
            r5.a(r0);
            r5 = r4.this$0;
            r5 = r5.cGm;
            if (r5 == 0) goto L_0x0098;
        L_0x0084:
            r1 = 0;
            r1 = java.lang.Integer.valueOf(r1);
            r1 = (java.lang.Number) r1;
            r5.a(r1);
            r5.Cc();
            r5 = r4.this$0;
            r0 = (com.iqoption.core.analytics.b) r0;
            r5.cGm = r0;
        L_0x0098:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.navigator.b$d.onChanged(com.iqoption.core.ui.d):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/deposit/navigator/WebPaymentResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositNavigatorFragment.kt */
    static final class e<T> implements Observer<g> {
        final /* synthetic */ b this$0;

        e(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final void onChanged(g gVar) {
            if (gVar instanceof a) {
                a aVar = (a) gVar;
                String str = aVar.isSuccess() ? "deposit" : "error_deposit";
                com.iqoption.deposit.i aqY = aVar.aqY();
                com.iqoption.core.ui.d.c a = com.iqoption.deposit.light.b.a.cEE.a(str, aqY.aoo().getName(), aqY.aeo(), aVar.Zx(), aqY.aom());
                this.this$0.alE().alG();
                com.iqoption.core.ui.d.g.a(this.this$0.alE(), a, false, 2, null);
            } else if (gVar instanceof f) {
                this.this$0.alE().alG();
            } else if (gVar instanceof e) {
                this.this$0.alE().alG();
            }
            b.a(this.this$0).aou();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "screen", "Lcom/iqoption/deposit/light/DepositPayResultScreen;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositNavigatorFragment.kt */
    static final class f<T> implements Observer<com.iqoption.deposit.light.a> {
        final /* synthetic */ b this$0;

        f(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.deposit.light.a aVar) {
            if (aVar != null) {
                v.j(com.iqoption.core.ext.a.r(this.this$0));
                if (aVar.arC()) {
                    com.iqoption.core.ui.d.g.a(this.this$0.alE(), aVar.arB(), false, 2, null);
                } else {
                    com.iqoption.core.ui.d.g.b(this.this$0.alE(), aVar.arB(), false, 2, null);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: DepositNavigatorFragment.kt */
    static final class g<T> implements Observer<com.iqoption.core.microservices.billing.response.crypto.a> {
        final /* synthetic */ b this$0;

        g(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: f */
        public final void onChanged(com.iqoption.core.microservices.billing.response.crypto.a aVar) {
            if (aVar != null) {
                int i = c.aob[aVar.ZR().ordinal()];
                if (i != 1) {
                    String str = "BigDecimal.valueOf(cryptoDeposit.amountFiat)";
                    if (i == 2) {
                        com.iqoption.deposit.light.b.a.a aVar2 = com.iqoption.deposit.light.b.a.cEE;
                        String ZO = aVar.ZO();
                        BigDecimal valueOf = BigDecimal.valueOf(aVar.ZN());
                        kotlin.jvm.internal.i.e(valueOf, str);
                        com.iqoption.core.ui.d.g.a(this.this$0.alE(), aVar2.a("deposit", ZO, valueOf, aVar.ZX(), false), false, 2, null);
                        return;
                    } else if (i == 3 || i == 4) {
                        this.this$0.alE().q(com.iqoption.deposit.crypto.refund.a.cAp.Bx(), true);
                        com.iqoption.deposit.light.b.a.a aVar3 = com.iqoption.deposit.light.b.a.cEE;
                        String ZO2 = aVar.ZO();
                        BigDecimal valueOf2 = BigDecimal.valueOf(aVar.ZN());
                        kotlin.jvm.internal.i.e(valueOf2, str);
                        com.iqoption.core.ui.d.g.a(this.this$0.alE(), aVar3.a("error_deposit", ZO2, valueOf2, aVar.ZX(), false), false, 2, null);
                        return;
                    } else {
                        return;
                    }
                }
                this.this$0.alE().q(com.iqoption.deposit.crypto.refund.a.cAp.Bx(), true);
                this.this$0.asW();
                b.a(this.this$0).i(aVar);
            }
        }
    }

    private final boolean asT() {
        kotlin.d dVar = this.cGn;
        j jVar = anY[0];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final l asU() {
        kotlin.d dVar = this.cGo;
        j jVar = anY[1];
        return (l) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public com.iqoption.core.ui.d.c KX() {
        return null;
    }

    public abstract void apL();

    public abstract void cS(boolean z);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cGl = d.cGs.V(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cGk = (r) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.deposit.o.f.fragment_deposit_navigator, viewGroup, false, 4, null);
        r rVar = this.cGk;
        if (rVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return rVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        boolean a = ag.a(getResources());
        d dVar = this.cGl;
        String str = "viewModel";
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a aVar = (com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a) dVar.aoy().getValue();
        boolean z = true;
        Object obj = aVar != null ? 1 : null;
        boolean z2 = a || obj == null;
        if (!a && obj == null) {
            z = false;
        }
        a(z2, z, aVar);
        asV();
        this.cGm = com.iqoption.core.d.Um().EC().b("deposit-page_loading", 0.0d, com.iqoption.deposit.d.a.cGB.atf(), true);
        d dVar2 = this.cGl;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        dVar2.atb().observe(lifecycleOwner, new d(this));
        dVar2 = this.cGl;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar2.atd().observe(lifecycleOwner, new e(this));
        dVar2 = this.cGl;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar2.aos().observe(lifecycleOwner, new f(this));
        dVar2 = this.cGl;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar2.aoI().observe(lifecycleOwner, new g(this));
    }

    private final void asV() {
        if (!ag.a(getResources())) {
            d dVar = this.cGl;
            if (dVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            dVar.aoy().observe(this, new c(this));
        }
    }

    private final void asW() {
        if (!ag.a(getResources())) {
            a(true, false, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    private final void a(boolean r9, boolean r10, com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a r11) {
        /*
        r8 = this;
        r6 = com.iqoption.core.ext.a.u(r8);
        r7 = r6.beginTransaction();
        r0 = "fm.beginTransaction()";
        kotlin.jvm.internal.i.e(r7, r0);
        r0 = com.iqoption.deposit.o.e.depositMethodsPane;
        r0 = r6.findFragmentById(r0);
        if (r0 != 0) goto L_0x001d;
    L_0x0015:
        r0 = com.iqoption.deposit.o.e.depositContentPane;
        r0 = r6.findFragmentById(r0);
        if (r0 == 0) goto L_0x0034;
    L_0x001d:
        if (r9 != 0) goto L_0x0029;
    L_0x001f:
        if (r10 == 0) goto L_0x0029;
    L_0x0021:
        r0 = com.iqoption.deposit.o.a.slide_in_right;
        r1 = com.iqoption.deposit.o.a.slide_out_left;
        r7.setCustomAnimations(r0, r1);
        goto L_0x0034;
    L_0x0029:
        if (r9 == 0) goto L_0x0034;
    L_0x002b:
        if (r10 != 0) goto L_0x0034;
    L_0x002d:
        r0 = com.iqoption.deposit.o.a.slide_in_left;
        r1 = com.iqoption.deposit.o.a.slide_out_right;
        r7.setCustomAnimations(r0, r1);
    L_0x0034:
        r0 = com.iqoption.deposit.light.methods.h.cFu;
        r3 = r0.apA();
        r0 = r11 instanceof com.iqoption.core.microservices.billing.response.crypto.a;
        if (r0 == 0) goto L_0x0057;
    L_0x003e:
        r11 = (com.iqoption.core.microservices.billing.response.crypto.a) r11;
        r1 = r11.ZR();
        r2 = com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus.NEW;
        if (r1 != r2) goto L_0x0057;
    L_0x0048:
        r0 = com.iqoption.deposit.crypto.address.a.cze;
        r1 = r11.ZF();
        r11 = r11.ZP();
        r11 = r0.h(r1, r11);
        goto L_0x006a;
    L_0x0057:
        if (r0 == 0) goto L_0x0060;
    L_0x0059:
        r11 = com.iqoption.deposit.crypto.b.b.cAy;
        r11 = r11.aqV();
        goto L_0x006a;
    L_0x0060:
        r11 = com.iqoption.deposit.light.perform.c.cFO;
        r0 = r8.asZ();
        r11 = r11.h(r0);
    L_0x006a:
        if (r9 == 0) goto L_0x007d;
    L_0x006c:
        if (r10 != 0) goto L_0x007d;
    L_0x006e:
        r0 = r3.getName();
        r0 = r6.findFragmentByTag(r0);
        r0 = (com.iqoption.deposit.light.methods.h) r0;
        if (r0 == 0) goto L_0x007d;
    L_0x007a:
        r0.clearSelection();
    L_0x007d:
        r5 = com.iqoption.deposit.o.e.depositMethodsPane;
        r0 = r8;
        r1 = r6;
        r2 = r7;
        r4 = r9;
        r0.a(r1, r2, r3, r4, r5);
        r5 = com.iqoption.deposit.o.e.depositContentPane;
        r3 = r11;
        r4 = r10;
        r0.a(r1, r2, r3, r4, r5);
        r7.commitAllowingStateLoss();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.navigator.b.a(boolean, boolean, com.iqoption.core.microservices.billing.response.deposit.cashboxitem.a):void");
    }

    private final void a(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, com.iqoption.core.ui.d.c cVar, boolean z, int i) {
        Fragment findFragmentById = fragmentManager.findFragmentById(i);
        if (z) {
            if (findFragmentById == null || !kotlin.jvm.internal.i.y(findFragmentById.getClass().getName(), cVar.alF())) {
                fragmentTransaction.replace(i, cVar.bh(com.iqoption.core.ext.a.q(this)), cVar.getName());
            } else {
                fragmentTransaction.show(findFragmentById);
            }
        } else if (findFragmentById != null) {
            fragmentTransaction.hide(findFragmentById);
        }
    }

    public boolean o(Intent intent) {
        kotlin.jvm.internal.i.f(intent, "intent");
        for (Fragment fragment : com.iqoption.core.ext.a.u(this).getFragments()) {
            if ((fragment instanceof com.iqoption.core.ui.fragment.c) && ((com.iqoption.core.ui.fragment.c) fragment).o(intent)) {
                return true;
            }
        }
        return false;
    }

    public int KW() {
        return com.iqoption.deposit.o.e.depositNavigatorContainer;
    }

    public void b(boolean z, com.iqoption.deposit.i iVar, String str) {
        kotlin.jvm.internal.i.f(iVar, "depositParams");
        com.iqoption.billing.repository.a.ayY.Kx();
        d dVar = this.cGl;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.b(z, iVar, str);
    }

    public void asX() {
        com.iqoption.billing.repository.a.ayY.Kx();
        d dVar = this.cGl;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.asX();
    }

    public void asY() {
        d dVar = this.cGl;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.asY();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        if (!(getContext() == null || com.iqoption.core.ext.a.p(this) || fragmentManager == null)) {
            Fragment findFragmentById = fragmentManager.findFragmentById(com.iqoption.deposit.o.e.depositContentPane);
            if (findFragmentById != null && findFragmentById.isVisible()) {
                d dVar = this.cGl;
                if (dVar == null) {
                    kotlin.jvm.internal.i.lG("viewModel");
                }
                dVar.i(null);
                a(true, false, null);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    private final void cR(boolean r4) {
        /*
        r3 = this;
        r0 = r3.isAdded();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = 1;
        r1 = 0;
        if (r4 == 0) goto L_0x001d;
    L_0x000b:
        r4 = r3.cGl;
        if (r4 != 0) goto L_0x0015;
    L_0x000f:
        r2 = "viewModel";
        kotlin.jvm.internal.i.lG(r2);
    L_0x0015:
        r4 = r4.aoK();
        if (r4 == 0) goto L_0x001d;
    L_0x001b:
        r4 = 1;
        goto L_0x001e;
    L_0x001d:
        r4 = 0;
    L_0x001e:
        if (r4 == 0) goto L_0x0032;
    L_0x0020:
        r3.cS(r1);
        r4 = new com.iqoption.kyc.e;
        r4.<init>();
        r4.ek(r0);
        r0 = r3;
        r0 = (androidx.fragment.app.Fragment) r0;
        r4.ai(r0);
        goto L_0x003f;
    L_0x0032:
        r4 = r3.asT();
        if (r4 == 0) goto L_0x003c;
    L_0x0038:
        r3.cS(r0);
        goto L_0x003f;
    L_0x003c:
        r3.cS(r1);
    L_0x003f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.navigator.b.cR(boolean):void");
    }

    /* JADX WARNING: Missing block: B:3:0x0010, code skipped:
            if (r0 != null) goto L_0x0015;
     */
    private final boolean asj() {
        /*
        r3 = this;
        r0 = com.iqoption.core.d.EH();
        r1 = "experimental-deposit-page";
        r0 = r0.ei(r1);
        if (r0 == 0) goto L_0x0013;
    L_0x000c:
        r0 = r0.getStatus();
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r0 = "disabled";
    L_0x0015:
        r1 = r0.hashCode();
        r2 = 0;
        switch(r1) {
            case -2059248520: goto L_0x0041;
            case -1619565966: goto L_0x003a;
            case -1605018400: goto L_0x0030;
            case 1275752347: goto L_0x0027;
            case 1631266500: goto L_0x001e;
            default: goto L_0x001d;
        };
    L_0x001d:
        goto L_0x0051;
    L_0x001e:
        r1 = "light-landscape";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0051;
    L_0x0026:
        goto L_0x0038;
    L_0x0027:
        r1 = "dark-show-presets";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0051;
    L_0x002f:
        goto L_0x0038;
    L_0x0030:
        r1 = "dark-hide-presets";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0051;
    L_0x0038:
        r2 = 1;
        goto L_0x0051;
    L_0x003a:
        r1 = "light-portrait";
        r0 = r0.equals(r1);
        goto L_0x0051;
    L_0x0041:
        r1 = "light-both-mode";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0051;
    L_0x0049:
        r0 = com.iqoption.core.ext.a.q(r3);
        r2 = com.iqoption.core.util.ag.aZ(r0);
    L_0x0051:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.navigator.b.asj():boolean");
    }

    private final void a(boolean z, KycVerificationContext kycVerificationContext) {
        b(z, kycVerificationContext).ai(this);
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.kyc.e b(boolean z, KycVerificationContext kycVerificationContext) {
        com.iqoption.kyc.e eVar = new com.iqoption.kyc.e();
        eVar.a(KycCaller.DEPOSIT);
        eVar.ei(z ^ 1);
        eVar.el(false);
        eVar.ej(true);
        eVar.c(kycVerificationContext);
        return eVar;
    }

    private final ArrayList<com.iqoption.core.features.c.a> asZ() {
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.core.d.EH().ei("default-preset");
        if (ei == null) {
            return null;
        }
        try {
            JsonElement ady = ei.ady();
            String jsonElement = ady.toString();
            kotlin.jvm.internal.i.e(jsonElement, "params.toString()");
            com.iqoption.core.features.b.a aVar = (com.iqoption.core.features.b.a) bhq.get(jsonElement);
            if (aVar == null) {
                Gson Ez = com.iqoption.core.d.Um().Ez();
                Type type = new b().getType();
                kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
                aVar = (com.iqoption.core.features.b.a) Ez.fromJson(ady, type);
                bhq.put(jsonElement, aVar);
            }
            for (Object next : aVar.Xm()) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.features.c.b) next).Xz(), ei.getStatus())) {
                    break;
                }
            }
            Object next2 = null;
            com.iqoption.core.features.c.b bVar = (com.iqoption.core.features.c.b) next2;
            if (bVar != null) {
                return bVar.XA();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(com.iqoption.core.microservices.kyc.response.k kVar) {
        kotlin.jvm.internal.i.f(kVar, "kycData");
        com.iqoption.kyc.e eVar = new com.iqoption.kyc.e();
        com.iqoption.core.microservices.kyc.response.step.c aeJ = kVar.aeJ();
        eVar.f(aeJ != null ? aeJ.afH() : null);
        eVar.a(KycCaller.DEPOSIT);
        eVar.el(false);
        eVar.c(KycVerificationContext.BILLING_DEPOSIT_AML);
        eVar.ai(this);
    }
}
