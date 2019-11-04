package com.iqoption.kyc.b;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycRisksBinding */
public abstract class as extends ViewDataBinding {
    @NonNull
    public final ContentLoadingProgressBar dvM;
    @NonNull
    public final WebView dvN;

    protected as(Object obj, View view, int i, ContentLoadingProgressBar contentLoadingProgressBar, WebView webView) {
        super(obj, view, i);
        this.dvM = contentLoadingProgressBar;
        this.dvN = webView;
    }
}
