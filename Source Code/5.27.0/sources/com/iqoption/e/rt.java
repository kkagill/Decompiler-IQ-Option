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

/* compiled from: MicroPortfolioMktOnOpenSingleGroupItemBinding */
public abstract class rt extends ViewDataBinding {
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
    public final RobotoTextView cog;

    protected rt(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, sj sjVar, TextView textView2, RobotoTextView robotoTextView, FrameLayout frameLayout, ImageView imageView2, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.cnH = constraintLayout;
        this.coe = sjVar;
        setContainedBinding(this.coe);
        this.bZk = textView2;
        this.bYU = robotoTextView;
        this.cnJ = frameLayout;
        this.cau = imageView2;
        this.cog = robotoTextView2;
    }

    @NonNull
    public static rt F(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return F(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rt F(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rt) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_mkt_on_open_single_group_item, viewGroup, z, obj);
    }
}
