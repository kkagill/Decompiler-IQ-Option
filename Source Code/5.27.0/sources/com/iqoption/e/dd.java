package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.b.e;

/* compiled from: BaseMenuFragmentBinding */
public abstract class dd extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYj;
    @Bindable
    protected e bYk;

    public abstract void a(@Nullable e eVar);

    protected dd(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.bYj = frameLayout;
    }
}
