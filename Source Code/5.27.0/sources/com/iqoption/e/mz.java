package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.ad;

/* compiled from: FragmentPushSettingsBinding */
public abstract class mz extends ViewDataBinding {
    @NonNull
    public final ProgressBar Dk;
    @NonNull
    public final LinearLayout bgn;
    @NonNull
    public final FrameLayout ceG;
    @NonNull
    public final ImageView ceM;
    @NonNull
    public final ImageView cit;
    @NonNull
    public final LinearLayout ciu;
    @NonNull
    public final TextView civ;
    @NonNull
    public final RecyclerView ciw;
    @Bindable
    protected ad cix;

    public abstract void a(@Nullable ad adVar);

    protected mz(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, ImageView imageView2, LinearLayout linearLayout2, ProgressBar progressBar, RecyclerView recyclerView) {
        super(obj, view, i);
        this.ceG = frameLayout;
        this.cit = imageView;
        this.ciu = linearLayout;
        this.civ = textView;
        this.ceM = imageView2;
        this.bgn = linearLayout2;
        this.Dk = progressBar;
        this.ciw = recyclerView;
    }
}
