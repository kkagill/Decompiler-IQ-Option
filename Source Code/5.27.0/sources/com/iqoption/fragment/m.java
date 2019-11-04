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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.core.c.a;
import com.iqoption.dto.ToastEntity;
import com.iqoption.e.lr;
import com.iqoption.fragment.b.b;
import com.iqoption.util.af;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: FragmentMarketIsOpen */
public class m extends b {
    private lr cVq;
    private final Runnable cVr = new -$$Lambda$D2xRStfu01oslQQLXHAw-0KAygA(this);

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cVq = (lr) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_market_is_open, viewGroup, false);
        this.cVq.cfH.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                m.this.onClose();
            }
        });
        return this.cVq.getRoot();
    }

    public void att() {
        this.cVq.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp6);
            this.cVq.cfL.setTranslationX((float) dimensionPixelSize2);
            this.cVq.cfL.setTranslationY((float) (-dimensionPixelSize2));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cVq.bYN, this.cVq.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, (float) dimensionPixelSize, (float) Math.hypot((double) this.cVq.bYN.getWidth(), (double) this.cVq.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            LinearLayout linearLayout = this.cVq.cfL;
            r3 = new PropertyValuesHolder[2];
            r3[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r3[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(linearLayout, r3);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.cVq.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f = (float) (-dimensionPixelOffset);
        this.cVq.bYN.setTranslationX(f);
        this.cVq.bYN.setTranslationY(f);
        this.cVq.bYN.setPivotX((float) (this.cVq.bYN.getWidth() - dimensionPixelOffset));
        this.cVq.bYN.setPivotY(1.0f);
        this.cVq.bYN.setScaleX(0.3f);
        this.cVq.bYN.setScaleY(0.3f);
        this.cVq.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setInterpolator(c.egR).start();
    }

    public void atu() {
        this.cVq.bYN.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(300).setInterpolator(c.egR).start();
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        com.iqoption.popup.c.A(requireActivity()).jr("FragmentMarketIsOpen");
        return true;
    }

    public void onResume() {
        super.onResume();
        a.biN.postDelayed(this.cVr, ToastEntity.TOAST_DURATION);
    }

    public void onPause() {
        a.biN.removeCallbacks(this.cVr);
        super.onPause();
    }

    public static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, int i) {
        com.iqoption.popup.c.A(fragmentActivity).a(new -$$Lambda$m$THuwlR1W3ezDJ8dhDWIp8EweE5E(fragmentManager, i, new m()), "FragmentMarketIsOpen");
    }

    private static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, Fragment fragment) {
        String str = "FragmentMarketIsOpen";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, fragment, str).addToBackStack(str).commitAllowingStateLoss();
        }
    }
}
