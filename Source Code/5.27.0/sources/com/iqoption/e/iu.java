package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* compiled from: FragmentInfoAssetBinding */
public abstract class iu extends ViewDataBinding {
    @NonNull
    public final ViewPager aRy;
    @NonNull
    public final ImageView cbk;
    @NonNull
    public final ConstraintLayout cfP;
    @NonNull
    public final TabLayout cfQ;

    protected iu(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, ViewPager viewPager, TabLayout tabLayout) {
        super(obj, view, i);
        this.cbk = imageView;
        this.cfP = constraintLayout;
        this.aRy = viewPager;
        this.cfQ = tabLayout;
    }
}
