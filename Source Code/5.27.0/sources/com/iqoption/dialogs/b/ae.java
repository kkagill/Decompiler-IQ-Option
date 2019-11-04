package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: OvernightChargeItemBinding */
public abstract class ae extends ViewDataBinding {
    @NonNull
    public final TextView cMI;
    @NonNull
    public final TextView cMf;

    protected ae(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cMI = textView;
        this.cMf = textView2;
    }
}
