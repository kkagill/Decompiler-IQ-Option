package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: TradingHistoryMultiSelectionBinding */
public abstract class aa extends ViewDataBinding {
    @NonNull
    public final CheckBox dKh;
    @NonNull
    public final TextView dKi;

    protected aa(Object obj, View view, int i, CheckBox checkBox, TextView textView) {
        super(obj, view, i);
        this.dKh = checkBox;
        this.dKi = textView;
    }
}
