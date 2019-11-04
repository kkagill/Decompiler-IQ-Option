package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentWithdrawNavigatorBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final TextView eqc;
    @NonNull
    public final NestedScrollView eqd;
    @NonNull
    public final FrameLayout eqe;
    @NonNull
    public final FrameLayout eqf;
    @NonNull
    public final FrameLayout eqg;
    @NonNull
    public final FrameLayout eqh;
    @NonNull
    public final FrameLayout eqi;
    @NonNull
    public final w eqj;

    protected i(Object obj, View view, int i, TextView textView, NestedScrollView nestedScrollView, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, w wVar) {
        super(obj, view, i);
        this.eqc = textView;
        this.eqd = nestedScrollView;
        this.eqe = frameLayout;
        this.eqf = frameLayout2;
        this.eqg = frameLayout3;
        this.eqh = frameLayout4;
        this.eqi = frameLayout5;
        this.eqj = wVar;
        setContainedBinding(this.eqj);
    }
}
