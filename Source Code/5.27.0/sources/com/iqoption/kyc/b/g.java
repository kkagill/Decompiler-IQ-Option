package com.iqoption.kyc.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentKycDecumentsHistoryBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final ImageView duE;
    @NonNull
    public final TextView duF;
    @NonNull
    public final RecyclerView duG;
    @NonNull
    public final FrameLayout duH;
    @NonNull
    public final TextView duI;

    protected g(Object obj, View view, int i, ImageView imageView, TextView textView, RecyclerView recyclerView, FrameLayout frameLayout, TextView textView2) {
        super(obj, view, i);
        this.duE = imageView;
        this.duF = textView;
        this.duG = recyclerView;
        this.duH = frameLayout;
        this.duI = textView2;
    }
}
