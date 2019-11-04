package com.iqoption.view.timer.component;

import android.graphics.RectF;

/* compiled from: FlowerDataCalc */
public class a {
    private final float[] bPM;
    private final float[] bPN;
    private final int bPQ;
    private final RectF[] eiy;
    private final int[] eiz;

    public a(int i) {
        this.bPQ = i;
        i = this.bPQ;
        this.bPM = new float[i];
        this.bPN = new float[i];
        double d = (double) i;
        Double.isNaN(d);
        double d2 = 6.283185307179586d / d;
        i = 0;
        while (true) {
            int i2 = this.bPQ;
            if (i < i2) {
                d = 180.0d + d2;
                double d3 = (double) i;
                Double.isNaN(d3);
                d -= d3 * d2;
                this.bPM[i] = (float) Math.cos(d);
                this.bPN[i] = (float) Math.sin(d);
                i++;
            } else {
                this.eiy = new RectF[i2];
                this.eiz = new int[i2];
                return;
            }
        }
    }

    public RectF[] anh() {
        return this.eiy;
    }

    public void f(int i, float f) {
        float f2 = (float) i;
        float f3 = f2 / 2.0f;
        f2 = (f2 - (f / 2.0f)) / 2.0f;
        float f4 = ((f2 * 2.0f) - f) / 2.0f;
        for (int i2 = 0; i2 < this.bPQ; i2++) {
            float[] fArr = this.bPM;
            float f5 = fArr[i2] * f2;
            float[] fArr2 = this.bPN;
            this.eiy[i2] = new RectF(f3 - f5, (fArr2[i2] * f2) + f3, f3 - (fArr[i2] * f4), (fArr2[i2] * f4) + f3);
        }
    }

    public int[] ani() {
        return this.eiz;
    }

    public void x(long j, long j2) {
        if (j != 0 && j2 != 0) {
            int i;
            j = Math.min(j, j2 - 1);
            int i2 = this.bPQ;
            long j3 = j2 / ((long) i2);
            int i3 = (int) ((((long) i2) - (j / j3)) - 1);
            for (i = 0; i < i3; i++) {
                this.eiz[i] = 25;
            }
            for (i = i3 + 1; i < this.bPQ; i++) {
                this.eiz[i] = 255;
            }
            float max = ((float) (j - Math.max(0, (j2 - (((long) i3) * j3)) - j3))) / ((float) j3);
            int[] iArr = this.eiz;
            if (i3 < iArr.length) {
                iArr[i3] = ((int) (max * 230.0f)) + 25;
            }
        }
    }
}
