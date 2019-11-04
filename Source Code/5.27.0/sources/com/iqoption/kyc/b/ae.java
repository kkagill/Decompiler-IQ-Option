package com.iqoption.kyc.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;

/* compiled from: FragmentKycQuestionMultiChoiceBinding */
public abstract class ae extends ViewDataBinding {
    @NonNull
    public final LinearLayout dvr;
    @NonNull
    public final ViewStubProxy dvs;
    @NonNull
    public final TextView dvt;

    protected ae(Object obj, View view, int i, LinearLayout linearLayout, ViewStubProxy viewStubProxy, TextView textView) {
        super(obj, view, i);
        this.dvr = linearLayout;
        this.dvs = viewStubProxy;
        this.dvt = textView;
    }
}
