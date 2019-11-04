package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioOpenEmptyItemBinding */
public abstract class rv extends ViewDataBinding {
    protected rv(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @NonNull
    public static rv G(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return G(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rv G(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rv) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_open_empty_item, viewGroup, z, obj);
    }
}
