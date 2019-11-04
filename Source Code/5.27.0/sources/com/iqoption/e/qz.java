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

/* compiled from: MicroPortfolioCfdSingleGroupItemBinding */
public abstract class qz extends ViewDataBinding {
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final qv cnI;
    @NonNull
    public final FrameLayout cnJ;

    protected qz(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, qv qvVar, TextView textView2, TextView textView3, FrameLayout frameLayout, ImageView imageView2, TextView textView4) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.cnH = constraintLayout;
        this.cnI = qvVar;
        setContainedBinding(this.cnI);
        this.bZk = textView2;
        this.alU = textView3;
        this.cnJ = frameLayout;
        this.cau = imageView2;
        this.aoq = textView4;
    }

    @NonNull
    public static qz w(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return w(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qz w(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (qz) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_cfd_single_group_item, viewGroup, z, obj);
    }
}
