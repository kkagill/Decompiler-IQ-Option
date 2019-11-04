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

/* compiled from: PortfolioPendingItemBinding */
public abstract class wb extends ViewDataBinding {
    @NonNull
    public final RobotoTextView bYU;
    @NonNull
    public final ImageView cau;
    @NonNull
    public final ConstraintLayout cnH;
    @NonNull
    public final FrameLayout cnJ;
    @NonNull
    public final TextView cof;
    @NonNull
    public final RobotoTextView coo;
    @NonNull
    public final vz cqb;

    protected wb(Object obj, View view, int i, ConstraintLayout constraintLayout, vz vzVar, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, TextView textView, FrameLayout frameLayout, ImageView imageView) {
        super(obj, view, i);
        this.cnH = constraintLayout;
        this.cqb = vzVar;
        setContainedBinding(this.cqb);
        this.bYU = robotoTextView;
        this.coo = robotoTextView2;
        this.cof = textView;
        this.cnJ = frameLayout;
        this.cau = imageView;
    }

    @NonNull
    public static wb ab(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return ab(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static wb ab(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (wb) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_pending_item, viewGroup, z, obj);
    }
}
