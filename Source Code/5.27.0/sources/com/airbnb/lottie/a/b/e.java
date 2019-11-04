package com.airbnb.lottie.a.b;

import com.airbnb.lottie.d.g;
import com.airbnb.lottie.e.a;
import java.util.List;

/* compiled from: IntegerKeyframeAnimation */
public class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: b */
    public Integer a(a<Integer> aVar, float f) {
        return Integer.valueOf(c(aVar, f));
    }

    /* Access modifiers changed, original: 0000 */
    public int c(a<Integer> aVar, float f) {
        if (aVar.kj == null || aVar.kk == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.gi != null) {
            Integer num = (Integer) this.gi.b(aVar.dw, aVar.km.floatValue(), aVar.kj, aVar.kk, f, aQ(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        }
        return g.b(aVar.cS(), aVar.cT(), f);
    }

    public int getIntValue() {
        return c(aP(), aR());
    }
}
