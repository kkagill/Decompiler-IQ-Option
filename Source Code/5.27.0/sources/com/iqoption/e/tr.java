package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: OtnLeaderBoardItemBinding */
public abstract class tr extends ViewDataBinding {
    @NonNull
    public final TextView chG;
    @NonNull
    public final ImageView chL;
    @NonNull
    public final TextView chN;
    @NonNull
    public final TextView coW;
    @NonNull
    public final LinearLayout coZ;

    protected tr(Object obj, View view, int i, ImageView imageView, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.chL = imageView;
        this.chG = textView;
        this.coZ = linearLayout;
        this.chN = textView2;
        this.coW = textView3;
    }
}
