package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: LegalUpdateBinding */
public abstract class qn extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView ani;
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final TextView cmS;
    @NonNull
    public final ConstraintLayout cmT;

    protected qn(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cmS = textView;
        this.bYN = frameLayout;
        this.cmT = constraintLayout;
        this.ani = textView2;
        this.alH = textView3;
    }
}
