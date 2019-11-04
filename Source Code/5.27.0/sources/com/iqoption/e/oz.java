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

/* compiled from: ItemOvernightFeeScheduleBinding */
public abstract class oz extends ViewDataBinding {
    @NonNull
    public final TextView anj;
    @NonNull
    public final TextView bWY;
    @NonNull
    public final TextView cml;
    @NonNull
    public final TextView cmm;

    protected oz(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.bWY = textView;
        this.cml = textView2;
        this.cmm = textView3;
        this.anj = textView4;
    }

    @NonNull
    public static oz r(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return r(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static oz r(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (oz) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_overnight_fee_schedule, viewGroup, z, obj);
    }
}
