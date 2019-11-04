package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentCommissionChangeBinding */
public abstract class is extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final TextView cbI;
    @NonNull
    public final FrameLayout cfH;
    @NonNull
    public final LinearLayout cfI;
    @NonNull
    public final RecyclerView cfJ;
    @NonNull
    public final ImageView cfK;
    @NonNull
    public final LinearLayout cfL;
    @NonNull
    public final TextView cfM;
    @NonNull
    public final TextView cfN;
    @NonNull
    public final TextView cfO;

    protected is(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, FrameLayout frameLayout2, ImageView imageView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cfH = frameLayout;
        this.cbI = textView;
        this.cfI = linearLayout;
        this.cfJ = recyclerView;
        this.bYN = frameLayout2;
        this.cfK = imageView;
        this.cfL = linearLayout2;
        this.cfM = textView2;
        this.cfN = textView3;
        this.cfO = textView4;
    }
}
