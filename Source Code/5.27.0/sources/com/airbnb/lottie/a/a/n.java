package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.PolystarShape.Type;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.d;
import java.util.List;

/* compiled from: PolystarContent */
public class n implements k, m, a {
    private final g cW;
    private final Type fN;
    private final com.airbnb.lottie.a.b.a<?, Float> fO;
    private final com.airbnb.lottie.a.b.a<?, Float> fP;
    @Nullable
    private final com.airbnb.lottie.a.b.a<?, Float> fQ;
    private final com.airbnb.lottie.a.b.a<?, Float> fR;
    @Nullable
    private final com.airbnb.lottie.a.b.a<?, Float> fS;
    private final com.airbnb.lottie.a.b.a<?, Float> fT;
    private final Path fb = new Path();
    private final boolean fq;
    private final com.airbnb.lottie.a.b.a<?, PointF> fu;
    private b fw = new b();
    private boolean fy;
    private final String name;

    /* compiled from: PolystarContent */
    /* renamed from: com.airbnb.lottie.a.a.n$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fU = new int[Type.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.airbnb.lottie.model.content.PolystarShape.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            fU = r0;
            r0 = fU;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.airbnb.lottie.model.content.PolystarShape.Type.STAR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fU;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.n$AnonymousClass1.<clinit>():void");
        }
    }

    public n(g gVar, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.cW = gVar;
        this.name = polystarShape.getName();
        this.fN = polystarShape.bR();
        this.fq = polystarShape.isHidden();
        this.fO = polystarShape.bS().bn();
        this.fu = polystarShape.bs().bn();
        this.fP = polystarShape.bu().bn();
        this.fR = polystarShape.bU().bn();
        this.fT = polystarShape.bW().bn();
        if (this.fN == Type.STAR) {
            this.fQ = polystarShape.bT().bn();
            this.fS = polystarShape.bV().bn();
        } else {
            this.fQ = null;
            this.fS = null;
        }
        aVar.a(this.fO);
        aVar.a(this.fu);
        aVar.a(this.fP);
        aVar.a(this.fR);
        aVar.a(this.fT);
        if (this.fN == Type.STAR) {
            aVar.a(this.fQ);
            aVar.a(this.fS);
        }
        this.fO.b(this);
        this.fu.b(this);
        this.fP.b(this);
        this.fR.b(this);
        this.fT.b(this);
        if (this.fN == Type.STAR) {
            this.fQ.b(this);
            this.fS.b(this);
        }
    }

    public void aB() {
        invalidate();
    }

    private void invalidate() {
        this.fy = false;
        this.cW.invalidateSelf();
    }

    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = (c) list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.aK() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.fw.a(sVar);
                    sVar.a(this);
                }
            }
        }
    }

    public Path getPath() {
        if (this.fy) {
            return this.fb;
        }
        this.fb.reset();
        if (this.fq) {
            this.fy = true;
            return this.fb;
        }
        int i = AnonymousClass1.fU[this.fN.ordinal()];
        if (i == 1) {
            aI();
        } else if (i == 2) {
            aJ();
        }
        this.fb.close();
        this.fw.a(this.fb);
        this.fy = true;
        return this.fb;
    }

    public String getName() {
        return this.name;
    }

    private void aI() {
        float f;
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        double cos;
        float floatValue = ((Float) this.fO.getValue()).floatValue();
        com.airbnb.lottie.a.b.a aVar = this.fP;
        double toRadians = Math.toRadians((aVar == null ? 0.0d : (double) ((Float) aVar.getValue()).floatValue()) - 90.0d);
        double d2 = (double) floatValue;
        Double.isNaN(d2);
        float f6 = (float) (6.283185307179586d / d2);
        float f7 = f6 / 2.0f;
        floatValue -= (float) ((int) floatValue);
        if (floatValue != 0.0f) {
            double d3 = (double) ((1.0f - floatValue) * f7);
            Double.isNaN(d3);
            toRadians += d3;
        }
        float floatValue2 = ((Float) this.fR.getValue()).floatValue();
        float floatValue3 = ((Float) this.fQ.getValue()).floatValue();
        com.airbnb.lottie.a.b.a aVar2 = this.fS;
        float floatValue4 = aVar2 != null ? ((Float) aVar2.getValue()).floatValue() / 100.0f : 0.0f;
        com.airbnb.lottie.a.b.a aVar3 = this.fT;
        float floatValue5 = aVar3 != null ? ((Float) aVar3.getValue()).floatValue() / 100.0f : 0.0f;
        double d4;
        if (floatValue != 0.0f) {
            f = ((floatValue2 - floatValue3) * floatValue) + floatValue3;
            float f8 = floatValue2;
            d4 = (double) f;
            double cos2 = Math.cos(toRadians);
            Double.isNaN(d4);
            d = d2;
            f2 = (float) (d4 * cos2);
            cos2 = Math.sin(toRadians);
            Double.isNaN(d4);
            f3 = (float) (d4 * cos2);
            this.fb.moveTo(f2, f3);
            d4 = (double) ((f6 * floatValue) / 2.0f);
            Double.isNaN(d4);
            toRadians += d4;
            f4 = f2;
            f5 = f;
            f2 = f8;
            float f9 = f7;
            f7 = f3;
            f3 = f9;
        } else {
            d = d2;
            f2 = floatValue2;
            d4 = (double) f2;
            cos = Math.cos(toRadians);
            Double.isNaN(d4);
            f3 = f7;
            f4 = (float) (d4 * cos);
            cos = Math.sin(toRadians);
            Double.isNaN(d4);
            f7 = (float) (d4 * cos);
            this.fb.moveTo(f4, f7);
            d4 = (double) f3;
            Double.isNaN(d4);
            toRadians += d4;
            f5 = 0.0f;
        }
        cos = Math.ceil(d) * 2.0d;
        int i = 0;
        double d5 = toRadians;
        int i2 = 0;
        while (true) {
            double d6 = (double) i;
            if (d6 < cos) {
                float f10;
                float f11;
                float f12;
                float f13;
                float f14;
                float f15;
                float f16 = i2 != 0 ? f2 : floatValue3;
                if (f5 == 0.0f || d6 != cos - 2.0d) {
                    f10 = f16;
                    f16 = f3;
                } else {
                    f10 = f16;
                    f16 = (f6 * floatValue) / 2.0f;
                }
                if (f5 == 0.0f || d6 != cos - 1.0d) {
                    f11 = f6;
                    f6 = f10;
                    f10 = f2;
                } else {
                    f11 = f6;
                    f10 = f2;
                    f6 = f5;
                }
                double d7 = (double) f6;
                double cos3 = Math.cos(d5);
                Double.isNaN(d7);
                double d8 = d6;
                f = (float) (d7 * cos3);
                cos3 = Math.sin(d5);
                Double.isNaN(d7);
                f6 = (float) (d7 * cos3);
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.fb.lineTo(f, f6);
                    f12 = f6;
                    f13 = f3;
                    f14 = floatValue3;
                    f15 = floatValue4;
                    f3 = floatValue5;
                    f6 = f16;
                } else {
                    f13 = f3;
                    f14 = floatValue3;
                    f15 = floatValue4;
                    double atan2 = (double) ((float) (Math.atan2((double) f7, (double) f4) - 1.5707963267948966d));
                    floatValue3 = (float) Math.cos(atan2);
                    f2 = (float) Math.sin(atan2);
                    f3 = floatValue5;
                    float f17 = f16;
                    f12 = f6;
                    double atan22 = (double) ((float) (Math.atan2((double) f6, (double) f) - 1.5707963267948966d));
                    floatValue4 = (float) Math.cos(atan22);
                    f16 = (float) Math.sin(atan22);
                    f6 = i2 != 0 ? f15 : f3;
                    float f18 = ((i2 != 0 ? f14 : f10) * f6) * 0.47829f;
                    floatValue3 *= f18;
                    f18 *= f2;
                    float f19 = ((i2 != 0 ? f10 : f14) * (i2 != 0 ? f3 : f15)) * 0.47829f;
                    floatValue4 *= f19;
                    f19 *= f16;
                    if (floatValue != 0.0f) {
                        if (i == 0) {
                            floatValue3 *= floatValue;
                            f18 *= floatValue;
                        } else if (d8 == cos - 1.0d) {
                            floatValue4 *= floatValue;
                            f19 *= floatValue;
                        }
                    }
                    this.fb.cubicTo(f4 - floatValue3, f7 - f18, f + floatValue4, f12 + f19, f, f12);
                    f6 = f17;
                }
                d7 = (double) f6;
                Double.isNaN(d7);
                d5 += d7;
                i2 ^= 1;
                i++;
                floatValue5 = f3;
                f4 = f;
                f3 = f13;
                f2 = f10;
                f6 = f11;
                floatValue3 = f14;
                floatValue4 = f15;
                f7 = f12;
            } else {
                PointF pointF = (PointF) this.fu.getValue();
                this.fb.offset(pointF.x, pointF.y);
                this.fb.close();
                return;
            }
        }
    }

    private void aJ() {
        int floor = (int) Math.floor((double) ((Float) this.fO.getValue()).floatValue());
        com.airbnb.lottie.a.b.a aVar = this.fP;
        double toRadians = Math.toRadians((aVar == null ? 0.0d : (double) ((Float) aVar.getValue()).floatValue()) - 90.0d);
        double d = (double) floor;
        Double.isNaN(d);
        float f = (float) (6.283185307179586d / d);
        float floatValue = ((Float) this.fT.getValue()).floatValue() / 100.0f;
        float floatValue2 = ((Float) this.fR.getValue()).floatValue();
        double d2 = (double) floatValue2;
        double cos = Math.cos(toRadians);
        Double.isNaN(d2);
        float f2 = (float) (cos * d2);
        double sin = Math.sin(toRadians);
        Double.isNaN(d2);
        float f3 = (float) (sin * d2);
        this.fb.moveTo(f2, f3);
        double d3 = (double) f;
        Double.isNaN(d3);
        toRadians += d3;
        d = Math.ceil(d);
        floor = 0;
        while (((double) floor) < d) {
            double d4;
            int i;
            double d5;
            double d6;
            double cos2 = Math.cos(toRadians);
            Double.isNaN(d2);
            float f4 = (float) (cos2 * d2);
            double sin2 = Math.sin(toRadians);
            Double.isNaN(d2);
            double d7 = d;
            float f5 = (float) (d2 * sin2);
            if (floatValue != 0.0f) {
                d4 = d2;
                i = floor;
                d5 = toRadians;
                double atan2 = (double) ((float) (Math.atan2((double) f3, (double) f2) - 1.5707963267948966d));
                d6 = d3;
                double atan22 = (double) ((float) (Math.atan2((double) f5, (double) f4) - 1.5707963267948966d));
                float f6 = (floatValue2 * floatValue) * 0.25f;
                this.fb.cubicTo(f2 - (((float) Math.cos(atan2)) * f6), f3 - (((float) Math.sin(atan2)) * f6), f4 + (((float) Math.cos(atan22)) * f6), f5 + (f6 * ((float) Math.sin(atan22))), f4, f5);
            } else {
                d5 = toRadians;
                d4 = d2;
                d6 = d3;
                i = floor;
                this.fb.lineTo(f4, f5);
            }
            Double.isNaN(d6);
            toRadians = d5 + d6;
            floor = i + 1;
            f3 = f5;
            f2 = f4;
            d = d7;
            d2 = d4;
            d3 = d6;
        }
        PointF pointF = (PointF) this.fu.getValue();
        this.fb.offset(pointF.x, pointF.y);
        this.fb.close();
    }

    public void a(d dVar, int i, List<d> list, d dVar2) {
        com.airbnb.lottie.d.g.a(dVar, i, list, dVar2, this);
    }

    public <T> void a(T t, @Nullable c<T> cVar) {
        if (t == l.eE) {
            this.fO.a(cVar);
        } else if (t == l.eF) {
            this.fP.a(cVar);
        } else if (t == l.ev) {
            this.fu.a(cVar);
        } else {
            com.airbnb.lottie.a.b.a aVar;
            if (t == l.eG) {
                aVar = this.fQ;
                if (aVar != null) {
                    aVar.a(cVar);
                    return;
                }
            }
            if (t == l.eH) {
                this.fR.a(cVar);
                return;
            }
            if (t == l.eI) {
                aVar = this.fS;
                if (aVar != null) {
                    aVar.a(cVar);
                    return;
                }
            }
            if (t == l.eJ) {
                this.fT.a(cVar);
            }
        }
    }
}
