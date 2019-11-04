package com.iqoption.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import com.iqoption.app.IQApp;
import com.iqoption.e.gk;
import com.iqoption.fragment.b.b;
import com.iqoption.system.a.c;
import com.iqoption.util.e;
import com.iqoption.x.R;

/* compiled from: OtnRewardInfoDialog */
public final class z extends b {
    private gk cWq;

    /* compiled from: OtnRewardInfoDialog */
    public static class a extends c<Boolean> {
    }

    @NonNull
    private static z ay(int i, int i2) {
        z zVar = new z();
        zVar.setArguments(new e().O("arg.anchorX", i).O("arg.anchorY", i2).toBundle());
        return zVar;
    }

    public static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3) {
        String str = "OtnRewardInfoDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, ay(i2, i3), str).addToBackStack(str).commit();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cWq = (gk) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_otn_reward_info, viewGroup, false);
        this.cWq.a(this);
        final int i = getArguments().getInt("arg.anchorY");
        this.cWq.getRoot().getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                z.this.cWq.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
                ((LayoutParams) z.this.cWq.bYN.getLayoutParams()).topMargin = i;
                z.this.cWq.bYN.requestLayout();
                return false;
            }
        });
        return this.cWq.getRoot();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        IQApp.Ex().bd(new a().setValue(Boolean.valueOf(true)));
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        IQApp.Ex().bd(new a().setValue(Boolean.valueOf(false)));
        return true;
    }

    public void att() {
        this.cWq.bYN.setAlpha(0.0f);
        float f = (float) (-getResources().getDimensionPixelOffset(R.dimen.dp12));
        this.cWq.bYN.setTranslationX(f);
        this.cWq.bYN.setTranslationY(f);
        this.cWq.bYN.setPivotX((float) this.cWq.bYN.getWidth());
        this.cWq.bYN.setPivotY(1.0f);
        this.cWq.bYN.setScaleX(0.3f);
        this.cWq.bYN.setScaleY(0.3f);
        this.cWq.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cWq.bYN.setPivotX((float) this.cWq.bYN.getWidth());
        this.cWq.bYN.setPivotY(1.0f);
        this.cWq.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
