package com.airbnb.lottie.model.a;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.m;
import com.airbnb.lottie.e.a;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue */
public class i implements m<PointF, PointF> {
    private final b hA;
    private final b hz;

    public i(b bVar, b bVar2) {
        this.hz = bVar;
        this.hA = bVar2;
    }

    public List<a<PointF>> bp() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean bo() {
        return this.hz.bo() && this.hA.bo();
    }

    public com.airbnb.lottie.a.b.a<PointF, PointF> bn() {
        return new m(this.hz.bn(), this.hA.bn());
    }
}
