package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ChatFragmentFilePickerBinding */
public abstract class ac extends ViewDataBinding {
    @NonNull
    public final ImageView aHK;
    @NonNull
    public final RecyclerView aRq;
    @NonNull
    public final ConstraintLayout aRr;
    @NonNull
    public final LinearLayout aRs;
    @NonNull
    public final TextView alH;

    protected ac(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView, ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.aHK = imageView;
        this.aRq = recyclerView;
        this.aRr = constraintLayout;
        this.alH = textView;
        this.aRs = linearLayout;
    }
}
