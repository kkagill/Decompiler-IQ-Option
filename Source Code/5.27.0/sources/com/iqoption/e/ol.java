package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* compiled from: HowToTradeMultiFragmentBinding */
public abstract class ol extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final FrameLayout caT;
    @NonNull
    public final CardView clm;
    @NonNull
    public final TextView cln;
    @NonNull
    public final TextView clo;

    protected ol(Object obj, View view, int i, CardView cardView, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3) {
        super(obj, view, i);
        this.clm = cardView;
        this.cln = textView;
        this.clo = textView2;
        this.caT = frameLayout;
        this.alH = textView3;
    }
}
