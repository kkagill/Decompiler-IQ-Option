package com.iqoption.cardsverification.a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentVerifyDetailsBinding */
public abstract class e extends ViewDataBinding {
    @NonNull
    public final Button aAB;
    @NonNull
    public final TextView aAC;
    @NonNull
    public final TextView aAD;
    @NonNull
    public final TextView aAE;
    @NonNull
    public final LinearLayout aAF;
    @NonNull
    public final ImageView aAG;
    @NonNull
    public final TextView aAH;
    @NonNull
    public final q aAI;
    @NonNull
    public final View aAJ;

    protected e(Object obj, View view, int i, Button button, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, ImageView imageView, TextView textView4, q qVar, View view2) {
        super(obj, view, i);
        this.aAB = button;
        this.aAC = textView;
        this.aAD = textView2;
        this.aAE = textView3;
        this.aAF = linearLayout;
        this.aAG = imageView;
        this.aAH = textView4;
        this.aAI = qVar;
        setContainedBinding(this.aAI);
        this.aAJ = view2;
    }
}
