package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioExpHeaderItemBinding */
public abstract class rh extends ViewDataBinding {
    @NonNull
    public final TextView bXz;

    protected rh(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.bXz = textView;
    }

    @NonNull
    public static rh A(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return A(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rh A(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rh) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_exp_header_item, viewGroup, z, obj);
    }
}
