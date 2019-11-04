package com.iqoption.feed.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: MicroFeedTitleBinding */
public abstract class w extends ViewDataBinding {
    @NonNull
    public final ImageView cPR;
    @NonNull
    public final ImageView cPS;
    @NonNull
    public final TextView cQw;
    @NonNull
    public final ConstraintLayout cQx;

    protected w(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.cPR = imageView;
        this.cPS = imageView2;
        this.cQw = textView;
        this.cQx = constraintLayout;
    }
}
