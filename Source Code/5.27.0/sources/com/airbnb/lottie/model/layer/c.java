package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.d.h;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;

/* compiled from: ImageLayer */
public class c extends a {
    private final Paint fh = new a(3);
    @Nullable
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> fm;
    private final Rect jd = new Rect();
    private final Rect je = new Rect();

    c(g gVar, Layer layer) {
        super(gVar, layer);
    }

    public void b(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap = getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            float cP = h.cP();
            this.fh.setAlpha(i);
            com.airbnb.lottie.a.b.a aVar = this.fm;
            if (aVar != null) {
                this.fh.setColorFilter((ColorFilter) aVar.getValue());
            }
            canvas.save();
            canvas.concat(matrix);
            this.jd.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.je.set(0, 0, (int) (((float) bitmap.getWidth()) * cP), (int) (((float) bitmap.getHeight()) * cP));
            canvas.drawBitmap(bitmap, this.jd, this.je, this.fh);
            canvas.restore();
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            rectF.set(0.0f, 0.0f, ((float) bitmap.getWidth()) * h.cP(), ((float) bitmap.getHeight()) * h.cP());
            this.iP.mapRect(rectF);
        }
    }

    @Nullable
    private Bitmap getBitmap() {
        return this.cW.p(this.iQ.cp());
    }

    public <T> void a(T t, @Nullable com.airbnb.lottie.e.c<T> cVar) {
        super.a((Object) t, (com.airbnb.lottie.e.c) cVar);
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
