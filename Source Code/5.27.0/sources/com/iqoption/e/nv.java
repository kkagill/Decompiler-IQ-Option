package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentVipAboutBinding */
public abstract class nv extends ViewDataBinding {
    @NonNull
    public final ImageView bYq;
    @NonNull
    public final ImageView ckE;
    @NonNull
    public final RecyclerView ckF;

    protected nv(Object obj, View view, int i, ImageView imageView, ImageView imageView2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.ckE = imageView;
        this.bYq = imageView2;
        this.ckF = recyclerView;
    }
}
