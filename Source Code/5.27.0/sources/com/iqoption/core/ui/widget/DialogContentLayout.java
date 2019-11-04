package com.iqoption.core.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.iqoption.core.i.m;

public class DialogContentLayout extends FrameLayout {
    private static final Rect bKg = new Rect();
    private static final Rect bKh = new Rect();
    private static final int[] bKi = new int[2];
    private int anchorGravity;
    private int anchorX;
    private int anchorY;
    private boolean bKj;
    private boolean bKk;
    private boolean bKl;

    public static class a extends LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static boolean ao(int i, int i2) {
        return (i & i2) == i2;
    }

    public DialogContentLayout(Context context) {
        super(context);
        init(context, null);
    }

    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public DialogContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    @TargetApi(21)
    public DialogContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.DialogContentLayout);
            setAnchorGravity(obtainStyledAttributes.getInt(m.DialogContentLayout_anchorGravity, 9));
            setAnchorX(obtainStyledAttributes.getDimensionPixelSize(m.DialogContentLayout_anchorX, 0));
            setAnchorY(obtainStyledAttributes.getDimensionPixelSize(m.DialogContentLayout_anchorY, 0));
            setAnchorUseWidth(obtainStyledAttributes.getBoolean(m.DialogContentLayout_anchorUseWidth, false));
            setAnchorUseHeight(obtainStyledAttributes.getBoolean(m.DialogContentLayout_anchorUseHeight, false));
            setIgnoreAnchor(obtainStyledAttributes.getBoolean(m.DialogContentLayout_ignoreAnchor, false));
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        if (childAt != null) {
            measureChildWithMargins(childAt, i, this.bKk ? this.anchorX : 0, i2, this.bKl ? this.anchorY : 0);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.bKj) {
            super.onLayout(z, i, i2, i3, i4);
        } else {
            View childAt = getChildAt(0);
            if (childAt != null) {
                int i5;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                a aVar = (a) childAt.getLayoutParams();
                int i6 = this.anchorX;
                int i7 = this.anchorY;
                getLocationInWindow(bKi);
                i6 = (int) (((float) i6) - (((float) bKi[0]) - getTranslationX()));
                i7 = (int) (((float) i7) - (((float) bKi[1]) - getTranslationY()));
                if (ao(this.anchorGravity, 2)) {
                    i6 -= aVar.getMarginEnd();
                    int i8 = i6;
                    i6 -= measuredWidth;
                    measuredWidth = i8;
                } else {
                    if (ao(this.anchorGravity, 4)) {
                        i6 -= measuredWidth / 2;
                    } else {
                        i6 += aVar.getMarginStart();
                    }
                    measuredWidth += i6;
                }
                if (ao(this.anchorGravity, 16)) {
                    i7 -= aVar.bottomMargin;
                    i5 = i7 - measuredHeight;
                } else {
                    if (ao(this.anchorGravity, 32)) {
                        i5 = i7 - (measuredHeight / 2);
                    } else {
                        i5 = aVar.topMargin + i7;
                    }
                    i7 = i5 + measuredHeight;
                }
                bKg.set(i6, i5, measuredWidth, i7);
                bKh.set(i, i2, i3, i4);
                if (!bKh.contains(bKg)) {
                    int[] iArr = bKi;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2;
                    if (bKg.width() > bKh.width() || bKg.height() > bKh.height()) {
                        i = bKh.left - bKg.left;
                        i2 = bKh.top - bKg.top;
                        iArr2 = bKi;
                        if (i <= 0) {
                            i = 0;
                        }
                        iArr2[0] = i;
                        iArr = bKi;
                        if (i2 <= 0) {
                            i2 = 0;
                        }
                        iArr[1] = i2;
                    } else if (bKg.left < bKh.left || bKg.top < bKh.top) {
                        i = bKh.left - bKg.left;
                        i2 = bKh.top - bKg.top;
                        iArr2 = bKi;
                        if (i <= 0) {
                            i = 0;
                        }
                        iArr2[0] = i;
                        iArr = bKi;
                        if (i2 <= 0) {
                            i2 = 0;
                        }
                        iArr[1] = i2;
                    } else if (bKg.right > bKh.right || bKg.bottom > bKh.bottom) {
                        i = bKh.right - bKg.right;
                        i2 = bKh.bottom - bKg.bottom;
                        iArr2 = bKi;
                        if (i >= 0) {
                            i = 0;
                        }
                        iArr2[0] = i;
                        iArr = bKi;
                        if (i2 >= 0) {
                            i2 = 0;
                        }
                        iArr[1] = i2;
                    }
                    Rect rect = bKg;
                    int[] iArr3 = bKi;
                    rect.offset(iArr3[0], iArr3[1]);
                }
                childAt.layout(bKg.left, bKg.top, bKg.right, bKg.bottom);
            }
        }
    }

    public int getAnchorX() {
        return this.anchorX;
    }

    public void setAnchorX(int i) {
        if (this.anchorX != i) {
            this.anchorX = i;
            requestLayout();
        }
    }

    public int getAnchorY() {
        return this.anchorY;
    }

    public void setAnchorY(int i) {
        if (this.anchorY != i) {
            this.anchorY = i;
            requestLayout();
        }
    }

    public int getAnchorGravity() {
        return this.anchorGravity;
    }

    public void setAnchorGravity(int i) {
        if (this.anchorGravity != i) {
            this.anchorGravity = i;
            requestLayout();
        }
    }

    public void setAnchorUseWidth(boolean z) {
        if (this.bKk != z) {
            this.bKk = z;
            requestLayout();
        }
    }

    public void setAnchorUseHeight(boolean z) {
        if (this.bKl != z) {
            this.bKl = z;
            requestLayout();
        }
    }

    public void setIgnoreAnchor(boolean z) {
        if (this.bKj != z) {
            this.bKj = z;
            requestLayout();
        }
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: c */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
