package com.iqoption.charttools.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentIndicatorSettingsBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final TextView aHJ;
    @NonNull
    public final ImageView aHK;
    @NonNull
    public final TextView aHL;
    @NonNull
    public final Guideline aHM;
    @NonNull
    public final View aHN;
    @NonNull
    public final RecyclerView aHO;
    @Nullable
    public final FrameLayout aHP;
    @Nullable
    public final Guideline aHQ;
    @NonNull
    public final TextView alH;

    protected a(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, Guideline guideline, View view2, RecyclerView recyclerView, FrameLayout frameLayout, TextView textView3, Guideline guideline2) {
        super(obj, view, i);
        this.aHJ = textView;
        this.aHK = imageView;
        this.aHL = textView2;
        this.aHM = guideline;
        this.aHN = view2;
        this.aHO = recyclerView;
        this.aHP = frameLayout;
        this.alH = textView3;
        this.aHQ = guideline2;
    }
}
