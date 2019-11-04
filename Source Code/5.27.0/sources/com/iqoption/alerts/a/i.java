package com.iqoption.alerts.a;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.DialogContentLayout;
import com.iqoption.core.ui.widget.clippinglayout.ClipLinearLayout;

/* compiled from: AlertsOptionsPickerFragmentBinding */
public abstract class i extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final RecyclerView aoA;
    @NonNull
    public final ClipLinearLayout aoy;
    @NonNull
    public final DialogContentLayout aoz;

    protected i(Object obj, View view, int i, ClipLinearLayout clipLinearLayout, DialogContentLayout dialogContentLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.aoy = clipLinearLayout;
        this.aoz = dialogContentLayout;
        this.aoA = recyclerView;
        this.alH = textView;
    }
}
