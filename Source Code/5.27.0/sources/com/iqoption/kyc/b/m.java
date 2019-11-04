package com.iqoption.kyc.b;

import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycGdprBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final CheckBox cgH;
    @NonNull
    public final TextView cgI;
    @NonNull
    public final TextView cgJ;
    @NonNull
    public final WebView cgK;
    @NonNull
    public final bs duX;

    protected m(Object obj, View view, int i, CheckBox checkBox, TextView textView, TextView textView2, WebView webView, bs bsVar) {
        super(obj, view, i);
        this.cgH = checkBox;
        this.cgI = textView;
        this.cgJ = textView2;
        this.cgK = webView;
        this.duX = bsVar;
        setContainedBinding(this.duX);
    }
}
