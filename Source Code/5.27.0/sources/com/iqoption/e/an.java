package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ActivityWithdrawBinding */
public abstract class an extends ViewDataBinding {
    @NonNull
    public final FrameLayout bTB;
    @NonNull
    public final FrameLayout bTu;

    protected an(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.bTu = frameLayout;
        this.bTB = frameLayout2;
    }
}
