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

/* compiled from: MicroPortfolioOpenHeaderItemBinding */
public abstract class rx extends ViewDataBinding {
    @NonNull
    public final TextView coh;
    @NonNull
    public final TextView coi;
    @NonNull
    public final TextView coj;
    @NonNull
    public final TextView cok;

    protected rx(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.coh = textView;
        this.coi = textView2;
        this.coj = textView3;
        this.cok = textView4;
    }

    @NonNull
    public static rx H(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return H(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rx H(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rx) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_open_header_item, viewGroup, z, obj);
    }
}
