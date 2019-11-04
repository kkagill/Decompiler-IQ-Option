package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: RegexBasedMatcher */
public final class b implements a {
    private final c afo = new c(100);

    public static a yy() {
        return new b();
    }

    private b() {
    }

    public boolean a(CharSequence charSequence, PhoneNumberDesc phoneNumberDesc, boolean z) {
        String ya = phoneNumberDesc.ya();
        if (ya.length() == 0) {
            return false;
        }
        return a(charSequence, this.afo.cR(ya), z);
    }

    private static boolean a(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            z = true;
        }
        return z;
    }
}
