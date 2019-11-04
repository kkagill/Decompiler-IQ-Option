package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.ViewDataBinding;
import com.iqoption.kyc.PositionPicker;

/* compiled from: FragmentKycCountryOldBinding */
public abstract class ji extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final pf cga;
    @NonNull
    public final AppCompatCheckBox cge;
    @NonNull
    public final PositionPicker cgf;
    @NonNull
    public final TextView cgg;

    protected ji(Object obj, View view, int i, AppCompatCheckBox appCompatCheckBox, PositionPicker positionPicker, pj pjVar, pf pfVar, TextView textView) {
        super(obj, view, i);
        this.cge = appCompatCheckBox;
        this.cgf = positionPicker;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cga = pfVar;
        setContainedBinding(this.cga);
        this.cgg = textView;
    }
}
