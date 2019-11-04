package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.databinding.ViewDataBinding;

/* compiled from: TradingHistorySingleSelectionBinding */
public abstract class ac extends ViewDataBinding {
    @NonNull
    public final TextView dKi;
    @NonNull
    public final AppCompatRadioButton dKj;
    @NonNull
    public final LinearLayout dKk;

    protected ac(Object obj, View view, int i, AppCompatRadioButton appCompatRadioButton, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.dKj = appCompatRadioButton;
        this.dKk = linearLayout;
        this.dKi = textView;
    }
}
