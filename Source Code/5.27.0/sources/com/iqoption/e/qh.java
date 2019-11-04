package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LeftMenuItemWithProgressBinding */
public abstract class qh extends ViewDataBinding {
    @NonNull
    public final TextView cmC;
    @NonNull
    public final ContentLoadingProgressBar cmP;

    protected qh(Object obj, View view, int i, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.cmC = textView;
        this.cmP = contentLoadingProgressBar;
    }
}
