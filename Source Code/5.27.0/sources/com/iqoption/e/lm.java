package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: FragmentMarginNotAddedBinding */
public abstract class lm extends ViewDataBinding {
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
    public final RobotoTextView chh;

    protected lm(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, View view2, FrameLayout frameLayout2, LinearLayout linearLayout, RobotoTextView robotoTextView) {
        super(obj, view, i);
        this.cfH = frameLayout;
        this.cbI = textView;
        this.chg = view2;
        this.bYN = frameLayout2;
        this.cfL = linearLayout;
        this.chh = robotoTextView;
    }
}
