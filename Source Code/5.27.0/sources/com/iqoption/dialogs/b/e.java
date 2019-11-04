package com.iqoption.dialogs.b;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

/* compiled from: CustodialScheduleItemBinding */
public abstract class e extends ViewDataBinding {
    @Nullable
    public final FrameLayout aIb;
    @NonNull
    public final TextView cMf;
    @NonNull
    public final TextView cMg;
    @NonNull
    public final TextView cMh;
    @NonNull
    public final TextView cMi;

    protected e(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cMf = textView;
        this.aIb = frameLayout;
        this.cMg = textView2;
        this.cMh = textView3;
        this.cMi = textView4;
    }
}
