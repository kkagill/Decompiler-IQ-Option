package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentNewsAndUpdatesBinding */
public abstract class lx extends ViewDataBinding {
    @NonNull
    public final ImageView ceM;
    @NonNull
    public final RecyclerView chq;

    protected lx(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.ceM = imageView;
        this.chq = recyclerView;
    }
}
