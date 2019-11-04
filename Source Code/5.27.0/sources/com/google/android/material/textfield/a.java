package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: CutoutDrawable */
class a extends GradientDrawable {
    private final Paint OW = new Paint(1);
    private final RectF OX;
    private int OY;

    a() {
        oI();
        this.OX = new RectF();
    }

    private void oI() {
        this.OW.setStyle(Style.FILL_AND_STROKE);
        this.OW.setColor(-1);
        this.OW.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    /* Access modifiers changed, original: 0000 */
    public boolean oJ() {
        return this.OX.isEmpty() ^ 1;
    }

    /* Access modifiers changed, original: 0000 */
    public void d(float f, float f2, float f3, float f4) {
        if (f != this.OX.left || f2 != this.OX.top || f3 != this.OX.right || f4 != this.OX.bottom) {
            this.OX.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(RectF rectF) {
        d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* Access modifiers changed, original: 0000 */
    public void oK() {
        d(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void draw(@NonNull Canvas canvas) {
        j(canvas);
        super.draw(canvas);
        canvas.drawRect(this.OX, this.OW);
        l(canvas);
    }

    private void j(@NonNull Canvas canvas) {
        Callback callback = getCallback();
        if (a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            k(canvas);
        }
    }

    private void k(@NonNull Canvas canvas) {
        if (VERSION.SDK_INT >= 21) {
            this.OY = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
            return;
        }
        this.OY = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    private void l(@NonNull Canvas canvas) {
        if (!a(getCallback())) {
            canvas.restoreToCount(this.OY);
        }
    }

    private boolean a(Callback callback) {
        return callback instanceof View;
    }
}
