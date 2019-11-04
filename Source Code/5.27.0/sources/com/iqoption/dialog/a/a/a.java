package com.iqoption.dialog.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Shader.TileMode;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.iqoption.core.util.aa;
import com.iqoption.dialog.a.a.d.c;
import com.iqoption.x.R;

/* compiled from: DefaultGraphDrawer */
public class a implements c {
    private final PathEffect cIh;
    @ColorInt
    private final int cIi;
    @ColorInt
    private final int cIj;
    private Paint cIk;
    private float cIl;
    private final Paint cIm = new Paint(1);
    private final Paint cIn = new Paint(1);
    private final float cIo;
    private final Path cIp = new Path();
    private final Path cIq = new Path();

    public a(Context context) {
        Resources resources = context.getResources();
        this.cIh = new CornerPathEffect((float) resources.getDimensionPixelSize(R.dimen.dp4));
        this.cIi = ContextCompat.getColor(context, R.color.grey_blur_50);
        this.cIj = ContextCompat.getColor(context, R.color.grey_blur_00);
        this.cIm.setColor(ContextCompat.getColor(context, R.color.grey_blur));
        this.cIm.setStyle(Style.STROKE);
        this.cIm.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.dp1));
        this.cIm.setPathEffect(this.cIh);
        this.cIn.setColor(ContextCompat.getColor(context, R.color.white));
        this.cIo = (float) resources.getDimensionPixelSize(R.dimen.dp2);
    }

    public void a(c cVar, Canvas canvas) {
        int pointsToDrawCount = cVar.getPointsToDrawCount();
        if (pointsToDrawCount != 0) {
            this.cIp.reset();
            this.cIq.reset();
            float graphHeight = cVar.getGraphHeight();
            float viewportHeight = cVar.getViewportHeight();
            int i = 0;
            aa fB = cVar.fB(0);
            this.cIp.moveTo(cVar.w(fB.x), cVar.x(fB.y));
            this.cIq.moveTo(0.0f, viewportHeight);
            this.cIq.lineTo(cVar.w(fB.x), cVar.x(fB.y));
            while (i < pointsToDrawCount) {
                float fC = cVar.fC(i);
                float fD = cVar.fD(i);
                this.cIp.lineTo(fC, fD);
                this.cIq.lineTo(fC, fD);
                i++;
            }
            int i2 = pointsToDrawCount - 1;
            this.cIq.lineTo(cVar.fC(i2), viewportHeight);
            if (this.cIk == null) {
                this.cIk = new Paint(1);
                this.cIl = graphHeight + ((float) cVar.getPaddingBottom());
                this.cIk.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.cIl, this.cIi, this.cIj, TileMode.CLAMP));
                this.cIk.setPathEffect(this.cIh);
            } else {
                viewportHeight = graphHeight / this.cIl;
                if (viewportHeight > 1.0f) {
                    viewportHeight -= 1.0f;
                }
                if (viewportHeight > 0.1f) {
                    this.cIl = graphHeight + ((float) cVar.getPaddingBottom());
                    this.cIk.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.cIl, this.cIi, this.cIj, TileMode.CLAMP));
                }
            }
            canvas.drawPath(this.cIp, this.cIm);
            canvas.drawPath(this.cIq, this.cIk);
            if (pointsToDrawCount == cVar.getPointsCount()) {
                canvas.drawCircle(cVar.fC(i2), cVar.fD(i2), this.cIo, this.cIn);
            }
        }
    }
}
