package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: FragmentMarketAnalysisBinding */
public abstract class lo extends ViewDataBinding {
    @Nullable
    public final Guideline aHQ;
    @NonNull
    public final ImageView aIs;
    @NonNull
    public final ViewPager aRy;
    @NonNull
    public final ConstraintLayout cfP;
    @NonNull
    public final TabLayout cfQ;
    @NonNull
    public final ImageView chi;
    @NonNull
    public final FormattedTextView chj;

    protected lo(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, ViewPager viewPager, TabLayout tabLayout, FormattedTextView formattedTextView, Guideline guideline) {
        super(obj, view, i);
        this.aIs = imageView;
        this.cfP = constraintLayout;
        this.chi = imageView2;
        this.aRy = viewPager;
        this.cfQ = tabLayout;
        this.chj = formattedTextView;
        this.aHQ = guideline;
    }
}
