package com.iqoption.e;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycRisksOldBinding */
public abstract class lc extends ViewDataBinding {
    @NonNull
    public final WebView Aa;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final pj cfS;

    protected lc(Object obj, View view, int i, pj pjVar, ContentLoadingProgressBar contentLoadingProgressBar, WebView webView) {
        super(obj, view, i);
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.bYW = contentLoadingProgressBar;
        this.Aa = webView;
    }
}
