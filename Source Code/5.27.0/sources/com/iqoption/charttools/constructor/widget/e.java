package com.iqoption.charttools.constructor.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* compiled from: ThumbPathDrawable */
final class e extends Drawable {
    private final Canvas aHC;
    private final Paint aHD;
    private final Paint aHE;
    private float aHn = 0.0f;
    private final RectF fd = new RectF();
    private final Paint fh;
    private final int maxHeight;
    private final int minHeight;
    private float offset = 0.0f;
    private final float radius;
    private final int width;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    e(int i, int i2, int i3, float f) {
        this.width = i;
        this.minHeight = i2;
        this.maxHeight = i3;
        this.radius = f;
        Bitmap createBitmap = Bitmap.createBitmap(i, i3, Config.ARGB_8888);
        this.aHC = new Canvas(createBitmap);
        this.fh = new Paint(3);
        this.fh.setShader(new BitmapShader(createBitmap, TileMode.CLAMP, TileMode.CLAMP));
        this.aHD = new Paint();
        this.aHE = new Paint();
        this.aHE.setXfermode(new PorterDuffXfermode(Mode.MULTIPLY));
        this.aHE.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) i3, -1, ViewCompat.MEASURED_SIZE_MASK, TileMode.CLAMP));
    }

    private void NQ() {
        this.aHC.drawColor(0, Mode.CLEAR);
        this.aHC.save();
        this.aHC.translate(0.0f, this.offset * (this.aHn - 1.0f));
        this.fd.set(0.0f, 0.0f, (float) this.width, (float) this.maxHeight);
        this.aHC.drawRect(this.fd, this.aHD);
        this.aHC.drawRect(this.fd, this.aHE);
        this.aHC.restore();
    }

    public void draw(@NonNull Canvas canvas) {
        this.fd.set(0.0f, 0.0f, (float) this.width, (float) NR());
        RectF rectF = this.fd;
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, this.fh);
    }

    public void setColor(int i) {
        if (this.aHD.getColor() != i) {
            this.aHD.setColor(i | ViewCompat.MEASURED_STATE_MASK);
            NQ();
            invalidateSelf();
        }
    }

    public void setFraction(float f) {
        if (this.aHn != f) {
            this.aHn = f;
            NQ();
            invalidateSelf();
        }
    }

    public void setOffset(float f) {
        if (this.offset != f) {
            this.offset = f;
            if (this.aHn != 1.0f) {
                NQ();
                invalidateSelf();
            }
        }
    }

    private int NR() {
        int i = this.minHeight;
        return i + Math.round(((float) (this.maxHeight - i)) * this.aHn);
    }

    public int getIntrinsicWidth() {
        return this.width;
    }

    public int getIntrinsicHeight() {
        return this.maxHeight;
    }
}
