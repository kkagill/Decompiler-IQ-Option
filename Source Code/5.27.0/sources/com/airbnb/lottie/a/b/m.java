package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.a.a;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation */
public class m extends a<PointF, PointF> {
    private final a<Float, Float> gC;
    private final a<Float, Float> gD;
    private final PointF gv = new PointF();

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.gC = aVar;
        this.gD = aVar2;
        setProgress(getProgress());
    }

    public void setProgress(float f) {
        this.gC.setProgress(f);
        this.gD.setProgress(f);
        this.gv.set(((Float) this.gC.getValue()).floatValue(), ((Float) this.gD.getValue()).floatValue());
        for (int i = 0; i < this.gb.size(); i++) {
            ((a) this.gb.get(i)).aB();
        }
    }

    /* renamed from: aZ */
    public PointF getValue() {
        return a(null, 0.0f);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: g */
    public PointF a(com.airbnb.lottie.e.a<PointF> aVar, float f) {
        return this.gv;
    }
}
