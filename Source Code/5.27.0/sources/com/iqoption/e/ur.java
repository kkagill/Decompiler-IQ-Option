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

/* compiled from: PortfolioExpHeaderItemBinding */
public abstract class ur extends ViewDataBinding {
    @NonNull
    public final TextView bXz;

    protected ur(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.bXz = textView;
    }

    @NonNull
    public static ur Q(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return Q(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ur Q(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ur) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_exp_header_item, viewGroup, z, obj);
    }
}
