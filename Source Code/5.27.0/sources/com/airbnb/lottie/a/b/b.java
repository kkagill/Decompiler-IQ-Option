package com.airbnb.lottie.a.b;

import com.airbnb.lottie.d.g;
import com.airbnb.lottie.e.a;
import java.util.List;

/* compiled from: ColorKeyframeAnimation */
public class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: b */
    public Integer a(a<Integer> aVar, float f) {
        return Integer.valueOf(c(aVar, f));
    }

    public int c(a<Integer> aVar, float f) {
        if (aVar.kj == null || aVar.kk == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) aVar.kj).intValue();
        int intValue2 = ((Integer) aVar.kk).intValue();
        if (this.gi != null) {
            Integer num = (Integer) this.gi.b(aVar.dw, aVar.km.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, aQ(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        }
        return com.airbnb.lottie.d.b.a(g.clamp(f, 0.0f, 1.0f), intValue, intValue2);
    }

    public int getIntValue() {
        return c(aP(), aR());
    }
}
