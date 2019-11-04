package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.DialogContentLayout;

/* compiled from: DialogCustodialFeeBinding */
public abstract class j extends ViewDataBinding {
    @NonNull
    public final View aHN;
    @Nullable
    public final TextView alH;
    @Nullable
    public final View bVK;
    @NonNull
    public final DialogContentLayout cMn;
    @Nullable
    public final TextView cMo;
    @Nullable
    public final TextView cMp;
    @NonNull
    public final RecyclerView cMq;
    @Nullable
    public final TextView cMr;

    protected j(Object obj, View view, int i, TextView textView, View view2, TextView textView2, DialogContentLayout dialogContentLayout, RecyclerView recyclerView, View view3, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cMo = textView;
        this.aHN = view2;
        this.cMp = textView2;
        this.cMn = dialogContentLayout;
        this.cMq = recyclerView;
        this.bVK = view3;
        this.cMr = textView3;
        this.alH = textView4;
    }
}
