package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentOtnLeadingBoardUserBoardTradingBinding */
public abstract class mj extends ViewDataBinding {
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final ConstraintLayout chI;
    @NonNull
    public final TextView chJ;

    protected mj(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.chI = constraintLayout;
        this.chJ = textView2;
    }
}
