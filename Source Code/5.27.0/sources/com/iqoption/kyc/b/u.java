package com.iqoption.kyc.b;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycNavigatorBinding */
public abstract class u extends ViewDataBinding {
    @NonNull
    public final bq dvg;
    @NonNull
    public final FrameLayout dvh;
    @NonNull
    public final FrameLayout dvi;
    @NonNull
    public final by dvj;

    protected u(Object obj, View view, int i, bq bqVar, FrameLayout frameLayout, FrameLayout frameLayout2, by byVar) {
        super(obj, view, i);
        this.dvg = bqVar;
        setContainedBinding(this.dvg);
        this.dvh = frameLayout;
        this.dvi = frameLayout2;
        this.dvj = byVar;
        setContainedBinding(this.dvj);
    }
}
