package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: PortfolioOpenEmptyItemBinding */
public abstract class vl extends ViewDataBinding {
    protected vl(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @NonNull
    public static vl W(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return W(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vl W(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (vl) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_open_empty_item, viewGroup, z, obj);
    }
}
