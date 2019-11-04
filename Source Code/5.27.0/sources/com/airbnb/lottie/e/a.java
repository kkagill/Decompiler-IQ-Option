package com.airbnb.lottie.e;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.e;

/* compiled from: Keyframe */
public class a<T> {
    @Nullable
    private final e df;
    public final float dw;
    @Nullable
    public final T kj;
    @Nullable
    public T kk;
    @Nullable
    public final Interpolator kl;
    @Nullable
    public Float km;
    private float kn;
    private float ko;
    private int kp;
    private int kq;
    private float kr;
    private float ks;
    public PointF kt;
    public PointF ku;

    public a(e eVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.kn = -3987645.8f;
        this.ko = -3987645.8f;
        this.kp = 784923401;
        this.kq = 784923401;
        this.kr = Float.MIN_VALUE;
        this.ks = Float.MIN_VALUE;
        this.kt = null;
        this.ku = null;
        this.df = eVar;
        this.kj = t;
        this.kk = t2;
        this.kl = interpolator;
        this.dw = f;
        this.km = f2;
    }

    public a(T t) {
        this.kn = -3987645.8f;
        this.ko = -3987645.8f;
        this.kp = 784923401;
        this.kq = 784923401;
        this.kr = Float.MIN_VALUE;
        this.ks = Float.MIN_VALUE;
        this.kt = null;
        this.ku = null;
        this.df = null;
        this.kj = t;
        this.kk = t;
        this.kl = null;
        this.dw = Float.MIN_VALUE;
        this.km = Float.valueOf(Float.MAX_VALUE);
    }

    public float cn() {
        e eVar = this.df;
        if (eVar == null) {
            return 0.0f;
        }
        if (this.kr == Float.MIN_VALUE) {
            this.kr = (this.dw - eVar.aj()) / this.df.ap();
        }
        return this.kr;
    }

    public float aT() {
        if (this.df == null) {
            return 1.0f;
        }
        if (this.ks == Float.MIN_VALUE) {
            if (this.km == null) {
                this.ks = 1.0f;
            } else {
                this.ks = cn() + ((this.km.floatValue() - this.dw) / this.df.ap());
            }
        }
        return this.ks;
    }

    public boolean bo() {
        return this.kl == null;
    }

    public boolean k(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= cn() && f < aT();
    }

    public float cQ() {
        if (this.kn == -3987645.8f) {
            this.kn = ((Float) this.kj).floatValue();
        }
        return this.kn;
    }

    public float cR() {
        if (this.ko == -3987645.8f) {
            this.ko = ((Float) this.kk).floatValue();
        }
        return this.ko;
    }

    public int cS() {
        if (this.kp == 784923401) {
            this.kp = ((Integer) this.kj).intValue();
        }
        return this.kp;
    }

    public int cT() {
        if (this.kq == 784923401) {
            this.kq = ((Integer) this.kk).intValue();
        }
        return this.kq;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Keyframe{startValue=");
        stringBuilder.append(this.kj);
        stringBuilder.append(", endValue=");
        stringBuilder.append(this.kk);
        stringBuilder.append(", startFrame=");
        stringBuilder.append(this.dw);
        stringBuilder.append(", endFrame=");
        stringBuilder.append(this.km);
        stringBuilder.append(", interpolator=");
        stringBuilder.append(this.kl);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
