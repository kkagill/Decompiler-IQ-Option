package com.iqoption.core.graphics.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.iqoption.core.ext.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0012\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/graphics/drawable/InputBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroidx/core/graphics/drawable/TintAwareDrawable;", "colors", "Landroid/content/res/ColorStateList;", "res", "Landroid/content/res/Resources;", "(Landroid/content/res/ColorStateList;Landroid/content/res/Resources;)V", "lineWidth", "", "(Landroid/content/res/ColorStateList;F)V", "paint", "Landroid/graphics/Paint;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getAlpha", "", "getOpacity", "isStateful", "", "onStateChange", "state", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "core_release"})
/* compiled from: InputBackgroundDrawable.kt */
public final class d extends Drawable implements TintAwareDrawable {
    private final ColorStateList biv;
    private final float biw;
    private final Paint fh = new Paint(1);

    public boolean isStateful() {
        return true;
    }

    public d(ColorStateList colorStateList, float f) {
        kotlin.jvm.internal.i.f(colorStateList, "colors");
        this.biv = colorStateList;
        this.biw = f;
    }

    public int getOpacity() {
        if (this.fh.getXfermode() == null && this.fh.getAlpha() != 0) {
        }
        return -3;
    }

    public void draw(Canvas canvas) {
        kotlin.jvm.internal.i.f(canvas, "canvas");
        Paint paint = this.fh;
        Object obj = (paint.getAlpha() == 0 && paint.getXfermode() == null) ? null : 1;
        if (obj != null) {
            Rect bounds = getBounds();
            float j = (float) a.j(bounds);
            canvas.drawRect((float) a.h(bounds), j - this.biw, (float) a.i(bounds), j, this.fh);
        }
    }

    public void setAlpha(int i) {
        if (this.fh.getAlpha() != i) {
            this.fh.setAlpha(i);
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.fh.getAlpha();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if ((kotlin.jvm.internal.i.y(this.fh.getColorFilter(), colorFilter) ^ 1) != 0) {
            this.fh.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean onStateChange(int[] iArr) {
        kotlin.jvm.internal.i.f(iArr, "state");
        int color = this.fh.getColor();
        ColorStateList colorStateList = this.biv;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == color) {
            return false;
        }
        this.fh.setColor(colorForState);
        return true;
    }
}
