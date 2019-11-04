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

/* compiled from: MicroPortfolioExpItemBinding */
public abstract class rl extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TimerView bXq;
    @NonNull
    public final TextView bZh;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final FrameLayout cnJ;
    @NonNull
    public final rj cnW;

    protected rl(Object obj, View view, int i, ConstraintLayout constraintLayout, rj rjVar, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView, TimerView timerView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cnH = constraintLayout;
        this.cnW = rjVar;
        setContainedBinding(this.cnW);
        this.bZh = textView;
        this.alU = textView2;
        this.cnJ = frameLayout;
        this.cau = imageView;
        this.bXq = timerView;
        this.alH = textView3;
        this.aoq = textView4;
    }

    @NonNull
    public static rl B(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return B(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static rl B(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (rl) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_exp_item, viewGroup, z, obj);
    }
}