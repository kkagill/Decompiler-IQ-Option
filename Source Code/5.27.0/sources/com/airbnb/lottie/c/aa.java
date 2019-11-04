package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.m;
import com.airbnb.lottie.model.content.f;

/* compiled from: RectangleShapeParser */
class aa {
    static f u(JsonReader jsonReader, e eVar) {
        String str = null;
        m mVar = str;
        com.airbnb.lottie.model.a.f fVar = mVar;
        b bVar = fVar;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3324) {
                    if (hashCode != 3519) {
                        if (hashCode != 114) {
                            if (hashCode == 115 && nextName.equals("s")) {
                                i = 2;
                            }
                        } else if (nextName.equals("r")) {
                            i = 3;
                        }
                    } else if (nextName.equals("nm")) {
                        i = 0;
                    }
                } else if (nextName.equals("hd")) {
                    i = 4;
                }
            } else if (nextName.equals("p")) {
                i = 1;
            }
            if (i == 0) {
                str = jsonReader.nextString();
            } else if (i == 1) {
                mVar = a.b(jsonReader, eVar);
            } else if (i == 2) {
                fVar = d.h(jsonReader, eVar);
            } else if (i == 3) {
                bVar = d.f(jsonReader, eVar);
            } else if (i != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new f(str, mVar, fVar, bVar, z);
    }
}
