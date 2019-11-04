package com.iqoption.feed.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.PreventScrollingTextView;
import com.iqoption.feed.feedlist.TagLayout;

/* compiled from: MicroOtherVideoFeedBinding */
public abstract class y extends ViewDataBinding {
    @NonNull
    public final TextView cQf;
    @NonNull
    public final TagLayout cQg;
    @NonNull
    public final ImageView cQn;
    @NonNull
    public final ConstraintLayout cQp;
    @NonNull
    public final ImageView cQq;
    @NonNull
    public final u cQs;
    @NonNull
    public final w cQt;
    @NonNull
    public final FrameLayout cQy;
    @NonNull
    public final PreventScrollingTextView cQz;

    protected y(Object obj, View view, int i, u uVar, w wVar, ImageView imageView, TextView textView, TagLayout tagLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView2, PreventScrollingTextView preventScrollingTextView) {
        super(obj, view, i);
        this.cQs = uVar;
        setContainedBinding(this.cQs);
        this.cQt = wVar;
        setContainedBinding(this.cQt);
        this.cQn = imageView;
        this.cQf = textView;
        this.cQg = tagLayout;
        this.cQy = frameLayout;
        this.cQp = constraintLayout;
        this.cQq = imageView2;
        this.cQz = preventScrollingTextView;
    }
}
