package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.FixedAppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: ToolsContentIndicatorsCommonBinding */
public abstract class zv extends ViewDataBinding {
    @NonNull
    public final ViewPager aRy;
    @NonNull
    public final TabLayout cfQ;
    @NonNull
    public final FixedAppBarLayout cup;
    @NonNull
    public final CoordinatorLayout cuq;
    @NonNull
    public final LinearLayout cus;
    @NonNull
    public final TextView cut;
    @NonNull
    public final ImageView cuu;

    protected zv(Object obj, View view, int i, FixedAppBarLayout fixedAppBarLayout, CoordinatorLayout coordinatorLayout, ViewPager viewPager, LinearLayout linearLayout, TextView textView, ImageView imageView, TabLayout tabLayout) {
        super(obj, view, i);
        this.cup = fixedAppBarLayout;
        this.cuq = coordinatorLayout;
        this.aRy = viewPager;
        this.cus = linearLayout;
        this.cut = textView;
        this.cuu = imageView;
        this.cfQ = tabLayout;
    }
}
