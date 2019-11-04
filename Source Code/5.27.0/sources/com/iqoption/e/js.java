package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: FragmentKycDocumentsUploadBinding */
public abstract class js extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final TextView cfU;
    @NonNull
    public final ImageView cgp;
    @NonNull
    public final LinearLayout cgq;
    @NonNull
    public final ContentLoadingProgressBar cgr;
    @NonNull
    public final TextView cgs;
    @NonNull
    public final ConfirmButtonView cgt;
    @NonNull
    public final TextView cgu;
    @NonNull
    public final LinearLayout cgv;
    @NonNull
    public final ContentLoadingProgressBar cgw;
    @NonNull
    public final TextView cgx;
    @NonNull
    public final TextView cgy;
    @NonNull
    public final TextView cgz;

    protected js(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView, TextView textView2, ConfirmButtonView confirmButtonView, TextView textView3, pj pjVar, LinearLayout linearLayout2, ContentLoadingProgressBar contentLoadingProgressBar2, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.cgp = imageView;
        this.cgq = linearLayout;
        this.cgr = contentLoadingProgressBar;
        this.cgs = textView;
        this.cfU = textView2;
        this.cgt = confirmButtonView;
        this.cgu = textView3;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cgv = linearLayout2;
        this.cgw = contentLoadingProgressBar2;
        this.cgx = textView4;
        this.cgy = textView5;
        this.cgz = textView6;
    }
}
