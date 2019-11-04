package com.iqoption.core.microservices.videoeducation.response;

import java.util.Locale;

/* compiled from: Locales */
final class d {
    public static boolean gS(String str) {
        return "all_ALL".equalsIgnoreCase(str);
    }

    public static boolean gT(String str) {
        return Locale.getDefault().toString().equalsIgnoreCase(str);
    }

    public static boolean gU(String str) {
        return gT(str) || gS(str);
    }
}
