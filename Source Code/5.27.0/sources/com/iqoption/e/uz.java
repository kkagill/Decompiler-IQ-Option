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

/* compiled from: PortfolioExpSingleGroupItemBinding */
public abstract class uz extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView alU;
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
    public final ut cqa;

    protected uz(Object obj, View view, int i, ConstraintLayout constraintLayout, ut utVar, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView, TimerView timerView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cnH = constraintLayout;
        this.cqa = utVar;
        setContainedBinding(this.cqa);
        this.bZk = textView;
        this.alU = textView2;
        this.cnJ = frameLayout;
        this.cau = imageView;
        this.bXq = timerView;
        this.alH = textView3;
        this.aoq = textView4;
    }

    @NonNull
    public static uz T(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return T(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static uz T(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (uz) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_exp_single_group_item, viewGroup, z, obj);
    }
}
