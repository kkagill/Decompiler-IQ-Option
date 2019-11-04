package com.iqoption.welcome.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentTwoStepAuthBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final TextView aRV;
    @NonNull
    public final LinearLayout aRl;
    @NonNull
    public final TextView alH;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final ImageView bfR;
    @NonNull
    public final IQTextInputEditText ekS;
    @NonNull
    public final TextInputLayout ekT;
    @NonNull
    public final TextView ekU;
    @NonNull
    public final TextView ekV;
    @NonNull
    public final TextView ekW;
    @NonNull
    public final TextView ekX;

    protected i(Object obj, View view, int i, ImageView imageView, TextView textView, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, LinearLayout linearLayout, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.bfR = imageView;
        this.aRV = textView;
        this.ekS = iQTextInputEditText;
        this.ekT = textInputLayout;
        this.aRl = linearLayout;
        this.bYW = contentLoadingProgressBar;
        this.ekU = textView2;
        this.alH = textView3;
        this.ekV = textView4;
        this.ekW = textView5;
        this.ekX = textView6;
    }
}
