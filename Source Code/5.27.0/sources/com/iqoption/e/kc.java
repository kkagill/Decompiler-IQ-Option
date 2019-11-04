package com.iqoption.e;

import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycGdprOldBinding */
public abstract class kc extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final CheckBox cgH;
    @NonNull
    public final TextView cgI;
    @NonNull
    public final TextView cgJ;
    @NonNull
    public final WebView cgK;
    @NonNull
    public final pf cga;

    protected kc(Object obj, View view, int i, CheckBox checkBox, TextView textView, TextView textView2, WebView webView, pj pjVar, pf pfVar) {
        super(obj, view, i);
        this.cgH = checkBox;
        this.cgI = textView;
        this.cgJ = textView2;
        this.cgK = webView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cga = pfVar;
        setContainedBinding(this.cga);
    }
}
