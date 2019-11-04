package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.view.RobotoTextView;

/* compiled from: BottomSheetCommissionBinding */
public abstract class dm extends ViewDataBinding {
    @NonNull
    public final RecyclerView aIq;
    @NonNull
    public final View bYo;
    @NonNull
    public final ImageView bYq;
    @NonNull
    public final FrameLayout bYr;
    @NonNull
    public final ProgressBar bYs;
    @NonNull
    public final LinearLayout bYt;
    @NonNull
    public final RobotoTextView bYu;
    @NonNull
    public final RobotoTextView bYv;
    @NonNull
    public final RelativeLayout bYw;
    @NonNull
    public final RobotoTextView bYx;

    protected dm(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView, View view2, FrameLayout frameLayout, ProgressBar progressBar, LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RelativeLayout relativeLayout, RobotoTextView robotoTextView3) {
        super(obj, view, i);
        this.bYq = imageView;
        this.aIq = recyclerView;
        this.bYo = view2;
        this.bYr = frameLayout;
        this.bYs = progressBar;
        this.bYt = linearLayout;
        this.bYu = robotoTextView;
        this.bYv = robotoTextView2;
        this.bYw = relativeLayout;
        this.bYx = robotoTextView3;
    }
}
