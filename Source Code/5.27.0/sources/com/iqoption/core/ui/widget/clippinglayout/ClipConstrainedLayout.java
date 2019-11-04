package com.iqoption.core.ui.widget.clippinglayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.iqoption.core.ui.widget.MaxSizeConstraintLayout;

public final class ClipConstrainedLayout extends MaxSizeConstraintLayout {
    private final a bMF;

    public ClipConstrainedLayout(Context context) {
        super(context);
        this.bMF = new a(this);
    }

    public ClipConstrainedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bMF = new a(this, attributeSet);
    }

    public ClipConstrainedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bMF = new a(this, attributeSet);
    }

    public void setRadius(float f) {
        this.bMF.setRadius(f);
    }

    public float getRadius() {
        return this.bMF.getRadius();
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bMF.ar(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.bMF.draw(canvas);
    }
}
