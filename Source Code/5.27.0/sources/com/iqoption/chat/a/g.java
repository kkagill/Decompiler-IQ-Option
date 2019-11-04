package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.core.ui.widget.MaxSizeFrameLayout;

/* compiled from: ChatDialogFeedbackBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final FrameLayout aHP;
    @NonNull
    public final TextView aQO;
    @NonNull
    public final TextView aQP;
    @NonNull
    public final IQTextInputEditText aQQ;
    @NonNull
    public final TextInputLayout aQR;
    @NonNull
    public final TextView aQS;
    @NonNull
    public final MaxSizeFrameLayout aQT;
    @NonNull
    public final TextView aQU;
    @NonNull
    public final TextView alH;

    protected g(Object obj, View view, int i, TextView textView, TextView textView2, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, TextView textView3, MaxSizeFrameLayout maxSizeFrameLayout, TextView textView4, FrameLayout frameLayout, TextView textView5) {
        super(obj, view, i);
        this.aQO = textView;
        this.aQP = textView2;
        this.aQQ = iQTextInputEditText;
        this.aQR = textInputLayout;
        this.aQS = textView3;
        this.aQT = maxSizeFrameLayout;
        this.aQU = textView4;
        this.aHP = frameLayout;
        this.alH = textView5;
    }
}
