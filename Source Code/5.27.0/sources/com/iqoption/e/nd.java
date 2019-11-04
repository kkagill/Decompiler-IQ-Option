package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeCardViewLayout;

/* compiled from: FragmentScrollableDialogBinding */
public abstract class nd extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final MaxSizeCardViewLayout aQN;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView ani;
    @NonNull
    public final ContentLoadingProgressBar ciB;
    @NonNull
    public final TextView ciC;
    @NonNull
    public final TextView ciD;
    @NonNull
    public final TextView ciE;

    protected nd(Object obj, View view, int i, ContentLoadingProgressBar contentLoadingProgressBar, MaxSizeCardViewLayout maxSizeCardViewLayout, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.ciB = contentLoadingProgressBar;
        this.aQN = maxSizeCardViewLayout;
        this.ciC = textView;
        this.aHP = frameLayout;
        this.ciD = textView2;
        this.ciE = textView3;
        this.ani = textView4;
        this.alH = textView5;
    }
}
