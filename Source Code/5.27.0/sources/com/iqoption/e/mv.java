package com.iqoption.e;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentProTraderWebBinding */
public abstract class mv extends ViewDataBinding {
    @NonNull
    public final zp cil;
    @NonNull
    public final FrameLayout cim;
    @NonNull
    public final WebView cin;

    protected mv(Object obj, View view, int i, zp zpVar, FrameLayout frameLayout, WebView webView) {
        super(obj, view, i);
        this.cil = zpVar;
        setContainedBinding(this.cil);
        this.cim = frameLayout;
        this.cin = webView;
    }
}
