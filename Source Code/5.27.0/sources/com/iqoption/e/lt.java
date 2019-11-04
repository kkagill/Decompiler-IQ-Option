package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: FragmentMktOnOpenCreatedBinding */
public abstract class lt extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final TextView cbI;
    @NonNull
    public final FrameLayout cfH;
    @NonNull
    public final LinearLayout cfL;
    @NonNull
    public final View chg;
    @NonNull
    public final RobotoTextView chk;
    @NonNull
    public final RobotoTextView chl;
    @NonNull
    public final TextView chm;

    protected lt(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, View view2, FrameLayout frameLayout2, LinearLayout linearLayout, RobotoTextView robotoTextView, TextView textView2, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.cfH = frameLayout;
        this.cbI = textView;
        this.chg = view2;
        this.bYN = frameLayout2;
        this.cfL = linearLayout;
        this.chl = robotoTextView;
        this.chm = textView2;
        this.chk = robotoTextView2;
    }
}
