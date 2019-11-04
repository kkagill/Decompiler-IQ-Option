package com.iqoption.e;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.widget.DialogContentLayout;
import com.iqoption.core.ui.widget.MaxSizeConstraintLayout;

/* compiled from: FragmentAssetsBinding */
public abstract class iq extends ViewDataBinding {
    @NonNull
    public final DialogContentLayout aoz;
    @NonNull
    public final ImageView cfA;
    @NonNull
    public final RecyclerView cfB;
    @NonNull
    public final View cfC;
    @NonNull
    public final MaxSizeConstraintLayout cfD;
    @NonNull
    public final Guideline cfE;
    @NonNull
    public final EditText cfF;
    @NonNull
    public final FrameLayout cfG;
    @NonNull
    public final RecyclerView cfy;
    @NonNull
    public final ImageView cfz;

    protected iq(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, RecyclerView recyclerView2, View view2, MaxSizeConstraintLayout maxSizeConstraintLayout, DialogContentLayout dialogContentLayout, Guideline guideline, EditText editText, FrameLayout frameLayout) {
        super(obj, view, i);
        this.cfy = recyclerView;
        this.cfz = imageView;
        this.cfA = imageView2;
        this.cfB = recyclerView2;
        this.cfC = view2;
        this.cfD = maxSizeConstraintLayout;
        this.aoz = dialogContentLayout;
        this.cfE = guideline;
        this.cfF = editText;
        this.cfG = frameLayout;
    }
}
