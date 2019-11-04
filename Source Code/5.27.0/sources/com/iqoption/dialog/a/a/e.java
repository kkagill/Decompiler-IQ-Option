package com.iqoption.dialog.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: QuoteValueDrawable */
public final class e extends Drawable {
    private final f cIL = new f();
    private final f cIM = new f();
    private float cIN;

    public int getOpacity() {
        return -3;
    }

    public e(float f, int i, int i2) {
        setGapSize(f);
        fE(i);
        fF(i2);
    }

    public void setText(String str) {
        if (str == null) {
            this.cIL.setText(null);
            this.cIM.setText(null);
            return;
        }
        int length = str.length() - 3;
        this.cIL.setText(str.substring(0, length));
        this.cIM.setText(str.substring(length));
    }

    public void fE(@ColorInt int i) {
        this.cIL.setColor(i);
    }

    public void W(float f) {
        this.cIL.K(f);
    }

    public void fF(@ColorInt int i) {
        this.cIM.setColor(i);
    }

    public void X(float f) {
        this.cIM.K(f);
    }

    public void setGapSize(float f) {
        this.cIN = f;
    }

    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        this.cIL.draw(canvas);
        canvas.translate(((float) this.cIL.getIntrinsicWidth()) + this.cIN, (float) (this.cIL.getIntrinsicHeight() - this.cIM.getIntrinsicHeight()));
        this.cIM.draw(canvas);
        canvas.restore();
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.cIL.setAlpha(i);
        this.cIM.setAlpha(i);
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.cIL.setColorFilter(colorFilter);
        this.cIM.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        return (int) (((float) (this.cIL.getIntrinsicWidth() + this.cIM.getIntrinsicWidth())) + this.cIN);
    }

    public int getIntrinsicHeight() {
        return Math.max(this.cIL.getIntrinsicHeight(), this.cIM.getIntrinsicHeight());
    }
}
