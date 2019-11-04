package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY})
public class DocumentData {
    @ColorInt
    public final int color;
    public final String hf;
    public final double hg;
    public final Justification hh;
    public final int hi;
    public final double hj;
    public final double hk;
    public final double hl;
    public final boolean hm;
    @ColorInt
    public final int strokeColor;
    public final String text;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, double d, Justification justification, int i, double d2, double d3, @ColorInt int i2, @ColorInt int i3, double d4, boolean z) {
        this.text = str;
        this.hf = str2;
        this.hg = d;
        this.hh = justification;
        this.hi = i;
        this.hj = d2;
        this.hk = d3;
        this.color = i2;
        this.strokeColor = i3;
        this.hl = d4;
        this.hm = z;
    }

    public int hashCode() {
        double hashCode = (double) (((this.text.hashCode() * 31) + this.hf.hashCode()) * 31);
        double d = this.hg;
        Double.isNaN(hashCode);
        int ordinal = (((((int) (hashCode + d)) * 31) + this.hh.ordinal()) * 31) + this.hi;
        long doubleToLongBits = Double.doubleToLongBits(this.hj);
        return (((ordinal * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.color;
    }
}
