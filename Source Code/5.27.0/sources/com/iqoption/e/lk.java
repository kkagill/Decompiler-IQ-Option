package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentLocaleAssetSearchCountryBinding */
public abstract class lk extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;
    @NonNull
    public final View bYo;
    @NonNull
    public final ProgressBar bYs;
    @NonNull
    public final LinearLayout bYt;
    @NonNull
    public final ImageView bfr;
    @NonNull
    public final TextView bft;
    @NonNull
    public final LinearLayout bfu;

    protected lk(Object obj, View view, int i, RecyclerView recyclerView, View view2, ProgressBar progressBar, ImageView imageView, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.aIq = recyclerView;
        this.bYo = view2;
        this.bYs = progressBar;
        this.bfr = imageView;
        this.bft = textView;
        this.bfu = linearLayout;
        this.bYt = linearLayout2;
    }
}
