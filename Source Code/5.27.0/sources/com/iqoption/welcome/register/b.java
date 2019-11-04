package com.iqoption.welcome.register;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.util.v;
import com.iqoption.welcome.n;
import com.iqoption.welcome.p;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H$J\b\u0010\u0015\u001a\u00020\u0016H$J\b\u0010\u0017\u001a\u00020\u0016H\u0004J\b\u0010\u0018\u001a\u00020\u0019H$J\b\u0010\u001a\u001a\u00020\bH$J\r\u0010\u001b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0016H$J\b\u0010 \u001a\u00020\u0016H\u0002J\u0012\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*H\u0014J\u001a\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010.\u001a\u00020/H$J\b\u00100\u001a\u00020\u001dH$J\b\u00101\u001a\u00020/H$J\b\u00102\u001a\u00020\u0019H%J\b\u00103\u001a\u00020-H$J\b\u00104\u001a\u00020\u001dH\u0004J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0016H$J\b\u00107\u001a\u00020\u001dH\u0002J\b\u00108\u001a\u00020-H$J\b\u00109\u001a\u00020\u001dH\u0014J\b\u0010:\u001a\u00020\u001dH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006;"}, bng = {"Lcom/iqoption/welcome/register/BaseRegistrationFragment;", "RegistrationViewModel", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "event", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "eventsProvider", "Lcom/iqoption/welcome/register/RegisterEventsProvider;", "getEventsProvider", "()Lcom/iqoption/welcome/register/RegisterEventsProvider;", "eventsProvider$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "setViewModel", "(Lcom/iqoption/welcome/register/BaseRegistrationViewModel;)V", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "acceptTermsCheck", "Landroid/widget/CheckBox;", "areFieldsValid", "", "closeKeyboardIfNeeded", "containerOther", "", "createEventsProvider", "createViewModel", "forceClose", "", "hideRegistrationProgress", "isTrialUser", "isValid", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onRegistrationFailed", "throwable", "", "onViewCreated", "view", "Landroid/view/View;", "policyTextView", "Landroid/widget/TextView;", "register", "registerButton", "registerButtonText", "registerProgress", "reportBackPressed", "setFieldsEnabled", "enabled", "showRegistrationProgress", "titleView", "updateButtonValidation", "updatePolicy", "welcome_release"})
/* compiled from: BaseRegistrationFragment.kt */
public abstract class b<RegistrationViewModel extends c> extends com.iqoption.core.ui.fragment.d {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "eventsProvider", "getEventsProvider()Lcom/iqoption/welcome/register/RegisterEventsProvider;"))};
    private HashMap apm;
    private com.iqoption.core.analytics.c bIW;
    protected RegistrationViewModel emh;
    private final kotlin.d emi = g.c(new BaseRegistrationFragment$eventsProvider$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a implements OnGlobalLayoutListener {
        final /* synthetic */ View bgH;
        final /* synthetic */ b this$0;

        public a(View view, b bVar) {
            this.bgH = view;
            this.this$0 = bVar;
        }

        public void onGlobalLayout() {
            this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.this$0.bax().requestFocus();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "RegistrationViewModel", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCheckedChanged"})
    /* compiled from: BaseRegistrationFragment.kt */
    static final class g implements OnCheckedChangeListener {
        final /* synthetic */ b this$0;

        g(b bVar) {
            this.this$0 = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.this$0.aNc();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ b this$0;

        public b(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            v.j(this.this$0.getActivity());
            this.this$0.bar();
            this.this$0.register();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "RegistrationViewModel", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseRegistrationFragment.kt */
    static final class c<T> implements Observer<Object> {
        final /* synthetic */ b this$0;

        c(b bVar) {
            this.this$0 = bVar;
        }

        public final void onChanged(Object obj) {
            this.this$0.baq();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "RegistrationViewModel", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "route", "Lcom/iqoption/welcome/WelcomeScreen;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseRegistrationFragment.kt */
    static final class d<T> implements Observer<n> {
        final /* synthetic */ b this$0;

        d(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: c */
        public final void onChanged(n nVar) {
            if (nVar != null && this.this$0.getParentFragment() != null) {
                com.iqoption.welcome.p.a aVar = p.ekx;
                Fragment parentFragment = this.this$0.getParentFragment();
                if (parentFragment == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
                aVar.bo(parentFragment).a(nVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, bng = {"<anonymous>", "", "RegistrationViewModel", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "isShown", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: BaseRegistrationFragment.kt */
    static final class e<T> implements Observer<Boolean> {
        final /* synthetic */ b this$0;

        e(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                this.this$0.bar();
            } else if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(false))) {
                this.this$0.bas();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "RegistrationViewModel", "Lcom/iqoption/welcome/register/BaseRegistrationViewModel;", "message", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BaseRegistrationFragment.kt */
    static final class f<T> implements Observer<String> {
        public static final f emj = new f();

        f() {
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.core.d.z(str, 1);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/register/BaseRegistrationFragment$updatePolicy$linkListener$1", "Lcom/iqoption/core/util/link/OpenBrowserClickListener;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "welcome_release"})
    /* compiled from: BaseRegistrationFragment.kt */
    public static final class h extends com.iqoption.core.util.b.g {
        final /* synthetic */ Context aOk;
        final /* synthetic */ b this$0;

        h(b bVar, Context context, Context context2) {
            this.this$0 = bVar;
            this.aOk = context;
            super(context2);
        }

        public void onLinkClicked(com.iqoption.core.util.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "link");
            super.onLinkClicked(aVar);
            String baP = this.this$0.bap().baP();
            if (baP != null) {
                com.iqoption.core.d.Um().EC().di(baP);
            }
        }
    }

    private final e bap() {
        kotlin.d dVar = this.emi;
        j jVar = anY[0];
        return (e) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract TextView baA();

    public abstract View baB();

    @StringRes
    public abstract int baC();

    public abstract e baD();

    public abstract boolean bak();

    public abstract RegistrationViewModel bav();

    public abstract int baw();

    public abstract View bax();

    public abstract TextView bay();

    public abstract CheckBox baz();

    public abstract void fx(boolean z);

    public abstract void register();

    /* Access modifiers changed, original: protected|final */
    public final RegistrationViewModel bao() {
        c cVar = this.emh;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return cVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.emh = bav();
    }

    public void onViewCreated(View view, Bundle bundle) {
        c cVar;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        String baO = bap().baO();
        if (baO != null) {
            this.bIW = com.iqoption.core.d.EC().dl(baO);
        }
        baA().setText(baC());
        view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view, this));
        baA().setOnClickListener(new b(this));
        baq();
        baO = "viewModel";
        if (!com.iqoption.core.data.d.e.bdq.Fz()) {
            cVar = this.emh;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG(baO);
            }
            cVar.baG().observe(this, new c(this));
        }
        aNc();
        cVar = this.emh;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(baO);
        }
        LifecycleOwner lifecycleOwner = this;
        cVar.bad().observe(lifecycleOwner, new d(this));
        cVar = this.emh;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(baO);
        }
        cVar.bab().observe(lifecycleOwner, new e(this));
        cVar = this.emh;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(baO);
        }
        cVar.bac().observe(lifecycleOwner, f.emj);
    }

    public void onDestroyView() {
        super.onDestroyView();
        com.iqoption.core.analytics.c cVar = this.bIW;
        if (cVar != null) {
            cVar.Cc();
        }
        this.bIW = (com.iqoption.core.analytics.c) null;
        Bj();
    }

    private final void baq() {
        Context context = getContext();
        if (context != null) {
            kotlin.jvm.internal.i.e(context, "context ?: return");
            String string = getString(com.iqoption.welcome.g.g.terms_and_conditions);
            kotlin.jvm.internal.i.e(string, "getString(R.string.terms_and_conditions)");
            com.iqoption.core.util.b.a aVar = new com.iqoption.core.util.b.a(string, com.iqoption.core.util.b.f.bn(context));
            String string2 = getString(com.iqoption.welcome.g.g.privacy_policy);
            kotlin.jvm.internal.i.e(string2, "getString(R.string.privacy_policy)");
            com.iqoption.core.util.b.a aVar2 = new com.iqoption.core.util.b.a(string2, com.iqoption.core.util.b.f.bo(context));
            h hVar = new h(this, context, context);
            baz().setVisibility(0);
            baz().setOnCheckedChangeListener(new g(this));
            String string3 = getString(com.iqoption.welcome.g.g.i_am_18_years_old_and_agree_n1_n2, aVar.getText(), aVar2.getText());
            kotlin.jvm.internal.i.e(string3, "getString(R.string.i_am_…Link.text, gdprLink.text)");
            com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{aVar, aVar2};
            com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, bay(), string3, 0, 0, false, hVar, 56, null));
        }
    }

    /* Access modifiers changed, original: protected */
    public void aNc() {
        baA().setEnabled(isValid());
    }

    private final void bar() {
        baA().setEnabled(false);
        baA().setText((CharSequence) null);
        com.iqoption.core.ext.a.ak(baB());
        fx(false);
    }

    private final void bas() {
        baA().setEnabled(isValid());
        baA().setText(baC());
        com.iqoption.core.ext.a.hide(baB());
        fx(true);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        bat();
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void bat() {
        String baQ = bap().baQ();
        if (baQ != null) {
            com.iqoption.core.d.Um().EC().di(baQ);
        }
    }

    private final boolean isValid() {
        return bak() && baz().isChecked();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean bau() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof com.iqoption.core.ui.a.a)) {
            activity = null;
        }
        com.iqoption.core.ui.a.a aVar = (com.iqoption.core.ui.a.a) activity;
        if (aVar == null || !aVar.akX()) {
            return false;
        }
        v.a((Context) com.iqoption.core.ext.a.r(this), getView());
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void azk() {
        bau();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.popBackStack();
        }
    }
}
