package com.iqoption.e;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentKycQuestionTextOldBinding */
public abstract class kq extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final EditText cgO;
    @NonNull
    public final pf cga;
    @NonNull
    public final TextView cgm;

    protected kq(Object obj, View view, int i, EditText editText, pj pjVar, pf pfVar, TextView textView) {
        super(obj, view, i);
        this.cgO = editText;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
        this.cga = pfVar;
        setContainedBinding(this.cga);
        this.cgm = textView;
    }
}
