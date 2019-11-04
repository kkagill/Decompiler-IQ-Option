package com.iqoption.kyc.b;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycGovernanceBinding */
public abstract class o extends ViewDataBinding {
    @NonNull
    public final AppCompatRadioButton duY;
    @NonNull
    public final AppCompatRadioButton duZ;

    protected o(Object obj, View view, int i, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2) {
        super(obj, view, i);
        this.duY = appCompatRadioButton;
        this.duZ = appCompatRadioButton2;
    }
}
