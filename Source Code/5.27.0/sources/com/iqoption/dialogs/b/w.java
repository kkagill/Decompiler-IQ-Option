package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentIqBottomSheetBinding */
public abstract class w extends ViewDataBinding {
    @NonNull
    public final FrameLayout cMA;
    @NonNull
    public final CoordinatorLayout cMB;
    @NonNull
    public final View cMC;
    @NonNull
    public final FrameLayout cMz;

    protected w(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout, View view2) {
        super(obj, view, i);
        this.cMz = frameLayout;
        this.cMA = frameLayout2;
        this.cMB = coordinatorLayout;
        this.cMC = view2;
    }
}
