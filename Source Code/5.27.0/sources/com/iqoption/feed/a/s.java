package com.iqoption.feed.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.PreventScrollingTextView;
import com.iqoption.feed.feedlist.TagLayout;

/* compiled from: MicroArticleFeedBinding */
public abstract class s extends ViewDataBinding {
    @NonNull
    public final TextView cQb;
    @NonNull
    public final PreventScrollingTextView cQe;
    @NonNull
    public final TextView cQf;
    @NonNull
    public final TagLayout cQg;
    @NonNull
    public final u cQs;
    @NonNull
    public final w cQt;

    protected s(Object obj, View view, int i, TextView textView, u uVar, w wVar, PreventScrollingTextView preventScrollingTextView, TextView textView2, TagLayout tagLayout) {
        super(obj, view, i);
        this.cQb = textView;
        this.cQs = uVar;
        setContainedBinding(this.cQs);
        this.cQt = wVar;
        setContainedBinding(this.cQt);
        this.cQe = preventScrollingTextView;
        this.cQf = textView2;
        this.cQg = tagLayout;
    }
}
