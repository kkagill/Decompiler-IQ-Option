package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PortfolioDelegateMicroBinding */
public abstract class un extends ViewDataBinding {
    @NonNull
    public final Guideline aHQ;
    @NonNull
    public final ImageView aIs;
    @NonNull
    public final ViewPager aRy;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TabLayout cfQ;
    @NonNull
    public final TextView ciF;

    protected un(Object obj, View view, int i, ImageView imageView, TextView textView, ViewPager viewPager, TabLayout tabLayout, TextView textView2, Guideline guideline) {
        super(obj, view, i);
        this.aIs = imageView;
        this.ciF = textView;
        this.aRy = viewPager;
        this.cfQ = tabLayout;
        this.alH = textView2;
        this.aHQ = guideline;
    }
}
