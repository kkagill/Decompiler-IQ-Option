package com.iqoption.core.ui.widget.clippinglayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.iqoption.core.ui.widget.MaxSizeLinearLayout;

public final class ClipLinearLayout extends MaxSizeLinearLayout {
    private final a bMF;

    public ClipLinearLayout(Context context) {
        super(context);
        this.bMF = new a(this);
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bMF = new a(this, attributeSet);
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet, int i) {
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

    public void draw(Canvas canvas) {
        this.bMF.draw(canvas);
        super.draw(canvas);
    }
}
