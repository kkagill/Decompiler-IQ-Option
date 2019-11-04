package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.b.f;

/* compiled from: BaseSmartDialogFragmentBinding */
public abstract class df extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYj;
    @NonNull
    public final FrameLayout bYl;
    @Bindable
    protected f bYm;

    public abstract void a(@Nullable f fVar);

    protected df(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.bYl = frameLayout;
        this.bYj = frameLayout2;
    }
}
