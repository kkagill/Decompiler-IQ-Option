package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialogGdprWarningBinding */
public abstract class fy extends ViewDataBinding {
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final TextView cbm;
    @NonNull
    public final ContentLoadingProgressBar cbn;
    @NonNull
    public final LinearLayout cbo;
    @NonNull
    public final Space cbp;
    @NonNull
    public final Space cbq;
    @NonNull
    public final Space cbr;
    @NonNull
    public final ImageView cbs;
    @NonNull
    public final TextView cbt;
    @NonNull
    public final TextView cbu;

    protected fy(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar, LinearLayout linearLayout, Space space, Space space2, Space space3, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.aoG = frameLayout;
        this.cbm = textView;
        this.cbn = contentLoadingProgressBar;
        this.cbo = linearLayout;
        this.cbp = space;
        this.cbq = space2;
        this.cbr = space3;
        this.cbs = imageView;
        this.cbt = textView2;
        this.cbu = textView3;
    }
}
