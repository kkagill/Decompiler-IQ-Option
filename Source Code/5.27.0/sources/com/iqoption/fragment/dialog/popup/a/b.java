package com.iqoption.fragment.dialog.popup.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.e.tf;
import com.iqoption.util.e;
import com.iqoption.util.y;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\fH\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\fH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0010H\u0002J\b\u0010'\u001a\u00020\u0012H\u0002J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006,"}, bng = {"Lcom/iqoption/fragment/dialog/popup/nps/NpsFeedbackFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/NpsFeedbackFragmentBinding;", "isCloseAnimation", "", "popupObj", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "popupViewModel", "Lcom/iqoption/popup/PopupViewModel;", "score", "", "Ljava/lang/Integer;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "enter", "nextAnim", "onCreateAnimator", "Landroid/animation/Animator;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onHideAnimation", "onShowAnimation", "send", "showCompletedFragment", "fm", "skip", "submitNps", "feedback", "", "Companion", "app_optionXRelease"})
/* compiled from: NpsFeedbackFragment.kt */
public final class b extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a deV = new a();
    private com.iqoption.popup.c aju;
    private HashMap apm;
    private com.iqoption.core.microservices.popupserver.response.a deR;
    private Integer deS;
    private tf deT;
    private boolean deU = true;

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, bng = {"Lcom/iqoption/fragment/dialog/popup/nps/NpsFeedbackFragment$Companion;", "", "()V", "ARG_DIALOG_TYPE", "", "ARG_SCORE", "MAX_FEEDBACK_LENGTH", "", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/fragment/dialog/popup/nps/NpsFeedbackFragment;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "score", "app_optionXRelease"})
    /* compiled from: NpsFeedbackFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final b a(com.iqoption.core.microservices.popupserver.response.a aVar, int i) {
            kotlin.jvm.internal.i.f(aVar, "popup");
            b bVar = new b();
            bVar.setArguments(new e().O("ARG_SCORE", i).b("ARG_DIALOG_TYPE", (Parcelable) aVar).toBundle());
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "v", "Landroid/view/View;", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "kotlin.jvm.PlatformType", "onTouch"})
    /* compiled from: NpsFeedbackFragment.kt */
    static final class d implements OnTouchListener {
        final /* synthetic */ b deW;

        d(b bVar) {
            this.deW = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.i.f(view, "v");
            if (this.deW.akX()) {
                y.a((Context) this.deW.getActivity(), view);
            }
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/nps/NpsFeedbackFragment$onCreateView$1", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: NpsFeedbackFragment.kt */
    public static final class b extends com.iqoption.view.d.b {
        final /* synthetic */ b deW;

        b(b bVar) {
            this.deW = bVar;
        }

        public void M(View view) {
            this.deW.aCl();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/nps/NpsFeedbackFragment$onCreateView$2", "Lcom/iqoption/view/viewinterface/OnClickDelayView;", "onDelayClick", "", "view", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: NpsFeedbackFragment.kt */
    public static final class c extends com.iqoption.view.d.b {
        final /* synthetic */ b deW;

        c(b bVar) {
            this.deW = bVar;
        }

        public void M(View view) {
            this.deW.send();
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.iqoption.popup.c.a aVar = com.iqoption.popup.c.dKG;
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "requireActivity()");
        this.aju = aVar.A(requireActivity);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        bundle = getArguments();
        if (bundle != null) {
            this.deS = Integer.valueOf(bundle.getInt("ARG_SCORE"));
            this.deR = (com.iqoption.core.microservices.popupserver.response.a) bundle.getParcelable("ARG_DIALOG_TYPE");
        }
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.nps_feedback_fragment, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…agment, container, false)");
        this.deT = (tf) inflate;
        tf tfVar = this.deT;
        String str = "binding";
        if (tfVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        tfVar.a(this);
        tfVar = this.deT;
        if (tfVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        tfVar.coI.setOnClickListener(new b(this));
        tfVar = this.deT;
        if (tfVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        tfVar.coH.setOnClickListener(new c(this));
        tfVar = this.deT;
        if (tfVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        tfVar.coD.setOnTouchListener(new d(this));
        tfVar = this.deT;
        if (tfVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return tfVar.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        ir("");
        fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
        }
        return true;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return z ? aCi() : aCj();
    }

    private final Animator aCi() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(j.XK());
        animatorSet.setDuration(300);
        tf tfVar = this.deT;
        if (tfVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        Animator[] animatorArr = new Animator[2];
        TextView textView = tfVar.cgm;
        Property property = View.TRANSLATION_Y;
        r6 = new float[2];
        r6[0] = com.iqoption.core.ext.a.b((ViewDataBinding) tfVar, (int) R.dimen._dp35);
        r6[1] = 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(textView, property, r6);
        animatorArr[1] = ObjectAnimator.ofFloat(tfVar.coG, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b(r7, (int) R.dimen._dp35), 0.0f});
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    private final Animator aCj() {
        String str = "binding";
        if (this.deU) {
            tf tfVar = this.deT;
            if (tfVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tfVar.getRoot(), View.ALPHA, new float[]{0.0f});
            kotlin.jvm.internal.i.e(ofFloat, "anim");
            ofFloat.setInterpolator(j.XL());
            ofFloat.setDuration(300);
            return ofFloat;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(j.XL());
        com.iqoption.core.util.b.a(animatorSet, 300);
        tf tfVar2 = this.deT;
        if (tfVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        r1 = new Animator[6];
        FrameLayout frameLayout = tfVar2.cac;
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[1];
        fArr[0] = com.iqoption.core.ext.a.b((ViewDataBinding) tfVar2, (int) R.dimen._dp30);
        r1[0] = ObjectAnimator.ofFloat(frameLayout, property, fArr);
        r1[1] = ObjectAnimator.ofFloat(tfVar2.cgm, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b(r8, (int) R.dimen._dp30)});
        r1[2] = ObjectAnimator.ofFloat(tfVar2.coG, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b(r8, (int) R.dimen._dp30)});
        r1[3] = ObjectAnimator.ofFloat(tfVar2.coI, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b(r8, (int) R.dimen.dp30)});
        r1[4] = ObjectAnimator.ofFloat(tfVar2.coH, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b(r8, (int) R.dimen.dp30)});
        r1[5] = ObjectAnimator.ofFloat(tfVar2.aIv, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorSet.playTogether(r1);
        return animatorSet;
    }

    private final void aCl() {
        this.deU = false;
        ir("");
        FragmentManager supportFragmentManager = com.iqoption.core.ext.a.r(this).getSupportFragmentManager();
        kotlin.jvm.internal.i.e(supportFragmentManager, "act.supportFragmentManager");
        j(supportFragmentManager);
    }

    private final void send() {
        this.deU = false;
        tf tfVar = this.deT;
        if (tfVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        EditText editText = tfVar.coG;
        kotlin.jvm.internal.i.e(editText, "binding.feedback");
        String obj = editText.getText().toString();
        if (obj.length() > 10000) {
            if (obj != null) {
                obj = obj.substring(10000);
                kotlin.jvm.internal.i.e(obj, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        ir(obj);
        FragmentManager supportFragmentManager = com.iqoption.core.ext.a.r(this).getSupportFragmentManager();
        kotlin.jvm.internal.i.e(supportFragmentManager, "act.supportFragmentManager");
        j(supportFragmentManager);
    }

    private final void ir(String str) {
        com.iqoption.core.microservices.popupserver.response.a aVar = this.deR;
        if (aVar != null) {
            com.iqoption.popup.c cVar = this.aju;
            if (cVar != null) {
                Integer num = this.deS;
                cVar.a(aVar, num != null ? num.intValue() : 0, str);
            }
            com.iqoption.popup.c cVar2 = this.aju;
            if (cVar2 != null) {
                com.iqoption.popup.c.a(cVar2, aVar, null, 2, null);
            }
        }
    }

    private final void j(FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().remove(this).add(R.id.fragment, a.deP.aCk(), a.deP.Bx()).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commitAllowingStateLoss();
    }

    static {
        String simpleName = b.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "NpsFeedbackFragment::class.java.simpleName");
        TAG = simpleName;
    }
}
