package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: PortfolioPendingHeaderItemBinding */
public abstract class vx extends ViewDataBinding {
    @NonNull
    public final RobotoTextView cal;

    protected vx(Object obj, View view, int i, RobotoTextView robotoTextView) {
        super(obj, view, i);
        this.cal = robotoTextView;
    }

    @NonNull
    public static vx aa(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return aa(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vx aa(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (vx) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_pending_header_item, viewGroup, z, obj);
    }
}
