package com.iqoption.core.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.iqoption.core.i.m;
import com.iqoption.core.ui.widget.d.-CC;

public class MaxSizeFrameLayout extends FrameLayout implements d {
    private int maxHeight = 0;
    private int maxWidth = 0;

    @NonNull
    public /* synthetic */ Point i(int i, int i2, int i3, int i4) {
        return -CC.$default$i(this, i, i2, i3, i4);
    }

    public MaxSizeFrameLayout(Context context) {
        super(context);
    }

    public MaxSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MaxSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @TargetApi(21)
    public MaxSizeFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.MaxSizeFrameLayout, 0, 0);
        try {
            this.maxHeight = obtainStyledAttributes.getDimensionPixelSize(m.MaxSizeFrameLayout_maxHeightFrameLayout, 0);
            this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(m.MaxSizeFrameLayout_maxWidthFrameLayout, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        Point i3 = i(this.maxWidth, this.maxHeight, i, i2);
        super.onMeasure(i3.x, i3.y);
    }
}
