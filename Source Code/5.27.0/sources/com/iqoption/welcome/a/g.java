package com.iqoption.welcome.a;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentTrialRegistrationBinding */
public abstract class g extends ViewDataBinding {
    @NonNull
    public final TextView aRV;
    @NonNull
    public final TextView alH;
    @NonNull
    public final FrameLayout aoG;
    @NonNull
    public final ContentLoadingProgressBar bYW;
    @NonNull
    public final ToggleButton cAR;
    @NonNull
    public final IQTextInputEditText ekI;
    @NonNull
    public final TextInputLayout ekK;
    @NonNull
    public final IQTextInputEditText ekL;
    @NonNull
    public final TextInputLayout ekM;
    @NonNull
    public final FrameLayout ekN;
    @NonNull
    public final FrameLayout ekO;
    @NonNull
    public final ImageView ekP;
    @NonNull
    public final CheckBox ekQ;
    @NonNull
    public final TextView ekR;

    protected g(Object obj, View view, int i, TextView textView, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, FrameLayout frameLayout, IQTextInputEditText iQTextInputEditText2, TextInputLayout textInputLayout2, ToggleButton toggleButton, ContentLoadingProgressBar contentLoadingProgressBar, FrameLayout frameLayout2, FrameLayout frameLayout3, ImageView imageView, TextView textView2, CheckBox checkBox, TextView textView3) {
        super(obj, view, i);
        this.aRV = textView;
        this.ekI = iQTextInputEditText;
        this.ekK = textInputLayout;
        this.aoG = frameLayout;
        this.ekL = iQTextInputEditText2;
        this.ekM = textInputLayout2;
        this.cAR = toggleButton;
        this.bYW = contentLoadingProgressBar;
        this.ekN = frameLayout2;
        this.ekO = frameLayout3;
        this.ekP = imageView;
        this.alH = textView2;
        this.ekQ = checkBox;
        this.ekR = textView3;
    }
}
