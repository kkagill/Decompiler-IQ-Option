package com.google.android.material.i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.TintAwareDrawable;

/* compiled from: MaterialShapeDrawable */
public class c extends Drawable implements TintAwareDrawable {
    private final Matrix[] LG;
    private final Matrix[] LH;
    private final d[] LJ;
    private final PointF LL;
    private final d LM;
    private final Region LN;
    private final Region LO;
    private final float[] LP;
    private final float[] LQ;
    @Nullable
    private e LW;
    private boolean LX;
    private boolean LZ;
    private float Ma;
    private int Mb;
    private float Mc;
    private Style Md;
    @Nullable
    private PorterDuffColorFilter Me;
    private Mode Mf;
    private ColorStateList Mg;
    private int alpha;
    private float dM;
    private final Path fb;
    private final Paint fh;
    private final Matrix matrix;
    private int shadowColor;
    private int shadowRadius;

    private static int l(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public int getOpacity() {
        return -3;
    }

    public ColorStateList oc() {
        return this.Mg;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.Mg = colorStateList;
        od();
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.Mf = mode;
        od();
        invalidateSelf();
    }

    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.alpha = i;
        invalidateSelf();
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.fh.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.LN.set(bounds);
        b(bounds.width(), bounds.height(), this.fb);
        this.LO.setPath(this.fb, this.LN);
        this.LN.op(this.LO, Op.DIFFERENCE);
        return this.LN;
    }

    public void D(float f) {
        this.Ma = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.fh.setColorFilter(this.Me);
        int alpha = this.fh.getAlpha();
        this.fh.setAlpha(l(alpha, this.alpha));
        this.fh.setStrokeWidth(this.Mc);
        this.fh.setStyle(this.Md);
        int i = this.Mb;
        if (i > 0 && this.LX) {
            this.fh.setShadowLayer((float) this.shadowRadius, 0.0f, (float) i, this.shadowColor);
        }
        if (this.LW != null) {
            b(canvas.getWidth(), canvas.getHeight(), this.fb);
            canvas.drawPath(this.fb, this.fh);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.fh);
        }
        this.fh.setAlpha(alpha);
    }

    public void a(int i, int i2, Path path) {
        path.rewind();
        if (this.LW != null) {
            for (int i3 = 0; i3 < 4; i3++) {
                a(i3, i, i2);
                b(i3, i, i2);
            }
            for (int i4 = 0; i4 < 4; i4++) {
                a(i4, path);
                b(i4, path);
            }
            path.close();
        }
    }

    private void a(int i, int i2, int i3) {
        a(i, i2, i3, this.LL);
        aO(i).b(c(i, i2, i3), this.Ma, this.LJ[i]);
        float d = d(((i - 1) + 4) % 4, i2, i3) + 1.5707964f;
        this.LG[i].reset();
        this.LG[i].setTranslate(this.LL.x, this.LL.y);
        this.LG[i].preRotate((float) Math.toDegrees((double) d));
    }

    private void b(int i, int i2, int i3) {
        this.LP[0] = this.LJ[i].Mj;
        this.LP[1] = this.LJ[i].Mk;
        this.LG[i].mapPoints(this.LP);
        float d = d(i, i2, i3);
        this.LH[i].reset();
        Matrix matrix = this.LH[i];
        float[] fArr = this.LP;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.LH[i].preRotate((float) Math.toDegrees((double) d));
    }

    private void a(int i, Path path) {
        this.LP[0] = this.LJ[i].Mh;
        this.LP[1] = this.LJ[i].Mi;
        this.LG[i].mapPoints(this.LP);
        float[] fArr;
        if (i == 0) {
            fArr = this.LP;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            fArr = this.LP;
            path.lineTo(fArr[0], fArr[1]);
        }
        this.LJ[i].a(this.LG[i], path);
    }

    private void b(int i, Path path) {
        int i2 = (i + 1) % 4;
        this.LP[0] = this.LJ[i].Mj;
        this.LP[1] = this.LJ[i].Mk;
        this.LG[i].mapPoints(this.LP);
        this.LQ[0] = this.LJ[i2].Mh;
        this.LQ[1] = this.LJ[i2].Mi;
        this.LG[i2].mapPoints(this.LQ);
        float[] fArr = this.LP;
        float f = fArr[0];
        float[] fArr2 = this.LQ;
        float hypot = (float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]));
        this.LM.j(0.0f, 0.0f);
        aP(i).a(hypot, this.Ma, this.LM);
        this.LM.a(this.LH[i], path);
    }

    private a aO(int i) {
        if (i == 1) {
            return this.LW.of();
        }
        if (i == 2) {
            return this.LW.og();
        }
        if (i != 3) {
            return this.LW.oe();
        }
        return this.LW.oh();
    }

    private b aP(int i) {
        if (i == 1) {
            return this.LW.oj();
        }
        if (i == 2) {
            return this.LW.ok();
        }
        if (i != 3) {
            return this.LW.oi();
        }
        return this.LW.ol();
    }

    private void a(int i, int i2, int i3, PointF pointF) {
        if (i == 1) {
            pointF.set((float) i2, 0.0f);
        } else if (i == 2) {
            pointF.set((float) i2, (float) i3);
        } else if (i != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, (float) i3);
        }
    }

    private float c(int i, int i2, int i3) {
        a(((i - 1) + 4) % 4, i2, i3, this.LL);
        float f = this.LL.x;
        float f2 = this.LL.y;
        a((i + 1) % 4, i2, i3, this.LL);
        float f3 = this.LL.x;
        float f4 = this.LL.y;
        a(i, i2, i3, this.LL);
        float f5 = this.LL.x;
        float f6 = this.LL.y;
        f4 -= f6;
        f5 = ((float) Math.atan2((double) (f2 - f6), (double) (f - f5))) - ((float) Math.atan2((double) f4, (double) (f3 - f5)));
        if (f5 >= 0.0f) {
            return f5;
        }
        double d = (double) f5;
        Double.isNaN(d);
        return (float) (d + 6.283185307179586d);
    }

    private float d(int i, int i2, int i3) {
        int i4 = (i + 1) % 4;
        a(i, i2, i3, this.LL);
        float f = this.LL.x;
        float f2 = this.LL.y;
        a(i4, i2, i3, this.LL);
        return (float) Math.atan2((double) (this.LL.y - f2), (double) (this.LL.x - f));
    }

    private void b(int i, int i2, Path path) {
        a(i, i2, path);
        if (this.dM != 1.0f) {
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f = this.dM;
            matrix.setScale(f, f, (float) (i / 2), (float) (i2 / 2));
            path.transform(this.matrix);
        }
    }

    private void od() {
        ColorStateList colorStateList = this.Mg;
        if (colorStateList == null || this.Mf == null) {
            this.Me = null;
            return;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        this.Me = new PorterDuffColorFilter(colorForState, this.Mf);
        if (this.LZ) {
            this.shadowColor = colorForState;
        }
    }
}
