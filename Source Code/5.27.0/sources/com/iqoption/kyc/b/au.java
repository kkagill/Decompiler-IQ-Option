package com.iqoption.kyc.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycSexBinding */
public abstract class au extends ViewDataBinding {
    @NonNull
    public final AppCompatRadioButton dvO;
    @NonNull
    public final AppCompatRadioButton dvP;
    @NonNull
    public final LinearLayout dvQ;
    @NonNull
    public final RadioGroup dvR;

    protected au(Object obj, View view, int i, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, LinearLayout linearLayout, RadioGroup radioGroup) {
        super(obj, view, i);
        this.dvO = appCompatRadioButton;
        this.dvP = appCompatRadioButton2;
        this.dvQ = linearLayout;
        this.dvR = radioGroup;
    }
}
