package com.airbnb.lottie.c;

import android.util.JsonReader;

/* compiled from: FloatParser */
public class i implements aj<Float> {
    public static final i jK = new i();

    private i() {
    }

    /* renamed from: d */
    public Float b(JsonReader jsonReader, float f) {
        return Float.valueOf(p.c(jsonReader) * f);
    }
}
