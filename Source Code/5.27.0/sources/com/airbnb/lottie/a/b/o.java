package com.airbnb.lottie.a.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.e.d;
import com.airbnb.lottie.model.a.l;
import com.airbnb.lottie.model.layer.a;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation */
public class o {
    private final Matrix gE;
    private final Matrix gF;
    private final Matrix gG;
    private final float[] gH;
    @NonNull
    private a<PointF, PointF> gI;
    @NonNull
    private a<?, PointF> gJ;
    @NonNull
    private a<d, d> gK;
    @NonNull
    private a<Float, Float> gL;
    @NonNull
    private a<Integer, Integer> gM;
    @Nullable
    private c gN;
    @Nullable
    private c gO;
    @Nullable
    private a<?, Float> gP;
    @Nullable
    private a<?, Float> gQ;
    private final Matrix matrix = new Matrix();

    public o(l lVar) {
        this.gI = lVar.br() == null ? null : lVar.br().bn();
        this.gJ = lVar.bs() == null ? null : lVar.bs().bn();
        this.gK = lVar.bt() == null ? null : lVar.bt().bn();
        this.gL = lVar.bu() == null ? null : lVar.bu().bn();
        this.gN = lVar.by() == null ? null : (c) lVar.by().bn();
        if (this.gN != null) {
            this.gE = new Matrix();
            this.gF = new Matrix();
            this.gG = new Matrix();
            this.gH = new float[9];
        } else {
            this.gE = null;
            this.gF = null;
            this.gG = null;
            this.gH = null;
        }
        this.gO = lVar.bz() == null ? null : (c) lVar.bz().bn();
        if (lVar.bv() != null) {
            this.gM = lVar.bv().bn();
        }
        if (lVar.bw() != null) {
            this.gP = lVar.bw().bn();
        } else {
            this.gP = null;
        }
        if (lVar.bx() != null) {
            this.gQ = lVar.bx().bn();
        } else {
            this.gQ = null;
        }
    }

    public void a(a aVar) {
        aVar.a(this.gM);
        aVar.a(this.gP);
        aVar.a(this.gQ);
        aVar.a(this.gI);
        aVar.a(this.gJ);
        aVar.a(this.gK);
        aVar.a(this.gL);
        aVar.a(this.gN);
        aVar.a(this.gO);
    }

    public void a(a.a aVar) {
        a aVar2 = this.gM;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
        aVar2 = this.gP;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
        aVar2 = this.gQ;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
        aVar2 = this.gI;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
        aVar2 = this.gJ;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
        aVar2 = this.gK;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
        aVar2 = this.gL;
        if (aVar2 != null) {
            aVar2.b(aVar);
        }
        c cVar = this.gN;
        if (cVar != null) {
            cVar.b(aVar);
        }
        cVar = this.gO;
        if (cVar != null) {
            cVar.b(aVar);
        }
    }

    public void setProgress(float f) {
        a aVar = this.gM;
        if (aVar != null) {
            aVar.setProgress(f);
        }
        aVar = this.gP;
        if (aVar != null) {
            aVar.setProgress(f);
        }
        aVar = this.gQ;
        if (aVar != null) {
            aVar.setProgress(f);
        }
        aVar = this.gI;
        if (aVar != null) {
            aVar.setProgress(f);
        }
        aVar = this.gJ;
        if (aVar != null) {
            aVar.setProgress(f);
        }
        aVar = this.gK;
        if (aVar != null) {
            aVar.setProgress(f);
        }
        aVar = this.gL;
        if (aVar != null) {
            aVar.setProgress(f);
        }
        c cVar = this.gN;
        if (cVar != null) {
            cVar.setProgress(f);
        }
        cVar = this.gO;
        if (cVar != null) {
            cVar.setProgress(f);
        }
    }

    @Nullable
    public a<?, Integer> ba() {
        return this.gM;
    }

    @Nullable
    public a<?, Float> bb() {
        return this.gP;
    }

    @Nullable
    public a<?, Float> bc() {
        return this.gQ;
    }

