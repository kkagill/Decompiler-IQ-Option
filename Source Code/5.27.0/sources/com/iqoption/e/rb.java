package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioClosedEmptyItemBinding */
public abstract class rb extends ViewDataBinding {
    protected rb(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @NonNull
    public static rb x(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return x(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rb x(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rb) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_closed_empty_item, viewGroup, z, obj);
    }
}
