package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;

/* compiled from: ClosedPortfolioItemBinding */
public abstract class ei extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aRA;
    @NonNull
    public final ImageView akZ;
    @NonNull
    public final TextView anJ;
    @NonNull
    public final TextView bZj;
    @NonNull
    public final TextView bZk;
    @NonNull
    public final ContentLoadingProgressBar bZl;
    @NonNull
    public final RobotoTextView bZm;
    @NonNull
    public final RobotoTextView bZn;

    protected ei(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, ContentLoadingProgressBar contentLoadingProgressBar, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        super(obj, view, i);
        this.akZ = imageView;
        this.anJ = textView;
        this.aRA = constraintLayout;
        this.bZj = textView2;
        this.bZk = textView3;
        this.bZl = contentLoadingProgressBar;
        this.bZm = robotoTextView;
        this.bZn = robotoTextView2;
    }
}
