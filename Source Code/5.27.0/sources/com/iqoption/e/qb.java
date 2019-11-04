package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LeftMenuItemProTraderBinding */
public abstract class qb extends ViewDataBinding {
    @NonNull
    public final ImageView cmI;
    @NonNull
    public final LinearLayout cmJ;
    @NonNull
    public final ImageView cmK;
    @NonNull
    public final TextView cmL;
    @NonNull
    public final TextView cmM;

    protected qb(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cmI = imageView;
        this.cmJ = linearLayout;
        this.cmK = imageView2;
        this.cmL = textView;
        this.cmM = textView2;
    }
}
