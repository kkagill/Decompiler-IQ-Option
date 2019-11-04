package com.iqoption.fragment.dialog.popup.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.e.td;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/fragment/dialog/popup/nps/NpsCompletedFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/NpsCompletedFragmentBinding;", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateAnimator", "Landroid/animation/Animator;", "transit", "", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHideAnimation", "onShowAnimation", "Companion", "app_optionXRelease"})
/* compiled from: NpsCompletedFragment.kt */
public final class a extends d {
    private static final String TAG;
    public static final a deP = new a();
    private HashMap apm;
    private td deO;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/fragment/dialog/popup/nps/NpsCompletedFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/fragment/dialog/popup/nps/NpsCompletedFragment;", "app_optionXRelease"})
    /* compiled from: NpsCompletedFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final a aCk() {
            return new a();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/nps/NpsCompletedFragment$onShowAnimation$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "app_optionXRelease"})
    /* compiled from: NpsCompletedFragment.kt */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ td deQ;

        b(td tdVar) {
            this.deQ = tdVar;
        }

        public void onAnimationEnd(Animator animator) {
            FrameLayout frameLayout = this.deQ.coB;
            kotlin.jvm.internal.i.e(frameLayout, "closeFrame");
            frameLayout.setAlpha(1.0f);
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.nps_completed_fragment, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…agment, container, false)");
        this.deO = (td) inflate;
        td tdVar = this.deO;
        String str = "binding";
        if (tdVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        tdVar.a(this);
        tdVar = this.deO;
        if (tdVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = tdVar.coB;
        kotlin.jvm.internal.i.e(frameLayout, "binding.closeFrame");
        frameLayout.setAlpha(0.0f);
        tdVar = this.deO;
        if (tdVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return tdVar.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction().remove(this).setTransition(8194).commitAllowingStateLoss();
        }
        return true;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return z ? aCi() : aCj();
    }

    public final Animator aCi() {
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, 300);
        animatorSet.setInterpolator(j.XK());
        td tdVar = this.deO;
        if (tdVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        Animator[] animatorArr = new Animator[2];
        ImageView imageView = tdVar.aRh;
        Property property = View.TRANSLATION_Y;
        r6 = new float[2];
        r6[0] = com.iqoption.core.ext.a.b((ViewDataBinding) tdVar, (int) R.dimen.dp35);
        r6[1] = 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(imageView, property, r6);
        animatorArr[1] = ObjectAnimator.ofFloat(tdVar.ani, View.TRANSLATION_Y, new float[]{com.iqoption.core.ext.a.b(r7, (int) R.dimen.dp35), 0.0f});
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new b(tdVar));
        return animatorSet;
    }

    public final Animator aCj() {
        td tdVar = this.deO;
        if (tdVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tdVar.getRoot(), View.ALPHA, new float[]{0.0f});
        kotlin.jvm.internal.i.e(ofFloat, "anim");
        ofFloat.setInterpolator(j.XL());
        ofFloat.setDuration(300);
        return ofFloat;
    }

    static {
        String simpleName = a.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "NpsCompletedFragment::class.java.simpleName");
        TAG = simpleName;
    }
}
