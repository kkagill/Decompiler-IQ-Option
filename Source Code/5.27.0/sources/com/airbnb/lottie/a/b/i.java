package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.e.a;
import java.util.List;

/* compiled from: PathKeyframeAnimation */
public class i extends f<PointF> {
    private final PointF gv = new PointF();
    private final float[] gw = new float[2];
    private h gx;
    private PathMeasure gy = new PathMeasure();

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    /* renamed from: g */
    public PointF a(a<PointF> aVar, float f) {
        h hVar = (h) aVar;
        Path path = hVar.getPath();
        if (path == null) {
            return (PointF) aVar.kj;
        }
        PointF pointF;
        if (this.gi != null) {
            pointF = (PointF) this.gi.b(hVar.dw, hVar.km.floatValue(), hVar.kj, hVar.kk, aQ(), f, getProgress());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.gx != hVar) {
            this.gy.setPath(path, false);
            this.gx = hVar;
        }
        PathMeasure pathMeasure = this.gy;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.gw, null);
        pointF = this.gv;
        float[] fArr = this.gw;
        pointF.set(fArr[0], fArr[1]);
        return this.gv;
    }
}
