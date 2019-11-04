package com.iqoption.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.d;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.ha;
import com.iqoption.fragment.b.b;
import com.iqoption.mobbtech.connect.request.api.Requests;
import com.iqoption.popup.c;
import com.iqoption.util.ak;
import com.iqoption.x.R;

/* compiled from: TradeOnPracticeDialog */
public class h extends b {
    private Builder ajf;
    private ha cHt;

    public long getAnimationDuration() {
        return 350;
    }

    private static h atA() {
        return new h();
    }

    public static void c(@NonNull FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager) {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        if (!d.dX("is_showed_trade_on_practice_dialog") && com.iqoption.core.data.d.b.WB().Wv() && DG.DJ() == 1 && DG.DI().doubleValue() == 0.0d) {
            a(fragmentActivity, fragmentManager);
        }
    }

    public static void a(@NonNull FragmentActivity fragmentActivity, @NonNull FragmentManager fragmentManager) {
        c.A(fragmentActivity).a(new -$$Lambda$h$RW8KQkRmFcyzN_znnx5T2WGlpm4(fragmentManager), "TradeOnPracticeDialog");
    }

    private static void d(@NonNull FragmentManager fragmentManager) {
        String str = "TradeOnPracticeDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(R.id.fragment, atA(), str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cHt = (ha) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_trade_on_practice, viewGroup, false);
        d.i("is_showed_trade_on_practice_dialog", true);
        this.cHt.ccJ.setOnClickListener(new -$$Lambda$h$JxjBPs2p0mVCgXj6oAOeLdTf180(this));
        this.cHt.aoG.setOnClickListener(new -$$Lambda$h$srdI5_DX4iY9AqzekG--M1GnxDs(this));
        if (com.iqoption.app.b.DG().Ej()) {
            this.cHt.cdz.setText(R.string.trade);
        }
        this.cHt.cdz.setOnClickListener(new -$$Lambda$h$mbUHewLPSscc-pVFijTHT3Co8ws(this));
        return this.cHt.getRoot();
    }

    private /* synthetic */ void aD(View view) {
        onBackPressed();
    }

    private /* synthetic */ void aC(View view) {
        atB();
    }

    private /* synthetic */ void aB(View view) {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        if (!DG.Ej()) {
            Long l;
            Balance dH = DG.dH(4);
            if (dH == null) {
                l = null;
            } else {
                l = Long.valueOf(dH.id);
            }
            if (l != null) {
                Requests.x(l);
            }
        }
        onBackPressed();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "trade_on_practice_dialog");
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }

    private void atB() {
        com.iqoption.core.util.b.o(this.cHt.ccK, com.iqoption.core.util.b.bi(requireContext()));
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        c.A(requireActivity()).jr("TradeOnPracticeDialog");
        return true;
    }

    public void att() {
        com.iqoption.core.ui.animation.b.d(this.cHt.aoG, ak.getColor(R.color.transparent), ak.getColor(R.color.black_66)).setInterpolator(com.iqoption.view.a.a.c.egR);
        ObjectAnimator.ofPropertyValuesHolder(this.cHt.ccK, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f, 1.0f})}).setInterpolator(new OvershootInterpolator(2.5f));
        ObjectAnimator.ofFloat(this.cHt.ccK, View.ALPHA, new float[]{0.0f, 1.0f}).setInterpolator(com.iqoption.view.a.a.c.egR);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{r0, r1, r3});
        animatorSet.start();
    }

    public void atu() {
        Animator d = com.iqoption.core.ui.animation.b.d(this.cHt.aoG, ak.getColor(R.color.black_66), ak.getColor(R.color.transparent));
        FrameLayout frameLayout = this.cHt.ccK;
        r2 = new PropertyValuesHolder[3];
        r2[0] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.4f});
        r2[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.4f});
        r2[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        animatorSet.playTogether(new Animator[]{d, ofPropertyValuesHolder});
        animatorSet.setInterpolator(com.iqoption.view.a.a.c.egR);
        animatorSet.start();
    }
}
