package com.iqoption.view.blurtextureview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;

/* compiled from: BlurRenderImpl */
abstract class a {
    protected Rect egV;
    protected Rect egW;
    protected int egX;
    protected volatile Bitmap egY;
    protected int mHeight;
    protected Paint mPaint;
    protected int mWidth;

    public void destroy() {
    }

    public void draw(Canvas canvas) {
        canvas.drawColor(0, Mode.CLEAR);
        if (this.egY != null) {
            synchronized (this.egY) {
                a(canvas, this.egY, this.egW, this.egV, this.mPaint);
            }
        }
    }

    public void ar(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    private void a(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        int i;
        rect2.set(0, 0, this.mWidth, this.mHeight);
        rect.set(0, 0, bitmap.getWidth() * this.egX, bitmap.getHeight() * this.egX);
        if (rect2.right < rect.right) {
            i = ((rect.right - rect2.right) / this.egX) / 2;
            rect.left = i;
            rect.right = bitmap.getWidth() - i;
        }
        if (rect2.bottom < rect.bottom) {
            i = ((rect.bottom - rect2.bottom) / this.egX) / 2;
            rect.top = i;
            rect.bottom = bitmap.getHeight() - i;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }
}
