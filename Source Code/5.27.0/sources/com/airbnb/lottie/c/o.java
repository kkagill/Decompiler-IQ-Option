package com.airbnb.lottie.c;

import android.util.JsonReader;

/* compiled from: IntegerParser */
public class o implements aj<Integer> {
    public static final o jM = new o();

    private o() {
    }

    /* renamed from: a */
    public Integer b(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(p.c(jsonReader) * f));
    }
}
