package com.iqoption.core.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iqoption.core.i.m;
import com.iqoption.core.ui.widget.d.-CC;

public class MaxSizeConstraintLayout extends ConstraintLayout implements d {
    private int maxHeight = 0;
    private int maxWidth = 0;

    @NonNull
    public /* synthetic */ Point i(int i, int i2, int i3, int i4) {
        return -CC.$default$i(this, i, i2, i3, i4);
    }

    public MaxSizeConstraintLayout(Context context) {
        super(context);
    }

    public MaxSizeConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MaxSizeConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.MaxSizeConstraintLayout, 0, 0);
        try {
            this.maxHeight = obtainStyledAttributes.getDimensionPixelSize(m.MaxSizeConstraintLayout_maxHeightConstraintLayout, 0);
            this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(m.MaxSizeConstraintLayout_maxWidthConstraintLayout, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setWidth(int i) {
        this.maxWidth = i;
        requestLayout();
    }

    public void setHeight(int i) {
        this.maxHeight = i;
        requestLayout();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        Point i3 = i(this.maxWidth, this.maxHeight, i, i2);
        super.onMeasure(i3.x, i3.y);
    }
}
