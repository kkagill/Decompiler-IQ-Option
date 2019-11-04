package com.iqoption.tradinghistory.materialcalendar.a;

/* compiled from: ArrayWeekDayFormatter */
public class a implements h {
    private final CharSequence[] eaL;

    public a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        } else if (charSequenceArr.length == 7) {
            this.eaL = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
    }

    public CharSequence hs(int i) {
        return this.eaL[i - 1];
    }
}
