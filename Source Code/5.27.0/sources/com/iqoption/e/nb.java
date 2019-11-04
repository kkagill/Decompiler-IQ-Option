package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentRightPanelBinding */
public abstract class nb extends ViewDataBinding {
    @NonNull
    public final FrameLayout ciA;
    @NonNull
    public final TextView ciz;

    protected nb(Object obj, View view, int i, TextView textView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.ciz = textView;
        this.ciA = frameLayout;
    }
}
