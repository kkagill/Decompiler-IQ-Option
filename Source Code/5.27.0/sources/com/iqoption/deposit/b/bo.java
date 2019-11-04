package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutPerformToolbarTitleLightBinding */
public abstract class bo extends ViewDataBinding {
    @NonNull
    public final TextView cDG;
    @NonNull
    public final LinearLayout cDH;
    @NonNull
    public final ImageView cDI;
    @NonNull
    public final LinearLayout cDJ;

    protected bo(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.cDG = textView;
        this.cDH = linearLayout;
        this.cDI = imageView;
        this.cDJ = linearLayout2;
    }
}
