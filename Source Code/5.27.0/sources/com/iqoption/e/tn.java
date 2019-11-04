package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: OtnLeaderBoardCurrentUserItemBinding */
public abstract class tn extends ViewDataBinding {
    @NonNull
    public final TextView chG;
    @NonNull
    public final ImageView chL;
    @NonNull
    public final TextView chN;
    @NonNull
    public final TextView coW;
    @NonNull
    public final TextView coX;

    protected tn(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.chL = imageView;
        this.chG = textView;
        this.chN = textView2;
        this.coW = textView3;
        this.coX = textView4;
    }
}
