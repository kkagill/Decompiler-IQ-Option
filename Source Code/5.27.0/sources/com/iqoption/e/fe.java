package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: DialogClosedDealsHeaderListMultiBinding */
public abstract class fe extends ViewDataBinding {
    protected fe(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @NonNull
    public static fe j(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return j(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static fe j(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (fe) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_closed_deals_header_list_multi, viewGroup, z, obj);
    }
}
