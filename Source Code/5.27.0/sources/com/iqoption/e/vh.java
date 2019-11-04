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

/* compiled from: PortfolioMktOnOpenItemBinding */
public abstract class vh extends ViewDataBinding {
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
    public final RobotoTextView cog;
    @NonNull
    public final vz cqb;

    protected vh(Object obj, View view, int i, ConstraintLayout constraintLayout, vz vzVar, RobotoTextView robotoTextView, TextView textView, FrameLayout frameLayout, ImageView imageView, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.cnH = constraintLayout;
        this.cqb = vzVar;
        setContainedBinding(this.cqb);
        this.bYU = robotoTextView;
        this.cof = textView;
        this.cnJ = frameLayout;
        this.cau = imageView;
        this.cog = robotoTextView2;
    }

    @NonNull
    public static vh U(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return U(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static vh U(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (vh) ViewDataBinding.inflateInternal(layoutInflater, R.layout.portfolio_mkt_on_open_item, viewGroup, z, obj);
    }
}
