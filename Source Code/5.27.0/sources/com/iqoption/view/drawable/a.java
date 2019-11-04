package com.iqoption.view.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.iqoption.x.R;

/* compiled from: DashedTextViewDrawable */
public class a extends Drawable {
    private final Path cJs = new Path();
    private float ehe;
    private Paint mPaint;

    public a(@NonNull Paint paint) {
        this.mPaint = paint;
        this.ehe = paint.getStrokeWidth();
    }

    public a(@NonNull Context context, @ColorRes int i) {
        this.ehe = context.getResources().getDimension(R.dimen.dp1);
        this.mPaint = new Paint(1);
        this.mPaint.setStyle(Style.STROKE);
        this.mPaint.setStrokeCap(Cap.ROUND);
        this.mPaint.setStrokeJoin(Join.ROUND);
        this.mPaint.setStrokeWidth(this.ehe);
        Paint paint = this.mPaint;
        r3 = new float[2];
        float f = this.ehe;
        r3[0] = f;
        r3[1] = f * 1.5f;
        paint.setPathEffect(new DashPathEffect(r3, 0.0f));
        this.mPaint.setColor(ContextCompat.getColor(context, i));
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.mPaint != null) {
            this.cJs.reset();
            this.cJs.moveTo(0.0f, ((float) canvas.getHeight()) - this.ehe);
            this.cJs.lineTo((float) canvas.getWidth(), ((float) canvas.getHeight()) - this.ehe);
            canvas.drawPath(this.cJs, this.mPaint);
        }
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.mPaint.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        Paint paint = this.mPaint;
        if (paint != null && paint.getXfermode() == null) {
            int alpha = this.mPaint.getAlpha();
            if (alpha == 0) {
                return -2;
            }
            if (alpha == 255) {
                return -1;
            }
        }
        return -3;
    }
}
