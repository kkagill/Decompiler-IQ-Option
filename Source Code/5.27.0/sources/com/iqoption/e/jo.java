package com.iqoption.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: FragmentKycDocumentAddressBinding */
public abstract class jo extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final TextView cfU;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final LinearLayout cgk;
    @NonNull
    public final ContentLoadingProgressBar cgl;
    @NonNull
    public final TextView cgm;

    protected jo(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, ContentLoadingProgressBar contentLoadingProgressBar, pj pjVar, ConfirmButtonView confirmButtonView, TextView textView2) {
        super(obj, view, i);
        this.cfU = textView;
        this.cgk = linearLayout;
        this.cgl = contentLoadingProgressBar;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
        this.cgm = textView2;
    }
}
