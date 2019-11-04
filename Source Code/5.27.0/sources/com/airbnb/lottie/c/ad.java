package com.airbnb.lottie.c;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.d.g;
import com.airbnb.lottie.model.a;
import com.airbnb.lottie.model.content.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeDataParser */
public class ad implements aj<h> {
    public static final ad jS = new ad();

    private ad() {
    }

    /* renamed from: m */
    public h b(JsonReader jsonReader, float f) {
        int i;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List list = null;
        List list2 = null;
        List list3 = list2;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 105) {
                    if (hashCode != 111) {
                        if (hashCode == 118 && nextName.equals("v")) {
                            i = 1;
                        }
                    } else if (nextName.equals("o")) {
                        i = 3;
                    }
                } else if (nextName.equals("i")) {
                    i = 2;
                }
            } else if (nextName.equals("c")) {
                i = 0;
            }
            if (i == 0) {
                z = jsonReader.nextBoolean();
            } else if (i == 1) {
                list = p.f(jsonReader, f);
            } else if (i == 2) {
                list2 = p.f(jsonReader, f);
            } else if (i == 3) {
                list3 = p.f(jsonReader, f);
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new h(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new a(g.b((PointF) list.get(i2), (PointF) list3.get(i2)), g.b(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                size--;
                arrayList.add(new a(g.b((PointF) list.get(size), (PointF) list3.get(size)), g.b(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new h(pointF, z, arrayList);
        }
    }
}
