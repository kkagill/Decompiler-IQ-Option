package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentLeftPanelBinding */
public abstract class li extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;
    @NonNull
    public final FrameLayout bTy;
    @NonNull
    public final FrameLayout bYl;
    @NonNull
    public final ImageView che;
    @NonNull
    public final FrameLayout chf;

    protected li(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, RecyclerView recyclerView, ImageView imageView, FrameLayout frameLayout3) {
        super(obj, view, i);
        this.bYl = frameLayout;
        this.bTy = frameLayout2;
        this.aIq = recyclerView;
        this.che = imageView;
        this.chf = frameLayout3;
    }
}
