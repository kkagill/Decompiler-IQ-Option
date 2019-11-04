package com.iqoption.welcome.changepassword;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.n;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.welcome.p;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010!\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006#"}, bng = {"Lcom/iqoption/welcome/changepassword/ChangePasswordFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "animatorFactory", "Lcom/iqoption/welcome/changepassword/AnimatorFactory;", "binding", "Lcom/iqoption/welcome/databinding/FragmentChangePasswordBinding;", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "kotlin.jvm.PlatformType", "getVerifyInfo", "()Lcom/iqoption/core/manager/VerifyInfo;", "verifyInfo$delegate", "Lkotlin/Lazy;", "onBack", "", "onCreateAnimator", "Landroid/animation/Animator;", "transit", "", "enter", "", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "passwordChange", "Companion", "welcome_release"})
/* compiled from: ChangePasswordFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "verifyInfo", "getVerifyInfo()Lcom/iqoption/core/manager/VerifyInfo;"))};
    public static final a ekD = new a();
    private HashMap apm;
    private com.iqoption.welcome.a.a ekA;
    private a ekB;
    private final kotlin.d ekC = g.c(new ChangePasswordFragment$verifyInfo$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/welcome/changepassword/ChangePasswordFragment$Companion;", "", "()V", "ARG_VERIFY_INFO", "", "TAG", "getTAG", "()Ljava/lang/String;", "createInstance", "Lcom/iqoption/welcome/changepassword/ChangePasswordFragment;", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "welcome_release"})
    /* compiled from: ChangePasswordFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final b c(af afVar) {
            kotlin.jvm.internal.i.f(afVar, "verifyInfo");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_VERIFY_INFO", afVar);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/changepassword/ChangePasswordFragment$onCreateAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "welcome_release"})
    /* compiled from: ChangePasswordFragment.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ b this$0;

        b(b bVar) {
            this.this$0 = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            super.onAnimationEnd(animator);
            if (this.this$0.isAdded()) {
                v.b(this.this$0.getContext(), b.c(this.this$0).ekE);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: ChangePasswordFragment.kt */
    static final class e implements OnEditorActionListener {
        final /* synthetic */ b this$0;

        e(b bVar) {
            this.this$0 = bVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.this$0.aZM();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ b this$0;

        public c(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.aZL();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ b this$0;

        public d(b bVar) {
            this.this$0 = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.aZM();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/changepassword/ChangePasswordFragment$onViewCreated$watcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "welcome_release"})
    /* compiled from: ChangePasswordFragment.kt */
    public static final class f extends ah {
        final /* synthetic */ b this$0;

        f(b bVar) {
            this.this$0 = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            IQTextInputEditText iQTextInputEditText = b.c(this.this$0).ekE;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.passwordEdit1");
            String valueOf = String.valueOf(iQTextInputEditText.getText());
            String str = "null cannot be cast to non-null type kotlin.CharSequence";
            if (valueOf != null) {
                int length = v.trim(valueOf).toString().length();
                IQTextInputEditText iQTextInputEditText2 = b.c(this.this$0).ekF;
                kotlin.jvm.internal.i.e(iQTextInputEditText2, "binding.passwordEdit2");
                String valueOf2 = String.valueOf(iQTextInputEditText2.getText());
                if (valueOf2 != null) {
                    int length2 = v.trim(valueOf2).toString().length();
                    TextView textView = b.c(this.this$0).aRV;
                    kotlin.jvm.internal.i.e(textView, "binding.button");
                    boolean z = length > 0 && length2 > 0;
                    textView.setEnabled(z);
                    return;
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }
    }

    private final af aZr() {
        kotlin.d dVar = this.ekC;
        j jVar = anY[0];
        return (af) dVar.getValue();
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

    public static final /* synthetic */ com.iqoption.welcome.a.a c(b bVar) {
        com.iqoption.welcome.a.a aVar = bVar.ekA;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aVar;
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
        this.ekA = (com.iqoption.welcome.a.a) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.welcome.g.e.fragment_change_password, viewGroup, false);
        com.iqoption.welcome.a.a aVar = this.ekA;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return aVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.welcome.a.a aVar = this.ekA;
        String str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = aVar.bfR;
        kotlin.jvm.internal.i.e(imageView, "binding.backButton");
        imageView.setOnClickListener(new c(this));
        aVar = this.ekA;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = aVar.aRV;
        kotlin.jvm.internal.i.e(textView, "binding.button");
        textView.setOnClickListener(new d(this));
        com.iqoption.welcome.a.a aVar2 = this.ekA;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        this.ekB = new a(aVar2);
        aVar = this.ekA;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aVar.ekF.setOnEditorActionListener(new e(this));
        f fVar = new f(this);
        aVar2 = this.ekA;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aVar2.ekE.requestFocus();
        aVar2 = this.ekA;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextWatcher textWatcher = fVar;
        aVar2.ekE.addTextChangedListener(textWatcher);
        aVar2 = this.ekA;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        aVar2.ekF.addTextChangedListener(textWatcher);
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        String str = "animatorFactory";
        a aVar;
        if (z) {
            aVar = this.ekB;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            Animator aZJ = aVar.aZJ();
            aZJ.addListener(new b(this));
            return aZJ;
        }
        aVar = this.ekB;
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

    private final void aZM() {
        com.iqoption.welcome.a.a aVar = this.ekA;
        String str = "binding";
        if (aVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        IQTextInputEditText iQTextInputEditText = aVar.ekE;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.passwordEdit1");
        String valueOf = String.valueOf(iQTextInputEditText.getText());
        String str2 = "null cannot be cast to non-null type kotlin.CharSequence";
        if (valueOf != null) {
            String obj = v.trim(valueOf).toString();
            aVar = this.ekA;
            if (aVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            iQTextInputEditText = aVar.ekF;
            kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.passwordEdit2");
            valueOf = String.valueOf(iQTextInputEditText.getText());
            if (valueOf != null) {
                String obj2 = v.trim(valueOf).toString();
                String str3 = "forgot-pass_send";
                if ((kotlin.jvm.internal.i.y(obj, obj2) ^ 1) != 0) {
                    com.iqoption.core.d.ag(com.iqoption.welcome.g.g.input_password_not_equal, 1);
                    com.iqoption.core.d.EC().c(str3, 0.0d);
                    return;
                } else if (com.iqoption.welcome.c.ekd.kf(obj) && com.iqoption.welcome.c.ekd.kf(obj2)) {
                    v.j(getActivity());
                    com.iqoption.welcome.p.a aVar2 = p.ekx;
                    Fragment parentFragment = getParentFragment();
                    if (parentFragment == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    kotlin.jvm.internal.i.e(parentFragment, "parentFragment!!");
                    aVar2.bo(parentFragment).a(new com.iqoption.welcome.k(af.a(aZr(), new n(obj, obj2, null, 4, null), null, null, null, null, 30, null)));
                    return;
                } else {
                    com.iqoption.core.d.ag(com.iqoption.welcome.g.g.newpassword_too_short, 1);
                    com.iqoption.core.d.EC().c(str3, 0.0d);
                    return;
                }
            }
            throw new TypeCastException(str2);
        }
        throw new TypeCastException(str2);
    }
}
