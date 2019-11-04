package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioPageOpenPositionsBinding */
public abstract class sb extends ViewDataBinding {
    @NonNull
    public final ProgressBar Dk;
    @NonNull
    public final RecyclerView aIq;
    @NonNull
    public final TextView col;
    @NonNull
    public final LinearLayout com;

    protected sb(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, ProgressBar progressBar) {
        super(obj, view, i);
        this.col = textView;
        this.com = linearLayout;
        this.aIq = recyclerView;
        this.Dk = progressBar;
    }

    @NonNull
    public static sb c(@NonNull LayoutInflater layoutInflater) {
        return c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static sb c(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (sb) ViewDataBinding.inflateInternal(layoutInflater, R.layout.micro_portfolio_page_open_positions, null, false, obj);
    }
}
