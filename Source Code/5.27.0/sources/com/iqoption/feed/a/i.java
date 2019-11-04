package com.iqoption.feed.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.PreventScrollingTextView;
import com.iqoption.feed.feedlist.TagLayout;

/* compiled from: MacroArticleFeedBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final ImageView cQa;
    @NonNull
    public final TextView cQb;
    @NonNull
    public final a cQc;
    @NonNull
    public final e cQd;
    @NonNull
    public final PreventScrollingTextView cQe;
    @NonNull
    public final TextView cQf;
    @NonNull
    public final TagLayout cQg;

    protected i(Object obj, View view, int i, ImageView imageView, TextView textView, a aVar, e eVar, PreventScrollingTextView preventScrollingTextView, TextView textView2, TagLayout tagLayout) {
        super(obj, view, i);
        this.cQa = imageView;
        this.cQb = textView;
        this.cQc = aVar;
        setContainedBinding(this.cQc);
        this.cQd = eVar;
        setContainedBinding(this.cQd);
        this.cQe = preventScrollingTextView;
        this.cQf = textView2;
        this.cQg = tagLayout;
    }
}
