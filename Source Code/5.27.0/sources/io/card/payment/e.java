package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* compiled from: FixedLengthValidator */
class e implements n {
    public int eKT;
    private String value;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public e(int i) {
        this.eKT = i;
    }

    public void afterTextChanged(Editable editable) {
        this.value = editable.toString();
    }

    public String getValue() {
        return this.value;
    }

    public boolean apr() {
        return isValid();
    }

    public boolean isValid() {
        String str = this.value;
        return str != null && str.length() == this.eKT;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return (i2 <= 0 || ((spanned.length() + i4) - i3) + i2 <= this.eKT) ? null : "";
    }
}
