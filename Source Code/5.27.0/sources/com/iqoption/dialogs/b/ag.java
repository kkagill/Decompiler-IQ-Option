package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: OvernightScheduleItemBinding */
public abstract class ag extends ViewDataBinding {
    @NonNull
    public final TextView cMJ;
    @NonNull
    public final TextView cMK;
    @NonNull
    public final TextView cML;
    @NonNull
    public final TextView cMM;

    protected ag(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cMJ = textView;
        this.cMK = textView2;
        this.cML = textView3;
        this.cMM = textView4;
    }
}
