package com.iqoption.core.ui.e;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JP\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J2\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/ui/span/CenteredImageSpan;", "Landroid/text/style/ImageSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "extraSpace", "", "initialDescent", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "core_release"})
/* compiled from: CenteredImageSpan.kt */
public final class a extends ImageSpan {
    private int bJv;
    private int bJw;

    public a(Drawable drawable) {
        kotlin.jvm.internal.i.f(drawable, "drawable");
        super(drawable);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.i.f(paint, "paint");
        kotlin.jvm.internal.i.f(charSequence, "text");
        Drawable drawable = getDrawable();
        kotlin.jvm.internal.i.e(drawable, "drawable");
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            if (bounds.bottom - (fontMetricsInt.descent - fontMetricsInt.ascent) >= 0) {
                this.bJv = fontMetricsInt.descent;
                this.bJw = bounds.bottom - (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            fontMetricsInt.descent = (this.bJw / 2) + this.bJv;
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.ascent = (-bounds.bottom) + fontMetricsInt.descent;
            fontMetricsInt.top = fontMetricsInt.ascent;
        }
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        kotlin.jvm.internal.i.f(charSequence, "text");
        kotlin.jvm.internal.i.f(paint, "paint");
        canvas.save();
        canvas.translate(f, 0.0f);
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
