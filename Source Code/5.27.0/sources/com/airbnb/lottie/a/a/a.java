package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.b.c;
import com.airbnb.lottie.a.b.e;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.d.h;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.a.b;
import com.airbnb.lottie.model.a.d;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent */
public abstract class a implements e, k, com.airbnb.lottie.a.b.a.a {
    private final g cW;
    private final PathMeasure fa = new PathMeasure();
    private final Path fb = new Path();
    private final Path fc = new Path();
    private final RectF fd = new RectF();
    protected final com.airbnb.lottie.model.layer.a fe;
    private final List<a> ff = new ArrayList();
    private final float[] fg;
    final Paint fh = new com.airbnb.lottie.a.a(1);
    private final com.airbnb.lottie.a.b.a<?, Float> fi;
    private final com.airbnb.lottie.a.b.a<?, Integer> fj;
    private final List<com.airbnb.lottie.a.b.a<?, Float>> fk;
    @Nullable
    private final com.airbnb.lottie.a.b.a<?, Float> fl;
    @Nullable
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> fm;

    /* compiled from: BaseStrokeContent */
    private static final class a {
        private final List<m> fn;
        @Nullable
        private final s fo;

        private a(@Nullable s sVar) {
            this.fn = new ArrayList();
            this.fo = sVar;
        }
    }

