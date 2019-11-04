package com.iqoption.feed.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.iqoption.feed.feedlist.TagLayout;

/* compiled from: MacroVideoFeedBinding */
public abstract class q extends ViewDataBinding {
    @NonNull
    public final a cQc;
    @NonNull
    public final e cQd;
    @NonNull
    public final TextView cQf;
    @NonNull
    public final TagLayout cQg;
    @NonNull
    public final TextView cQm;
    @NonNull
    public final ImageView cQn;
    @NonNull
    public final FrameLayout cQo;
    @NonNull
    public final ConstraintLayout cQp;
    @NonNull
    public final ImageView cQq;
    @NonNull
    public final TextView cQr;

    protected q(Object obj, View view, int i, a aVar, e eVar, TextView textView, ImageView imageView, TextView textView2, TagLayout tagLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView3) {
        super(obj, view, i);
        this.cQc = aVar;
        setContainedBinding(this.cQc);
        this.cQd = eVar;
        setContainedBinding(this.cQd);
        this.cQm = textView;
        this.cQn = imageView;
        this.cQf = textView2;
        this.cQg = tagLayout;
        this.cQo = frameLayout;
        this.cQp = constraintLayout;
        this.cQq = imageView2;
        this.cQr = textView3;
    }
}
