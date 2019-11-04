package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycSexOldBinding */
public abstract class le extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final TextView cgi;
    @NonNull
    public final TextView chc;
    @NonNull
    public final TextView chd;

    protected le(Object obj, View view, int i, TextView textView, TextView textView2, pj pjVar, TextView textView3) {
        super(obj, view, i);
        this.cgi = textView;
        this.chc = textView2;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.chd = textView3;
    }
}
