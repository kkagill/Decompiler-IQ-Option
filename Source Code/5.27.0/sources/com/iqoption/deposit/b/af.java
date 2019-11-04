package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemConstructorSpinnerLightBinding */
public abstract class af extends ViewDataBinding {
    @NonNull
    public final ImageView cCV;
    @NonNull
    public final LinearLayout cCW;
    @NonNull
    public final TextView cCX;

    protected af(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.cCV = imageView;
        this.cCW = linearLayout;
        this.cCX = textView;
    }
}
