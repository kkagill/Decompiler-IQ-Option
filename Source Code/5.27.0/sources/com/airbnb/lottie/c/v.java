package com.airbnb.lottie.c;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.MergePaths.MergePathsMode;

/* compiled from: MergePathsParser */
class v {
    static MergePaths e(JsonReader jsonReader) {
        String str = null;
        MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 3324) {
                if (hashCode != 3488) {
                    if (hashCode == 3519 && nextName.equals("nm")) {
                        i = 0;
                    }
                } else if (nextName.equals("mm")) {
                    i = 1;
                }
            } else if (nextName.equals("hd")) {
                i = 2;
            }
            if (i == 0) {
                str = jsonReader.nextString();
            } else if (i == 1) {
                mergePathsMode = MergePathsMode.forId(jsonReader.nextInt());
            } else if (i != 2) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
