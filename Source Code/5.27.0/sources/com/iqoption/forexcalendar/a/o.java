package com.iqoption.forexcalendar.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: MicroForexCalendarItemBinding */
public abstract class o extends ViewDataBinding {
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
    @NonNull
    public final View cTl;

    protected o(Object obj, View view, int i, View view2, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cTl = view2;
        this.cTk = constraintLayout;
        this.aRh = imageView;
        this.cTh = imageView2;
        this.amZ = textView;
        this.anj = textView2;
    }
}
