package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.SoftKeyboardEditText;

/* compiled from: FragmentOldKycLegalNameBinding */
public abstract class lz extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final pf cga;
    @NonNull
    public final TextView cgi;
    @NonNull
    public final SoftKeyboardEditText chr;
    @NonNull
    public final SoftKeyboardEditText chs;

    protected lz(Object obj, View view, int i, TextView textView, SoftKeyboardEditText softKeyboardEditText, pj pjVar, SoftKeyboardEditText softKeyboardEditText2, pf pfVar) {
        super(obj, view, i);
        this.cgi = textView;
        this.chr = softKeyboardEditText;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.chs = softKeyboardEditText2;
        this.cga = pfVar;
        setContainedBinding(this.cga);
    }
}
