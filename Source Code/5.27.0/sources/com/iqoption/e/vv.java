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
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: PortfolioPendingGroupItemBinding */
public abstract class vv extends ViewDataBinding {
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final RobotoTextView bYU;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final ImageView cnb;
    @NonNull
    public final TextView cnc;
    @NonNull
    public final TextView cof;

    protected vv(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, RobotoTextView robotoTextView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.cnb = imageView2;
        this.bZk = textView2;
        this.bYU = robotoTextView;
        this.cnc = textView3;
        this.cof = textView4;
    }

    @NonNull
    public static vv Z(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return Z(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vv Z(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (vv) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_pending_group_item, viewGroup, z, obj);
    }
}
