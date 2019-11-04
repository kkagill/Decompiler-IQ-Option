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

/* compiled from: DialogClosedDealsHeaderMultiBinding */
public abstract class fg extends ViewDataBinding {
    @NonNull
    public final RobotoTextView cal;
    @NonNull
    public final RobotoTextView can;
    @NonNull
    public final RobotoTextView cao;
    @NonNull
    public final RobotoTextView cap;

    protected fg(Object obj, View view, int i, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        super(obj, view, i);
        this.can = robotoTextView;
        this.cao = robotoTextView2;
        this.cap = robotoTextView3;
        this.cal = robotoTextView4;
    }

    @NonNull
    public static fg k(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return k(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static fg k(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (fg) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_closed_deals_header_multi, viewGroup, z, obj);
    }
}
