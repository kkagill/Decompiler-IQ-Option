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

/* compiled from: DialogClosedDealsBottomOptionByTickBinding */
public abstract class eu extends ViewDataBinding {
    @NonNull
    public final TextView cae;

    protected eu(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.cae = textView;
    }

    @NonNull
    public static eu i(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return i(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static eu i(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (eu) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_closed_deals_bottom_option_by_tick, viewGroup, z, obj);
    }
}
