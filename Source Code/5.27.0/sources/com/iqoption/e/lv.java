package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.x;

/* compiled from: FragmentMultiplierChooserBinding */
public abstract class lv extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final RecyclerView chn;
    @Bindable
    protected x cho;

    public abstract void a(@Nullable x xVar);

    protected lv(Object obj, View view, int i, FrameLayout frameLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.bYN = frameLayout;
        this.chn = recyclerView;
    }
}
