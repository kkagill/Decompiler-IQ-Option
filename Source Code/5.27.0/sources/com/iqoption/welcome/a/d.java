package com.iqoption.welcome.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentForgotPasswordBinding */
public abstract class d extends ViewDataBinding {
    @NonNull
    public final TextView aRV;
    @NonNull
    public final TextView alH;
    @NonNull
    public final FrameLayout bYN;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final ImageView bfR;
    @NonNull
    public final IQTextInputEditText ekI;
    @NonNull
    public final TextInputLayout ekJ;

    protected d(Object obj, View view, int i, ImageView imageView, TextView textView, FrameLayout frameLayout, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView2) {
        super(obj, view, i);
        this.bfR = imageView;
        this.aRV = textView;
        this.bYN = frameLayout;
        this.ekI = iQTextInputEditText;
        this.ekJ = textInputLayout;
        this.bYW = contentLoadingProgressBar;
        this.alH = textView2;
    }
}
