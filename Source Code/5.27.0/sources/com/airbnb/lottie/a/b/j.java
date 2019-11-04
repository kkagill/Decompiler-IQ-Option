package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.e.a;
import java.util.List;

/* compiled from: PointKeyframeAnimation */
public class j extends f<PointF> {
    private final PointF gv = new PointF();

    public j(List<a<PointF>> list) {
        super(list);
    }

    /* renamed from: g */
    public PointF a(a<PointF> aVar, float f) {
        if (aVar.kj == null || aVar.kk == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) aVar.kj;
        PointF pointF2 = (PointF) aVar.kk;
        if (this.gi != null) {
            PointF pointF3 = (PointF) this.gi.b(aVar.dw, aVar.km.floatValue(), pointF, pointF2, f, aQ(), getProgress());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.gv.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.gv;
    }
}
