package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a;

/* compiled from: PathKeyframe */
public class h extends a<PointF> {
    @Nullable
    private Path fb;
    private final a<PointF> gu;

    public h(e eVar, a<PointF> aVar) {
        super(eVar, aVar.kj, aVar.kk, aVar.kl, aVar.dw, aVar.km);
        this.gu = aVar;
        aY();
    }

    public void aY() {
        Object obj = (this.kk == null || this.kj == null || !((PointF) this.kj).equals(((PointF) this.kk).x, ((PointF) this.kk).y)) ? null : 1;
        if (this.kk != null && obj == null) {
            this.fb = com.airbnb.lottie.d.h.b((PointF) this.kj, (PointF) this.kk, this.gu.kt, this.gu.ku);
        }
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public Path getPath() {
        return this.fb;
    }
}
