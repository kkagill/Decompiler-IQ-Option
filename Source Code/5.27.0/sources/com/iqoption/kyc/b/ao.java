package com.iqoption.kyc.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;

/* compiled from: FragmentKycReportableBinding */
public abstract class ao extends ViewDataBinding {
    @NonNull
    public final TextView aIr;
    @NonNull
    public final ConfirmButtonView cgZ;
    @NonNull
    public final TextView cha;
    @NonNull
    public final ConfirmButtonView chb;
    @NonNull
    public final LinearLayout dvJ;

    protected ao(Object obj, View view, int i, TextView textView, ConfirmButtonView confirmButtonView, LinearLayout linearLayout, TextView textView2, ConfirmButtonView confirmButtonView2) {
        super(obj, view, i);
        this.aIr = textView;
        this.cgZ = confirmButtonView;
        this.dvJ = linearLayout;
        this.cha = textView2;
        this.chb = confirmButtonView2;
    }
}
