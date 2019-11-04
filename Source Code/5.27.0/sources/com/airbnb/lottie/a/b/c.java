package com.airbnb.lottie.a.b;

import com.airbnb.lottie.d.g;
import com.airbnb.lottie.e.a;
import java.util.List;

/* compiled from: FloatKeyframeAnimation */
public class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: d */
    public Float a(a<Float> aVar, float f) {
        return Float.valueOf(e(aVar, f));
    }

    /* Access modifiers changed, original: 0000 */
    public float e(a<Float> aVar, float f) {
        if (aVar.kj == null || aVar.kk == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.gi != null) {
            Float f2 = (Float) this.gi.b(aVar.dw, aVar.km.floatValue(), aVar.kj, aVar.kk, f, aQ(), getProgress());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return g.lerp(aVar.cQ(), aVar.cR(), f);
    }

    public float aU() {
        return e(aP(), aR());
    }
}
