package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;

/* compiled from: SolidLayer */
public class f extends a {
    private final Path fb = new Path();
    private final RectF fd = new RectF();
    private final Paint fh = new a();
    @Nullable
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> fm;
    private final Layer iQ;
    private final float[] points = new float[8];

    f(g gVar, Layer layer) {
        super(gVar, layer);
        this.iQ = layer;
        this.fh.setAlpha(0);
        this.fh.setStyle(Style.FILL);
        this.fh.setColor(layer.getSolidColor());
    }

    public void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.iQ.getSolidColor());
        if (alpha != 0) {
            i = (int) (((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.fY.ba() == null ? 100 : ((Integer) this.fY.ba().getValue()).intValue()))) / 100.0f)) * 255.0f);
            this.fh.setAlpha(i);
            com.airbnb.lottie.a.b.a aVar = this.fm;
            if (aVar != null) {
                this.fh.setColorFilter((ColorFilter) aVar.getValue());
            }
            if (i > 0) {
                float[] fArr = this.points;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.iQ.cw();
                fArr = this.points;
                fArr[3] = 0.0f;
                fArr[4] = (float) this.iQ.cw();
                this.points[5] = (float) this.iQ.cv();
                fArr = this.points;
                fArr[6] = 0.0f;
                fArr[7] = (float) this.iQ.cv();
                matrix.mapPoints(this.points);
                this.fb.reset();
                Path path = this.fb;
                fArr = this.points;
                path.moveTo(fArr[0], fArr[1]);
                path = this.fb;
                fArr = this.points;
                path.lineTo(fArr[2], fArr[3]);
                path = this.fb;
                fArr = this.points;
                path.lineTo(fArr[4], fArr[5]);
                path = this.fb;
                fArr = this.points;
                path.lineTo(fArr[6], fArr[7]);
                path = this.fb;
                fArr = this.points;
                path.lineTo(fArr[0], fArr[1]);
                this.fb.close();
                canvas.drawPath(this.fb, this.fh);
            }
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.fd.set(0.0f, 0.0f, (float) this.iQ.cw(), (float) this.iQ.cv());
        this.iP.mapRect(this.fd);
        rectF.set(this.fd);
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        super.a((Object) t, (c) cVar);
        if (t != l.eN) {
            return;
        }
        if (cVar == null) {
            this.fm = null;
        } else {
            this.fm = new p(cVar);
        }
    }
}
