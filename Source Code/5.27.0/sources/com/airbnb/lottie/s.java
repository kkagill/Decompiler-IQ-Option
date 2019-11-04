package com.airbnb.lottie;

import java.util.Map;

/* compiled from: TextDelegate */
public class s {
    private final Map<String, String> eY;
    private boolean eZ;

    private String r(String str) {
        return str;
    }

    public final String s(String str) {
        if (this.eZ && this.eY.containsKey(str)) {
            return (String) this.eY.get(str);
        }
        String r = r(str);
        if (this.eZ) {
            this.eY.put(str, r);
        }
        return r;
    }
}
