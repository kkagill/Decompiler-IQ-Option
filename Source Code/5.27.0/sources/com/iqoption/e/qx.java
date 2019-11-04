package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioCfdItemBinding */
public abstract class qx extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TextView bZh;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ImageView cnG;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final qv cnI;
    @NonNull
    public final FrameLayout cnJ;

    protected qx(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, qv qvVar, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cnG = imageView;
        this.cnH = constraintLayout;
        this.cnI = qvVar;
        setContainedBinding(this.cnI);
        this.bZh = textView;
        this.alU = textView2;
        this.cnJ = frameLayout;
        this.cau = imageView2;
        this.alH = textView3;
        this.aoq = textView4;
    }

    @NonNull
    public static qx v(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return v(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qx v(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (qx) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_cfd_item, viewGroup, z, obj);
    }
}
