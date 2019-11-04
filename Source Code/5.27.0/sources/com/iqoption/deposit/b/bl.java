package com.iqoption.deposit.b;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutNavigatorContentBinding */
public abstract class bl extends ViewDataBinding {
    @NonNull
    public final FrameLayout cDE;
    @NonNull
    public final FrameLayout cDF;

    protected bl(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.cDE = frameLayout;
        this.cDF = frameLayout2;
    }
}
