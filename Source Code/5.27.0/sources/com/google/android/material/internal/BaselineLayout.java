package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {
    private int baseline = -1;

    public BaselineLayout(Context context) {
        super(context, null, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i3 = Math.max(i3, baseline);
                    i4 = Math.max(i4, childAt.getMeasuredHeight() - baseline);
                }
                i6 = Math.max(i6, childAt.getMeasuredWidth());
                i5 = Math.max(i5, childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            }
        }
        if (i3 != -1) {
            i5 = Math.max(i5, Math.max(i4, getPaddingBottom()) + i3);
            this.baseline = i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumWidth()), i, i7), View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i2 = getPaddingLeft();
        i3 = ((i3 - i) - getPaddingRight()) - i2;
        i = getPaddingTop();
        for (i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i5 = ((i3 - measuredWidth) / 2) + i2;
                int baseline = (this.baseline == -1 || childAt.getBaseline() == -1) ? i : (this.baseline + i) - childAt.getBaseline();
                childAt.layout(i5, baseline, measuredWidth + i5, measuredHeight + baseline);
            }
        }
    }

    public int getBaseline() {
        return this.baseline;
    }
}
