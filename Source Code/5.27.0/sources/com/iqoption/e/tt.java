package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: OtnLeaderBoardSelectCountryItemBinding */
public abstract class tt extends ViewDataBinding {
    @NonNull
    public final ImageView cpa;
    @NonNull
    public final TextView cpb;

    protected tt(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.cpa = imageView;
        this.cpb = textView;
    }
}
