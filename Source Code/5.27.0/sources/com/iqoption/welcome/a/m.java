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

/* compiled from: FragmentWelcomeLoginBinding */
public abstract class m extends ViewDataBinding {
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
    @NonNull
    public final IQTextInputEditText ekL;
    @NonNull
    public final TextView ekY;
    @NonNull
    public final TextInputLayout ekZ;
    @NonNull
    public final ae ela;

    protected m(Object obj, View view, int i, ImageView imageView, TextView textView, FrameLayout frameLayout, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, TextView textView2, IQTextInputEditText iQTextInputEditText2, TextInputLayout textInputLayout2, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView3, ae aeVar) {
        super(obj, view, i);
        this.bfR = imageView;
        this.aRV = textView;
        this.bYN = frameLayout;
        this.ekI = iQTextInputEditText;
        this.ekJ = textInputLayout;
        this.ekY = textView2;
        this.ekL = iQTextInputEditText2;
        this.ekZ = textInputLayout2;
        this.bYW = contentLoadingProgressBar;
        this.alH = textView3;
        this.ela = aeVar;
        setContainedBinding(this.ela);
    }
}
