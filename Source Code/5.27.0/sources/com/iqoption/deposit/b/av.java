package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutCurrencySelectorLightBinding */
public abstract class av extends ViewDataBinding {
    @NonNull
    public final ImageView cDm;
    @NonNull
    public final TextView cDn;

    protected av(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.cDm = imageView;
        this.cDn = textView;
    }
}
