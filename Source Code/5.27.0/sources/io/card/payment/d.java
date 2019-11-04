package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.Date;

/* compiled from: ExpiryValidator */
class d implements n {
    private static final String TAG = "d";
    private boolean eKS;
    public int month;
    public int year;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public d(int i, int i2) {
        this.month = i;
        this.year = i2;
        boolean z = this.month > 0 && this.year > 0;
        this.eKS = z;
        i = this.year;
        if (i < CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE) {
            this.year = i + CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        }
    }

    public void afterTextChanged(Editable editable) {
        this.eKS = editable.length() >= 5;
        String obj = editable.toString();
        if (obj != null) {
            Date lc = c.lc(obj);
            if (lc != null) {
                this.month = lc.getMonth() + 1;
                this.year = lc.getYear();
                int i = this.year;
                if (i < 1900) {
                    this.year = i + 1900;
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.month = 0;
        this.year = 0;
        this.eKS = false;
    }

    public String getValue() {
        return String.format("%02d/%02d", new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year % 100)});
    }

    public boolean apr() {
        return this.eKS;
    }

    public boolean isValid() {
        int i = this.month;
        boolean z = false;
        if (i >= 1 && 12 >= i) {
            Date date = new Date();
            if (this.year > (date.getYear() + 1900) + 15) {
                return false;
            }
            if (this.year > date.getYear() + 1900 || (this.year == date.getYear() + 1900 && this.month >= date.getMonth() + 1)) {
                z = true;
            }
        }
        return z;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i3 == 0 && spannableStringBuilder.length() > 0 && '1' < spannableStringBuilder.charAt(0) && spannableStringBuilder.charAt(0) <= '9') {
            spannableStringBuilder.insert(0, "0");
            i2++;
        }
        int i5 = i4 - i3;
        if (i3 - i5 <= 2 && (i3 + i2) - i5 >= 2) {
            i5 = 2 - i3;
            if (i5 == i2 || (i5 >= 0 && i5 < i2 && spannableStringBuilder.charAt(i5) != '/')) {
                spannableStringBuilder.insert(i5, "/");
                i2++;
            }
        }
        String spannableStringBuilder2 = new SpannableStringBuilder(spanned).replace(i3, i4, spannableStringBuilder, i, i2).toString();
        String str = "";
        if (spannableStringBuilder2.length() >= 1 && (spannableStringBuilder2.charAt(0) < '0' || '1' < spannableStringBuilder2.charAt(0))) {
            return str;
        }
        if (spannableStringBuilder2.length() >= 2) {
            if (spannableStringBuilder2.charAt(0) != '0' && spannableStringBuilder2.charAt(1) > '2') {
                return str;
            }
            if (spannableStringBuilder2.charAt(0) == '0' && spannableStringBuilder2.charAt(1) == '0') {
                return str;
            }
        }
        return spannableStringBuilder2.length() > 5 ? str : spannableStringBuilder;
    }
}
