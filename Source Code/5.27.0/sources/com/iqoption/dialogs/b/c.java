package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: CommissionChangeItemBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final TextView cMc;
    @NonNull
    public final TextView cMd;
    @NonNull
    public final TextView cMe;

    protected c(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cMc = textView;
        this.cMd = textView2;
        this.cMe = textView3;
    }
}
