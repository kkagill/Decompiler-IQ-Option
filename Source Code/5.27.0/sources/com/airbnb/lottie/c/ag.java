package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.model.a.h;
import com.airbnb.lottie.model.content.k;

/* compiled from: ShapePathParser */
class ag {
    static k y(JsonReader jsonReader, e eVar) {
        String str = null;
        h hVar = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i2 = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 3324) {
                if (hashCode != 3432) {
                    if (hashCode != 3519) {
                        if (hashCode == 104415 && nextName.equals("ind")) {
                            i2 = 1;
                        }
                    } else if (nextName.equals("nm")) {
                        i2 = 0;
                    }
                } else if (nextName.equals("ks")) {
                    i2 = 2;
                }
            } else if (nextName.equals("hd")) {
                i2 = 3;
            }
            if (i2 == 0) {
                str = jsonReader.nextString();
            } else if (i2 == 1) {
                i = jsonReader.nextInt();
            } else if (i2 == 2) {
                hVar = d.j(jsonReader, eVar);
            } else if (i2 != 3) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new k(str, i, hVar, z);
    }
}
