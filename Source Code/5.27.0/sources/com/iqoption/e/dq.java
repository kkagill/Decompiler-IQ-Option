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

/* compiled from: BottomSheetMessageBinding */
public abstract class dq extends ViewDataBinding {
    @NonNull
    public final View bYo;
    @NonNull
    public final RobotoTextView bYz;

    protected dq(Object obj, View view, int i, RobotoTextView robotoTextView, View view2) {
        super(obj, view, i);
        this.bYz = robotoTextView;
        this.bYo = view2;
    }

    @NonNull
    public static dq c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return c(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static dq c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (dq) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bottom_sheet_message, viewGroup, z, obj);
    }
}
