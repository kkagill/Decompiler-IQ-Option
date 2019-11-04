package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentVipEducationBinding */
public abstract class nz extends ViewDataBinding {
    @NonNull
    public final ImageView bYq;
    @NonNull
    public final RecyclerView ckF;

    protected nz(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.bYq = imageView;
        this.ckF = recyclerView;
    }
}
