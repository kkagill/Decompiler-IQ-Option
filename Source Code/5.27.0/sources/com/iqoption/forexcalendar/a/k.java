package com.iqoption.forexcalendar.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: MacroForexCalendarItemBinding */
public abstract class k extends ViewDataBinding {
    @NonNull
    public final ImageView aRh;
    @NonNull
    public final TextView amZ;
    @NonNull
    public final TextView anj;
    @NonNull
    public final ImageView cTh;
    @NonNull
    public final ConstraintLayout cTk;

    protected k(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cTk = constraintLayout;
        this.aRh = imageView;
        this.cTh = imageView2;
        this.amZ = textView;
        this.anj = textView2;
    }
}
