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
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioPendingSingleGroupItemBinding */
public abstract class sn extends ViewDataBinding {
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final RobotoTextView bYU;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final FrameLayout cnJ;
    @NonNull
    public final sj coe;
    @NonNull
    public final RobotoTextView coo;

    protected sn(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, sj sjVar, TextView textView2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, FrameLayout frameLayout, ImageView imageView2) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.cnH = constraintLayout;
        this.coe = sjVar;
        setContainedBinding(this.coe);
        this.bZk = textView2;
        this.bYU = robotoTextView;
        this.coo = robotoTextView2;
        this.cnJ = frameLayout;
        this.cau = imageView2;
    }

    @NonNull
    public static sn L(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return L(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static sn L(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (sn) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_pending_single_group_item, viewGroup, z, obj);
    }
}
