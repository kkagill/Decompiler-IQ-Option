package com.iqoption.feed.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.iqoption.feed.feedlist.TagLayout;

/* compiled from: MacroTweetFeedBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final TextView aRe;
    @NonNull
    public final a cQc;
    @NonNull
    public final e cQd;
    @NonNull
    public final TextView cQf;
    @NonNull
    public final TagLayout cQg;
    @NonNull
    public final ConstraintLayout cQj;
    @NonNull
    public final TextView cQk;
    @NonNull
    public final ImageView cQl;

    protected o(Object obj, View view, int i, TextView textView, a aVar, e eVar, ConstraintLayout constraintLayout, TextView textView2, TagLayout tagLayout, TextView textView3, ImageView imageView) {
        super(obj, view, i);
        this.aRe = textView;
        this.cQc = aVar;
        setContainedBinding(this.cQc);
        this.cQd = eVar;
        setContainedBinding(this.cQd);
        this.cQj = constraintLayout;
        this.cQf = textView2;
        this.cQg = tagLayout;
        this.cQk = textView3;
        this.cQl = imageView;
    }
}
