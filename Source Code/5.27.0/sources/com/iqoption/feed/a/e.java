package com.iqoption.feed.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FeedTitleBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final ImageView cPR;
    @NonNull
    public final ImageView cPS;
    @NonNull
    public final TextView cPT;

    protected e(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.cPR = imageView;
        this.cPS = imageView2;
        this.cPT = textView;
    }
}
