package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PortfolioDelegateMacroBinding */
public abstract class ul extends ViewDataBinding {
    @NonNull
    public final ImageView aHK;
    @NonNull
    public final Guideline aHQ;
    @NonNull
    public final ViewPager aRy;
    @NonNull
    public final TextView alH;
    @NonNull
    public final TextView alU;
    @NonNull
    public final TextView aoq;
    @NonNull
    public final TabLayout cfQ;
    @NonNull
    public final TextView ciF;
    @NonNull
    public final Barrier cpZ;

    protected ul(Object obj, View view, int i, ImageView imageView, TextView textView, ViewPager viewPager, TextView textView2, TabLayout tabLayout, TextView textView3, Barrier barrier, Guideline guideline, TextView textView4) {
        super(obj, view, i);
        this.aHK = imageView;
        this.ciF = textView;
        this.aRy = viewPager;
        this.alU = textView2;
        this.cfQ = tabLayout;
        this.alH = textView3;
        this.cpZ = barrier;
        this.aHQ = guideline;
        this.aoq = textView4;
    }
}
