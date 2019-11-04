package com.iqoption.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.iqoption.x.R;

/* compiled from: DialogClosedDealsBinding */
public abstract class eq extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bYq;
    @NonNull
    public final AppBarLayout bZR;
    @NonNull
    public final Space bZS;
    @NonNull
    public final Space bZT;
    @NonNull
    public final LinearLayout bZU;
    @NonNull
    public final CoordinatorLayout bZV;
    @NonNull
    public final FrameLayout bZW;
    @NonNull
    public final ContentLoadingProgressBar bZX;
    @NonNull
    public final FrameLayout bZY;
    @NonNull
    public final FrameLayout bZZ;
    @NonNull
    public final LinearLayout caa;
    @NonNull
    public final TextView cab;
    @NonNull
    public final FrameLayout cac;

    protected eq(Object obj, View view, int i, AppBarLayout appBarLayout, ImageView imageView, Space space, Space space2, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, ContentLoadingProgressBar contentLoadingProgressBar, FrameLayout frameLayout2, FrameLayout frameLayout3, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, FrameLayout frameLayout4) {
        super(obj, view, i);
        this.bZR = appBarLayout;
        this.bYq = imageView;
        this.bZS = space;
        this.bZT = space2;
        this.bZU = linearLayout;
        this.bZV = coordinatorLayout;
        this.bZW = frameLayout;
        this.bZX = contentLoadingProgressBar;
        this.bZY = frameLayout2;
        this.bZZ = frameLayout3;
        this.caa = linearLayout2;
        this.aIq = recyclerView;
        this.alH = textView;
        this.cab = textView2;
        this.cac = frameLayout4;
    }

    @NonNull
    public static eq g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return g(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static eq g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (eq) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_closed_deals, viewGroup, z, obj);
    }
}
