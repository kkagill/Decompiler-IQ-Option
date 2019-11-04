package com.iqoption.chat.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentMicroRoomListBinding */
public abstract class ck extends ViewDataBinding {
    @NonNull
    public final Guideline aHQ;
    @NonNull
    public final ImageView aIs;
    @NonNull
    public final RecyclerView aRZ;
    @NonNull
    public final TextView alH;

    protected ck(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView, TextView textView, Guideline guideline) {
        super(obj, view, i);
        this.aIs = imageView;
        this.aRZ = recyclerView;
        this.alH = textView;
        this.aHQ = guideline;
    }
}
