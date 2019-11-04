package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.SoftKeyboardEditText;

/* compiled from: FragmentKycAddressOldBinding */
public abstract class je extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final SoftKeyboardEditText cfX;
    @NonNull
    public final SoftKeyboardEditText cfY;
    @NonNull
    public final TextView cfZ;
    @NonNull
    public final pf cga;

    protected je(Object obj, View view, int i, SoftKeyboardEditText softKeyboardEditText, SoftKeyboardEditText softKeyboardEditText2, TextView textView, pj pjVar, pf pfVar) {
        super(obj, view, i);
        this.cfX = softKeyboardEditText;
        this.cfY = softKeyboardEditText2;
        this.cfZ = textView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cga = pfVar;
        setContainedBinding(this.cga);
    }
}
