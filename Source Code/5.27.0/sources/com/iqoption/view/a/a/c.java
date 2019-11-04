package com.iqoption.view.a.a;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* compiled from: Interpolators */
public class c {
    public static final Interpolator bhT = new LinearOutSlowInInterpolator();
    public static final Interpolator bhU = new FastOutLinearInInterpolator();
    public static final Interpolator bhV = new LinearOutSlowInInterpolator();
    public static final Interpolator bhW = new FastOutLinearInInterpolator();
    public static final Interpolator bhX = new LinearInterpolator();
    public static final Interpolator bhY = new BounceInterpolator();
    public static final Interpolator bhZ = new AccelerateInterpolator();
    public static final Interpolator bia = new DecelerateInterpolator();
    public static final Interpolator egR = new FastOutSlowInInterpolator();
}
