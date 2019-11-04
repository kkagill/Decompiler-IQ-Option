package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: FragmentMarketIsOpenBinding */
public abstract class lr extends ViewDataBinding {
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final FrameLayout cfH;
    @NonNull
    public final LinearLayout cfL;
    @NonNull
    public final RobotoTextView chk;

    protected lr(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, RobotoTextView robotoTextView) {
        super(obj, view, i);
        this.cfH = frameLayout;
        this.bYN = frameLayout2;
        this.cfL = linearLayout;
        this.chk = robotoTextView;
    }
}
