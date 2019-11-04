package com.google.android.material.a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: AnimationUtils */
public class a {
    public static final TimeInterpolator DG = new LinearInterpolator();
    public static final TimeInterpolator DH = new FastOutSlowInInterpolator();
    public static final TimeInterpolator DI = new FastOutLinearInInterpolator();
    public static final TimeInterpolator DL = new LinearOutSlowInInterpolator();
    public static final TimeInterpolator DN = new DecelerateInterpolator();

    public static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int b(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
