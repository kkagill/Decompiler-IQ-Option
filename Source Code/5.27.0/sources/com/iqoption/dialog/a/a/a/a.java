package com.iqoption.dialog.a.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.common.collect.ImmutableList;
import com.iqoption.core.util.aa;
import com.iqoption.dialog.a.a.d.b;
import com.iqoption.dialog.a.a.f;
import com.iqoption.dto.Point;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.x.R;
import java.util.Locale;

/* compiled from: BinaryDecorDrawer */
public final class a implements b {
    @ColorInt
    private final int amj;
    @ColorInt
    private final int amk;
    private final Resources cIQ;
    private final Drawable cIR;
    private final Drawable cIS;
    private final float cIT;
    private final float cIU;
    private final Paint cIV = new Paint(1);
    private final Paint cIW = new Paint(1);
    private final Paint cIX = new Paint(1);
    private final Paint cIY = new Paint(1);
    private final float cIZ;
    private final float cJa;
    private final f cJb;
    private final float cJc;
    private final Drawable cJd;
    private final float cJe;
    private final float cJf;
    private final float cJg;
    private final float cJh;
    private float cJi;
    private float cJj;
    private boolean cJk;
    @ColorInt
    private final int cJl;
    @ColorInt
    private final int cJm;
    @ColorInt
    private final int cJn;
    private b[] cJo;
    private String cJp;
    private double cJq;
    private boolean cJr;
    private final Path cJs = new Path();

