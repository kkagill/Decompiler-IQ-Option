package com.iqoption.core.a;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: TermsFragmentBinding */
public abstract class v extends ViewDataBinding {
    @NonNull
    public final LinearLayout bgn;
    @NonNull
    public final WebView bgo;
    @NonNull
    public final r bgp;

    protected v(Object obj, View view, int i, LinearLayout linearLayout, WebView webView, r rVar) {
        super(obj, view, i);
        this.bgn = linearLayout;
        this.bgo = webView;
        this.bgp = rVar;
        setContainedBinding(this.bgp);
    }
}
