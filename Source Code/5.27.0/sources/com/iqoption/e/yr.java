package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: SellDelegateBinding */
public abstract class yr extends ViewDataBinding {
    @NonNull
    public final TextView alW;
    @NonNull
    public final TextView bTD;
    @NonNull
    public final TextView bWZ;
    @NonNull
    public final TextView bYV;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final TextView bZh;
    @NonNull
    public final TextView cen;
    @NonNull
    public final FrameLayout ctY;
    @NonNull
    public final TextView ctZ;
    @NonNull
    public final TextView cua;

    protected yr(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView6, FrameLayout frameLayout, TextView textView7, TextView textView8) {
        super(obj, view, i);
        this.bTD = textView;
        this.bZh = textView2;
        this.bYV = textView3;
        this.alW = textView4;
        this.cen = textView5;
        this.bYW = contentLoadingProgressBar;
        this.bWZ = textView6;
        this.ctY = frameLayout;
        this.ctZ = textView7;
        this.cua = textView8;
    }

    @NonNull
    public static yr ad(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return ad(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static yr ad(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (yr) ViewDataBinding.inflateInternal(layoutInflater, R.layout.sell_delegate, viewGroup, z, obj);
    }
}
