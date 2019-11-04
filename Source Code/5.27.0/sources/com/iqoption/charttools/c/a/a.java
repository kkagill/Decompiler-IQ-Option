package com.iqoption.charttools.c.a;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* compiled from: DoubleIndicatorFilter */
public class a implements InputFilter {
    private double aID;
    private double aIE;

    public a() {
        this.aID = 0.1d;
        this.aIE = 10.0d;
    }

    public a(double d, double d2) {
        this.aID = d;
        this.aIE = d2;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String str = "";
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(spanned.subSequence(0, i3).toString());
        stringBuilder.append(charSequence2);
        stringBuilder.append(spanned.subSequence(i4, spanned.length()).toString());
        try {
            double parseDouble = Double.parseDouble(stringBuilder.toString());
            return ((parseDouble >= this.aID && parseDouble <= this.aIE) || TextUtils.isEmpty(spanned) || charSequence2.equals(".") || charSequence2.equals(",") || charSequence2.equals("0")) ? null : str;
        } catch (NumberFormatException unused) {
            return str;
        }
    }
}