    public Matrix getMatrix() {
        PointF pointF;
        float floatValue;
        this.matrix.reset();
        a aVar = this.gJ;
        if (aVar != null) {
            pointF = (PointF) aVar.getValue();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.matrix.preTranslate(pointF.x, pointF.y);
            }
        }
        aVar = this.gL;
        if (aVar != null) {
            if (aVar instanceof p) {
                floatValue = ((Float) aVar.getValue()).floatValue();
            } else {
                floatValue = ((c) aVar).aU();
            }
            if (floatValue != 0.0f) {
                this.matrix.preRotate(floatValue);
            }
        }
        if (this.gN != null) {
            c cVar = this.gO;
            floatValue = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.aU()) + 90.0f)));
            c cVar2 = this.gO;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.aU()) + 90.0f)));
            float tan = (float) Math.tan(Math.toRadians((double) this.gN.aU()));
            bd();
            float[] fArr = this.gH;
            fArr[0] = floatValue;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = floatValue;
            fArr[8] = 1.0f;
            this.gE.setValues(fArr);
            bd();
            fArr = this.gH;
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            this.gF.setValues(fArr);
            bd();
            float[] fArr2 = this.gH;
            fArr2[0] = floatValue;
            fArr2[1] = f;
            fArr2[3] = sin;
            fArr2[4] = floatValue;
            fArr2[8] = 1.0f;
            this.gG.setValues(fArr2);
            this.gF.preConcat(this.gE);
            this.gG.preConcat(this.gF);
            this.matrix.preConcat(this.gG);
        }
        aVar = this.gK;
        if (aVar != null) {
            d dVar = (d) aVar.getValue();
            if (!(dVar.getScaleX() == 1.0f && dVar.getScaleY() == 1.0f)) {
                this.matrix.preScale(dVar.getScaleX(), dVar.getScaleY());
            }
        }
        aVar = this.gI;
        if (aVar != null) {
            pointF = (PointF) aVar.getValue();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.matrix.preTranslate(-pointF.x, -pointF.y);
            }
        }
        return this.matrix;
    }

    private void bd() {
        for (int i = 0; i < 9; i++) {
            this.gH[i] = 0.0f;
        }
    }

    public Matrix e(float f) {
        a aVar = this.gJ;
        PointF pointF = null;
        PointF pointF2 = aVar == null ? null : (PointF) aVar.getValue();
        a aVar2 = this.gK;
        d dVar = aVar2 == null ? null : (d) aVar2.getValue();
        this.matrix.reset();
        if (pointF2 != null) {
            this.matrix.preTranslate(pointF2.x * f, pointF2.y * f);
        }
        if (dVar != null) {
            double d = (double) f;
            this.matrix.preScale((float) Math.pow((double) dVar.getScaleX(), d), (float) Math.pow((double) dVar.getScaleY(), d));
        }
        aVar = this.gL;
        if (aVar != null) {
            float floatValue = ((Float) aVar.getValue()).floatValue();
            aVar2 = this.gI;
            if (aVar2 != null) {
                pointF = (PointF) aVar2.getValue();
            }
            Matrix matrix = this.matrix;
            floatValue *= f;
            f = 0.0f;
            float f2 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f = pointF.y;
            }
            matrix.preRotate(floatValue, f2, f);
        }
        return this.matrix;
    }

    public <T> boolean b(T t, @Nullable c<T> cVar) {
        a aVar;
        if (t == com.airbnb.lottie.l.eq) {
            aVar = this.gI;
            if (aVar == null) {
                this.gI = new p(cVar, new PointF());
            } else {
                aVar.a(cVar);
            }
        } else if (t == com.airbnb.lottie.l.er) {
            aVar = this.gJ;
            if (aVar == null) {
                this.gJ = new p(cVar, new PointF());
            } else {
                aVar.a(cVar);
            }
        } else if (t == com.airbnb.lottie.l.ew) {
            aVar = this.gK;
            if (aVar == null) {
                this.gK = new p(cVar, new d());
            } else {
                aVar.a(cVar);
            }
        } else if (t == com.airbnb.lottie.l.ex) {
            aVar = this.gL;
            if (aVar == null) {
                this.gL = new p(cVar, Float.valueOf(0.0f));
            } else {
                aVar.a(cVar);
            }
        } else if (t == com.airbnb.lottie.l.eo) {
            aVar = this.gM;
            if (aVar == null) {
                this.gM = new p(cVar, Integer.valueOf(100));
            } else {
                aVar.a(cVar);
            }
        } else {
            a aVar2;
            if (t == com.airbnb.lottie.l.eK) {
                aVar2 = this.gP;
                if (aVar2 != null) {
                    if (aVar2 == null) {
                        this.gP = new p(cVar, Integer.valueOf(100));
                    } else {
                        aVar2.a(cVar);
                    }
                }
            }
            if (t == com.airbnb.lottie.l.eL) {
                aVar2 = this.gQ;
                if (aVar2 != null) {
                    if (aVar2 == null) {
                        this.gQ = new p(cVar, Integer.valueOf(100));
                    } else {
                        aVar2.a(cVar);
                    }
                }
            }
            if (t == com.airbnb.lottie.l.ey) {
                c cVar2 = this.gN;
                if (cVar2 != null) {
                    if (cVar2 == null) {
                        this.gN = new c(Collections.singletonList(new com.airbnb.lottie.e.a(Float.valueOf(0.0f))));
                    }
                    this.gN.a(cVar);
                }
            }
            if (t == com.airbnb.lottie.l.ez) {
                c cVar3 = this.gO;
                if (cVar3 != null) {
                    if (cVar3 == null) {
                        this.gO = new c(Collections.singletonList(new com.airbnb.lottie.e.a(Float.valueOf(0.0f))));
                    }
                    this.gO.a(cVar);
                }
            }
            return false;
        }
        return true;
    }
}
