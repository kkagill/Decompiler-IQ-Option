package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetsCfdItemBinding */
public abstract class cf extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final TextView bTE;
    @NonNull
    public final TextView bTG;
    @NonNull
    public final cv bXr;
    @NonNull
    public final LinearLayout bXs;
    @NonNull
    public final TextView bXt;
    @NonNull
    public final TextView bXv;

    protected cf(Object obj, View view, int i, cv cvVar, TextView textView, ImageView imageView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.bXr = cvVar;
        setContainedBinding(this.bXr);
        this.bXv = textView;
        this.aRh = imageView;
        this.bXs = linearLayout;
        this.bTE = textView2;
        this.amZ = textView3;
        this.bXt = textView4;
        this.bTG = textView5;
    }
}
