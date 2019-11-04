package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.a.a.l;
import com.airbnb.lottie.d.d;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.layer.a;

public class MergePaths implements b {
    private final boolean fq;
    private final MergePathsMode ij;
    private final String name;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.name = str;
        this.ij = mergePathsMode;
        this.fq = z;
    }

    public String getName() {
        return this.name;
    }

    public MergePathsMode bQ() {
        return this.ij;
    }

    public boolean isHidden() {
        return this.fq;
    }

    @Nullable
    public c a(g gVar, a aVar) {
        if (gVar.as()) {
            return new l(this);
        }
        d.warning("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MergePaths{mode=");
        stringBuilder.append(this.ij);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
