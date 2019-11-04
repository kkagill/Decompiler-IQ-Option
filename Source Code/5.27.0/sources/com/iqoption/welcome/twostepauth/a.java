package com.iqoption.welcome.twostepauth;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.manager.aa;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.n;
import com.iqoption.core.manager.o;
import com.iqoption.core.manager.p;
import com.iqoption.core.manager.q;
import com.iqoption.core.manager.y;
import com.iqoption.core.manager.z;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.welcome.m;
import java.util.HashMap;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/welcome/twostepauth/VerifyAuthFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/welcome/databinding/FragmentTwoStepAuthBinding;", "isCustomTransitionsEnabled", "", "()Z", "resendViewController", "Lcom/iqoption/welcome/twostepauth/VerifyAuthFragment$ResendViewController;", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "kotlin.jvm.PlatformType", "getVerifyInfo", "()Lcom/iqoption/core/manager/VerifyInfo;", "verifyInfo$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/iqoption/welcome/twostepauth/VerifyAuthViewModel;", "hideLoginProgress", "", "login", "onBackButtonClick", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResendClick", "onViewCreated", "view", "showLoginProgress", "updateLoginTwoStepAuthButton", "Companion", "ResendViewController", "welcome_release"})
/* compiled from: VerifyAuthFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "verifyInfo", "getVerifyInfo()Lcom/iqoption/core/manager/VerifyInfo;"))};
    public static final a enz = new a();
    private HashMap apm;
    private final kotlin.d ekC = g.c(new VerifyAuthFragment$verifyInfo$2(this));
    private b enw;
    private com.iqoption.welcome.a.i enx;
    private b eny;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/welcome/twostepauth/VerifyAuthFragment$Companion;", "", "()V", "ARG_VERIFY_INFO", "", "TAG", "getTAG", "()Ljava/lang/String;", "createInstance", "Lcom/iqoption/welcome/twostepauth/VerifyAuthFragment;", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "welcome_release"})
    /* compiled from: VerifyAuthFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final a d(af afVar) {
            kotlin.jvm.internal.i.f(afVar, "verifyInfo");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_VERIFY_INFO", afVar);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/welcome/twostepauth/VerifyAuthFragment$ResendViewController;", "", "binding", "Lcom/iqoption/welcome/databinding/FragmentTwoStepAuthBinding;", "(Lcom/iqoption/welcome/databinding/FragmentTwoStepAuthBinding;)V", "canResend", "", "setResendAvailable", "", "setResendAvailable$welcome_release", "setTimeLeft", "time", "", "setTimeLeft$welcome_release", "welcome_release"})
    /* compiled from: VerifyAuthFragment.kt */
    private static final class b {
        private boolean enA = true;
        private final com.iqoption.welcome.a.i enx;

        public b(com.iqoption.welcome.a.i iVar) {
            kotlin.jvm.internal.i.f(iVar, "binding");
            this.enx = iVar;
        }

        public final void kk(String str) {
            TextView textView;
            kotlin.jvm.internal.i.f(str, "time");
            String str2 = "binding.verificationCodeTimerText";
            if (this.enA) {
                this.enA = false;
                textView = this.enx.ekX;
                kotlin.jvm.internal.i.e(textView, str2);
                com.iqoption.core.ext.a.ak(textView);
                textView = this.enx.ekU;
                String str3 = "binding.resendVerificationCode";
                kotlin.jvm.internal.i.e(textView, str3);
                com.iqoption.core.ext.a.al(textView);
                this.enx.ekV.setText(com.iqoption.welcome.g.g.you_can_resend_the_code_in_countdown);
                textView = this.enx.ekU;
                kotlin.jvm.internal.i.e(textView, str3);
                TextView textView2 = this.enx.ekU;
                kotlin.jvm.internal.i.e(textView2, str3);
                textView.setPaintFlags(textView2.getPaintFlags() ^ 8);
            }
            textView = this.enx.ekX;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(str);
        }

        public final void bbD() {
            if (!this.enA) {
                this.enA = true;
                TextView textView = this.enx.ekX;
                kotlin.jvm.internal.i.e(textView, "binding.verificationCodeTimerText");
                com.iqoption.core.ext.a.al(textView);
                textView = this.enx.ekU;
                String str = "binding.resendVerificationCode";
                kotlin.jvm.internal.i.e(textView, str);
                textView.setEnabled(true);
                TextView textView2 = this.enx.ekU;
                kotlin.jvm.internal.i.e(textView2, str);
                com.iqoption.core.ext.a.ak(textView2);
                textView2 = this.enx.ekU;
                kotlin.jvm.internal.i.e(textView2, str);
                textView = this.enx.ekU;
                kotlin.jvm.internal.i.e(textView, str);
                textView2.setPaintFlags(textView.getPaintFlags() | 8);
                this.enx.ekV.setText(com.iqoption.welcome.g.g.haven_t_received_the_code_yet);
                this.enx.ekS.setText("");
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: VerifyAuthFragment.kt */
    static final class j implements OnEditorActionListener {
        final /* synthetic */ a this$0;

        j(a aVar) {
            this.this$0 = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.this$0.aZU();
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: VerifyAuthFragment.kt */
    static final class k implements Runnable {
        final /* synthetic */ l enC;
        final /* synthetic */ a this$0;

        k(a aVar, l lVar) {
            this.this$0 = aVar;
            this.enC = lVar;
        }

        public final void run() {
            l lVar = this.enC;
            IQTextInputEditText iQTextInputEditText = a.g(this.this$0).ekS;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.codeEdit");
            Editable text = iQTextInputEditText.getText();
            if (text == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(text, "binding.codeEdit.text!!");
            lVar.afterTextChanged(text);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public c(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.aZY();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.bbB();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        public e(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.aZU();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isShown", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: VerifyAuthFragment.kt */
    static final class f<T> implements Observer<Boolean> {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (kotlin.jvm.internal.i.y(Boolean.TRUE, bool)) {
                this.this$0.aZZ();
            } else if (kotlin.jvm.internal.i.y(Boolean.FALSE, bool)) {
                this.this$0.baa();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "timeout", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: VerifyAuthFragment.kt */
    static final class g<T> implements Observer<String> {
        final /* synthetic */ a this$0;

        g(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                b f = this.this$0.eny;
                if (f == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                f.kk(str);
                return;
            }
            b f2 = this.this$0.eny;
            if (f2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            f2.bbD();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "toast", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: VerifyAuthFragment.kt */
    static final class h<T> implements Observer<String> {
        public static final h enB = new h();

        h() {
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                com.iqoption.core.d.z(str, 1);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, bng = {"<anonymous>", "", "action", "kotlin.jvm.PlatformType", "onChanged", "(Lkotlin/Unit;)V"})
    /* compiled from: VerifyAuthFragment.kt */
    static final class i<T> implements Observer<kotlin.l> {
        final /* synthetic */ a this$0;

        i(a aVar) {
            this.this$0 = aVar;
        }

        /* renamed from: b */
        public final void onChanged(kotlin.l lVar) {
            if (lVar != null) {
                this.this$0.aZY();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/twostepauth/VerifyAuthFragment$onViewCreated$watcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "welcome_release"})
    /* compiled from: VerifyAuthFragment.kt */
    public static final class l extends ah {
        final /* synthetic */ a this$0;

        l(a aVar) {
            this.this$0 = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            ContentLoadingProgressBar contentLoadingProgressBar = a.g(this.this$0).bYW;
            kotlin.jvm.internal.i.e(contentLoadingProgressBar, "binding.progress");
            if (contentLoadingProgressBar.getVisibility() != 0) {
                IQTextInputEditText iQTextInputEditText = a.g(this.this$0).ekS;
                kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.codeEdit");
                CharSequence valueOf = String.valueOf(iQTextInputEditText.getText());
                boolean z = true;
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
                int length2 = valueOf.subSequence(i, length + 1).toString().length();
                TextView textView = a.g(this.this$0).aRV;
                kotlin.jvm.internal.i.e(textView, "binding.button");
                if (length2 <= 0) {
                    z = false;
                }
                textView.setEnabled(z);
            }
        }
    }

    private final af aZr() {
        kotlin.d dVar = this.ekC;
        kotlin.reflect.j jVar = anY[0];
        return (af) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public boolean ME() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ com.iqoption.welcome.a.i g(a aVar) {
        com.iqoption.welcome.a.i iVar = aVar.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iVar;
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.enx = (com.iqoption.welcome.a.i) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.welcome.g.e.fragment_two_step_auth, viewGroup, false);
        com.iqoption.welcome.a.i iVar = this.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        com.iqoption.welcome.a.i iVar;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.welcome.a.i iVar2 = this.enx;
        String str = "binding";
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = iVar2.bfR;
        kotlin.jvm.internal.i.e(imageView, "binding.backButton");
        imageView.setOnClickListener(new c(this));
        iVar2 = this.enx;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = iVar2.ekU;
        kotlin.jvm.internal.i.e(textView, "binding.resendVerificationCode");
        textView.setOnClickListener(new d(this));
        iVar2 = this.enx;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = iVar2.aRV;
        kotlin.jvm.internal.i.e(textView, "binding.button");
        textView.setOnClickListener(new e(this));
        com.iqoption.welcome.a.i iVar3 = this.enx;
        if (iVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        this.eny = new b(iVar3);
        this.enw = m.ekn.aZw().bn(this);
        b bVar = this.enw;
        String str2 = "viewModel";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        LifecycleOwner lifecycleOwner = this;
        bVar.bab().observe(lifecycleOwner, new f(this));
        bVar = this.enw;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        bVar.bbE().observe(lifecycleOwner, new g(this));
        bVar = this.enw;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        bVar.bac().observe(lifecycleOwner, h.enB);
        bVar = this.enw;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        bVar.bbF().observe(lifecycleOwner, new i(this));
        iVar2 = this.enx;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = iVar2.ekW;
        kotlin.jvm.internal.i.e(textView, "binding.verificationCodeSentText");
        textView.setText(getString(com.iqoption.welcome.g.g.verification_code_has_just_been_sent_to_number, aZr().Yd()));
        iVar2 = this.enx;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iVar2.ekS.requestFocus();
        if (bundle != null) {
            Context context = getContext();
            iVar = this.enx;
            if (iVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            v.b(context, iVar.ekS);
        }
        iVar2 = this.enx;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iVar2.ekS.setOnEditorActionListener(new j(this));
        com.iqoption.core.manager.e Yf = aZr().Yf();
        str2 = "binding.title";
        if ((Yf instanceof q) || (Yf instanceof o)) {
            iVar2 = this.enx;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = iVar2.alH;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(getString(com.iqoption.welcome.g.g.two_factor_text));
        } else if ((Yf instanceof p) || (Yf instanceof z) || (Yf instanceof aa)) {
            iVar2 = this.enx;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = iVar2.alH;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(getString(com.iqoption.welcome.g.g.registration_mob));
        } else if (Yf instanceof y) {
            iVar2 = this.enx;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = iVar2.alH;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(getString(com.iqoption.welcome.g.g.password_recovery));
        } else if (Yf instanceof n) {
            iVar2 = this.enx;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            textView = iVar2.alH;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(getString(com.iqoption.welcome.g.g.change_password));
        }
        l lVar = new l(this);
        iVar = this.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iVar.ekS.addTextChangedListener(lVar);
        iVar = this.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        iVar.ekS.post(new k(this, lVar));
    }

    private final void bbB() {
        com.iqoption.welcome.a.i iVar = this.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = iVar.ekU;
        kotlin.jvm.internal.i.e(textView, "binding.resendVerificationCode");
        textView.setEnabled(false);
        bbC();
        b bVar = this.enw;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        af aZr = aZr();
        kotlin.jvm.internal.i.e(aZr, "verifyInfo");
        bVar.g(aZr);
    }

    private final void aZY() {
        if (getParentFragment() instanceof com.iqoption.welcome.l) {
            com.iqoption.welcome.p.a aVar = com.iqoption.welcome.p.ekx;
            Fragment parentFragment = getParentFragment();
            if (parentFragment == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
            aVar.bo(parentFragment).aZG();
        } else {
            com.iqoption.core.ext.a.t(this).popBackStack();
        }
        v.j(getActivity());
    }

    private final void bbC() {
        com.iqoption.welcome.a.i iVar = this.enx;
        String str = "binding";
        if (iVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = iVar.aRV;
        kotlin.jvm.internal.i.e(textView, "binding.button");
        com.iqoption.welcome.a.i iVar2 = this.enx;
        if (iVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView.setEnabled(iVar2.ekS.length() >= 6);
    }

    private final void aZZ() {
        com.iqoption.welcome.a.i iVar = this.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = iVar.aRV;
        String str = "button";
        kotlin.jvm.internal.i.e(textView, str);
        textView.setEnabled(false);
        textView = iVar.aRV;
        kotlin.jvm.internal.i.e(textView, str);
        textView.setText((CharSequence) null);
        iVar.bYW.show();
        IQTextInputEditText iQTextInputEditText = iVar.ekS;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "codeEdit");
        iQTextInputEditText.setEnabled(false);
    }

    private final void baa() {
        com.iqoption.welcome.a.i iVar = this.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = iVar.aRV;
        kotlin.jvm.internal.i.e(textView, "button");
        textView.setEnabled(true);
        iVar.aRV.setText(com.iqoption.welcome.g.g.send);
        iVar.bYW.hide();
        IQTextInputEditText iQTextInputEditText = iVar.ekS;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "codeEdit");
        iQTextInputEditText.setEnabled(true);
    }

    private final void aZU() {
        com.iqoption.welcome.a.i iVar = this.enx;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        IQTextInputEditText iQTextInputEditText = iVar.ekS;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.codeEdit");
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
        b bVar = this.enw;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.e(af.a(aZr(), null, null, null, null, obj3, 15, null));
        v.j(getActivity());
    }
}
