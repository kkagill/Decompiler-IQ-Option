package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentActivePhaseNotificationBinding */
public abstract class io extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aRA;
    @NonNull
    public final TextView bfF;
    @NonNull
    public final TextView cfw;
    @NonNull
    public final ToggleButton cfx;

    protected io(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ToggleButton toggleButton) {
        super(obj, view, i);
        this.aRA = constraintLayout;
        this.bfF = textView;
        this.cfw = textView2;
        this.cfx = toggleButton;
    }
}
