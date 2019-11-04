package com.iqoption.core.ui.widget.f;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: DoublePrecisionFilter */
public class a implements InputFilter {
    private int akR;

    public a(int i) {
        this.akR = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String str = "";
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(spanned.subSequence(0, i3).toString());
        stringBuilder.append(charSequence2);
        stringBuilder.append(spanned.subSequence(i4, spanned.length()).toString());
        charSequence2 = stringBuilder.toString();
        try {
            Double.parseDouble(charSequence2);
            i = charSequence2.indexOf(46);
            if (i <= 0 || (charSequence2.length() - i) - 1 <= this.akR) {
                return null;
            }
            return str;
        } catch (NullPointerException | NumberFormatException unused) {
            return str;
        }
    }
}
