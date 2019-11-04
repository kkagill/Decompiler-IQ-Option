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
import com.iqoption.e.fs;
import com.iqoption.fragment.b.b;
import com.iqoption.system.a.c;
import com.iqoption.util.e;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: CommisionInfoDialog */
public final class g extends b {
    private fs cUK;

    /* compiled from: CommisionInfoDialog */
    public static class a extends c<Boolean> {
    }

    @NonNull
    private static g h(int i, int i2, String str) {
        g gVar = new g();
        gVar.setArguments(new e().O("arg.anchorX", i).O("arg.anchorY", i2).aF("arg.stringValue", str).toBundle());
        return gVar;
    }

    public static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3, String str) {
        String str2 = "CommisionInfoDialog";
        if (fragmentManager.findFragmentByTag(str2) == null) {
            fragmentManager.beginTransaction().add(i, h(i2, i3, str), str2).addToBackStack(str2).commit();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cUK = (fs) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_commision_info, viewGroup, false);
        this.cUK.a(this);
        final int i = getArguments().getInt("arg.anchorY");
        String format = String.format(Locale.US, "%s%%", new Object[]{r5.getString("arg.stringValue")});
        this.cUK.caU.setText(getString(R.string.fixed_trade_commission, format));
        this.cUK.getRoot().getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                g.this.cUK.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
                ((LayoutParams) g.this.cUK.bYN.getLayoutParams()).topMargin = i;
                g.this.cUK.bYN.requestLayout();
                return false;
            }
        });
        return this.cUK.getRoot();
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
        this.cUK.bYN.setAlpha(0.0f);
        float f = (float) (-getResources().getDimensionPixelOffset(R.dimen.dp12));
        this.cUK.bYN.setTranslationX(f);
        this.cUK.bYN.setTranslationY(f);
        this.cUK.bYN.setPivotX((float) this.cUK.bYN.getWidth());
        this.cUK.bYN.setPivotY(1.0f);
        this.cUK.bYN.setScaleX(0.3f);
        this.cUK.bYN.setScaleY(0.3f);
        this.cUK.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cUK.bYN.setPivotX((float) this.cUK.bYN.getWidth());
        this.cUK.bYN.setPivotY(1.0f);
        this.cUK.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
