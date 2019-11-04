package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.c;
import com.airbnb.lottie.model.content.e;

/* compiled from: GradientStrokeContent */
public class i extends a {
    private final LongSparseArray<LinearGradient> fA = new LongSparseArray();
    private final LongSparseArray<RadialGradient> fB = new LongSparseArray();
    private final RectF fD = new RectF();
    private final GradientType fE;
    private final a<PointF, PointF> fF;
    private final a<PointF, PointF> fG;
    @Nullable
    private p fH;
    private final int fI;
    private final boolean fq;
    private final a<c, c> fz;
    private final String name;

    public i(g gVar, com.airbnb.lottie.model.layer.a aVar, e eVar) {
        super(gVar, aVar, eVar.bJ().toPaintCap(), eVar.bK().toPaintJoin(), eVar.bN(), eVar.bv(), eVar.bI(), eVar.bL(), eVar.bM());
        this.name = eVar.getName();
        this.fE = eVar.bE();
        this.fq = eVar.isHidden();
        this.fI = (int) (gVar.getComposition().ai() / 32.0f);
        this.fz = eVar.bF().bn();
        this.fz.b(this);
        aVar.a(this.fz);
        this.fF = eVar.bG().bn();
        this.fF.b(this);
        aVar.a(this.fF);
        this.fG = eVar.bH().bn();
        this.fG.b(this);
        aVar.a(this.fG);
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.fq) {
            Shader aE;
            a(this.fD, matrix, false);
            if (this.fE == GradientType.LINEAR) {
                aE = aE();
            } else {
                aE = aF();
            }
            this.fh.setShader(aE);
            super.a(canvas, matrix, i);
        }
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
        LinearGradient linearGradient2 = new LinearGradient((float) ((int) ((this.fD.left + (this.fD.width() / 2.0f)) + pointF.x)), (float) ((int) ((this.fD.top + (this.fD.height() / 2.0f)) + pointF.y)), (float) ((int) ((this.fD.left + (this.fD.width() / 2.0f)) + pointF2.x)), (float) ((int) ((this.fD.top + (this.fD.height() / 2.0f)) + pointF2.y)), a(cVar.getColors()), cVar.bD(), TileMode.CLAMP);
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
        int width = (int) ((this.fD.left + (this.fD.width() / 2.0f)) + pointF.x);
        int height = (int) ((this.fD.top + (this.fD.height() / 2.0f)) + pointF.y);
        float f = (float) width;
        float f2 = (float) height;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (((int) ((this.fD.left + (this.fD.width() / 2.0f)) + pointF2.x)) - width), (double) (((int) ((this.fD.top + (this.fD.height() / 2.0f)) + pointF2.y)) - height)), a, bD, TileMode.CLAMP);
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

    public <T> void a(T t, @Nullable com.airbnb.lottie.e.c<T> cVar) {
        super.a((Object) t, (com.airbnb.lottie.e.c) cVar);
        if (t != l.eO) {
            return;
        }
        if (cVar == null) {
            if (this.fH != null) {
                this.fe.b(this.fH);
            }
            this.fH = null;
            return;
        }
        this.fH = new p(cVar);
        this.fH.b(this);
        this.fe.a(this.fH);
    }
}
