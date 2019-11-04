package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeConstraintLayout;
import com.iqoption.core.ui.widget.StarBar;

/* compiled from: DialogRateUsBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final StarBar aRL;
    @NonNull
    public final TextView ani;
    @NonNull
    public final TextView cMu;
    @NonNull
    public final MaxSizeConstraintLayout cMv;
    @NonNull
    public final ImageView cbf;

    protected o(Object obj, View view, int i, TextView textView, MaxSizeConstraintLayout maxSizeConstraintLayout, ImageView imageView, FrameLayout frameLayout, StarBar starBar, TextView textView2) {
        super(obj, view, i);
        this.cMu = textView;
        this.cMv = maxSizeConstraintLayout;
        this.cbf = imageView;
        this.aHP = frameLayout;
        this.aRL = starBar;
        this.ani = textView2;
    }
}
