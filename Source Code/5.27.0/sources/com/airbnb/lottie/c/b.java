package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.model.a.a;
import com.airbnb.lottie.model.a.k;

/* compiled from: AnimatableTextPropertiesParser */
public class b {
    public static k c(JsonReader jsonReader, e eVar) {
        jsonReader.beginObject();
        k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 97 && nextName.equals("a")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                kVar = d(jsonReader, eVar);
            }
        }
        jsonReader.endObject();
        return kVar == null ? new k(null, null, null, null) : kVar;
    }

    private static k d(JsonReader jsonReader, e eVar) {
        jsonReader.beginObject();
        a aVar = null;
        a aVar2 = null;
        com.airbnb.lottie.model.a.b bVar = aVar2;
        com.airbnb.lottie.model.a.b bVar2 = bVar;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 116) {
                if (hashCode != 3261) {
                    if (hashCode != 3664) {
                        if (hashCode == 3684 && nextName.equals("sw")) {
                            i = 2;
                        }
                    } else if (nextName.equals("sc")) {
                        i = 1;
                    }
                } else if (nextName.equals("fc")) {
                    i = 0;
                }
            } else if (nextName.equals("t")) {
                i = 3;
            }
            if (i == 0) {
                aVar = d.l(jsonReader, eVar);
            } else if (i == 1) {
                aVar2 = d.l(jsonReader, eVar);
            } else if (i == 2) {
                bVar = d.f(jsonReader, eVar);
            } else if (i != 3) {
                jsonReader.skipValue();
            } else {
                bVar2 = d.f(jsonReader, eVar);
            }
        }
        jsonReader.endObject();
        return new k(aVar, aVar2, bVar, bVar2);
    }
}
