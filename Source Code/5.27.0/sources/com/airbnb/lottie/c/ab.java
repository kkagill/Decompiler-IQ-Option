package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.l;
import com.airbnb.lottie.model.content.g;

/* compiled from: RepeaterParser */
class ab {
    static g v(JsonReader jsonReader, e eVar) {
        String str = null;
        b bVar = str;
        b bVar2 = bVar;
        l lVar = bVar2;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3324) {
                        if (hashCode != 3519) {
                            if (hashCode == 3710 && nextName.equals("tr")) {
                                i = 3;
                            }
                        } else if (nextName.equals("nm")) {
                            i = 0;
                        }
                    } else if (nextName.equals("hd")) {
                        i = 4;
                    }
                } else if (nextName.equals("o")) {
                    i = 2;
                }
            } else if (nextName.equals("c")) {
                i = 1;
            }
            if (i == 0) {
                str = jsonReader.nextString();
            } else if (i == 1) {
                bVar = d.a(jsonReader, eVar, false);
            } else if (i == 2) {
                bVar2 = d.a(jsonReader, eVar, false);
            } else if (i == 3) {
                lVar = c.e(jsonReader, eVar);
            } else if (i != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new g(str, bVar, bVar2, lVar, z);
    }
}
