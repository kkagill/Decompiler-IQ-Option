package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.account.security.AccountSecurityFragment;
import com.iqoption.view.SmoothViewPager;

/* compiled from: FragmentAccountSecurityBinding */
public abstract class ig extends ViewDataBinding {
    @NonNull
    public final LinearLayout bgn;
    @NonNull
    public final FrameLayout ceG;
    @NonNull
    public final ImageView ceH;
    @NonNull
    public final ImageView ceI;
    @NonNull
    public final ImageView ceJ;
    @NonNull
    public final ImageView ceK;
    @NonNull
    public final LinearLayout ceL;
    @NonNull
    public final ImageView ceM;
    @NonNull
    public final ImageView ceN;
    @NonNull
    public final ImageView ceO;
    @NonNull
    public final LinearLayout ceP;
    @NonNull
    public final FrameLayout ceQ;
    @NonNull
    public final ImageView ceR;
    @NonNull
    public final ImageView ceS;
    @NonNull
    public final SmoothViewPager ceT;
    @Bindable
    protected AccountSecurityFragment ceU;

    public abstract void a(@Nullable AccountSecurityFragment accountSecurityFragment);

    protected ig(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout2, ImageView imageView7, LinearLayout linearLayout3, FrameLayout frameLayout2, ImageView imageView8, ImageView imageView9, SmoothViewPager smoothViewPager) {
        super(obj, view, i);
        this.ceG = frameLayout;
        this.ceH = imageView;
        this.ceI = imageView2;
        this.ceJ = imageView3;
        this.ceK = imageView4;
        this.ceL = linearLayout;
        this.ceM = imageView5;
        this.ceN = imageView6;
        this.bgn = linearLayout2;
        this.ceO = imageView7;
        this.ceP = linearLayout3;
        this.ceQ = frameLayout2;
        this.ceR = imageView8;
        this.ceS = imageView9;
        this.ceT = smoothViewPager;
    }
}
