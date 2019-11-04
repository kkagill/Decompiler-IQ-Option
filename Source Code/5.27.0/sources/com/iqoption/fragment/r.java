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
import com.iqoption.e.go;
import com.iqoption.fragment.b.b;
import com.iqoption.system.a.c;
import com.iqoption.util.e;
import com.iqoption.util.q;
import com.iqoption.x.R;

/* compiled from: InvestPortfolioInfoDialog */
public final class r extends b {
    private go cVI;

    /* compiled from: InvestPortfolioInfoDialog */
    public static class a extends c<Boolean> {
    }

    @NonNull
    private static r av(int i, int i2) {
        r rVar = new r();
        rVar.setArguments(new e().O("arg.anchorX", i).O("arg.anchorY", i2).toBundle());
        return rVar;
    }

    public static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3) {
        String str = "CommisionInfoDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, av(i2, i3), str).addToBackStack(str).commit();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cVI = (go) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_portfolio_invest_info, viewGroup, false);
        this.cVI.a(this);
        Bundle arguments = getArguments();
        final int i = arguments.getInt("arg.anchorX");
        final int i2 = arguments.getInt("arg.anchorY");
        final q qVar = new q(getContext());
        this.cVI.getRoot().getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                r.this.cVI.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
                LayoutParams layoutParams = (LayoutParams) r.this.cVI.bYN.getLayoutParams();
                layoutParams.topMargin = i2 - qVar.ad(8.0f);
                layoutParams.leftMargin = i + qVar.ad(4.0f);
                r.this.cVI.bYN.requestLayout();
                return false;
            }
        });
        return this.cVI.getRoot();
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
        this.cVI.bYN.setAlpha(0.0f);
        float f = (float) (-getResources().getDimensionPixelOffset(R.dimen.dp12));
        this.cVI.bYN.setTranslationX(f);
        this.cVI.bYN.setTranslationY(f);
        this.cVI.bYN.setPivotX(1.0f);
        this.cVI.bYN.setPivotY(1.0f);
        this.cVI.bYN.setScaleX(0.3f);
        this.cVI.bYN.setScaleY(0.3f);
        this.cVI.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cVI.bYN.setPivotX(1.0f);
        this.cVI.bYN.setPivotY(1.0f);
        this.cVI.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
