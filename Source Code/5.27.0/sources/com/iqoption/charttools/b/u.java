package com.iqoption.charttools.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: IndicatorConstructorInputSelectBinding */
public abstract class u extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final TextView aIy;
    @NonNull
    public final TextView aoo;

    protected u(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.aGo = linearLayout;
        this.aIy = textView;
        this.aoo = textView2;
    }
}
