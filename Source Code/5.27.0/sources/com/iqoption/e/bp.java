package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: AssetOvernightItemItemBinding */
public abstract class bp extends ViewDataBinding {
    @NonNull
    public final TextView anj;
    @NonNull
    public final TextView bWX;
    @NonNull
    public final TextView bWY;
    @NonNull
    public final TextView bWZ;

    protected bp(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.bWX = textView;
        this.bWY = textView2;
        this.bWZ = textView3;
        this.anj = textView4;
    }
}
