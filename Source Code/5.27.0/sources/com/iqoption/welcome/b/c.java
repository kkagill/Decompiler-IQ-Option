package com.iqoption.welcome.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ag;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.welcome.p;
import java.util.HashMap;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\"\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\"\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010#\u001a\u00020\u001aH\u0002J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u001eH\u0016J&\u0010)\u001a\u0004\u0018\u00010\u00162\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u001aH\u0016J\b\u00101\u001a\u00020\u001aH\u0002J\b\u00102\u001a\u00020\u001aH\u0002J\b\u00103\u001a\u00020\u001aH\u0002J\b\u00104\u001a\u00020\u001aH\u0002J\u001a\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u00162\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00107\u001a\u00020\u001aH\u0003J\u0010\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\u001aH\u0002J\b\u0010<\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006>"}, bng = {"Lcom/iqoption/welcome/login/LoginFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/welcome/login/OnActivityResultListener;", "()V", "animatorFactory", "Lcom/iqoption/welcome/login/AnimatorFactory;", "binding", "Lcom/iqoption/welcome/databinding/FragmentWelcomeLoginBinding;", "facebookAuthViewModel", "Lcom/iqoption/welcome/social/FacebookAuthViewModel;", "googleAuthViewModel", "Lcom/iqoption/welcome/social/GoogleAuthViewModel;", "loginViewModel", "Lcom/iqoption/welcome/login/LoginViewModel;", "progressObserver", "Landroidx/lifecycle/Observer;", "", "routeObserver", "Lcom/iqoption/welcome/WelcomeScreen;", "toastObserver", "", "viewToFocusOn", "Landroid/view/View;", "getViewToFocusOn", "()Landroid/view/View;", "hideLoginProgress", "", "login", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onActivityResultReceived", "onBackButtonClick", "onCreateAnimator", "Landroid/animation/Animator;", "transit", "enter", "nextAnim", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFacebookButtonClick", "onForgotPasswordClick", "onGoogleButtonClick", "onLoginButtonClick", "onViewCreated", "view", "prepareSocial", "reportSocialClicked", "type", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "showKeyboardIfPortrait", "showLoginProgress", "Companion", "welcome_release"})
/* compiled from: LoginFragment.kt */
public final class c extends com.iqoption.core.ui.fragment.d implements e {
    public static final String TAG = c.class.getName();
    public static final a elG = new a();
    private HashMap apm;
    private com.iqoption.welcome.d.c elA;
    private com.iqoption.welcome.d.b elB;
    private a elC;
    private final Observer<com.iqoption.welcome.n> elD = new m(this);
    private final Observer<Boolean> elE = new l(this);
    private final Observer<String> elF = n.elJ;
    private com.iqoption.welcome.a.m ely;
    private d elz;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/welcome/login/LoginFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "welcome_release"})
    /* compiled from: LoginFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/login/LoginFragment$onCreateAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "welcome_release"})
    /* compiled from: LoginFragment.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ c elH;

        b(c cVar) {
            this.elH = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            super.onAnimationEnd(animator);
            this.elH.aZS();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: LoginFragment.kt */
    static final class f implements OnEditorActionListener {
        final /* synthetic */ c elH;

        f(c cVar) {
            this.elH = cVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.elH.aZU();
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: LoginFragment.kt */
    static final class g implements Runnable {
        final /* synthetic */ c elH;
        final /* synthetic */ i elI;

        g(c cVar, i iVar) {
            this.elH = cVar;
            this.elI = iVar;
        }

        public final void run() {
            i iVar = this.elI;
            IQTextInputEditText iQTextInputEditText = c.e(this.elH).ekI;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
            Editable text = iQTextInputEditText.getText();
            if (text == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(text, "binding.emailEdit.text!!");
            iVar.afterTextChanged(text);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: LoginFragment.kt */
    static final class j implements OnClickListener {
        final /* synthetic */ c elH;

        j(c cVar) {
            this.elH = cVar;
        }

        public final void onClick(View view) {
            this.elH.aZX();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: LoginFragment.kt */
    static final class k implements OnClickListener {
        final /* synthetic */ c elH;

        k(c cVar) {
            this.elH = cVar;
        }

        public final void onClick(View view) {
            this.elH.aZW();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ c elH;

        public c(c cVar) {
            this.elH = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.elH.aZY();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ c elH;

        public d(c cVar) {
            this.elH = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.elH.aZV();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ c elH;

        public e(c cVar) {
            this.elH = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.elH.aZT();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "phoneEnabled", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: LoginFragment.kt */
    static final class h<T> implements Observer<Boolean> {
        final /* synthetic */ c elH;

        h(c cVar) {
            this.elH = cVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            kotlin.jvm.internal.i.e(bool, "phoneEnabled");
            String str = "binding.emailInput";
            TextInputLayout textInputLayout;
            if (bool.booleanValue()) {
                textInputLayout = c.e(this.elH).ekJ;
                kotlin.jvm.internal.i.e(textInputLayout, str);
                textInputLayout.setHint(this.elH.getString(com.iqoption.welcome.g.g.your_email_or_phone));
                c.e(this.elH).ekI.addTextChangedListener(new com.iqoption.core.e.a());
                if (VERSION.SDK_INT >= 21) {
                    c.e(this.elH).ekI.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
                    return;
                } else {
                    c.e(this.elH).ekI.addTextChangedListener(new com.iqoption.core.e.d());
                    return;
                }
            }
            textInputLayout = c.e(this.elH).ekJ;
            kotlin.jvm.internal.i.e(textInputLayout, str);
            textInputLayout.setHint(this.elH.getString(com.iqoption.welcome.g.g.your_email));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/login/LoginFragment$onViewCreated$watcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "welcome_release"})
    /* compiled from: LoginFragment.kt */
    public static final class i extends ah {
        final /* synthetic */ c elH;

        i(c cVar) {
            this.elH = cVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            ContentLoadingProgressBar contentLoadingProgressBar = c.e(this.elH).bYW;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.progress");
            if (contentLoadingProgressBar.getVisibility() != 0) {
                Object obj;
                IQTextInputEditText iQTextInputEditText = c.e(this.elH).ekI;
                kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
                CharSequence valueOf = String.valueOf(iQTextInputEditText.getText());
                boolean z = true;
                int length = valueOf.length() - 1;
                int i = 0;
                Object obj2 = null;
                while (i <= length) {
                    obj = valueOf.charAt(obj2 == null ? i : length) <= ' ' ? 1 : null;
                    if (obj2 == null) {
                        if (obj == null) {
                            obj2 = 1;
                        } else {
                            i++;
                        }
                    } else if (obj == null) {
                        break;
                    } else {
                        length--;
                    }
                }
                int length2 = valueOf.subSequence(i, length + 1).toString().length();
                IQTextInputEditText iQTextInputEditText2 = c.e(this.elH).ekL;
                kotlin.jvm.internal.i.e(iQTextInputEditText2, "binding.passwordEdit");
                CharSequence valueOf2 = String.valueOf(iQTextInputEditText2.getText());
                int length3 = valueOf2.length() - 1;
                length = 0;
                obj = null;
                while (length <= length3) {
                    Object obj3 = valueOf2.charAt(obj == null ? length : length3) <= ' ' ? 1 : null;
                    if (obj == null) {
                        if (obj3 == null) {
                            obj = 1;
                        } else {
                            length++;
                        }
                    } else if (obj3 == null) {
                        break;
                    } else {
                        length3--;
                    }
                }
                i = valueOf2.subSequence(length, length3 + 1).toString().length();
                TextView textView = c.e(this.elH).aRV;
                kotlin.jvm.internal.i.e(textView, "binding.button");
                if (length2 <= 0 || i <= 0) {
                    z = false;
                }
                textView.setEnabled(z);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isShown", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: LoginFragment.kt */
    static final class l<T> implements Observer<Boolean> {
        final /* synthetic */ c elH;

        l(c cVar) {
            this.elH = cVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (kotlin.jvm.internal.i.y(Boolean.TRUE, bool)) {
                this.elH.aZZ();
            } else if (kotlin.jvm.internal.i.y(Boolean.FALSE, bool)) {
                this.elH.baa();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "route", "Lcom/iqoption/welcome/WelcomeScreen;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: LoginFragment.kt */
    static final class m<T> implements Observer<com.iqoption.welcome.n> {
        final /* synthetic */ c elH;

        m(c cVar) {
            this.elH = cVar;
        }

        /* renamed from: c */
        public final void onChanged(com.iqoption.welcome.n nVar) {
            if (nVar != null && this.elH.getParentFragment() != null) {
                com.iqoption.welcome.p.a aVar = p.ekx;
                Fragment parentFragment = this.elH.getParentFragment();
                if (parentFragment == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
                aVar.bo(parentFragment).a(nVar);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "toast", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: LoginFragment.kt */
    static final class n<T> implements Observer<String> {
        public static final n elJ = new n();

        n() {
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.core.d.z(str, 1);
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final /* synthetic */ com.iqoption.welcome.a.m e(c cVar) {
        com.iqoption.welcome.a.m mVar = cVar.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mVar;
    }

    private final View aZQ() {
        com.iqoption.welcome.a.m mVar = this.ely;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText;
        if (mVar.ekI.length() == 0) {
            mVar = this.ely;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            iQTextInputEditText = mVar.ekI;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
            return iQTextInputEditText;
        }
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iQTextInputEditText = mVar.ekL;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.passwordEdit");
        return iQTextInputEditText;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a fVar;
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.ely = (com.iqoption.welcome.a.m) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.welcome.g.e.fragment_welcome_login, viewGroup, false);
        Resources resources = getResources();
        kotlin.jvm.internal.i.e(resources, "resources");
        String str = "binding";
        com.iqoption.welcome.a.m mVar;
        if (resources.getConfiguration().orientation == 1) {
            mVar = this.ely;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            fVar = new f(mVar);
        } else {
            mVar = this.ely;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            fVar = new b(mVar);
        }
        this.elC = fVar;
        com.iqoption.welcome.a.m mVar2 = this.ely;
        if (mVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return mVar2.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        com.iqoption.welcome.a.m mVar = this.ely;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = mVar.bfR;
        kotlin.jvm.internal.i.e(imageView, "binding.backButton");
        imageView.setOnClickListener(new c(this));
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = mVar.ekY;
        kotlin.jvm.internal.i.e(textView, "binding.forgotPassword");
        textView.setOnClickListener(new d(this));
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = mVar.aRV;
        kotlin.jvm.internal.i.e(textView, "binding.button");
        textView.setOnClickListener(new e(this));
        this.elz = com.iqoption.welcome.m.ekn.aZw().bm(this);
        if (bundle == null) {
            mVar = this.ely;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            mVar.ekI.setText(com.iqoption.core.data.d.a.bdi.VZ());
        }
        if (bundle != null) {
            aZS();
        }
        d dVar = this.elz;
        String str2 = "loginViewModel";
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        LifecycleOwner lifecycleOwner = this;
        dVar.bab().observe(lifecycleOwner, this.elE);
        dVar = this.elz;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        dVar.bac().observe(lifecycleOwner, this.elF);
        dVar = this.elz;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        dVar.bad().observe(lifecycleOwner, this.elD);
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar.ekL.setOnEditorActionListener(new f(this));
        i iVar = new i(this);
        com.iqoption.welcome.a.m mVar2 = this.ely;
        if (mVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextWatcher textWatcher = iVar;
        mVar2.ekI.addTextChangedListener(textWatcher);
        mVar2 = this.ely;
        if (mVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar2.ekL.addTextChangedListener(textWatcher);
        mVar2 = this.ely;
        if (mVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mVar2.ekI.post(new g(this, iVar));
        dVar = this.elz;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        dVar.bae().observe(lifecycleOwner, new h(this));
        aZR();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void aZR() {
        com.iqoption.welcome.m aZw = com.iqoption.welcome.m.ekn.aZw();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String str = "activity!!";
        kotlin.jvm.internal.i.e(activity, str);
        this.elB = aZw.L(activity);
        com.iqoption.welcome.d.b bVar = this.elB;
        String str2 = "facebookAuthViewModel";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        LifecycleOwner lifecycleOwner = this;
        bVar.bab().observe(lifecycleOwner, this.elE);
        bVar = this.elB;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        bVar.bac().observe(lifecycleOwner, this.elF);
        bVar = this.elB;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        bVar.bad().observe(lifecycleOwner, this.elD);
        aZw = com.iqoption.welcome.m.ekn.aZw();
        activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(activity, str);
        this.elA = aZw.M(activity);
        com.iqoption.welcome.d.c cVar = this.elA;
        str2 = "googleAuthViewModel";
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        cVar.bab().observe(lifecycleOwner, this.elE);
        cVar = this.elA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        cVar.bac().observe(lifecycleOwner, this.elF);
        cVar = this.elA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        cVar.bad().observe(lifecycleOwner, this.elD);
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.core.d.EH().ei("show-social-login");
        Object obj = (String) null;
        if (ei != null) {
            obj = ei.getStatus();
        }
        String str3 = "enabled";
        if (obj == null) {
            obj = str3;
        }
        String str4 = "binding.welcomeSocial.socialContainer";
        String str5 = "binding";
        com.iqoption.welcome.a.m mVar;
        if (com.iqoption.core.d.Un().Du() || kotlin.jvm.internal.i.y("disabled", obj) || com.iqoption.core.d.Un().Dq()) {
            mVar = this.ely;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str5);
            }
            LinearLayout linearLayout = mVar.ela.elu;
            kotlin.jvm.internal.i.e(linearLayout, str4);
            linearLayout.setVisibility(8);
            return;
        }
        com.iqoption.welcome.a.m mVar2 = this.ely;
        if (mVar2 == null) {
            kotlin.jvm.internal.i.lG(str5);
        }
        LinearLayout linearLayout2 = mVar2.ela.elu;
        kotlin.jvm.internal.i.e(linearLayout2, str4);
        linearLayout2.setVisibility(0);
        String str6 = "binding.welcomeSocial.googleLogin";
        View view;
        if (com.iqoption.core.ext.c.b(obj, str3, "google")) {
            mVar2 = this.ely;
            if (mVar2 == null) {
                kotlin.jvm.internal.i.lG(str5);
            }
            view = mVar2.ela.elt;
            kotlin.jvm.internal.i.e(view, str6);
            view.setVisibility(0);
            mVar2 = this.ely;
            if (mVar2 == null) {
                kotlin.jvm.internal.i.lG(str5);
            }
            mVar2.ela.elt.setOnTouchListener(new com.iqoption.core.ui.widget.h.a(0.0f, 0.0f, 3, null));
            mVar2 = this.ely;
            if (mVar2 == null) {
                kotlin.jvm.internal.i.lG(str5);
            }
            mVar2.ela.elt.setOnClickListener(new j(this));
        } else {
            mVar2 = this.ely;
            if (mVar2 == null) {
                kotlin.jvm.internal.i.lG(str5);
            }
            view = mVar2.ela.elt;
            kotlin.jvm.internal.i.e(view, str6);
            view.setVisibility(8);
        }
        str6 = "binding.welcomeSocial.facebookLogin";
        View view2;
        if (com.iqoption.core.d.Un().Di() || !com.iqoption.core.ext.c.b(obj, str3, "fb")) {
            mVar = this.ely;
            if (mVar == null) {
                kotlin.jvm.internal.i.lG(str5);
            }
            view2 = mVar.ela.els;
            kotlin.jvm.internal.i.e(view2, str6);
            view2.setVisibility(8);
            return;
        }
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str5);
        }
        view2 = mVar.ela.els;
        kotlin.jvm.internal.i.e(view2, str6);
        view2.setVisibility(0);
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str5);
        }
        mVar.ela.els.setOnTouchListener(new com.iqoption.core.ui.widget.h.a(0.0f, 0.0f, 3, null));
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str5);
        }
        mVar.ela.els.setOnClickListener(new k(this));
    }

    public void onDestroyView() {
        super.onDestroyView();
        com.iqoption.welcome.d.b bVar = this.elB;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("facebookAuthViewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        bVar.removeObservers(lifecycleOwner);
        com.iqoption.welcome.d.c cVar = this.elA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("googleAuthViewModel");
        }
        cVar.removeObservers(lifecycleOwner);
        Bj();
    }

    private final void aZS() {
        if (isAdded() && !isDetached()) {
            if (ag.a(getResources())) {
                com.iqoption.welcome.a.m mVar = this.ely;
                if (mVar == null) {
                    kotlin.jvm.internal.i.lG("binding");
                }
                mVar.alH.requestFocus();
            } else {
                View aZQ = aZQ();
                aZQ.requestFocus();
                v.b(getContext(), aZQ);
            }
        }
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        String str = "animatorFactory";
        a aVar;
        if (z) {
            aVar = this.elC;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            Animator aZJ = aVar.aZJ();
            aZJ.addListener(new b(this));
            return aZJ;
        }
        aVar = this.elC;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return aVar.aZK();
    }

    private final void aZT() {
        aZU();
    }

    private final void aZU() {
        d dVar = this.elz;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("loginViewModel");
        }
        com.iqoption.welcome.a.m mVar = this.ely;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = mVar.ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.emailEdit");
        CharSequence valueOf = String.valueOf(iQTextInputEditText.getText());
        int length = valueOf.length() - 1;
        int i = 0;
        Object obj = null;
        while (i <= length) {
            Object obj2 = valueOf.charAt(obj == null ? i : length) <= ' ' ? 1 : null;
            if (obj == null) {
                if (obj2 == null) {
                    obj = 1;
                } else {
                    i++;
                }
            } else if (obj2 == null) {
                break;
            } else {
                length--;
            }
        }
        String obj3 = valueOf.subSequence(i, length + 1).toString();
        com.iqoption.welcome.a.m mVar2 = this.ely;
        if (mVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText2 = mVar2.ekL;
        kotlin.jvm.internal.i.e(iQTextInputEditText2, "binding.passwordEdit");
        dVar.aG(obj3, String.valueOf(iQTextInputEditText2.getText()));
        v.j(getActivity());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        c(i, i2, intent);
    }

    public void c(int i, int i2, Intent intent) {
        com.iqoption.welcome.d.b bVar = this.elB;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("facebookAuthViewModel");
        }
        bVar.onActivityResult(i, i2, intent);
        com.iqoption.welcome.d.c cVar = this.elA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("googleAuthViewModel");
        }
        cVar.onActivityResult(i, i2, intent);
    }

    private final void aZV() {
        if (getParentFragment() != null) {
            com.iqoption.welcome.p.a aVar = p.ekx;
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
            aVar.bo(parentFragment).a(com.iqoption.welcome.f.ekg);
        }
        com.iqoption.core.d.EC().di("login_forgot-pass");
    }

    private final void aZW() {
        com.iqoption.welcome.d.b bVar = this.elB;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("facebookAuthViewModel");
        }
        bVar.br(this);
        aZZ();
        d(SocialTypeId.FACEBOOK);
    }

    private final void aZX() {
        com.iqoption.welcome.d.c cVar = this.elA;
        if (cVar == null) {
            kotlin.jvm.internal.i.lG("googleAuthViewModel");
        }
        cVar.bs(this);
        aZZ();
        d(SocialTypeId.GOOGLE_PLUS);
    }

    private final void d(SocialTypeId socialTypeId) {
        com.iqoption.core.d.EC().a("login_login-social", 1.0d, com.iqoption.core.microservices.core.register.b.c(socialTypeId));
    }

    private final void aZY() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            com.iqoption.welcome.p.a aVar = p.ekx;
            kotlin.jvm.internal.i.e(parentFragment, "it");
            aVar.bo(parentFragment).aZG();
        }
        v.j(getActivity());
    }

    private final void aZZ() {
        com.iqoption.welcome.a.m mVar = this.ely;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = mVar.aRV;
        String str2 = "button";
        kotlin.jvm.internal.i.e(textView, str2);
        textView.setEnabled(false);
        textView = mVar.aRV;
        kotlin.jvm.internal.i.e(textView, str2);
        textView.setText((CharSequence) null);
        mVar.bYW.show();
        IQTextInputEditText iQTextInputEditText = mVar.ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "emailEdit");
        iQTextInputEditText.setEnabled(false);
        IQTextInputEditText iQTextInputEditText2 = mVar.ekL;
        kotlin.jvm.internal.i.e(iQTextInputEditText2, "passwordEdit");
        iQTextInputEditText2.setEnabled(false);
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View view = mVar.ela.els;
        kotlin.jvm.internal.i.e(view, "binding.welcomeSocial.facebookLogin");
        view.setEnabled(false);
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        view = mVar.ela.elt;
        kotlin.jvm.internal.i.e(view, "binding.welcomeSocial.googleLogin");
        view.setEnabled(false);
    }

    private final void baa() {
        com.iqoption.welcome.a.m mVar = this.ely;
        String str = "binding";
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = mVar.aRV;
        kotlin.jvm.internal.i.e(textView, "button");
        textView.setEnabled(true);
        mVar.aRV.setText(com.iqoption.welcome.g.g.login);
        mVar.bYW.hide();
        IQTextInputEditText iQTextInputEditText = mVar.ekI;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "emailEdit");
        iQTextInputEditText.setEnabled(true);
        IQTextInputEditText iQTextInputEditText2 = mVar.ekL;
        kotlin.jvm.internal.i.e(iQTextInputEditText2, "passwordEdit");
        iQTextInputEditText2.setEnabled(true);
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View view = mVar.ela.els;
        kotlin.jvm.internal.i.e(view, "binding.welcomeSocial.facebookLogin");
        view.setEnabled(true);
        mVar = this.ely;
        if (mVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        view = mVar.ela.elt;
        kotlin.jvm.internal.i.e(view, "binding.welcomeSocial.googleLogin");
        view.setEnabled(true);
    }
}
