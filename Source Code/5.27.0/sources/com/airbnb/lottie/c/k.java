package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.model.b;

/* compiled from: FontParser */
class k {
    static b a(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = str2;
        float f = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = -1;
            switch (nextName.hashCode()) {
                case -1866931350:
                    if (nextName.equals("fFamily")) {
                        i = 0;
                        break;
                    }
                    break;
                case -1408684838:
                    if (nextName.equals("ascent")) {
                        i = 3;
                        break;
                    }
                    break;
                case -1294566165:
                    if (nextName.equals("fStyle")) {
                        i = 2;
                        break;
                    }
                    break;
                case 96619537:
                    if (nextName.equals("fName")) {
                        i = 1;
                        break;
                    }
                    break;
            }
            if (i == 0) {
                str = jsonReader.nextString();
            } else if (i == 1) {
                str2 = jsonReader.nextString();
            } else if (i == 2) {
                str3 = jsonReader.nextString();
            } else if (i != 3) {
                jsonReader.skipValue();
            } else {
                f = (float) jsonReader.nextDouble();
            }
        }
        jsonReader.endObject();
        return new b(str, str2, str3, f);
    }
}
