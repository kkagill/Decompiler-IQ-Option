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
import com.iqoption.view.timer.TimerView;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioExpSingleGroupItemBinding */
public abstract class rp extends ViewDataBinding {
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TimerView bXq;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final FrameLayout cnJ;
    @NonNull
    public final rj cnW;

    protected rp(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, rj rjVar, TextView textView2, TextView textView3, FrameLayout frameLayout, ImageView imageView, TimerView timerView, TextView textView4) {
        super(obj, view, i);
        this.anJ = textView;
        this.cnH = constraintLayout;
        this.cnW = rjVar;
        setContainedBinding(this.cnW);
        this.bZk = textView2;
        this.alU = textView3;
        this.cnJ = frameLayout;
        this.cau = imageView;
        this.bXq = timerView;
        this.aoq = textView4;
    }

    @NonNull
    public static rp D(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return D(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rp D(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rp) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_exp_single_group_item, viewGroup, z, obj);
    }
}
