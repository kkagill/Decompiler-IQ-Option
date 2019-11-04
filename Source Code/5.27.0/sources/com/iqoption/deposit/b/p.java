package com.iqoption.deposit.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentDepositMethodsLightBinding */
public abstract class p extends ViewDataBinding {
    @NonNull
    public final TextView cBS;
    @NonNull
    public final LinearLayout cBT;
    @NonNull
    public final RecyclerView cBU;
    @NonNull
    public final TextView cBV;
    @NonNull
    public final FrameLayout cBW;
    @NonNull
    public final ImageView cBX;

    protected p(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView2, FrameLayout frameLayout, ImageView imageView) {
        super(obj, view, i);
        this.cBS = textView;
        this.cBT = linearLayout;
        this.cBU = recyclerView;
        this.cBV = textView2;
        this.cBW = frameLayout;
        this.cBX = imageView;
    }
}
