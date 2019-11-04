package com.iqoption.core.graphics.animation;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003¨\u0006\u0016"}, bng = {"accelerate", "Landroid/view/animation/Interpolator;", "getAccelerate", "()Landroid/view/animation/Interpolator;", "accelerationCurve", "getAccelerationCurve", "bounceInterpolator", "getBounceInterpolator", "decelerate", "getDecelerate", "decelerationCurve", "getDecelerationCurve", "fastOutLinearInInterpolator", "getFastOutLinearInInterpolator", "linearInterpolator", "getLinearInterpolator", "linearOutSlowInInterpolator", "getLinearOutSlowInInterpolator", "overshootInterpolator", "getOvershootInterpolator", "standardCurve", "getStandardCurve", "core_release"})
/* compiled from: Interpolators.kt */
public final class j {
    private static final Interpolator bhS = new FastOutSlowInInterpolator();
    private static final Interpolator bhT = new LinearOutSlowInInterpolator();
    private static final Interpolator bhU = new FastOutLinearInInterpolator();
    private static final Interpolator bhV = new LinearOutSlowInInterpolator();
    private static final Interpolator bhW = new FastOutLinearInInterpolator();
    private static final Interpolator bhX = new LinearInterpolator();
    private static final Interpolator bhY = new BounceInterpolator();
    private static final Interpolator bhZ = new AccelerateInterpolator();
    private static final Interpolator bia = new DecelerateInterpolator();
    private static final Interpolator bib = new OvershootInterpolator();

    public static final Interpolator XJ() {
        return bhS;
    }

    public static final Interpolator XK() {
        return bhT;
    }

    public static final Interpolator XL() {
        return bhU;
    }

    public static final Interpolator XM() {
        return bhW;
    }

    public static final Interpolator XN() {
        return bhX;
    }

    public static final Interpolator XO() {
        return bia;
    }
}
