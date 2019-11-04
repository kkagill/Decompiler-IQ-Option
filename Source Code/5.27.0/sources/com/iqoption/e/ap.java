package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetBaseCfdItemBinding */
public abstract class ap extends ViewDataBinding {
    @NonNull
    public final TextView bTC;
    @NonNull
    public final TextView bTD;
    @NonNull
    public final TextView bTE;
    @NonNull
    public final TextView bTF;
    @NonNull
    public final TextView bTG;

    protected ap(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.bTC = textView;
        this.bTD = textView2;
        this.bTE = textView3;
        this.bTF = textView4;
        this.bTG = textView5;
    }
}
