package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY})
/* compiled from: Font */
public class b {
    private final float ascent;
    private final String hn;
    private final String ho;
    private final String name;

    public b(String str, String str2, String str3, float f) {
        this.hn = str;
        this.name = str2;
        this.ho = str3;
        this.ascent = f;
    }

    public String getFamily() {
        return this.hn;
    }

    public String getName() {
        return this.name;
    }

    public String bh() {
        return this.ho;
    }
}
