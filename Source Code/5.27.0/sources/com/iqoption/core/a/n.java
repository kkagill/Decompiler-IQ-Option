package com.iqoption.core.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: LayoutCountryFieldBinding */
public abstract class n extends ViewDataBinding {
    @NonNull
    public final FrameLayout bfL;
    @NonNull
    public final ImageView bfM;
    @NonNull
    public final ContentLoadingProgressBar bfN;
    @NonNull
    public final IQTextInputEditText bfm;
    @NonNull
    public final TextInputLayout bfn;
    @NonNull
    public final ImageView bfp;

    protected n(Object obj, View view, int i, FrameLayout frameLayout, IQTextInputEditText iQTextInputEditText, TextInputLayout textInputLayout, ImageView imageView, ImageView imageView2, ContentLoadingProgressBar contentLoadingProgressBar) {
        super(obj, view, i);
        this.bfL = frameLayout;
        this.bfm = iQTextInputEditText;
        this.bfn = textInputLayout;
        this.bfp = imageView;
        this.bfM = imageView2;
        this.bfN = contentLoadingProgressBar;
    }
}
