package com.iqoption.core.ui.widget.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/core/ui/widget/drawable/DotsDrawable;", "Landroid/graphics/drawable/Drawable;", "dotStrokeWidth", "", "dotRadius", "dotOffset", "dotMaxCount", "", "(FFFI)V", "value", "color", "getColor", "()I", "setColor", "(I)V", "fillCount", "getFillCount", "setFillCount", "paint", "Landroid/graphics/Paint;", "strokeRadius", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "core_release"})
/* compiled from: DotsDrawable.kt */
public final class a extends Drawable {
    private final float bNd;
    private int bNe = 1;
    private final float bNf;
    private final float bNg;
    private final int bNh;
    private final Paint fh;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public a(float f, float f2, float f3, int i) {
        this.bNf = f2;
        this.bNg = f3;
        this.bNh = i;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(f);
        this.fh = paint;
        this.bNd = this.bNf - (f / 2.0f);
    }

    public final void setColor(int i) {
        this.fh.setColor(i);
        invalidateSelf();
    }

    public final void fk(int i) {
        if (this.bNe != i) {
            this.bNe = i;
            invalidateSelf();
        }
    }

    public int getIntrinsicWidth() {
        float f = ((float) 2) * this.bNf;
        int i = this.bNh;
        return c.au((f * ((float) i)) + (this.bNg * ((float) (i - 1))));
    }

    public int getIntrinsicHeight() {
        return c.au(((float) 2) * this.bNf);
    }

    public void draw(Canvas canvas) {
        if (canvas != null) {
            canvas.save();
            float f = this.bNf;
            canvas.translate(f, f);
            int i = this.bNh;
            for (int i2 = 0; i2 < i; i2++) {
                float f2;
                if (i2 < this.bNe) {
                    this.fh.setStyle(Style.FILL);
                    f2 = this.bNf;
                } else {
                    this.fh.setStyle(Style.STROKE);
                    f2 = this.bNd;
                }
                if (i2 != 0) {
                    canvas.translate(this.bNg + (this.bNf * ((float) 2)), 0.0f);
                }
                canvas.drawCircle(0.0f, 0.0f, f2, this.fh);
            }
            canvas.restore();
        }
    }
}
