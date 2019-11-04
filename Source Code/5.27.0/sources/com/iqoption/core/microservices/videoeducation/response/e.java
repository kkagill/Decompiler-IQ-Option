package com.iqoption.core.microservices.videoeducation.response;

/* compiled from: Platforms */
public class e {
    public static boolean gS(String str) {
        return "all".equalsIgnoreCase(str);
    }

    public static boolean gV(String str) {
        return "mobile".equalsIgnoreCase(str);
    }

    public static boolean gW(String str) {
        return gV(str) || gS(str);
    }
}
