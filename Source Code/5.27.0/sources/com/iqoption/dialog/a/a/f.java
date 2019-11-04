package com.iqoption.dialog.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: TextDrawable */
public final class f extends Drawable {
    private final TextPaint aUf = new TextPaint(1);
    private boolean cIO;
    private float cIP;
    private float height;
    private String text;
    private float width;

    public int getOpacity() {
        return -3;
    }

    public f(String str) {
        setText(str);
    }

    private void atN() {
        this.cIO = true;
    }

    private void lb() {
        float descent = this.aUf.descent();
        float ascent = this.aUf.ascent();
        float f = descent / 3.0f;
        String str = this.text;
        if (str != null) {
            this.width = this.aUf.measureText(str);
        } else {
            this.width = 0.0f;
        }
        this.height = (descent - ascent) - f;
        this.cIP = (-ascent) + f;
        this.cIO = false;
    }

    public void setText(String str) {
        if (str == null ? this.text == null : !str.equals(this.text)) {
            atN();
        }
        this.text = str;
    }

    public void K(float f) {
        if (f != this.aUf.getTextSize()) {
            atN();
        }
        this.aUf.setTextSize(f);
    }

    public void setColor(@ColorInt int i) {
        this.aUf.setColor(i);
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.cIO) {
            lb();
        }
        Rect bounds = getBounds();
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        canvas.drawText(this.text, 0.0f, this.cIP, this.aUf);
        canvas.restore();
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.aUf.setAlpha(i);
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.aUf.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        if (this.cIO) {
            lb();
        }
        return (int) this.width;
    }

    public int getIntrinsicHeight() {
        if (this.cIO) {
            lb();
        }
        return (int) this.height;
    }
}
