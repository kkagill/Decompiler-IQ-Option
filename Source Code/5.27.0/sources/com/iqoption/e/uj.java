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

/* compiled from: PortfolioCfdSingleGroupItemBinding */
public abstract class uj extends ViewDataBinding {
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final FrameLayout cnJ;
    @NonNull
    public final uf cpY;

    protected uj(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, uf ufVar, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.akZ = imageView;
        this.cnH = constraintLayout;
        this.cpY = ufVar;
        setContainedBinding(this.cpY);
        this.bZk = textView;
        this.alU = textView2;
        this.cnJ = frameLayout;
        this.cau = imageView2;
        this.alH = textView3;
        this.aoq = textView4;
    }

    @NonNull
    public static uj O(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return O(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static uj O(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (uj) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_cfd_single_group_item, viewGroup, z, obj);
    }
}
