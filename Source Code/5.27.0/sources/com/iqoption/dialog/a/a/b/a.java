package com.iqoption.dialog.a.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.common.collect.ImmutableList;
import com.iqoption.core.util.aa;
import com.iqoption.dialog.a.a.c;
import com.iqoption.dialog.a.a.d.b;
import com.iqoption.dialog.a.a.e;
import com.iqoption.dialog.a.a.f;
import com.iqoption.dto.Point;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.x.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: DigitalDecorDrawer */
public final class a implements b {
    @ColorInt
    private final int amj;
    @ColorInt
    private final int amk;
    private final Resources cIQ;
    private final Rect cJA;
    private final float cJB;
    private final float cJC;
    private final Paint cJD = new Paint(1);
    private final Paint cJE = new Paint(1);
    private final RectF cJF = new RectF();
    private final RectF cJG = new RectF();
    private final RectF cJH = new RectF();
    private final RectF cJI = new RectF();
    private final RectF cJJ = new RectF();
    private final float cJK;
    private final float cJL;
    private final float cJM;
    private final float cJN;
    private final e cJO;
    private final float cJP;
    private final float cJQ;
    private final e cJR;
    private final float cJS;
    private final float cJT;
    private final Drawable cJU;
    private final Drawable cJV;
    private final RectF cJW = new RectF();
    private final f cJX;
    private final float cJY;
    private final float cJZ;
    private final String cJp;
    private double cJq;
    private final Path cJs = new Path();
    private final Drawable cJw;
    private final Drawable cJx;
    private final Drawable cJy;
    private final Drawable cJz;
    private b[] cKa;
    private c[] cKb;
    private c[] cKc;

