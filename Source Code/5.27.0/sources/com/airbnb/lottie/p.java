package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import com.airbnb.lottie.d.f;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker */
public class p {
    private final Set<a> eU = new ArraySet();
    private final Map<String, f> eV = new HashMap();
    private final Comparator<Pair<String, Float>> eW = new Comparator<Pair<String, Float>>() {
        /* renamed from: a */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };
    private boolean enabled = false;

    /* compiled from: PerformanceTracker */
    public interface a {
        void d(float f);
    }

    /* Access modifiers changed, original: 0000 */
    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void a(String str, float f) {
        if (this.enabled) {
            f fVar = (f) this.eV.get(str);
            if (fVar == null) {
                fVar = new f();
                this.eV.put(str, fVar);
            }
            fVar.j(f);
            if (str.equals("__container")) {
                for (a d : this.eU) {
                    d.d(f);
                }
            }
        }
    }
}
