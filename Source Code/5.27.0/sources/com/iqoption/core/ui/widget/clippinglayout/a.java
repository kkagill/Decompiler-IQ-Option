package com.iqoption.core.ui.widget.clippinglayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.core.i.m;

/* compiled from: ClipLayout */
final class a {
    private static final RectF bMG = new RectF();
    private final ViewGroup bMH;
    private final Path fb;
    private float radius;

    public a(ViewGroup viewGroup) {
        this(viewGroup, null);
    }

    a(@NonNull ViewGroup viewGroup, @Nullable AttributeSet attributeSet) {
        this.fb = new Path();
        this.bMH = viewGroup;
        viewGroup.setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.ClippingLayout);
            this.radius = obtainStyledAttributes.getDimension(m.ClippingLayout_clippingRadius, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    private Context getContext() {
        return this.bMH.getContext();
    }

    private void invalidate() {
        this.bMH.invalidate();
    }

    private int getWidth() {
        return this.bMH.getWidth();
    }

    private int getHeight() {
        return this.bMH.getHeight();
    }

    /* Access modifiers changed, original: 0000 */
    public float getRadius() {
        return this.radius;
    }

    /* Access modifiers changed, original: 0000 */
    public void setRadius(float f) {
        if (this.radius != f) {
            this.radius = f;
            if (this.bMH.isLaidOut()) {
                aq(getWidth(), getHeight());
            }
            invalidate();
        }
    }

    private void aq(int i, int i2) {
        this.fb.rewind();
        if (this.radius > 0.0f) {
            bMG.set(0.0f, 0.0f, (float) i, (float) i2);
            Path path = this.fb;
            RectF rectF = bMG;
            float f = this.radius;
            path.addRoundRect(rectF, f, f, Direction.CW);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ar(int i, int i2) {
        aq(i, i2);
    }

    /* Access modifiers changed, original: 0000 */
    public void draw(@NonNull Canvas canvas) {
        if (!this.fb.isEmpty()) {
            canvas.clipPath(this.fb);
        }
    }
}
