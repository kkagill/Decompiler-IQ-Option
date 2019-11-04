package com.airbnb.lottie.model;

/* compiled from: Marker */
public class g {
    private static String hx = "\r";
    public final float dw;
    public final float hy;
    private final String name;

    public g(String str, float f, float f2) {
        this.name = str;
        this.hy = f2;
        this.dw = f;
    }

    public boolean A(String str) {
        if (this.name.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.name.endsWith(hx)) {
            String str2 = this.name;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
