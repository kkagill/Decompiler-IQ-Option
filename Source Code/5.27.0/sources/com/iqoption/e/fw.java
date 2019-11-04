package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialogFragmentEtfsBinding */
public abstract class fw extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView cbk;
    @NonNull
    public final TextView cbl;

    protected fw(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cbk = imageView;
        this.alH = textView;
        this.cbl = textView2;
    }
}
