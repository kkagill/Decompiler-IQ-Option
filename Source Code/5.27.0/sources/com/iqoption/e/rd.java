package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioClosedItemBinding */
public abstract class rd extends ViewDataBinding {
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final TextView bZj;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final TextView cat;

    protected rd(Object obj, View view, int i, ImageView imageView, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.aRl = linearLayout;
        this.bZj = textView2;
        this.bZk = textView3;
        this.alU = textView4;
        this.cat = textView5;
    }

    @NonNull
    public static rd y(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return y(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rd y(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rd) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_closed_item, viewGroup, z, obj);
    }
}
