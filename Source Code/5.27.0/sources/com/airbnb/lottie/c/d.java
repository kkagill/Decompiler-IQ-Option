package com.airbnb.lottie.c;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.airbnb.lottie.d.h;
import com.airbnb.lottie.e;
import com.airbnb.lottie.model.a.a;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.c;
import com.airbnb.lottie.model.a.f;
import com.airbnb.lottie.model.a.g;
import com.airbnb.lottie.model.a.j;
import java.util.List;

/* compiled from: AnimatableValueParser */
public class d {
    public static b f(JsonReader jsonReader, e eVar) {
        return a(jsonReader, eVar, true);
    }

    public static b a(JsonReader jsonReader, e eVar, boolean z) {
        return new b(a(jsonReader, z ? h.cP() : 1.0f, eVar, i.jK));
    }

    static com.airbnb.lottie.model.a.d g(JsonReader jsonReader, e eVar) {
        return new com.airbnb.lottie.model.a.d(a(jsonReader, eVar, o.jM));
    }

    static f h(JsonReader jsonReader, e eVar) {
        return new f(a(jsonReader, h.cP(), eVar, y.jQ));
    }

    static g i(JsonReader jsonReader, e eVar) {
        return new g(a(jsonReader, eVar, ac.jR));
    }

    static com.airbnb.lottie.model.a.h j(JsonReader jsonReader, e eVar) {
        return new com.airbnb.lottie.model.a.h(a(jsonReader, h.cP(), eVar, ad.jS));
    }

    static j k(JsonReader jsonReader, e eVar) {
        return new j(a(jsonReader, eVar, h.jJ));
    }

    static a l(JsonReader jsonReader, e eVar) {
        return new a(a(jsonReader, eVar, f.jI));
    }

    static c a(JsonReader jsonReader, e eVar, int i) {
        return new c(a(jsonReader, eVar, new l(i)));
    }

    @Nullable
    private static <T> List<com.airbnb.lottie.e.a<T>> a(JsonReader jsonReader, e eVar, aj<T> ajVar) {
        return r.a(jsonReader, eVar, 1.0f, ajVar);
    }

    @Nullable
    private static <T> List<com.airbnb.lottie.e.a<T>> a(JsonReader jsonReader, float f, e eVar, aj<T> ajVar) {
        return r.a(jsonReader, eVar, f, ajVar);
    }
}
