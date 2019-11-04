package com.iqoption.welcome.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.welcome.n;
import com.iqoption.welcome.o;
import com.iqoption.welcome.p;
import java.util.HashMap;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/welcome/recover/ForgotPasswordFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "animatorFactory", "Lcom/iqoption/welcome/recover/AnimatorFactory;", "binding", "Lcom/iqoption/welcome/databinding/FragmentForgotPasswordBinding;", "phoneEnabled", "", "viewModel", "Lcom/iqoption/welcome/recover/PasswordRecoveryViewModel;", "hideProgress", "", "onBack", "onCreateAnimator", "Landroid/animation/Animator;", "transit", "", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "recoverPassword", "showProgress", "Companion", "welcome_release"})
/* compiled from: ForgotPasswordFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a elX = new a();
    private HashMap apm;
    private com.iqoption.welcome.a.d elT;
    private boolean elU;
    private c elV;
    private a elW;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcome/recover/ForgotPasswordFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "welcome_release"})
    /* compiled from: ForgotPasswordFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/recover/ForgotPasswordFragment$onCreateAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "welcome_release"})
    /* compiled from: ForgotPasswordFragment.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ b elY;

        b(b bVar) {
            this.elY = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            super.onAnimationEnd(animator);
            if (this.elY.isAdded()) {
                v.b(this.elY.getContext(), b.c(this.elY).ekI);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ForgotPasswordFragment.kt */
    static final class e implements OnClickListener {
        public static final e elZ = new e();

        e() {
        }

        public final void onClick(View view) {
            com.iqoption.core.d.EC().dk("forgot-pass_email");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: ForgotPasswordFragment.kt */
    static final class f implements OnEditorActionListener {
        final /* synthetic */ b elY;

        f(b bVar) {
            this.elY = bVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.elY.bag();
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ForgotPasswordFragment.kt */
    static final class g implements Runnable {
        final /* synthetic */ b elY;
        final /* synthetic */ j ema;

        g(b bVar, j jVar) {
            this.elY = bVar;
            this.ema = jVar;
        }

        public final void run() {
            j jVar = this.ema;
            IQTextInputEditText iQTextInputEditText = b.c(this.elY).ekI;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
            Editable text = iQTextInputEditText.getText();
            if (text == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(text, "binding.emailEdit.text!!");
            jVar.afterTextChanged(text);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ b elY;

        public c(b bVar) {
            this.elY = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.elY.aZL();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ b elY;

        public d(b bVar) {
            this.elY = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.elY.bag();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "route", "Lcom/iqoption/welcome/WelcomeScreen;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ForgotPasswordFragment.kt */
    static final class h<T> implements Observer<n> {
        final /* synthetic */ b elY;

        h(b bVar) {
            this.elY = bVar;
        }

        /* renamed from: c */
        public final void onChanged(n nVar) {
            if (nVar != null && this.elY.getParentFragment() != null) {
                com.iqoption.welcome.p.a aVar = p.ekx;
                Fragment parentFragment = this.elY.getParentFragment();
                if (parentFragment == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
                aVar.bo(parentFragment).a(nVar);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ForgotPasswordFragment.kt */
    static final class i<T> implements Observer<String> {
        final /* synthetic */ b elY;

        i(b bVar) {
            this.elY = bVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            String str2 = "forgot-pass_send";
            if (str != null) {
                com.iqoption.core.d.z(str, 1);
                com.iqoption.core.d.EC().c(str2, 1.0d);
                this.elY.aZL();
                return;
            }
            com.iqoption.core.d.EC().c(str2, 0.0d);
            com.iqoption.core.d.ag(com.iqoption.welcome.g.g.unknown_error_occurred, 1);
            this.elY.aLa();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/recover/ForgotPasswordFragment$onViewCreated$watcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "welcome_release"})
    /* compiled from: ForgotPasswordFragment.kt */
    public static final class j extends ah {
        final /* synthetic */ b elY;

        j(b bVar) {
            this.elY = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            ContentLoadingProgressBar contentLoadingProgressBar = b.c(this.elY).bYW;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.progress");
            if (contentLoadingProgressBar.getVisibility() != 0) {
                IQTextInputEditText iQTextInputEditText = b.c(this.elY).ekI;
                kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
                String valueOf = String.valueOf(iQTextInputEditText.getText());
                if (valueOf != null) {
                    int length = v.trim(valueOf).toString().length();
                    TextView textView = b.c(this.elY).aRV;
                    kotlin.jvm.internal.i.e(textView, "binding.button");
                    textView.setEnabled(length > 0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ com.iqoption.welcome.a.d c(b bVar) {
        com.iqoption.welcome.a.d dVar = bVar.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return dVar;
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.elT = (com.iqoption.welcome.a.d) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.welcome.g.e.fragment_forgot_password, viewGroup, false);
        com.iqoption.welcome.a.d dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return dVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.welcome.a.d dVar = this.elT;
        String str = "binding";
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = dVar.bfR;
        kotlin.jvm.internal.i.e(imageView, "binding.backButton");
        imageView.setOnClickListener(new c(this));
        dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = dVar.aRV;
        kotlin.jvm.internal.i.e(textView, "binding.button");
        textView.setOnClickListener(new d(this));
        if (bundle == null) {
            dVar = this.elT;
            if (dVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            dVar.ekI.setText(com.iqoption.core.data.d.a.bdi.VZ());
        }
        this.elV = c.emd.bp(this);
        dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar.ekI.setOnClickListener(e.elZ);
        dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar.ekI.requestFocus();
        com.iqoption.welcome.a.d dVar2 = this.elT;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        this.elW = new a(dVar2);
        dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar.ekI.setOnEditorActionListener(new f(this));
        j jVar = new j(this);
        dVar2 = this.elT;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar2.ekI.addTextChangedListener(jVar);
        dVar2 = this.elT;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        dVar2.ekI.post(new g(this, jVar));
        c cVar = this.elV;
        String str2 = "viewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        LifecycleOwner lifecycleOwner = this;
        cVar.bad().observe(lifecycleOwner, new h(this));
        cVar = this.elV;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        cVar.bah().observe(lifecycleOwner, new i(this));
        Object value = o.ekt.N(com.iqoption.core.ext.a.r(this)).aZy().getValue();
        if (value == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        this.elU = ((Boolean) value).booleanValue();
        str2 = "binding.emailInput";
        TextInputLayout textInputLayout;
        if (this.elU) {
            dVar = this.elT;
            if (dVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textInputLayout = dVar.ekJ;
            kotlin.jvm.internal.i.e(textInputLayout, str2);
            textInputLayout.setHint(getString(com.iqoption.welcome.g.g.your_email_or_phone));
            dVar = this.elT;
            if (dVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            dVar.ekI.addTextChangedListener(new com.iqoption.core.e.a());
            if (VERSION.SDK_INT >= 21) {
                dVar = this.elT;
                if (dVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                dVar.ekI.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
                return;
            }
            dVar = this.elT;
            if (dVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            dVar.ekI.addTextChangedListener(new com.iqoption.core.e.d());
            return;
        }
        dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textInputLayout = dVar.ekJ;
        kotlin.jvm.internal.i.e(textInputLayout, str2);
        textInputLayout.setHint(getString(com.iqoption.welcome.g.g.your_email));
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        String str = "animatorFactory";
        a aVar;
        if (z) {
            aVar = this.elW;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            Animator aZJ = aVar.aZJ();
            aZJ.addListener(new b(this));
            return aZJ;
        }
        aVar = this.elW;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return aVar.aZK();
    }

    private final void aZL() {
        if (getParentFragment() != null) {
            com.iqoption.welcome.p.a aVar = p.ekx;
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
            aVar.bo(parentFragment).aZG();
        }
        v.j(getActivity());
    }

    private final void bag() {
        com.iqoption.welcome.a.d dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        IQTextInputEditText iQTextInputEditText = dVar.ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
        String valueOf = String.valueOf(iQTextInputEditText.getText());
        if ((((CharSequence) valueOf).length() == 0 ? 1 : null) == null && com.iqoption.welcome.c.ekd.A(valueOf, this.elU)) {
            v.j(getActivity());
            Lf();
            c cVar = this.elV;
            if (cVar == null) {
                kotlin.jvm.internal.i.lG("viewModel");
            }
            cVar.kh(valueOf);
            return;
        }
        int i;
        if (this.elU) {
            i = com.iqoption.welcome.g.g.incorrect_email_or_phone;
        } else {
            i = com.iqoption.welcome.g.g.please_enter_valid_email;
        }
        com.iqoption.core.d.ag(i, 1);
        com.iqoption.core.d.EC().c("forgot-pass_send", 0.0d);
    }

    private final void Lf() {
        com.iqoption.welcome.a.d dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = dVar.aRV;
        String str = "button";
        kotlin.jvm.internal.i.e(textView, str);
        textView.setEnabled(false);
        textView = dVar.aRV;
        kotlin.jvm.internal.i.e(textView, str);
        textView.setText((CharSequence) null);
        dVar.bYW.show();
        IQTextInputEditText iQTextInputEditText = dVar.ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "emailEdit");
        iQTextInputEditText.setEnabled(false);
    }

    private final void aLa() {
        com.iqoption.welcome.a.d dVar = this.elT;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = dVar.aRV;
        kotlin.jvm.internal.i.e(textView, "button");
        textView.setEnabled(true);
        dVar.aRV.setText(com.iqoption.welcome.g.g.send);
        dVar.bYW.hide();
        IQTextInputEditText iQTextInputEditText = dVar.ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "emailEdit");
        iQTextInputEditText.setEnabled(true);
    }
}
