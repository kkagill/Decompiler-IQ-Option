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

/* compiled from: PortfolioOpenHeaderItemBinding */
public abstract class vn extends ViewDataBinding {
    @NonNull
    public final TextView cqc;

    protected vn(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.cqc = textView;
    }

    @NonNull
    public static vn X(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return X(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vn X(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (vn) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_open_header_item, viewGroup, z, obj);
    }
}
