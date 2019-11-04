package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: DialogWhatsNewWithoutBtnBinding */
public abstract class hm extends ViewDataBinding {
    @NonNull
    public final ConstraintLayout aIv;
    @NonNull
    public final LinearLayout aRs;
    @NonNull
    public final ImageView bYA;
    @NonNull
    public final TextView bfF;
    @NonNull
    public final TextView cdH;
    @NonNull
    public final FrameLayout cdI;
    @NonNull
    public final FrameLayout cdJ;

    protected hm(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, TextView textView2, LinearLayout linearLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.bYA = imageView;
        this.aIv = constraintLayout;
        this.cdH = textView;
        this.cdI = frameLayout;
        this.bfF = textView2;
        this.aRs = linearLayout;
        this.cdJ = frameLayout2;
    }
}
