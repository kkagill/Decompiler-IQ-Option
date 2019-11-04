package com.iqoption.kyc.b;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutKycToolbarBinding */
public abstract class by extends ViewDataBinding {
    @NonNull
    public final ImageView cCu;
    @NonNull
    public final ImageView dwH;
    @NonNull
    public final ProgressBar dwI;
    @NonNull
    public final ImageView dwJ;
    @NonNull
    public final EditText dwK;
    @NonNull
    public final ImageView dwL;
    @NonNull
    public final TextView dwM;
    @NonNull
    public final ContentLoadingProgressBar dwN;
    @NonNull
    public final TextView dwO;

    protected by(Object obj, View view, int i, ImageView imageView, ProgressBar progressBar, ImageView imageView2, EditText editText, ImageView imageView3, TextView textView, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView2, ImageView imageView4) {
        super(obj, view, i);
        this.dwH = imageView;
        this.dwI = progressBar;
        this.dwJ = imageView2;
        this.dwK = editText;
        this.dwL = imageView3;
        this.dwM = textView;
        this.dwN = contentLoadingProgressBar;
        this.dwO = textView2;
        this.cCu = imageView4;
    }
}
