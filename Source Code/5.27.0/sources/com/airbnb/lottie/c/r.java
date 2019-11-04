package com.airbnb.lottie.c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser */
class r {
    static <T> List<a<T>> a(JsonReader jsonReader, e eVar, float f, aj<T> ajVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            eVar.l("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 107 && nextName.equals("k")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(q.a(jsonReader, eVar, f, ajVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(q.a(jsonReader, eVar, f, ajVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(q.a(jsonReader, eVar, f, ajVar, false));
            }
        }
        jsonReader.endObject();
        e(arrayList);
        return arrayList;
    }

    public static <T> void e(List<? extends a<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            a aVar = (a) list.get(i2);
            i2++;
            a aVar2 = (a) list.get(i2);
            aVar.km = Float.valueOf(aVar2.dw);
            if (aVar.kk == null && aVar2.kj != null) {
                aVar.kk = aVar2.kj;
                if (aVar instanceof h) {
                    ((h) aVar).aY();
                }
            }
        }
        a aVar3 = (a) list.get(i);
        if ((aVar3.kj == null || aVar3.kk == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
