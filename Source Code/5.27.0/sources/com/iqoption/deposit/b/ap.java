package com.iqoption.deposit.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemPresetLightBinding */
public abstract class ap extends ViewDataBinding {
    @NonNull
    public final TextView cDe;
    @NonNull
    public final FrameLayout cDf;
    @NonNull
    public final ImageView cDg;

    protected ap(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, ImageView imageView) {
        super(obj, view, i);
        this.cDe = textView;
        this.cDf = frameLayout;
        this.cDg = imageView;
    }
}
