package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemTradingHistoryBinding */
public abstract class q extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView aRu;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView alW;
    @NonNull
    public final TextView ctH;

    protected q(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.aRh = imageView;
        this.alW = textView;
        this.ctH = textView2;
        this.aRu = textView3;
        this.alH = textView4;
    }
}
