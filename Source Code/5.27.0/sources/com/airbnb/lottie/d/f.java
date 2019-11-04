package com.airbnb.lottie.d;

/* compiled from: MeanCalculator */
public class f {
    private float ke;
    private int n;

    public void j(float f) {
        this.ke += f;
        this.n++;
        int i = this.n;
        if (i == Integer.MAX_VALUE) {
            this.ke /= 2.0f;
            this.n = i / 2;
        }
    }
}
