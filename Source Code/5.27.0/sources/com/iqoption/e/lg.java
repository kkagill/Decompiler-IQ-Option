package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: FragmentKycStartNonRegulatedBinding */
public abstract class lg extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final ConfirmButtonView cfW;
    @NonNull
    public final ImageView cgF;

    protected lg(Object obj, View view, int i, ImageView imageView, pj pjVar, ConfirmButtonView confirmButtonView) {
        super(obj, view, i);
        this.cgF = imageView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cfW = confirmButtonView;
    }
}
