package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BottomSheetPortfolioTpslChooserBinding */
public abstract class dw extends ViewDataBinding {
    @NonNull
    public final TextView aQO;
    @NonNull
    public final TextView bYE;
    @NonNull
    public final TextView bYF;
    @NonNull
    public final RecyclerView bYG;
    @NonNull
    public final TextView bYH;
    @NonNull
    public final RecyclerView bYI;
    @NonNull
    public final View bYo;
    @NonNull
    public final LinearLayout bYt;

    protected dw(Object obj, View view, int i, TextView textView, TextView textView2, View view2, LinearLayout linearLayout, TextView textView3, RecyclerView recyclerView, TextView textView4, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.aQO = textView;
        this.bYE = textView2;
        this.bYo = view2;
        this.bYt = linearLayout;
        this.bYF = textView3;
        this.bYG = recyclerView;
        this.bYH = textView4;
        this.bYI = recyclerView2;
    }
}
