package com.iqoption.portfolio;

/* compiled from: Calculation */
public class a {
    private double auh;
    private double dKW;
    private double dKX;
    private double dKY;
    private double dKZ;
    private long dLa;
    private double value;

    public void i(double d, double d2, double d3) {
        this.auh += d;
        this.dKW += d2;
        this.dKY += d3;
        update();
    }

    public void a(a aVar) {
        i(aVar.auh, aVar.dKW, aVar.dKY);
    }

    public void a(double d, double d2, double d3, long j) {
        this.auh = d;
        this.dKW = d2;
        this.dKY = d3;
        this.dLa = j;
        update();
    }

    public void reset() {
        a(0.0d, 0.0d, 0.0d, 0);
    }

    private void update() {
        double d = this.auh;
        if (d == 0.0d) {
            this.dKX = 0.0d;
            this.dKZ = 0.0d;
        } else {
            this.dKX = (this.dKW / d) * 100.0d;
            this.dKZ = (this.dKY / d) * 100.0d;
        }
        this.value = this.auh + this.dKW;
    }

    public boolean aQn() {
        return this.dLa > 0;
    }

    public long aQo() {
        return this.dLa;
    }

    public double getInvest() {
        return this.auh;
    }

    public double getSellPnl() {
        return this.dKW;
    }

    public double aQp() {
        return this.dKX;
    }

    public boolean aQq() {
        return this.dKW > 0.0d;
    }

    public boolean aQr() {
        return this.dKW < 0.0d;
    }

    public double getExpPnl() {
        return this.dKY;
    }

    public double aQs() {
        return this.dKZ;
    }

    public boolean aQt() {
        return this.dKY > 0.0d;
    }

    public boolean aQu() {
        return this.dKY < 0.0d;
    }

    public double getValue() {
        return this.value;
    }
}
