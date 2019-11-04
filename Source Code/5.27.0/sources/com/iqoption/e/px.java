package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LeftMenuItemListBinding */
public abstract class px extends ViewDataBinding {
    @NonNull
    public final FrameLayout cmG;
    @NonNull
    public final RecyclerView cmH;

    protected px(Object obj, View view, int i, FrameLayout frameLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.cmG = frameLayout;
        this.cmH = recyclerView;
    }
}
