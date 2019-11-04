package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;

/* compiled from: CardNumberValidator */
class b implements n {
    static final int[] cxA = new int[]{4, 11};
    static final int[] cxB = new int[]{4, 9, 14};
    private int cxC;
    private String cxz;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public b(String str) {
        this.cxz = str;
    }

    public void afterTextChanged(Editable editable) {
        this.cxz = k.le(editable.toString());
        CardType fromCardNumber = CardType.fromCardNumber(this.cxz);
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
            if ((fromCardNumber.numberLength() == 15 && (i2 == 4 || i2 == 11)) || ((fromCardNumber.numberLength() == 16 || fromCardNumber.numberLength() == 14) && (i2 == 4 || i2 == 9 || i2 == 14))) {
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
        if (this.cxz.length() == CardType.fromCardNumber(this.cxz).numberLength()) {
            z = true;
        }
        return z;
    }

    public boolean isValid() {
        if (apr() && c.hC(this.cxz)) {
            return true;
        }
        return false;
    }

    public String getValue() {
        return this.cxz;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String le = k.le(new SpannableStringBuilder(spanned).replace(i3, i4, charSequence, i, i2).toString());
        int numberLength = CardType.fromCardNumber(le).numberLength();
        if (le.length() > numberLength) {
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
