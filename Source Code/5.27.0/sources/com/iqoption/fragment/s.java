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
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.e.lm;
import com.iqoption.fragment.b.b;
import com.iqoption.util.af;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: MarginNotAddedFragment */
public final class s extends b {
    private lm cVM;

    public static void a(FragmentManager fragmentManager, @IdRes int i) {
        String str = "MarginNotAddedFragment";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, new s(), str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cVM = (lm) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_margin_not_added, viewGroup, false);
        this.cVM.cfH.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                s.this.onClose();
            }
        });
        this.cVM.cbI.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                TradeRoomActivity tradeRoomActivity = s.this.getTradeRoomActivity();
                if (tradeRoomActivity != null) {
                    tradeRoomActivity.Ao();
                }
                s.this.onClose();
            }
        });
        return this.cVM.getRoot();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        return true;
    }

    public void att() {
        this.cVM.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            this.cVM.cfL.setTranslationX((float) dimensionPixelSize2);
            this.cVM.cfL.setTranslationY((float) (-dimensionPixelSize2));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cVM.bYN, this.cVM.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cVM.bYN.getWidth(), (double) this.cVM.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            LinearLayout linearLayout = this.cVM.cfL;
            r3 = new PropertyValuesHolder[2];
            r3[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout, r3);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.cVM.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f = (float) (-dimensionPixelOffset);
        this.cVM.bYN.setTranslationX(f);
        this.cVM.bYN.setTranslationY(f);
        this.cVM.bYN.setPivotX((float) (this.cVM.bYN.getWidth() - dimensionPixelOffset));
        this.cVM.bYN.setPivotY(1.0f);
        this.cVM.bYN.setScaleX(0.3f);
        this.cVM.bYN.setScaleY(0.3f);
        this.cVM.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setInterpolator(c.egR).start();
    }

    public void atu() {
        this.cVM.bYN.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(300).setInterpolator(c.egR).start();
    }
}
