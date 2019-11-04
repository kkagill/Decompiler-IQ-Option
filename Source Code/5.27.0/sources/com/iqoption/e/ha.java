package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: DialogTradeOnPracticeBinding */
public abstract class ha extends ViewDataBinding {
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final ImageView ccJ;
    @NonNull
    public final FrameLayout ccK;
    @NonNull
    public final RobotoTextView ccL;
    @NonNull
    public final TextView cdz;

    protected ha(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, FrameLayout frameLayout2, RobotoTextView robotoTextView, TextView textView) {
        super(obj, view, i);
        this.ccJ = imageView;
        this.aoG = frameLayout;
        this.ccK = frameLayout2;
        this.ccL = robotoTextView;
        this.cdz = textView;
    }
}
