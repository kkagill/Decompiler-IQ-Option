package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: OtnLeaderBoardFirstItemBinding */
public abstract class tp extends ViewDataBinding {
    @NonNull
    public final ImageView chL;
    @NonNull
    public final TextView chN;
    @NonNull
    public final TextView coW;
    @NonNull
    public final ImageView coY;
    @NonNull
    public final LinearLayout coZ;

    protected tp(Object obj, View view, int i, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.chL = imageView;
        this.coY = imageView2;
        this.coZ = linearLayout;
        this.chN = textView;
        this.coW = textView2;
    }
}
