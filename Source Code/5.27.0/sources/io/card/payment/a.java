package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* compiled from: AlwaysValid */
class a implements n {
    private String bou;

    public void afterTextChanged(Editable editable) {
    }

    public boolean apr() {
        return true;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public String getValue() {
        return this.bou;
    }
}
