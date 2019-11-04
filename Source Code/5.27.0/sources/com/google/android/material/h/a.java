package com.google.android.material.h;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import androidx.appcompat.graphics.drawable.DrawableWrapper;

/* compiled from: ShadowDrawableWrapper */
public class a extends DrawableWrapper {
    static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    private final int LD;
    private boolean LE;
    private boolean LF;
    final Paint Lo;
    final Paint Lp;
    final RectF Lq;
    float Lr;
    Path Ls;
    float Lt;
    float Lu;
    float Lv;
    float Lw;
    private boolean Lx;
    private final int Ly;
    private final int Lz;
    private float rotation;

    public int getOpacity() {
        return -3;
    }

    private static int toEven(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.Lo.setAlpha(i);
        this.Lp.setAlpha(i);
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        this.Lx = true;
    }

    public void setShadowSize(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        f = (float) toEven(f);
        f2 = (float) toEven(f2);
        if (f > f2) {
            if (!this.LF) {
                this.LF = true;
            }
            f = f2;
        }
        if (this.Lw != f || this.Lu != f2) {
            this.Lw = f;
            this.Lu = f2;
            this.Lv = (float) Math.round(f * 1.5f);
            this.Lt = f2;
            this.Lx = true;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.Lu);
    }

    public float getShadowSize() {
        return this.Lw;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) calculateVerticalPadding(this.Lu, this.Lr, this.LE));
        int ceil2 = (int) Math.ceil((double) calculateHorizontalPadding(this.Lu, this.Lr, this.LE));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - COS_45;
        double d3 = (double) f2;
        Double.isNaN(d3);
        d2 *= d3;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - COS_45;
        double d3 = (double) f2;
        Double.isNaN(d3);
        d2 *= d3;
        Double.isNaN(d);
        return (float) (d + d2);
    }

    public void draw(Canvas canvas) {
        if (this.Lx) {
            buildComponents(getBounds());
            this.Lx = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public final void setRotation(float f) {
        if (this.rotation != f) {
            this.rotation = f;
            invalidateSelf();
        }
    }

    private void drawShadow(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.rotation, this.Lq.centerX(), this.Lq.centerY());
        float f4 = this.Lr;
        float f5 = (-f4) - this.Lv;
        float f6 = f4 * 2.0f;
        Object obj = this.Lq.width() - f6 > 0.0f ? 1 : null;
        Object obj2 = this.Lq.height() - f6 > 0.0f ? 1 : null;
        float f7 = this.Lw;
        float f8 = f4 / ((f7 - (0.5f * f7)) + f4);
        float f9 = f4 / ((f7 - (0.25f * f7)) + f4);
        float f10 = f4 / ((f7 - (f7 * 1.0f)) + f4);
        int save2 = canvas.save();
        canvas2.translate(this.Lq.left + f4, this.Lq.top + f4);
        canvas2.scale(f8, f9);
        canvas2.drawPath(this.Ls, this.Lo);
        if (obj != null) {
            canvas2.scale(1.0f / f8, 1.0f);
            i = save2;
            f = f10;
            i2 = save;
            f2 = f9;
            canvas.drawRect(0.0f, f5, this.Lq.width() - f6, -this.Lr, this.Lp);
        } else {
            i = save2;
            f = f10;
            i2 = save;
            f2 = f9;
        }
        canvas2.restoreToCount(i);
        i = canvas.save();
        canvas2.translate(this.Lq.right - f4, this.Lq.bottom - f4);
        f9 = f;
        canvas2.scale(f8, f9);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.Ls, this.Lo);
        if (obj != null) {
            canvas2.scale(1.0f / f8, 1.0f);
            f3 = f2;
            f2 = f9;
            canvas.drawRect(0.0f, f5, this.Lq.width() - f6, (-this.Lr) + this.Lv, this.Lp);
        } else {
            f3 = f2;
            f2 = f9;
        }
        canvas2.restoreToCount(i);
        int save3 = canvas.save();
        canvas2.translate(this.Lq.left + f4, this.Lq.bottom - f4);
        canvas2.scale(f8, f2);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.Ls, this.Lo);
        if (obj2 != null) {
            canvas2.scale(1.0f / f2, 1.0f);
            canvas.drawRect(0.0f, f5, this.Lq.height() - f6, -this.Lr, this.Lp);
        }
        canvas2.restoreToCount(save3);
        save = canvas.save();
        canvas2.translate(this.Lq.right - f4, this.Lq.top + f4);
        f4 = f3;
        canvas2.scale(f8, f4);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.Ls, this.Lo);
        if (obj2 != null) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f5, this.Lq.height() - f6, -this.Lr, this.Lp);
        }
        canvas2.restoreToCount(save);
        canvas2.restoreToCount(i2);
    }

    private void buildShadowCorners() {
        float f = this.Lr;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.Lv;
        rectF2.inset(-f2, -f2);
        Path path = this.Ls;
        if (path == null) {
            this.Ls = new Path();
        } else {
            path.reset();
        }
        this.Ls.setFillType(FillType.EVEN_ODD);
        this.Ls.moveTo(-this.Lr, 0.0f);
        this.Ls.rLineTo(-this.Lv, 0.0f);
        this.Ls.arcTo(rectF2, 180.0f, 90.0f, false);
        this.Ls.arcTo(rectF, 270.0f, -90.0f, false);
        this.Ls.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.Lr / f3;
            float f5 = ((1.0f - f4) / 2.0f) + f4;
            Paint paint = this.Lo;
            Shader shader = r8;
            Shader radialGradient = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.Ly, this.Lz, this.LD}, new float[]{0.0f, f4, f5, 1.0f}, TileMode.CLAMP);
            paint.setShader(shader);
        }
        this.Lp.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.Ly, this.Lz, this.LD}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        this.Lp.setAntiAlias(false);
    }

    private void buildComponents(Rect rect) {
        float f = this.Lu * 1.5f;
        this.Lq.set(((float) rect.left) + this.Lu, ((float) rect.top) + f, ((float) rect.right) - this.Lu, ((float) rect.bottom) - f);
        getWrappedDrawable().setBounds((int) this.Lq.left, (int) this.Lq.top, (int) this.Lq.right, (int) this.Lq.bottom);
        buildShadowCorners();
    }
}
