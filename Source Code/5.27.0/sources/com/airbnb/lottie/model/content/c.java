package com.airbnb.lottie.model.content;

import com.airbnb.lottie.d.b;
import com.airbnb.lottie.d.g;

/* compiled from: GradientColor */
public class c {
    private final float[] hQ;
    private final int[] hR;

    public c(float[] fArr, int[] iArr) {
        this.hQ = fArr;
        this.hR = iArr;
    }

    public float[] bD() {
        return this.hQ;
    }

    public int[] getColors() {
        return this.hR;
    }

    public int getSize() {
        return this.hR.length;
    }

    public void a(c cVar, c cVar2, float f) {
        if (cVar.hR.length == cVar2.hR.length) {
            for (int i = 0; i < cVar.hR.length; i++) {
                this.hQ[i] = g.lerp(cVar.hQ[i], cVar2.hQ[i], f);
                this.hR[i] = b.a(f, cVar.hR[i], cVar2.hR[i]);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot interpolate between gradients. Lengths vary (");
        stringBuilder.append(cVar.hR.length);
        stringBuilder.append(" vs ");
        stringBuilder.append(cVar2.hR.length);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
