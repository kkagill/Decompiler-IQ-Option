package com.iqoption.deposit.b;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentRedirectWebPaymentLightBinding */
public abstract class ab extends ViewDataBinding {
    @NonNull
    public final WebView cCN;
    @NonNull
    public final ImageView cCu;

    protected ab(Object obj, View view, int i, WebView webView, ImageView imageView) {
        super(obj, view, i);
        this.cCN = webView;
        this.cCu = imageView;
    }
}
