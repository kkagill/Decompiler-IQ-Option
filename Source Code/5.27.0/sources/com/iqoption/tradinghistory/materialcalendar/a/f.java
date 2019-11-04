package com.iqoption.tradinghistory.materialcalendar.a;

import android.text.SpannableStringBuilder;
import com.iqoption.tradinghistory.materialcalendar.b;

/* compiled from: MonthArrayTitleFormatter */
public class f implements g {
    private final CharSequence[] eaN;

    public f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        } else if (charSequenceArr.length >= 12) {
            this.eaN = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Label array is too short");
        }
    }

    public CharSequence o(b bVar) {
        return new SpannableStringBuilder().append(this.eaN[bVar.getMonth()]).append(" ").append(String.valueOf(bVar.getYear()));
    }
}
