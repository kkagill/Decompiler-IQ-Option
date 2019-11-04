package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY})
/* compiled from: CubicCurveData */
public class a {
    private final PointF hc;
    private final PointF hd;
    private final PointF he;

    public a() {
        this.hc = new PointF();
        this.hd = new PointF();
        this.he = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.hc = pointF;
        this.hd = pointF2;
        this.he = pointF3;
    }

    public void b(float f, float f2) {
        this.hc.set(f, f2);
    }

    public PointF be() {
        return this.hc;
    }

    public void c(float f, float f2) {
        this.hd.set(f, f2);
    }

    public PointF bf() {
        return this.hd;
    }

    public void d(float f, float f2) {
        this.he.set(f, f2);
    }

    public PointF bg() {
        return this.he;
    }
}
