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

/* compiled from: FragmentChangePasswordBinding */
public abstract class a extends ViewDataBinding {
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
    public final IQTextInputEditText ekE;
    @NonNull
    public final IQTextInputEditText ekF;
    @NonNull
    public final TextInputLayout ekG;
    @NonNull
    public final TextInputLayout ekH;

    protected a(Object obj, View view, int i, ImageView imageView, TextView textView, FrameLayout frameLayout, IQTextInputEditText iQTextInputEditText, IQTextInputEditText iQTextInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView2) {
        super(obj, view, i);
        this.bfR = imageView;
        this.aRV = textView;
        this.bYN = frameLayout;
        this.ekE = iQTextInputEditText;
        this.ekF = iQTextInputEditText2;
        this.ekG = textInputLayout;
        this.ekH = textInputLayout2;
        this.bYW = contentLoadingProgressBar;
        this.alH = textView2;
    }
}
