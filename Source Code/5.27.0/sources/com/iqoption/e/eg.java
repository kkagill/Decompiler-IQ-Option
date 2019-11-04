package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: ClosePositionDelegateBinding */
public abstract class eg extends ViewDataBinding {
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TextView bTD;
    @NonNull
    public final FrameLayout bYR;
    @NonNull
    public final TextView bYV;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final ImageView bYX;
    @NonNull
    public final TextView bZb;
    @NonNull
    public final TextView bZc;
    @NonNull
    public final TextView bZd;
    @NonNull
    public final TextView bZe;
    @NonNull
    public final LinearLayout bZg;
    @NonNull
    public final TextView bZh;
    @NonNull
    public final TextView bZi;

    protected eg(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, TextView textView6, TextView textView7, ContentLoadingProgressBar contentLoadingProgressBar, ImageView imageView, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.bZb = textView;
        this.bYR = frameLayout;
        this.bZc = textView2;
        this.bZd = textView3;
        this.bZe = textView4;
        this.bTD = textView5;
        this.bZg = linearLayout;
        this.bZh = textView6;
        this.bYV = textView7;
        this.bYW = contentLoadingProgressBar;
        this.bYX = imageView;
        this.bZi = textView8;
        this.aoq = textView9;
    }

    @NonNull
    public static eg f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return f(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static eg f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (eg) ViewDataBinding.inflateInternal(layoutInflater, R.layout.close_position_delegate, viewGroup, z, obj);
    }
}
