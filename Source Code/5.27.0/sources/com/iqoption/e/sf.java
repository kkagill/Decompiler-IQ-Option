package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioPendingEmptyItemBinding */
public abstract class sf extends ViewDataBinding {
    protected sf(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @NonNull
    public static sf I(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return I(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static sf I(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (sf) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_pending_empty_item, viewGroup, z, obj);
    }
}
