package com.iqoption.e;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentVideoEducationVideosBinding */
public abstract class nt extends ViewDataBinding {
    @NonNull
    public final ImageView aHK;
    @NonNull
    public final EditText aRC;
    @NonNull
    public final TextView alH;
    @NonNull
    public final FrameLayout bZY;
    @NonNull
    public final ImageView cfA;
    @NonNull
    public final LinearLayout ckA;
    @NonNull
    public final RecyclerView ckB;
    @NonNull
    public final FrameLayout ckC;
    @NonNull
    public final RecyclerView ckD;
    @NonNull
    public final TextView ckz;

    protected nt(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, FrameLayout frameLayout, EditText editText, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView2, FrameLayout frameLayout2, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.aHK = imageView;
        this.ckz = textView;
        this.cfA = imageView2;
        this.bZY = frameLayout;
        this.aRC = editText;
        this.ckA = linearLayout;
        this.ckB = recyclerView;
        this.alH = textView2;
        this.ckC = frameLayout2;
        this.ckD = recyclerView2;
    }
}
