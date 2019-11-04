package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.c;
import com.airbnb.lottie.model.content.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent */
public class h implements e, k, a {
    private final g cW;
    private final LongSparseArray<LinearGradient> fA = new LongSparseArray();
    private final LongSparseArray<RadialGradient> fB = new LongSparseArray();
    private final Matrix fC = new Matrix();
    private final RectF fD = new RectF();
    private final GradientType fE;
    private final com.airbnb.lottie.a.b.a<PointF, PointF> fF;
    private final com.airbnb.lottie.a.b.a<PointF, PointF> fG;
    @Nullable
    private p fH;
    private final int fI;
    private final Path fb = new Path();
    private final com.airbnb.lottie.model.layer.a fe;
    private final Paint fh = new com.airbnb.lottie.a.a(1);
    private final com.airbnb.lottie.a.b.a<Integer, Integer> fj;
    @Nullable
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> fm;
    private final List<m> fn = new ArrayList();
    private final boolean fq;
    private final com.airbnb.lottie.a.b.a<c, c> fz;
    @NonNull
    private final String name;

    public h(g gVar, com.airbnb.lottie.model.layer.a aVar, d dVar) {
        this.fe = aVar;
        this.name = dVar.getName();
        this.fq = dVar.isHidden();
        this.cW = gVar;
        this.fE = dVar.bE();
        this.fb.setFillType(dVar.getFillType());
        this.fI = (int) (gVar.getComposition().ai() / 32.0f);
        this.fz = dVar.bF().bn();
        this.fz.b(this);
        aVar.a(this.fz);
        this.fj = dVar.bv().bn();
        this.fj.b(this);
        aVar.a(this.fj);
        this.fF = dVar.bG().bn();
        this.fF.b(this);
        aVar.a(this.fF);
        this.fG = dVar.bH().bn();
        this.fG.b(this);
        aVar.a(this.fG);
    }

    public void aB() {
        this.cW.invalidateSelf();
    }

    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof m) {
                this.fn.add((m) cVar);
            }
        }
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.fq) {
            Shader aE;
            String str = "GradientFillContent#draw";
            com.airbnb.lottie.d.beginSection(str);
            this.fb.reset();
            for (int i2 = 0; i2 < this.fn.size(); i2++) {
                this.fb.addPath(((m) this.fn.get(i2)).getPath(), matrix);
            }
            this.fb.computeBounds(this.fD, false);
            if (this.fE == GradientType.LINEAR) {
                aE = aE();
            } else {
                aE = aF();
            }
            this.fC.set(matrix);
            aE.setLocalMatrix(this.fC);
            this.fh.setShader(aE);
            com.airbnb.lottie.a.b.a aVar = this.fm;
            if (aVar != null) {
                this.fh.setColorFilter((ColorFilter) aVar.getValue());
            }
            this.fh.setAlpha(com.airbnb.lottie.d.g.clamp((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.fj.getValue()).intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.fb, this.fh);
            com.airbnb.lottie.d.k(str);
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.fb.reset();
        for (int i = 0; i < this.fn.size(); i++) {
            this.fb.addPath(((m) this.fn.get(i)).getPath(), matrix);
        }
        this.fb.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public String getName() {
        return this.name;
    }

    private LinearGradient aE() {
        long aG = (long) aG();
        LinearGradient linearGradient = (LinearGradient) this.fA.get(aG);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.fF.getValue();
        PointF pointF2 = (PointF) this.fG.getValue();
        c cVar = (c) this.fz.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, a(cVar.getColors()), cVar.bD(), TileMode.CLAMP);
        this.fA.put(aG, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient aF() {
        long aG = (long) aG();
        RadialGradient radialGradient = (RadialGradient) this.fB.get(aG);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.fF.getValue();
        PointF pointF2 = (PointF) this.fG.getValue();
        c cVar = (c) this.fz.getValue();
        int[] a = a(cVar.getColors());
        float[] bD = cVar.bD();
        float f = pointF.x;
        float f2 = pointF.y;
        float hypot = (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2));
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, a, bD, TileMode.CLAMP);
        this.fB.put(aG, radialGradient2);
        return radialGradient2;
    }

    private int aG() {
        int round = Math.round(this.fF.getProgress() * ((float) this.fI));
        int round2 = Math.round(this.fG.getProgress() * ((float) this.fI));
        int round3 = Math.round(this.fz.getProgress() * ((float) this.fI));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = (i * 31) * round2;
        }
        return round3 != 0 ? (i * 31) * round3 : i;
    }

    private int[] a(int[] iArr) {
        p pVar = this.fH;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public void a(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.d.g.a(dVar, i, list, dVar2, this);
    }

    public <T> void a(T t, @Nullable com.airbnb.lottie.e.c<T> cVar) {
        if (t == l.ep) {
            this.fj.a(cVar);
        } else if (t == l.eN) {
            if (cVar == null) {
                this.fm = null;
                return;
            }
            this.fm = new p(cVar);
            this.fm.b(this);
            this.fe.a(this.fm);
        } else if (t != l.eO) {
        } else {
            if (cVar == null) {
                com.airbnb.lottie.a.b.a aVar = this.fH;
                if (aVar != null) {
                    this.fe.b(aVar);
                }
                this.fH = null;
                return;
            }
            this.fH = new p(cVar);
            this.fH.b(this);
            this.fe.a(this.fH);
        }
    }
}
