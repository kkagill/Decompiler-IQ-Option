package com.iqoption.withdraw.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.withdraw.d.e;

/* compiled from: FragmentWithdrawCompleteBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final TextView epO;
    @NonNull
    public final ImageView epP;
    @NonNull
    public final TextView epQ;

    protected a(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.epO = textView;
        this.epP = imageView;
        this.epQ = textView2;
    }

    @NonNull
    public static a af(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return af(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static a af(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (a) ViewDataBinding.inflateInternal(layoutInflater, e.fragment_withdraw_complete, viewGroup, z, obj);
    }
}
