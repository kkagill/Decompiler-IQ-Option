package com.iqoption.welcome;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.iqoption.core.util.af;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/welcome/InputValidator;", "", "()V", "MAX_LENGTH", "", "isEmailValid", "", "email", "", "isIdentifierValid", "identifier", "isPhoneRegEnabled", "isPasswordValid", "password", "isPhoneValid", "phone", "welcome_release"})
/* compiled from: InputValidator.kt */
public final class c {
    public static final c ekd = new c();

    private c() {
    }

    public final boolean A(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "identifier");
        return kd(str) || (z && ke(str));
    }

    public final boolean kd(String str) {
        kotlin.jvm.internal.i.f(str, "email");
        return af.G(str);
    }

    public final boolean ke(String str) {
        kotlin.jvm.internal.i.f(str, "phone");
        try {
            PhoneNumberUtil xt = PhoneNumberUtil.xt();
            PhoneNumberUtil xt2 = PhoneNumberUtil.xt();
            CharSequence charSequence = str;
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.i.e(locale, "Locale.getDefault()");
            return xt.b(xt2.b(charSequence, locale.getCountry()));
        } catch (NumberParseException unused) {
            return false;
        }
    }

    public final boolean kf(String str) {
        kotlin.jvm.internal.i.f(str, "password");
        return str.length() >= 6;
    }
}
