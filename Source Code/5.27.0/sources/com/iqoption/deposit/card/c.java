package com.iqoption.deposit.card;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import com.iqoption.core.util.af;
import io.card.payment.CardType;
import java.text.StringCharacterIterator;

/* compiled from: CardNumberValidator */
public class c implements h {
    static final int[] cxA = new int[]{4, 11};
    static final int[] cxB = new int[]{4, 9, 14};
    private int cxC;
    private String cxz;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.cxz = af.H(editable.toString());
        CardType hm = com.iqoption.core.util.c.hm(this.cxz);
        if (hm == null) {
            hm = CardType.UNKNOWN;
        }
        int i = this.cxC;
        int i2 = 0;
        if (i > 1) {
            int i3 = i - 1;
            this.cxC = 0;
            if (i > i3) {
                editable.delete(i3, i);
            }
        }
        while (i2 < editable.length()) {
            char charAt = editable.charAt(i2);
            if ((hm.numberLength() == 15 && (i2 == 4 || i2 == 11)) || ((hm.numberLength() == 16 || hm.numberLength() == 14) && (i2 == 4 || i2 == 9 || i2 == 14))) {
                if (charAt != ' ') {
                    editable.insert(i2, " ");
                }
            } else if (charAt == ' ') {
                editable.delete(i2, i2 + 1);
                i2--;
            }
            i2++;
        }
    }

    public boolean apr() {
        boolean z = false;
        if (TextUtils.isEmpty(this.cxz)) {
            return false;
        }
        CardType hm = com.iqoption.core.util.c.hm(this.cxz);
        if (hm == null || hm == CardType.UNKNOWN) {
            return true;
        }
        if (this.cxz.length() == hm.numberLength()) {
            z = true;
        }
        return z;
    }

    public boolean isValid() {
        if (apr() && hC(this.cxz)) {
            return true;
        }
        return false;
    }

    public static boolean hC(String str) {
        r0 = new int[2][];
        boolean z = false;
        r0[0] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        r0[1] = new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        char last = stringCharacterIterator.last();
        int i = 0;
        int i2 = 0;
        while (last != 65535) {
            if (!Character.isDigit(last)) {
                return false;
            }
            int i3 = i2 + 1;
            i += r0[i2 & 1][last - 48];
            last = stringCharacterIterator.previous();
            i2 = i3;
        }
        if (i % 10 == 0) {
            z = true;
        }
        return z;
    }

    public String getValue() {
        return this.cxz;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String H = af.H(new SpannableStringBuilder(spanned).replace(i3, i4, charSequence, i, i2).toString());
        CardType hm = com.iqoption.core.util.c.hm(H);
        if (hm == null) {
            hm = CardType.UNKNOWN;
        }
        int numberLength = hm.numberLength();
        if (H.length() > numberLength) {
            return "";
        }
        int[] iArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (numberLength == 15) {
            iArr = cxA;
        } else {
            iArr = cxB;
        }
        i4 -= i3;
        int i5 = 0;
        while (i5 < iArr.length) {
            if (charSequence.length() == 0 && i3 == iArr[i5] && spanned.charAt(i3) == ' ') {
                this.cxC = iArr[i5];
            }
            if (i3 - i4 <= iArr[i5] && (i3 + i2) - i4 >= iArr[i5]) {
                int i6 = iArr[i5] - i3;
                if (i6 == i2 || (i6 >= 0 && i6 < i2 && spannableStringBuilder.charAt(i6) != ' ')) {
                    spannableStringBuilder.insert(i6, " ");
                    i2++;
                }
            }
            i5++;
        }
        return spannableStringBuilder;
    }
}
