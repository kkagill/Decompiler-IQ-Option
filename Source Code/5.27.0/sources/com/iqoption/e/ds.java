package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BottomSheetOtnEmissionHistoryBinding */
public abstract class ds extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bYA;
    @NonNull
    public final RecyclerView bYB;
    @NonNull
    public final FrameLayout bYC;
    @NonNull
    public final View bYo;

    protected ds(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView, View view2, FrameLayout frameLayout, TextView textView) {
        super(obj, view, i);
        this.bYA = imageView;
        this.bYB = recyclerView;
        this.bYo = view2;
        this.bYC = frameLayout;
        this.alH = textView;
    }
}
