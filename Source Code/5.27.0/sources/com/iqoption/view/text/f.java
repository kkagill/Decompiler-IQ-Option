package com.iqoption.view.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import java.util.Locale;

/* compiled from: HiddenPhoneNumberTransformation */
public class f implements TransformationMethod {
    private final Locale locale;

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public f(Context context) {
        this.locale = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        int i = 0;
        if ((charSequence == null ? 0 : charSequence.length()) == 0) {
            return charSequence;
        }
        String charSequence2 = charSequence.toString();
        try {
            PhoneNumberUtil xt = PhoneNumberUtil.xt();
            PhoneNumber b = xt.b(charSequence2, this.locale.getCountry());
            int length = String.valueOf(b.xK()).length();
            charSequence2 = xt.a(b, PhoneNumberFormat.INTERNATIONAL);
            if (charSequence2.isEmpty()) {
                return charSequence;
            }
            charSequence = new StringBuilder(charSequence2);
            if (charSequence2.charAt(0) == '+') {
                length++;
            }
            for (int length2 = charSequence.length() - 1; length2 > length; length2--) {
                if (Character.isDigit(charSequence.charAt(length2))) {
                    i++;
                    if (i > 4) {
                        charSequence.setCharAt(length2, '*');
                    }
                }
            }
            return charSequence;
        } catch (NumberParseException unused) {
        }
    }
}
