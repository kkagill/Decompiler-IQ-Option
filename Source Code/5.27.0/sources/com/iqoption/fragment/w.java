package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.e.ge;
import com.iqoption.fragment.b.b;
import com.iqoption.popup.c;
import com.iqoption.util.af;
import com.iqoption.util.e;
import com.iqoption.util.q;
import com.iqoption.x.R;

/* compiled from: MultiplierConfirmDialog */
public final class w extends b {
    private Animator cUQ;
    private int cUR;
    private ge cWf;

    /* compiled from: MultiplierConfirmDialog */
    public static class a {
        public final boolean cVc;

        public a(boolean z) {
            this.cVc = z;
        }
    }

    @NonNull
    private static w aw(int i, int i2) {
        w wVar = new w();
        wVar.setArguments(new e().O("arg.anchorX", i).O("arg.anchorY", i2).toBundle());
        return wVar;
    }

    public static void a(FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3) {
        c.A(fragmentActivity).a(new -$$Lambda$w$iHlt_KFg2XJd-_qisHq7zhrzZvY(fragmentManager, i, i2, i3), "MultiplierConfirmDialog");
    }

    private static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3) {
        String str = "MultiplierConfirmDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, aw(i2, i3), str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cWf = (ge) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_multiplier_confirm, viewGroup, false);
        this.cWf.a(this);
        com.iqoption.core.util.b bVar = com.iqoption.core.util.b.bQf;
        this.cUR = com.iqoption.core.util.b.bi(getContext());
        q qVar = new q(getContext());
        Bundle arguments = getArguments();
        arguments.getInt("arg.anchorX");
        final int i = arguments.getInt("arg.anchorY");
        this.cWf.getRoot().getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                w.this.cWf.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
                ((LayoutParams) w.this.cWf.bYN.getLayoutParams()).topMargin = i;
                w.this.cWf.bYN.requestLayout();
                return false;
            }
        });
        return this.cWf.getRoot();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        IQApp.Ex().bd(new a(true));
    }

    public boolean onClose() {
        if (d.dX("multiplier_confirmed")) {
            requireFragmentManager().popBackStack();
            c.A(requireActivity()).jr("MultiplierConfirmDialog");
            IQApp.Ex().bd(new a(false));
        } else {
            axD();
        }
        return true;
    }

    private void axD() {
        Animator animator = this.cUQ;
        if (animator != null) {
            animator.cancel();
        }
        this.cUQ = com.iqoption.core.util.b.o(this.cWf.bYN, this.cUR);
    }

    public void axC() {
        d.i("multiplier_confirmed", true);
        onClose();
    }

    public void att() {
        this.cWf.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            this.cWf.bYN.setTranslationX((float) dimensionPixelSize2);
            this.cWf.bYN.setTranslationY((float) (-dimensionPixelSize2));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cWf.bYN, this.cWf.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cWf.bYN.getWidth(), (double) this.cWf.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cWf.bYN;
            r3 = new PropertyValuesHolder[2];
            r3[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r3);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.cWf.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f = (float) (-dimensionPixelOffset);
        this.cWf.bYN.setTranslationX(f);
        this.cWf.bYN.setTranslationY(f);
        this.cWf.bYN.setPivotX((float) (this.cWf.bYN.getWidth() - dimensionPixelOffset));
        this.cWf.bYN.setPivotY(1.0f);
        this.cWf.bYN.setScaleX(0.3f);
        this.cWf.bYN.setScaleY(0.3f);
        this.cWf.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cWf.bYN.setPivotX((float) this.cWf.bYN.getWidth());
        this.cWf.bYN.setPivotY(1.0f);
        this.cWf.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
