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

/* compiled from: DialogClosedDealsBottomMultiBinding */
public abstract class es extends ViewDataBinding {
    @NonNull
    public final TextView cad;

    protected es(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.cad = textView;
    }

    @NonNull
    public static es h(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return h(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static es h(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (es) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_closed_deals_bottom_multi, viewGroup, z, obj);
    }
}
