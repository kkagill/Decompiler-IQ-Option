package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.model.a.f;
import com.airbnb.lottie.model.a.m;
import com.airbnb.lottie.model.content.a;

/* compiled from: CircleShapeParser */
class e {
    static a b(JsonReader jsonReader, com.airbnb.lottie.e eVar, int i) {
        boolean z = i == 3;
        String str = null;
        m mVar = str;
        f fVar = mVar;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i2 = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 100) {
                if (hashCode != 112) {
                    if (hashCode != 115) {
                        if (hashCode != 3324) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                i2 = 0;
                            }
                        } else if (nextName.equals("hd")) {
                            i2 = 3;
                        }
                    } else if (nextName.equals("s")) {
                        i2 = 2;
                    }
                } else if (nextName.equals("p")) {
                    i2 = 1;
                }
            } else if (nextName.equals("d")) {
                i2 = 4;
            }
            if (i2 == 0) {
                str = jsonReader.nextString();
            } else if (i2 == 1) {
                mVar = a.b(jsonReader, eVar);
            } else if (i2 == 2) {
                fVar = d.h(jsonReader, eVar);
            } else if (i2 == 3) {
                z2 = jsonReader.nextBoolean();
            } else if (i2 != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextInt() == 3;
            }
        }
        return new a(str, mVar, fVar, z, z2);
    }
}
