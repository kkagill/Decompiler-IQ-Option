package com.iqoption.welcome.a;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: LayoutWelcomePolicyBinding */
public abstract class ac extends ViewDataBinding {
    @NonNull
    public final CheckBox ekQ;
    @NonNull
    public final TextView ekR;

    protected ac(Object obj, View view, int i, CheckBox checkBox, TextView textView) {
        super(obj, view, i);
        this.ekQ = checkBox;
        this.ekR = textView;
    }
}
