package com.iqoption.charttools.b;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: IndicatorConstructorInputStepFieldBinding */
public abstract class w extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final EditText aGq;
    @NonNull
    public final ImageView aoB;
    @NonNull
    public final ImageView aoC;
    @NonNull
    public final TextView aoo;

    protected w(Object obj, View view, int i, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, EditText editText, TextView textView) {
        super(obj, view, i);
        this.aoB = imageView;
        this.aoC = imageView2;
        this.aGo = linearLayout;
        this.aGq = editText;
        this.aoo = textView;
    }
}
