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
import com.iqoption.e.hc;
import com.iqoption.fragment.b.b;
import com.iqoption.util.e;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: TrailingStopInfoDialog */
public final class ai extends b {
    private hc cYo;

    @NonNull
    private static ai az(int i, int i2) {
        ai aiVar = new ai();
        aiVar.setArguments(new e().O("arg.anchorX", i).O("arg.anchorY", i2).toBundle());
        return aiVar;
    }

    public static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3) {
        String str = "TrailingStopInfoDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, az(i2, i3), str).addToBackStack(str).commit();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cYo = (hc) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_trailing_info, viewGroup, false);
        this.cYo.a(this);
        Bundle arguments = getArguments();
        final int i = arguments.getInt("arg.anchorX");
        final int i2 = arguments.getInt("arg.anchorY");
        this.cYo.getRoot().getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                ai.this.cYo.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
                LayoutParams layoutParams = (LayoutParams) ai.this.cYo.bYN.getLayoutParams();
                layoutParams.topMargin = i2;
                layoutParams.leftMargin = i;
                ai.this.cYo.bYN.requestLayout();
                return false;
            }
        });
        return this.cYo.getRoot();
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        return true;
    }

    public void att() {
        this.cYo.bYN.setAlpha(0.0f);
        float f = (float) (-getResources().getDimensionPixelOffset(R.dimen.dp12));
        this.cYo.bYN.setTranslationX(f);
        this.cYo.bYN.setTranslationY(f);
        this.cYo.bYN.setPivotX(1.0f);
        this.cYo.bYN.setPivotY(1.0f);
        this.cYo.bYN.setScaleX(0.3f);
        this.cYo.bYN.setScaleY(0.3f);
        this.cYo.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(c.egR).start();
    }

    public void atu() {
        this.cYo.bYN.setPivotX(1.0f);
        this.cYo.bYN.setPivotY(1.0f);
        this.cYo.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(c.egR).start();
    }
}
