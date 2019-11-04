package com.iqoption.welcome.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: FragmentWelcomeRegistrationBinding */
public abstract class p extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bfR;
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
    public final aa elb;
    @NonNull
    public final TextView elc;
    @NonNull
    public final ac eld;

    protected p(Object obj, View view, int i, ImageView imageView, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, aa aaVar, IQTextInputEditText iQTextInputEditText2, TextInputLayout textInputLayout2, TextView textView, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView2, ac acVar) {
        super(obj, view, i);
        this.bfR = imageView;
        this.ekI = iQTextInputEditText;
        this.ekK = textInputLayout;
        this.elb = aaVar;
        setContainedBinding(this.elb);
        this.ekL = iQTextInputEditText2;
        this.ekM = textInputLayout2;
        this.elc = textView;
        this.ekN = frameLayout;
        this.ekO = frameLayout2;
        this.alH = textView2;
        this.eld = acVar;
        setContainedBinding(this.eld);
    }
}
