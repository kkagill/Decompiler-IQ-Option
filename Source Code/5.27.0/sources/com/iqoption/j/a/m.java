package com.iqoption.j.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.databinding.ViewDataBinding;

/* compiled from: OperationHistorySingleSelectionBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final TextView dKi;
    @NonNull
    public final AppCompatRadioButton dKj;
    @NonNull
    public final LinearLayout dKk;

    protected m(Object obj, View view, int i, AppCompatRadioButton appCompatRadioButton, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.dKj = appCompatRadioButton;
        this.dKk = linearLayout;
        this.dKi = textView;
    }
}
