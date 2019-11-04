package com.airbnb.lottie.c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.e;

/* compiled from: PathKeyframeParser */
class w {
    static h s(JsonReader jsonReader, e eVar) {
        return new h(eVar, q.a(jsonReader, eVar, com.airbnb.lottie.d.h.cP(), x.jP, jsonReader.peek() == JsonToken.BEGIN_OBJECT));
    }
}
