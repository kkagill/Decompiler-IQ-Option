package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.g;

/* compiled from: NullLayer */
public class d extends a {
    /* Access modifiers changed, original: 0000 */
    public void b(Canvas canvas, Matrix matrix, int i) {
    }

    d(g gVar, Layer layer) {
        super(gVar, layer);
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
