package com.airbnb.lottie.c;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.d.h;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.e;
import com.airbnb.lottie.model.a.i;
import com.airbnb.lottie.model.a.m;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser */
public class a {
    public static e a(JsonReader jsonReader, com.airbnb.lottie.e eVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(w.s(jsonReader, eVar));
            }
            jsonReader.endArray();
            r.e(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.e.a(p.g(jsonReader, h.cP())));
        }
        return new e(arrayList);
    }

    static m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.e eVar) {
        jsonReader.beginObject();
        m<PointF, PointF> mVar = null;
        b bVar = mVar;
        b bVar2 = bVar;
        Object obj = null;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            int i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 107) {
                if (hashCode != 120) {
                    if (hashCode == 121 && nextName.equals("y")) {
                        i = 2;
                    }
                } else if (nextName.equals("x")) {
                    i = 1;
                }
            } else if (nextName.equals("k")) {
                i = 0;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        jsonReader.skipValue();
                    } else if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                    } else {
                        bVar2 = d.f(jsonReader, eVar);
                    }
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    jsonReader.skipValue();
                } else {
                    bVar = d.f(jsonReader, eVar);
                }
                obj = 1;
            } else {
                mVar = a(jsonReader, eVar);
            }
        }
        jsonReader.endObject();
        if (obj != null) {
            eVar.l("Lottie doesn't support expressions.");
        }
        if (mVar != null) {
            return mVar;
        }
        return new i(bVar, bVar2);
    }
}
