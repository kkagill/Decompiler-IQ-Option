package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: CloseDelegateBinding */
public abstract class ee extends ViewDataBinding {
    @NonNull
    public final TextView bTD;
    @NonNull
    public final FrameLayout bYR;
    @NonNull
    public final TextView bYT;
    @NonNull
    public final TextView bYV;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final TextView bZb;
    @NonNull
    public final TextView bZc;
    @NonNull
    public final TextView bZd;
    @NonNull
    public final TextView bZe;
    @NonNull
    public final TextView bZf;
    @NonNull
    public final LinearLayout bZg;
    @NonNull
    public final TextView bZh;

    protected ee(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LinearLayout linearLayout, TextView textView8, TextView textView9, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.bZb = textView;
        this.bYR = frameLayout;
        this.bZc = textView2;
        this.bZd = textView3;
        this.bZe = textView4;
        this.bZf = textView5;
        this.bYT = textView6;
        this.bTD = textView7;
        this.bZg = linearLayout;
        this.bZh = textView8;
        this.bYV = textView9;
        this.bYW = contentLoadingProgressBar;
    }

    @NonNull
    public static ee e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return e(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ee e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ee) ViewDataBinding.inflateInternal(layoutInflater, R.layout.close_delegate, viewGroup, z, obj);
    }
}