    public a(Context context, String str) {
        this.cJp = str;
        this.cIQ = context.getResources();
        this.cIR = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_strike_red_18dp);
        this.cIS = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_strike_green_18dp);
        this.cJl = ContextCompat.getColor(context, R.color.grey_blur);
        this.cJn = ContextCompat.getColor(context, R.color.grey_blur_20);
        this.cJm = ContextCompat.getColor(context, R.color.grey_blur_00);
        this.amk = ContextCompat.getColor(context, R.color.red);
        this.amj = ContextCompat.getColor(context, R.color.green);
        this.cIT = ((float) this.cIR.getIntrinsicWidth()) / 2.0f;
        this.cIU = ((float) this.cIR.getIntrinsicHeight()) / 2.0f;
        this.cIV.setStyle(Style.STROKE);
        this.cIV.setPathEffect(new DashPathEffect(new float[]{this.cIQ.getDimension(R.dimen.dp4), this.cIQ.getDimension(R.dimen.dp2)}, 0.0f));
        this.cIW.setStyle(Style.STROKE);
        this.cIW.setStrokeWidth(this.cIQ.getDimension(R.dimen.dp2));
        this.cIZ = this.cIQ.getDimension(R.dimen.dp3);
        this.cJa = this.cIQ.getDimension(R.dimen.dp3);
        this.cJb = new f();
        this.cJb.K(this.cIQ.getDimension(R.dimen.dp10));
        this.cJc = this.cIQ.getDimension(R.dimen.dp36);
        this.cJd = com.iqoption.dialog.a.a.b.o(context, R.drawable.ic_flag_in_circle);
        this.cJe = ((float) this.cJd.getIntrinsicWidth()) / 2.0f;
        this.cJf = ((float) this.cJd.getIntrinsicHeight()) / 2.0f;
        this.cJg = this.cIQ.getDimension(R.dimen.dp38);
        this.cJh = this.cIQ.getDimension(R.dimen.dp16);
        this.cIY.setStyle(Style.STROKE);
    }

    public void a(ImmutableList<c> immutableList, Point point, aa[] aaVarArr) {
        this.cJo = new b[aaVarArr.length];
        boolean z = false;
        for (int i = 0; i < this.cJo.length; i++) {
            aa aaVar = aaVarArr[i];
            if (aaVar != null) {
                c cVar = (c) immutableList.get(i);
                String format = String.format(Locale.US, this.cJp, new Object[]{Double.valueOf(cVar.getValue())});
                int isSold = cVar.isSold() ^ 1;
                if (NotificationCompat.CATEGORY_CALL.equalsIgnoreCase(cVar.getDir())) {
                    this.cJo[i] = new b(format, aaVar, this.cIS, this.amj, isSold);
                } else {
                    this.cJo[i] = new b(format, aaVar, this.cIR, this.amk, isSold);
                }
            }
        }
        c cVar2 = (c) immutableList.get(0);
        if (cVar2.getExpired() <= point.timestamp) {
            z = true;
        }
        this.cJr = z;
        if (((long) (cVar2.getExpValue() * 1000000.0d)) > 0) {
            this.cJq = cVar2.getExpValue();
        } else {
            this.cJq = point.rate;
        }
    }

    public float atM() {
        return this.cIT;
    }

    public void e(RectF rectF) {
        rectF.right -= this.cIQ.getDimension(R.dimen.dp120);
    }

    public void a(com.iqoption.dialog.a.a.c cVar, Canvas canvas) {
        com.iqoption.dialog.a.a.c cVar2 = cVar;
        Canvas canvas2 = canvas;
        int pointsToDrawCount = cVar.getPointsToDrawCount();
        if (pointsToDrawCount != 0 && this.cJo != null) {
            float f;
            float x;
            float f2;
            float abs;
            float f3;
            Drawable drawable;
            int i;
            float f4;
            int pointsCount = cVar.getPointsCount();
            float graphProgress = cVar.getGraphProgress();
            float decorProgress = cVar.getDecorProgress();
            float f5 = 0.0f;
            float i2 = com.iqoption.dialog.a.a.b.i(decorProgress, 0.0f, this.cJr ? 0.4f : 1.0f);
            float i3 = com.iqoption.dialog.a.a.b.i(decorProgress, 0.4f, 1.0f);
            int i4 = pointsCount - 1;
            float fC = cVar2.fC(i4);
            float fD = cVar2.fD(i4);
            this.cJs.reset();
            this.cJs.moveTo(0.0f, fD);
            this.cJs.lineTo((fC * graphProgress) + ((this.cJc - this.cIZ) * i2), fD);
            this.cIV.setColor(this.cJn);
            canvas2.drawPath(this.cJs, this.cIV);
            if (i2 > 0.0f) {
                canvas.save();
                canvas2.translate(this.cJc + fC, fD - (((float) this.cJb.getIntrinsicHeight()) / 1.5f));
                this.cJb.setAlpha((int) (i2 * 255.0f));
                this.cJb.setColor(this.cJl);
                f fVar = this.cJb;
                Locale locale = Locale.US;
                String str = this.cJp;
                Object[] objArr = new Object[1];
                f = fD;
                objArr[0] = Double.valueOf(this.cJq);
                fVar.setText(String.format(locale, str, objArr));
                this.cJb.draw(canvas2);
                canvas.restore();
            } else {
                f = fD;
            }
            int i5 = 0;
            while (true) {
                b[] bVarArr = this.cJo;
                if (i5 >= bVarArr.length) {
                    break;
                }
                float f6;
                b bVar = bVarArr[i5];
                aa aaVar = bVar.cJt;
                float w = cVar2.w(aaVar.x);
                x = cVar2.x(aaVar.y);
                this.cJs.reset();
                this.cJs.moveTo(f5, x);
                this.cIV.setColor(bVar.color);
                int i6 = pointsToDrawCount;
                int i7 = pointsCount;
                double d = cVar2.fB(pointsToDrawCount - 1).x;
                if (this.cJk || !bVar.cJv) {
                    f2 = i3;
                } else {
                    abs = Math.abs(x - f);
                    f2 = i3;
                    if (this.cJj < abs) {
                        this.cJj = abs;
                    }
                }
                if (aaVar.x > d) {
                    this.cJs.lineTo(cVar2.w(d), x);
                    canvas2.drawPath(this.cJs, this.cIV);
                    f6 = graphProgress;
                    f3 = f;
                    graphProgress = fC;
                } else {
                    float f7;
                    b bVar2;
                    this.cJs.lineTo(w, x);
                    canvas2.drawPath(this.cJs, this.cIV);
                    if (bVar.cJv) {
                        decorProgress = fC - w;
                        this.cIW.setColor(bVar.color);
                        abs = w;
                        i3 = x;
                        f7 = w;
                        w += decorProgress * graphProgress;
                        bVar2 = bVar;
                        f3 = f;
                        f6 = graphProgress;
                        graphProgress = fC;
                        canvas.drawLine(abs, x, w, i3, this.cIW);
                        if (i2 > 0.0f) {
                            this.cJs.reset();
                            this.cJs.moveTo(graphProgress, i3);
                            this.cJs.lineTo(graphProgress + ((this.cJc - this.cIZ) * i2), i3);
                            canvas2.drawPath(this.cJs, this.cIV);
                            this.cIX.setColor(bVar2.color);
                            canvas2.drawCircle(graphProgress, i3, this.cJa * i2, this.cIX);
                            canvas.save();
                            canvas2.translate(graphProgress + this.cJc, i3 - (((float) this.cJb.getIntrinsicHeight()) / 1.5f));
                            this.cJb.setAlpha((int) (i2 * 255.0f));
                            this.cJb.setColor(bVar2.color);
                            this.cJb.setText(bVar2.value);
                            this.cJb.draw(canvas2);
                            canvas.restore();
                        }
                    } else {
                        i3 = x;
                        f7 = w;
                        bVar2 = bVar;
                        f6 = graphProgress;
                        f3 = f;
                        graphProgress = fC;
                    }
                    canvas.save();
                    drawable = bVar2.cJu;
                    canvas2.translate(f7 - (((float) drawable.getIntrinsicWidth()) / 2.0f), i3 - (((float) drawable.getIntrinsicHeight()) / 2.0f));
                    decorProgress = ((float) ((i6 - i5) - 1)) / ((float) ((i7 - i5) - 1));
                    x = 1.0f - decorProgress;
                    decorProgress += 1.0f;
                    abs = this.cIT;
                    i = (int) (abs * x);
                    fD = this.cIU;
                    drawable.setBounds(i, (int) (x * fD), (int) (abs * decorProgress), (int) (fD * decorProgress));
                    drawable.draw(canvas2);
                    canvas.restore();
                }
                i5++;
                cVar2 = cVar;
                f = f3;
                fC = graphProgress;
                pointsToDrawCount = i6;
                pointsCount = i7;
                i3 = f2;
                graphProgress = f6;
                f5 = 0.0f;
            }
            graphProgress = fC;
            f2 = i3;
            f3 = f;
            if (!this.cJk) {
                f4 = this.cJj;
                decorProgress = this.cJh;
                abs = f4 + decorProgress;
                x = this.cJg;
                if (abs < x) {
                    this.cJi = x;
                } else {
                    this.cJi = f4 + decorProgress;
                }
                Paint paint = this.cIY;
                float f8 = this.cJi * 2.0f;
                r4 = new int[3];
                i = this.cJm;
                r4[0] = i;
                r4[1] = this.cJl;
                r4[2] = i;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f8, r4, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
                this.cJk = true;
            }
            if (this.cJr && f2 > 0.0f) {
                float f9 = 1.0f - f2;
                i3 = f2 + 1.0f;
                canvas.save();
                canvas2.translate(graphProgress, f3 - this.cJi);
                f4 = this.cJi;
                canvas.drawLine(0.0f, f4 * f9, 0.0f, f4 * i3, this.cIY);
                canvas.restore();
                canvas.save();
                canvas2.translate(graphProgress - this.cJe, f3 - this.cJf);
                drawable = this.cJd;
                decorProgress = this.cJe;
                int i8 = (int) (decorProgress * f9);
                x = this.cJf;
                drawable.setBounds(i8, (int) (f9 * x), (int) (decorProgress * i3), (int) (x * i3));
                this.cJd.draw(canvas2);
                canvas.restore();
            }
        }
    }
}
