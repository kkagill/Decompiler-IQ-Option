package com.airbnb.lottie.c;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.ColorInt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils */
class p {

    /* compiled from: JsonUtils */
    /* renamed from: com.airbnb.lottie.c.p$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jN = new int[JsonToken.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = android.util.JsonToken.values();
            r0 = r0.length;
            r0 = new int[r0];
            jN = r0;
            r0 = jN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.util.JsonToken.NUMBER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = jN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.util.JsonToken.BEGIN_ARRAY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = jN;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.util.JsonToken.BEGIN_OBJECT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.p$AnonymousClass1.<clinit>():void");
        }
    }

    @ColorInt
    static int b(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static List<PointF> f(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(g(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    static PointF g(JsonReader jsonReader, float f) {
        int i = AnonymousClass1.jN[jsonReader.peek().ordinal()];
        if (i == 1) {
            return h(jsonReader, f);
        }
        if (i == 2) {
            return i(jsonReader, f);
        }
        if (i == 3) {
            return j(jsonReader, f);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown point starts with ");
        stringBuilder.append(jsonReader.peek());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static PointF h(JsonReader jsonReader, float f) {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF i(JsonReader jsonReader, float f) {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF j(JsonReader jsonReader, float f) {
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 120) {
                if (hashCode == 121 && nextName.equals("y")) {
                    i = 1;
                }
            } else if (nextName.equals("x")) {
                i = 0;
            }
            if (i == 0) {
                f2 = c(jsonReader);
            } else if (i != 1) {
                jsonReader.skipValue();
            } else {
                f3 = c(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f2 * f, f3 * f);
    }

    static float c(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i = AnonymousClass1.jN[peek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i == 2) {
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return nextDouble;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown value for token of type ");
        stringBuilder.append(peek);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
