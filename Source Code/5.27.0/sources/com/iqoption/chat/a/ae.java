package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* compiled from: ChatFragmentImagePreviewBinding */
public abstract class ae extends ViewDataBinding {
    @NonNull
    public final ImageView aHK;
    @NonNull
    public final ImageView aQK;
    @NonNull
    public final ImageView aRt;
    @NonNull
    public final TextView aRu;
    @NonNull
    public final Guideline aRv;
    @NonNull
    public final TextView alH;

    protected ae(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, Guideline guideline) {
        super(obj, view, i);
        this.aHK = imageView;
        this.aRt = imageView2;
        this.aQK = imageView3;
        this.aRu = textView;
        this.alH = textView2;
        this.aRv = guideline;
    }
}
