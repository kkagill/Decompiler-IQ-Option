package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: PortfolioPendingEmptyItemBinding */
public abstract class vt extends ViewDataBinding {
    protected vt(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @NonNull
    public static vt Y(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return Y(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vt Y(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (vt) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_pending_empty_item, viewGroup, z, obj);
    }
}
