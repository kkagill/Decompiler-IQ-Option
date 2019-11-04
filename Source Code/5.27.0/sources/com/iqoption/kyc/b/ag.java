package com.iqoption.kyc.b;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;

/* compiled from: FragmentKycQuestionSingleChoiceBinding */
public abstract class ag extends ViewDataBinding {
    @NonNull
    public final RadioGroup dvu;
    @NonNull
    public final ViewStubProxy dvv;
    @NonNull
    public final TextView dvw;

    protected ag(Object obj, View view, int i, RadioGroup radioGroup, ViewStubProxy viewStubProxy, TextView textView) {
        super(obj, view, i);
        this.dvu = radioGroup;
        this.dvv = viewStubProxy;
        this.dvw = textView;
    }
}
