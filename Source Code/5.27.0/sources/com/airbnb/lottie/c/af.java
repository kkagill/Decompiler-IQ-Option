package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.model.content.b;
import com.airbnb.lottie.model.content.j;
import java.util.ArrayList;

/* compiled from: ShapeGroupParser */
class af {
    static j x(JsonReader jsonReader, e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 3324) {
                if (hashCode != 3371) {
                    if (hashCode == 3519 && nextName.equals("nm")) {
                        i = 0;
                    }
                } else if (nextName.equals("it")) {
                    i = 2;
                }
            } else if (nextName.equals("hd")) {
                i = 1;
            }
            if (i == 0) {
                str = jsonReader.nextString();
            } else if (i == 1) {
                z = jsonReader.nextBoolean();
            } else if (i != 2) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    b m = g.m(jsonReader, eVar);
                    if (m != null) {
                        arrayList.add(m);
                    }
                }
                jsonReader.endArray();
            }
        }
        return new j(str, arrayList, z);
    }
}
