package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.b.g;

/* compiled from: BaseSmartFragmentBinding */
public abstract class dh extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYj;
    @NonNull
    public final FrameLayout bYl;
    @Bindable
    protected g bYn;

    public abstract void a(@Nullable g gVar);

    protected dh(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.bYl = frameLayout;
        this.bYj = frameLayout2;
    }
}
