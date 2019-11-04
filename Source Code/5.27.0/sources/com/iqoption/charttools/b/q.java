package com.iqoption.charttools.b;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: IndicatorConstructorInputFieldBinding */
public abstract class q extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final EditText aGq;
    @NonNull
    public final TextView aoo;

    protected q(Object obj, View view, int i, LinearLayout linearLayout, EditText editText, TextView textView) {
        super(obj, view, i);
        this.aGo = linearLayout;
        this.aGq = editText;
        this.aoo = textView;
    }
}
