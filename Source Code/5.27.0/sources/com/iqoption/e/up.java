package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: PortfolioExpGroupItemBinding */
public abstract class up extends ViewDataBinding {
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final ImageView cnb;
    @NonNull
    public final TextView cnc;

    protected up(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.cnb = imageView2;
        this.bZk = textView2;
        this.alU = textView3;
        this.cnc = textView4;
        this.aoq = textView5;
    }

    @NonNull
    public static up P(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return P(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static up P(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (up) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_exp_group_item, viewGroup, z, obj);
    }
}
