package com.airbnb.lottie.a.b;

import com.airbnb.lottie.d.g;
import com.airbnb.lottie.e.a;
import com.airbnb.lottie.e.d;
import java.util.List;

/* compiled from: ScaleKeyframeAnimation */
public class k extends f<d> {
    private final d gz = new d();

    public k(List<a<d>> list) {
        super(list);
    }

    /* renamed from: h */
    public d a(a<d> aVar, float f) {
        if (aVar.kj == null || aVar.kk == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        d dVar = (d) aVar.kj;
        d dVar2 = (d) aVar.kk;
        if (this.gi != null) {
            d dVar3 = (d) this.gi.b(aVar.dw, aVar.km.floatValue(), dVar, dVar2, f, aQ(), getProgress());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        this.gz.set(g.lerp(dVar.getScaleX(), dVar2.getScaleX(), f), g.lerp(dVar.getScaleY(), dVar2.getScaleY(), f));
        return this.gz;
    }
}
