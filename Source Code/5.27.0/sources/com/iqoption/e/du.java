package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.x.R;

/* compiled from: BottomSheetPortfolioFilterChooserBinding */
public abstract class du extends ViewDataBinding {
    @NonNull
    public final RecyclerView bYD;
    @NonNull
    public final View bYo;

    protected du(Object obj, View view, int i, RecyclerView recyclerView, View view2) {
        super(obj, view, i);
        this.bYD = recyclerView;
        this.bYo = view2;
    }

    @NonNull
    public static du d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return d(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static du d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (du) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bottom_sheet_portfolio_filter_chooser, viewGroup, z, obj);
    }
}
