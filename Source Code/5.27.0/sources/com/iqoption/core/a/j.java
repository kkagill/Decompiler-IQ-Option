package com.iqoption.core.a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ItemCountrySuggestBinding */
public abstract class j extends ViewDataBinding {
    @NonNull
    public final TextView bfG;
    @NonNull
    public final LinearLayout bfl;

    protected j(Object obj, View view, int i, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.bfl = linearLayout;
        this.bfG = textView;
    }
}
