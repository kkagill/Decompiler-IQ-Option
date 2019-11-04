package com.iqoption.kyc.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemPoaTypeBinding */
public abstract class bo extends ViewDataBinding {
    @NonNull
    public final LinearLayout dwx;
    @NonNull
    public final TextView dwy;

    protected bo(Object obj, View view, int i, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.dwx = linearLayout;
        this.dwy = textView;
    }
}
