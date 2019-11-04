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

/* compiled from: MicroPortfolioMktOnOpenItemBinding */
public abstract class rr extends ViewDataBinding {
    @NonNull
    public final RobotoTextView bYU;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final FrameLayout cnJ;
    @NonNull
    public final sj coe;
    @NonNull
    public final TextView cof;
    @NonNull
    public final RobotoTextView cog;

    protected rr(Object obj, View view, int i, ConstraintLayout constraintLayout, sj sjVar, RobotoTextView robotoTextView, TextView textView, FrameLayout frameLayout, ImageView imageView, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.cnH = constraintLayout;
        this.coe = sjVar;
        setContainedBinding(this.coe);
        this.bYU = robotoTextView;
        this.cof = textView;
        this.cnJ = frameLayout;
        this.cau = imageView;
        this.cog = robotoTextView2;
    }

    @NonNull
    public static rr E(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return E(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rr E(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rr) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_mkt_on_open_item, viewGroup, z, obj);
    }
}
