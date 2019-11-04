package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.j;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer */
public class e extends a {
    private final d fZ;

    e(g gVar, Layer layer) {
        super(gVar, layer);
        this.fZ = new d(gVar, this, new j("__container", layer.bi(), false));
        this.fZ.a(Collections.emptyList(), Collections.emptyList());
    }

    /* Access modifiers changed, original: 0000 */
    public void b(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.fZ.a(canvas, matrix, i);
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.fZ.a(rectF, this.iP, z);
    }

    /* Access modifiers changed, original: protected */
    public void b(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        this.fZ.a(dVar, i, list, dVar2);
    }
}
