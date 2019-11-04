package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BottomSheetOvernightHistoryBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final LinearLayout aGo;
    @NonNull
    public final TextView aIr;
    @NonNull
    public final TextView alH;
    @NonNull
    public final RecyclerView cMa;
    @NonNull
    public final TextView cMb;

    protected a(Object obj, View view, int i, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cMa = recyclerView;
        this.aGo = linearLayout;
        this.aIr = textView;
        this.alH = textView2;
        this.cMb = textView3;
    }
}
