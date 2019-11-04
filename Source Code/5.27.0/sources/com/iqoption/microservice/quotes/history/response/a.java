package com.iqoption.microservice.quotes.history.response;

/* compiled from: GetFirstCandles */
public final class a {
    public int[] bxB;
    public double[] bxC;
    public double[] bxD;
    public double[] bxE;
    public double[] bxF;
    public double[] bxG;
    public long[] bxy;
    public long[] bxz;

    private a() {
    }

    public a(int i) {
        this.bxy = new long[i];
        this.bxz = new long[i];
        this.bxB = new int[i];
        this.bxC = new double[i];
        this.bxD = new double[i];
        this.bxE = new double[i];
        this.bxF = new double[i];
        this.bxG = new double[i];
    }
}
