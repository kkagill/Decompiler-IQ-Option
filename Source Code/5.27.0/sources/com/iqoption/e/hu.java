package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialpadKeyBinding */
public abstract class hu extends ViewDataBinding {
    @NonNull
    public final TextView cee;
    @NonNull
    public final TextView cef;

    protected hu(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cee = textView;
        this.cef = textView2;
    }
}
