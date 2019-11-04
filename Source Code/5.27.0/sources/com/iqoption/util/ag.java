package com.iqoption.util;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import java.util.Locale;

/* compiled from: PhoneUtils */
public final class ag {
    public static String x(int i, long j) {
        if (j <= 0) {
            return "";
        }
        if (String.valueOf(j).length() >= 6) {
            PhoneNumberUtil xt = PhoneNumberUtil.xt();
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.cH(i);
            phoneNumber.K(j);
            return xt.a(phoneNumber, PhoneNumberFormat.INTERNATIONAL);
        } else if (i <= 0) {
            return String.format(Locale.US, "*****%d", new Object[]{Long.valueOf(j)});
        } else {
            return String.format(Locale.US, "+%d*****%d", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
        }
    }
}
