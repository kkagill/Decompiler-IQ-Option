package com.iqoption.feed.a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: SmartFeedFragmentBinding */
public abstract class ae extends ViewDataBinding {
    @NonNull
    public final FrameLayout cQA;
    @NonNull
    public final ContentLoadingProgressBar cQB;
    @NonNull
    public final FrameLayout cQC;

    protected ae(Object obj, View view, int i, FrameLayout frameLayout, ContentLoadingProgressBar contentLoadingProgressBar, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.cQA = frameLayout;
        this.cQB = contentLoadingProgressBar;
        this.cQC = frameLayout2;
    }
}
