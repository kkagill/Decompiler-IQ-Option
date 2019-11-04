package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LeftMenuItemCounterBinding */
public abstract class pt extends ViewDataBinding {
    @NonNull
    public final TextView cmC;
    @NonNull
    public final TextView cmD;

    protected pt(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cmD = textView;
        this.cmC = textView2;
    }
}
