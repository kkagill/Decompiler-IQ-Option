package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetBaseOptionsItemBinding */
public abstract class ar extends ViewDataBinding {
    @NonNull
    public final TextView alW;
    @NonNull
    public final TextView bTD;
    @NonNull
    public final TextView bTF;
    @NonNull
    public final TextView bTG;
    @NonNull
    public final LinearLayout bTH;

    protected ar(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4) {
        super(obj, view, i);
        this.bTD = textView;
        this.bTF = textView2;
        this.alW = textView3;
        this.bTH = linearLayout;
        this.bTG = textView4;
    }
}