    public a(Context context, String str) {
        this.cJp = str;
        this.cIQ = context.getResources();
        this.amk = ContextCompat.getColor(context, R.color.red);
        this.amj = ContextCompat.getColor(context, R.color.green);
        this.cJw = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_point_red_8dp);
        this.cJx = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_point_green_8dp);
        this.cJy = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_strike_red_18dp);
        this.cJz = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_strike_green_18dp);
        this.cJA = new Rect();
        this.cJB = ((float) this.cJy.getIntrinsicWidth()) / 2.0f;
        this.cJC = ((float) this.cJy.getIntrinsicWidth()) / 2.0f;
        this.cJD.setColor(this.amk);
        this.cJD.setStyle(Style.STROKE);
        this.cJD.setStrokeCap(Cap.ROUND);
        this.cJD.setStrokeJoin(Join.ROUND);
        this.cJD.setPathEffect(new DashPathEffect(new float[]{this.cIQ.getDimension(R.dimen.dp4), this.cIQ.getDimension(R.dimen.dp2)}, 0.0f));
        this.cJE.setColor(this.amk);
        this.cJE.setStyle(Style.STROKE);
        this.cJM = this.cIQ.getDimension(R.dimen.dp65);
        this.cJN = this.cIQ.getDimension(R.dimen.dp11);
        this.cJK = this.cIQ.getDimension(R.dimen.dp1);
        this.cJL = this.cIQ.getDimension(R.dimen.dp1);
        this.cJO = new e((float) this.cIQ.getDimensionPixelSize(R.dimen.dp1), ContextCompat.getColor(context, R.color.grey_blur_70), ContextCompat.getColor(context, R.color.grey_blur));
        this.cJO.W((float) this.cIQ.getDimensionPixelSize(R.dimen.dp8));
        this.cJO.X(this.cIQ.getDimension(R.dimen.dp10));
        this.cJP = this.cIQ.getDimension(R.dimen.dp8);
        this.cJQ = this.cIQ.getDimension(R.dimen.dp4);
        this.cJR = new e(this.cIQ.getDimension(R.dimen.dp1), ContextCompat.getColor(context, R.color.grey_blur), ContextCompat.getColor(context, R.color.white));
        this.cJR.W(this.cIQ.getDimension(R.dimen.dp8));
        this.cJR.X(this.cIQ.getDimension(R.dimen.dp10));
        this.cJS = this.cIQ.getDimension(R.dimen.dp4);
        this.cJT = this.cIQ.getDimension(R.dimen.dp6);
        this.cJU = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_indicator_call_10dp);
        this.cJV = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_indicator_put_10dp);
        this.cJX = new f("ITM");
        this.cJX.K(this.cIQ.getDimension(R.dimen.dp8));
        this.cJX.setColor(ContextCompat.getColor(context, R.color.white));
        this.cJY = this.cIQ.getDimension(R.dimen.dp2);
        float dimension = this.cIQ.getDimension(R.dimen.dp4);
        this.cJZ = this.cIQ.getDimension(R.dimen.dp4);
        this.cJW.set(0.0f, 0.0f, (((float) (this.cJU.getIntrinsicWidth() + this.cJX.getIntrinsicWidth())) + this.cJY) + dimension, (float) Math.max(this.cJU.getIntrinsicHeight(), this.cJX.getIntrinsicHeight()));
    }

    public void a(@NonNull ImmutableList<Position> immutableList, Point point, @NonNull aa[] aaVarArr) {
        ImmutableList<Position> immutableList2 = immutableList;
        this.cKa = new b[immutableList.size()];
        this.cKb = new c[this.cKa.length];
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            c cVar;
            Position position = (Position) immutableList2.get(i);
            aa aaVar = aaVarArr[i];
            boolean isCall = position.isCall();
            boolean equalsIgnoreCase = "win".equalsIgnoreCase(position.getWin());
            boolean isSold = position.isSold();
            Double valueOf = Double.valueOf(position.getValue());
            c cVar2 = (c) arrayMap.get(valueOf);
            if (cVar2 == null) {
                cVar2 = new c(valueOf);
                arrayMap.put(valueOf, cVar2);
            }
            c cVar3 = cVar2;
            d dVar;
            if (isCall) {
                dVar = (d) arrayMap2.get(valueOf);
                if (dVar == null) {
                    dVar = new d();
                    arrayMap2.put(valueOf, dVar);
                }
                d dVar2 = dVar;
                if (cVar3.cKh == null) {
                    cVar3.cKh = Double.valueOf(aaVar.x);
                }
                if (cVar3.cKj == null) {
                    cVar3.cKj = dVar2;
                }
                if (dVar2.value == 0.0f && !cVar3.atO()) {
                    dVar2.value = -this.cJL;
                    if (cVar3.cKk != null) {
                        cVar3.cKk.value = this.cJL;
                    }
                }
                cVar = cVar3;
                this.cKa[i] = new b(aaVar, this.amj, this.cJx, this.cJz, dVar2);
            } else {
                cVar = cVar3;
                dVar = (d) arrayMap3.get(valueOf);
                if (dVar == null) {
                    dVar = new d();
                    arrayMap3.put(valueOf, dVar);
                }
                d dVar3 = dVar;
                if (cVar.cKi == null) {
                    cVar.cKi = Double.valueOf(aaVar.x);
                }
                if (cVar.cKk == null) {
                    cVar.cKk = dVar3;
                }
                if (dVar3.value == 0.0f && !cVar.atO()) {
                    dVar3.value = this.cJL;
                    if (cVar.cKj != null) {
                        cVar.cKj.value = -this.cJL;
                    }
                }
                this.cKa[i] = new b(aaVar, this.amk, this.cJw, this.cJy, dVar3);
            }
            if (equalsIgnoreCase && !isSold && cVar.cKl == null) {
                cVar.cKm = isCall;
                cVar.cKl = isCall ? this.cJU : this.cJV;
            }
            this.cKb[i] = cVar;
        }
        this.cJq = ((Double) com.google.common.base.e.g(Double.valueOf(((Position) immutableList2.get(0)).getExpValue()), Double.valueOf(point.rate))).doubleValue();
        this.cKc = (c[]) arrayMap.values().toArray(new c[0]);
        Arrays.sort(this.cKc, -$$Lambda$a$YdmquZbdpy4SEMRC4r2gknJ366E.INSTANCE);
    }

    public float atM() {
        return this.cJB;
    }

    public void e(RectF rectF) {
        rectF.right -= this.cIQ.getDimension(R.dimen.dp143);
    }

    public void a(c cVar, Canvas canvas) {
        c cVar2 = cVar;
        Canvas canvas2 = canvas;
        int pointsToDrawCount = cVar.getPointsToDrawCount();
        if (pointsToDrawCount != 0 && this.cKa != null) {
            aa fB;
            float f;
            float x;
            float w;
            float f2;
            float f3;
            int i;
            int i2;
            Canvas canvas3;
            float w2;
            int pointsCount = cVar.getPointsCount();
            float decorProgress = cVar.getDecorProgress();
            float f4 = 0.0f;
            float i3 = com.iqoption.dialog.a.a.b.i(decorProgress, 0.0f, 0.5f);
            float i4 = com.iqoption.dialog.a.a.b.i(decorProgress, 0.2f, 0.8f);
            float i5 = com.iqoption.dialog.a.a.b.i(decorProgress, 0.8f, 1.0f);
            Object obj = pointsToDrawCount == pointsCount ? 1 : null;
            if (obj != null) {
                float f5;
                aa aaVar;
                fB = cVar2.fB(pointsCount - 1);
                float w3 = cVar2.w(fB.x);
                f = this.cJM + w3;
                int i6 = 0;
                while (true) {
                    c[] cVarArr = this.cKc;
                    if (i6 >= cVarArr.length) {
                        break;
                    }
                    int i7;
                    c cVar3;
                    c cVar4 = cVarArr[i6];
                    f5 = i5;
                    x = cVar2.x((double) cVar4.cKg);
                    if (i4 > f4) {
                        float f6;
                        canvas.save();
                        canvas2.translate(f4, x);
                        if (cVar4.cKh != null) {
                            w = cVar2.w(cVar4.cKh.doubleValue());
                            decorProgress = f - w;
                            this.cJE.setColor(this.amj);
                            i5 = w + (decorProgress * i4);
                            i7 = i6;
                            f6 = w;
                            w = f;
                            f = cVar4.cKj.value;
                            aaVar = fB;
                            f2 = i5;
                            cVar3 = cVar4;
                            f3 = i3;
                            i3 = w;
                            i = pointsCount;
                            pointsCount = 0;
                            canvas.drawLine(f6, f, f2, cVar4.cKj.value, this.cJE);
                        } else {
                            i7 = i6;
                            aaVar = fB;
                            cVar3 = cVar4;
                            i = pointsCount;
                            f3 = i3;
                            pointsCount = 0;
                            i3 = f;
                        }
                        if (cVar3.cKi != null) {
                            f6 = cVar2.w(cVar3.cKi.doubleValue());
                            f = i3 - f6;
                            this.cJE.setColor(this.amk);
                            canvas.drawLine(f6, cVar3.cKk.value, f6 + (f * i4), cVar3.cKk.value, this.cJE);
                        }
                        canvas.restore();
                    } else {
                        i7 = i6;
                        aaVar = fB;
                        cVar3 = cVar4;
                        i = pointsCount;
                        f3 = i3;
                        pointsCount = 0;
                        i3 = f;
                    }
                    if (f5 > 0.0f) {
                        i2 = (int) (f5 * 255.0f);
                        this.cJX.setAlpha(i2);
                        this.cJO.setAlpha(i2);
                        this.cJO.setText(String.format(Locale.US, this.cJp, new Object[]{cVar3.value}));
                        this.cJF.set(0.0f, 0.0f, ((float) this.cJO.getIntrinsicWidth()) + (this.cJP * 2.0f), ((float) this.cJO.getIntrinsicHeight()) + (this.cJQ * 2.0f));
                        canvas.save();
                        canvas3 = canvas;
                        canvas3.translate(i3, x - this.cJF.centerY());
                        canvas.save();
                        if (cVar3.cKl != null) {
                            f = (this.cJF.right - this.cJW.right) / 2.0f;
                            if (cVar3.cKm) {
                                f2 = (this.cJF.top - this.cJW.height()) + this.cJZ;
                            } else {
                                f2 = this.cJF.bottom - this.cJZ;
                            }
                            this.cJH.set(f, f2, this.cJW.width() + f, this.cJW.height() + f2);
                            canvas.save();
                            canvas3.translate(f + this.cJY, f2);
                            cVar3.cKl.setAlpha(i2);
                            cVar3.cKl.draw(canvas3);
                            canvas3.translate((float) cVar3.cKl.getIntrinsicWidth(), 0.0f);
                            this.cJX.draw(canvas3);
                            canvas.restore();
                            canvas3.clipRect(this.cJH, Op.XOR);
                        }
                        canvas.save();
                        this.cJG.set((this.cJF.right + this.cJK) * f5, this.cJF.top - this.cJK, this.cJF.right + this.cJK, this.cJF.bottom + this.cJK);
                        canvas3.clipRect(this.cJG, Op.DIFFERENCE);
                        RectF rectF;
                        if (cVar3.atO()) {
                            if (cVar3.cKh != null) {
                                this.cJE.setColor(this.amj);
                            } else if (cVar3.cKi != null) {
                                this.cJE.setColor(this.amk);
                            } else {
                                this.cJE.setColor(pointsCount);
                            }
                            rectF = this.cJF;
                            f = this.cJN;
                            canvas3.drawRoundRect(rectF, f, f, this.cJE);
                        } else {
                            canvas.save();
                            this.cJI.set(this.cJF.left - this.cJK, this.cJF.top - this.cJK, this.cJF.right + this.cJK, this.cJF.centerY() + cVar3.cKk.value);
                            canvas3.clipRect(this.cJI, Op.DIFFERENCE);
                            this.cJE.setColor(this.amk);
                            rectF = this.cJF;
                            f = this.cJN;
                            canvas3.drawRoundRect(rectF, f, f, this.cJE);
                            canvas.restore();
                            canvas.save();
                            this.cJJ.set(this.cJF.left - this.cJK, this.cJF.centerY() + cVar3.cKj.value, this.cJF.right + this.cJK, this.cJF.bottom + this.cJK);
                            canvas3.clipRect(this.cJJ, Op.DIFFERENCE);
                            this.cJE.setColor(this.amj);
                            rectF = this.cJF;
                            f = this.cJN;
                            canvas3.drawRoundRect(rectF, f, f, this.cJE);
                            canvas.restore();
                        }
                        canvas.restore();
                        canvas.restore();
                        canvas.save();
                        canvas3.translate(this.cJP, this.cJQ);
                        this.cJO.draw(canvas3);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        canvas3 = canvas;
                    }
                    fB = aaVar;
                    f = i3;
                    i3 = f3;
                    i5 = f5;
                    pointsCount = i;
                    f4 = 0.0f;
                    canvas2 = canvas3;
                    i6 = i7 + 1;
                }
                canvas3 = canvas2;
                i = pointsCount;
                f3 = i3;
                f5 = i5;
                pointsCount = 0;
                aaVar = fB;
                if (f5 > 0.0f) {
                    this.cJR.setAlpha((int) (f5 * 255.0f));
                    this.cJR.setText(String.format(Locale.US, this.cJp, new Object[]{Double.valueOf(this.cJq)}));
                    canvas.save();
                    canvas3.translate(w3 + this.cJS, cVar2.x(aaVar.y) + this.cJT);
                    this.cJR.draw(canvas3);
                    canvas.restore();
                }
            } else {
                canvas3 = canvas2;
                i = pointsCount;
                f3 = i3;
                pointsCount = 0;
            }
            i2 = 0;
            while (true) {
                b[] bVarArr = this.cKa;
                if (i2 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i2];
                fB = bVar.cJt;
                if (fB.x > cVar2.fB(pointsToDrawCount - 1).x) {
                    break;
                }
                w2 = cVar2.w(fB.x);
                f2 = cVar2.x(fB.y);
                w = cVar2.x((double) this.cKb[i2].cKg) - f2;
                canvas.save();
                Drawable drawable = bVar.cJu;
                canvas3.translate(w2 - (((float) drawable.getIntrinsicWidth()) / 2.0f), f2 - (((float) drawable.getIntrinsicHeight()) / 2.0f));
                drawable.draw(canvas3);
                canvas.restore();
                this.cJs.reset();
                this.cJs.moveTo(w2, f2);
                this.cJs.lineTo(w2, f2 + (w * (((float) ((pointsToDrawCount - i2) - 1)) / ((float) ((i - i2) - 1)))));
                this.cJD.setColor(bVar.cKd);
                canvas3.drawPath(this.cJs, this.cJD);
                i2++;
            }
            if (obj != null) {
                while (true) {
                    b[] bVarArr2 = this.cKa;
                    if (pointsCount < bVarArr2.length) {
                        b bVar2 = bVarArr2[pointsCount];
                        f = cVar2.w(bVar2.cJt.x);
                        f2 = cVar2.x((double) this.cKb[pointsCount].cKg);
                        canvas.save();
                        canvas3.translate(f - this.cJB, (f2 - this.cJC) + bVar2.cKf.value);
                        x = 1.0f - f3;
                        i3 = f3 + 1.0f;
                        Rect rect = this.cJA;
                        w2 = this.cJB;
                        int i8 = (int) (w2 * x);
                        float f7 = this.cJC;
                        rect.set(i8, (int) (x * f7), (int) (w2 * i3), (int) (f7 * i3));
                        bVar2.cKe.setBounds(this.cJA);
                        bVar2.cKe.draw(canvas3);
                        canvas.restore();
                        pointsCount++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