    a(g gVar, com.airbnb.lottie.model.layer.a aVar, Cap cap, Join join, float f, d dVar, b bVar, List<b> list, b bVar2) {
        int i;
        this.cW = gVar;
        this.fe = aVar;
        this.fh.setStyle(Style.STROKE);
        this.fh.setStrokeCap(cap);
        this.fh.setStrokeJoin(join);
        this.fh.setStrokeMiter(f);
        this.fj = dVar.bn();
        this.fi = bVar.bn();
        if (bVar2 == null) {
            this.fl = null;
        } else {
            this.fl = bVar2.bn();
        }
        this.fk = new ArrayList(list.size());
        this.fg = new float[list.size()];
        for (i = 0; i < list.size(); i++) {
            this.fk.add(((b) list.get(i)).bn());
        }
        aVar.a(this.fj);
        aVar.a(this.fi);
        for (i = 0; i < this.fk.size(); i++) {
            aVar.a((com.airbnb.lottie.a.b.a) this.fk.get(i));
        }
        com.airbnb.lottie.a.b.a aVar2 = this.fl;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
        this.fj.b(this);
        this.fi.b(this);
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((com.airbnb.lottie.a.b.a) this.fk.get(i2)).b(this);
        }
        com.airbnb.lottie.a.b.a aVar3 = this.fl;
        if (aVar3 != null) {
            aVar3.b(this);
        }
    }

    public void aB() {
        this.cW.invalidateSelf();
    }

    public void a(List<c> list, List<c> list2) {
        c cVar;
        s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            cVar = (c) list.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.aK() == Type.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.a(this);
        }
        Object obj = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            cVar = (c) list2.get(size2);
            if (cVar instanceof s) {
                s sVar3 = (s) cVar;
                if (sVar3.aK() == Type.INDIVIDUALLY) {
                    if (obj != null) {
                        this.ff.add(obj);
                    }
                    obj = new a(sVar3);
                    sVar3.a(this);
                }
            }
            if (cVar instanceof m) {
                if (obj == null) {
                    obj = new a(sVar);
                }
                obj.fn.add((m) cVar);
            }
        }
        if (obj != null) {
            this.ff.add(obj);
        }
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        String str = "StrokeContent#draw";
        com.airbnb.lottie.d.beginSection(str);
        if (h.c(matrix)) {
            com.airbnb.lottie.d.k(str);
            return;
        }
        int i2 = 0;
        this.fh.setAlpha(com.airbnb.lottie.d.g.clamp((int) ((((((float) i) / 255.0f) * ((float) ((e) this.fj).getIntValue())) / 100.0f) * 255.0f), 0, 255));
        this.fh.setStrokeWidth(((c) this.fi).aU() * h.b(matrix));
        if (this.fh.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.d.k(str);
            return;
        }
        a(matrix);
        com.airbnb.lottie.a.b.a aVar = this.fm;
        if (aVar != null) {
            this.fh.setColorFilter((ColorFilter) aVar.getValue());
        }
        while (i2 < this.ff.size()) {
            a aVar2 = (a) this.ff.get(i2);
            if (aVar2.fo != null) {
                a(canvas, aVar2, matrix);
            } else {
                String str2 = "StrokeContent#buildPath";
                com.airbnb.lottie.d.beginSection(str2);
                this.fb.reset();
                for (int size = aVar2.fn.size() - 1; size >= 0; size--) {
                    this.fb.addPath(((m) aVar2.fn.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.d.k(str2);
                String str3 = "StrokeContent#drawPath";
                com.airbnb.lottie.d.beginSection(str3);
                canvas.drawPath(this.fb, this.fh);
                com.airbnb.lottie.d.k(str3);
            }
            i2++;
        }
        com.airbnb.lottie.d.k(str);
    }

    private void a(Canvas canvas, a aVar, Matrix matrix) {
        String str = "StrokeContent#applyTrimPath";
        com.airbnb.lottie.d.beginSection(str);
        if (aVar.fo == null) {
            com.airbnb.lottie.d.k(str);
            return;
        }
        this.fb.reset();
        for (int size = aVar.fn.size() - 1; size >= 0; size--) {
            this.fb.addPath(((m) aVar.fn.get(size)).getPath(), matrix);
        }
        this.fa.setPath(this.fb, false);
        float length = this.fa.getLength();
        while (this.fa.nextContour()) {
            length += this.fa.getLength();
        }
        float floatValue = (((Float) aVar.fo.aN().getValue()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) aVar.fo.aL().getValue()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) aVar.fo.aM().getValue()).floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = aVar.fn.size() - 1; size2 >= 0; size2--) {
            float f2;
            this.fc.set(((m) aVar.fn.get(size2)).getPath());
            this.fc.transform(matrix);
            this.fa.setPath(this.fc, false);
            float length2 = this.fa.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                f2 = floatValue3 - length;
                if (f2 < f + length2 && f < f2) {
                    h.a(this.fc, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f2 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.fc, this.fh);
                    f += length2;
                }
            }
            f2 = f + length2;
            if (f2 >= floatValue2 && f <= floatValue3) {
                if (f2 > floatValue3 || floatValue2 >= f) {
                    float f4 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                    if (floatValue3 <= f2) {
                        f3 = (floatValue3 - f) / length2;
                    }
                    h.a(this.fc, f4, f3, 0.0f);
                    canvas.drawPath(this.fc, this.fh);
                } else {
                    canvas.drawPath(this.fc, this.fh);
                }
            }
            f += length2;
        }
        com.airbnb.lottie.d.k(str);
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        String str = "StrokeContent#getBounds";
        com.airbnb.lottie.d.beginSection(str);
        this.fb.reset();
        for (int i = 0; i < this.ff.size(); i++) {
            a aVar = (a) this.ff.get(i);
            for (int i2 = 0; i2 < aVar.fn.size(); i2++) {
                this.fb.addPath(((m) aVar.fn.get(i2)).getPath(), matrix);
            }
        }
        this.fb.computeBounds(this.fd, false);
        float aU = ((c) this.fi).aU();
        RectF rectF2 = this.fd;
        aU /= 2.0f;
        rectF2.set(rectF2.left - aU, this.fd.top - aU, this.fd.right + aU, this.fd.bottom + aU);
        rectF.set(this.fd);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.d.k(str);
    }

    private void a(Matrix matrix) {
        String str = "StrokeContent#applyDashPattern";
        com.airbnb.lottie.d.beginSection(str);
        if (this.fk.isEmpty()) {
            com.airbnb.lottie.d.k(str);
            return;
        }
        float b = h.b(matrix);
        for (int i = 0; i < this.fk.size(); i++) {
            float[] fArr;
            this.fg[i] = ((Float) ((com.airbnb.lottie.a.b.a) this.fk.get(i)).getValue()).floatValue();
            if (i % 2 == 0) {
                fArr = this.fg;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                fArr = this.fg;
                if (fArr[i] < 0.1f) {
                    fArr[i] = 0.1f;
                }
            }
            fArr = this.fg;
            fArr[i] = fArr[i] * b;
        }
        com.airbnb.lottie.a.b.a aVar = this.fl;
        this.fh.setPathEffect(new DashPathEffect(this.fg, aVar == null ? 0.0f : ((Float) aVar.getValue()).floatValue()));
        com.airbnb.lottie.d.k(str);
    }

    public void a(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.d.g.a(dVar, i, list, dVar2, this);
    }

    @CallSuper
    public <T> void a(T t, @Nullable com.airbnb.lottie.e.c<T> cVar) {
        if (t == l.ep) {
            this.fj.a(cVar);
        } else if (t == l.eA) {
            this.fi.a(cVar);
        } else if (t != l.eN) {
        } else {
            if (cVar == null) {
                this.fm = null;
                return;
            }
            this.fm = new p(cVar);
            this.fm.b(this);
            this.fe.a(this.fm);
        }
    }
}
