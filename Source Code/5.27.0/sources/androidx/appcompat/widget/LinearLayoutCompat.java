package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LinearLayoutCompat_Layout);
            this.weight = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.gravity = -1;
            this.weight = f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = -1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    /* Access modifiers changed, original: 0000 */
    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLocationOffset(View view) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNextLocationOffset(View view) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int measureNullChild(int i) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                virtualChildCount = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                virtualChildCount = virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, virtualChildCount);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersHorizontal(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                int right;
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (isLayoutRtl) {
                    right = virtualChildAt.getRight() + layoutParams.rightMargin;
                } else {
                    right = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, right);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int i2;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    virtualChildCount = virtualChildAt2.getLeft() - layoutParams2.leftMargin;
                    i2 = this.mDividerWidth;
                } else {
                    virtualChildCount = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                    drawVerticalDivider(canvas, virtualChildCount);
                }
            } else if (isLayoutRtl) {
                virtualChildCount = getPaddingLeft();
                drawVerticalDivider(canvas, virtualChildCount);
            } else {
                virtualChildCount = getWidth() - getPaddingRight();
                i2 = this.mDividerWidth;
            }
            virtualChildCount -= i2;
            drawVerticalDivider(canvas, virtualChildCount);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    /* Access modifiers changed, original: 0000 */
    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.mBaselineAlignedChildIndex;
        if (childCount > i) {
            View childAt = getChildAt(i);
            i = childAt.getBaseline();
            if (i != -1) {
                int i2 = this.mBaselineChildTop;
                if (this.mOrientation == 1) {
                    int i3 = this.mGravity & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                        }
                    }
                }
                return (i2 + ((LayoutParams) childAt.getLayoutParams()).topMargin) + i;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("base aligned child index out of range (0, ");
            stringBuilder.append(getChildCount());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mBaselineAlignedChildIndex = i;
    }

    /* Access modifiers changed, original: 0000 */
    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    /* Access modifiers changed, original: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    /* Access modifiers changed, original: protected */
    @RestrictTo({Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.mShowDividers & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.mShowDividers & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.mShowDividers & 2) != 0) {
                for (i--; i >= 0; i--) {
                    if (getChildAt(i).getVisibility() != 8) {
                        z = true;
                        break;
                    }
                }
            }
            return z;
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0330  */
    public void measureVertical(int r34, int r35) {
        /*
        r33 = this;
        r7 = r33;
        r8 = r34;
        r9 = r35;
        r10 = 0;
        r7.mTotalLength = r10;
        r11 = r33.getVirtualChildCount();
        r12 = android.view.View.MeasureSpec.getMode(r34);
        r13 = android.view.View.MeasureSpec.getMode(r35);
        r14 = r7.mBaselineAlignedChildIndex;
        r15 = r7.mUseLargestChild;
        r16 = 0;
        r17 = 1;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r18 = 0;
        r19 = 1;
        r20 = 0;
    L_0x002a:
        r10 = 8;
        r22 = r4;
        if (r6 >= r11) goto L_0x019d;
    L_0x0030:
        r4 = r7.getVirtualChildAt(r6);
        if (r4 != 0) goto L_0x0047;
    L_0x0036:
        r4 = r7.mTotalLength;
        r10 = r7.measureNullChild(r6);
        r4 = r4 + r10;
        r7.mTotalLength = r4;
        r23 = r11;
        r4 = r22;
    L_0x0043:
        r22 = r13;
        goto L_0x0191;
    L_0x0047:
        r24 = r1;
        r1 = r4.getVisibility();
        if (r1 != r10) goto L_0x005b;
    L_0x004f:
        r1 = r7.getChildrenSkipCount(r4, r6);
        r6 = r6 + r1;
        r23 = r11;
        r4 = r22;
        r1 = r24;
        goto L_0x0043;
    L_0x005b:
        r1 = r7.hasDividerBeforeChildAt(r6);
        if (r1 == 0) goto L_0x0068;
    L_0x0061:
        r1 = r7.mTotalLength;
        r10 = r7.mDividerHeight;
        r1 = r1 + r10;
        r7.mTotalLength = r1;
    L_0x0068:
        r1 = r4.getLayoutParams();
        r10 = r1;
        r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10;
        r1 = r10.weight;
        r25 = r0 + r1;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 != r1) goto L_0x00a6;
    L_0x0077:
        r0 = r10.height;
        if (r0 != 0) goto L_0x00a6;
    L_0x007b:
        r0 = r10.weight;
        r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a6;
    L_0x0081:
        r0 = r7.mTotalLength;
        r1 = r10.topMargin;
        r1 = r1 + r0;
        r26 = r2;
        r2 = r10.bottomMargin;
        r1 = r1 + r2;
        r0 = java.lang.Math.max(r0, r1);
        r7.mTotalLength = r0;
        r0 = r3;
        r3 = r4;
        r31 = r5;
        r23 = r11;
        r8 = r24;
        r30 = r26;
        r18 = 1;
        r11 = r6;
        r32 = r22;
        r22 = r13;
        r13 = r32;
        goto L_0x0118;
    L_0x00a6:
        r26 = r2;
        r0 = r10.height;
        if (r0 != 0) goto L_0x00b7;
    L_0x00ac:
        r0 = r10.weight;
        r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b7;
    L_0x00b2:
        r0 = -2;
        r10.height = r0;
        r2 = 0;
        goto L_0x00b9;
    L_0x00b7:
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x00b9:
        r27 = 0;
        r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1));
        if (r0 != 0) goto L_0x00c4;
    L_0x00bf:
        r0 = r7.mTotalLength;
        r28 = r0;
        goto L_0x00c6;
    L_0x00c4:
        r28 = 0;
    L_0x00c6:
        r0 = r33;
        r8 = r24;
        r23 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r4;
        r29 = r2;
        r30 = r26;
        r2 = r6;
        r9 = r3;
        r3 = r34;
        r24 = r4;
        r23 = r11;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r32 = r22;
        r22 = r13;
        r13 = r32;
        r4 = r27;
        r31 = r5;
        r5 = r35;
        r11 = r6;
        r6 = r28;
        r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6);
        r0 = r29;
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 == r1) goto L_0x00f5;
    L_0x00f3:
        r10.height = r0;
    L_0x00f5:
        r0 = r24.getMeasuredHeight();
        r1 = r7.mTotalLength;
        r2 = r1 + r0;
        r3 = r10.topMargin;
        r2 = r2 + r3;
        r3 = r10.bottomMargin;
        r2 = r2 + r3;
        r3 = r24;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = java.lang.Math.max(r1, r2);
        r7.mTotalLength = r1;
        if (r15 == 0) goto L_0x0117;
    L_0x0112:
        r0 = java.lang.Math.max(r0, r9);
        goto L_0x0118;
    L_0x0117:
        r0 = r9;
    L_0x0118:
        if (r14 < 0) goto L_0x0122;
    L_0x011a:
        r6 = r11 + 1;
        if (r14 != r6) goto L_0x0122;
    L_0x011e:
        r1 = r7.mTotalLength;
        r7.mBaselineChildTop = r1;
    L_0x0122:
        if (r11 >= r14) goto L_0x0133;
    L_0x0124:
        r1 = r10.weight;
        r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1));
        if (r1 > 0) goto L_0x012b;
    L_0x012a:
        goto L_0x0133;
    L_0x012b:
        r0 = new java.lang.RuntimeException;
        r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.";
        r0.<init>(r1);
        throw r0;
    L_0x0133:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r1) goto L_0x0140;
    L_0x0137:
        r1 = r10.width;
        r2 = -1;
        if (r1 != r2) goto L_0x0140;
    L_0x013c:
        r1 = 1;
        r20 = 1;
        goto L_0x0141;
    L_0x0140:
        r1 = 0;
    L_0x0141:
        r2 = r10.leftMargin;
        r4 = r10.rightMargin;
        r2 = r2 + r4;
        r4 = r3.getMeasuredWidth();
        r4 = r4 + r2;
        r5 = r30;
        r5 = java.lang.Math.max(r5, r4);
        r6 = r3.getMeasuredState();
        r6 = android.view.View.combineMeasuredStates(r8, r6);
        if (r19 == 0) goto L_0x0162;
    L_0x015b:
        r8 = r10.width;
        r9 = -1;
        if (r8 != r9) goto L_0x0162;
    L_0x0160:
        r8 = 1;
        goto L_0x0163;
    L_0x0162:
        r8 = 0;
    L_0x0163:
        r9 = r10.weight;
        r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1));
        if (r9 <= 0) goto L_0x0175;
    L_0x0169:
        if (r1 == 0) goto L_0x016c;
    L_0x016b:
        goto L_0x016d;
    L_0x016c:
        r2 = r4;
    L_0x016d:
        r4 = java.lang.Math.max(r13, r2);
        r13 = r4;
        r1 = r31;
        goto L_0x017f;
    L_0x0175:
        if (r1 == 0) goto L_0x0178;
    L_0x0177:
        goto L_0x0179;
    L_0x0178:
        r2 = r4;
    L_0x0179:
        r1 = r31;
        r1 = java.lang.Math.max(r1, r2);
    L_0x017f:
        r2 = r7.getChildrenSkipCount(r3, r11);
        r2 = r2 + r11;
        r3 = r0;
        r19 = r8;
        r4 = r13;
        r0 = r25;
        r32 = r5;
        r5 = r1;
        r1 = r6;
        r6 = r2;
        r2 = r32;
    L_0x0191:
        r6 = r6 + 1;
        r8 = r34;
        r9 = r35;
        r13 = r22;
        r11 = r23;
        goto L_0x002a;
    L_0x019d:
        r8 = r1;
        r9 = r3;
        r1 = r5;
        r23 = r11;
        r5 = r2;
        r32 = r22;
        r22 = r13;
        r13 = r32;
        r2 = r7.mTotalLength;
        if (r2 <= 0) goto L_0x01bd;
    L_0x01ad:
        r2 = r23;
        r3 = r7.hasDividerBeforeChildAt(r2);
        if (r3 == 0) goto L_0x01bf;
    L_0x01b5:
        r3 = r7.mTotalLength;
        r4 = r7.mDividerHeight;
        r3 = r3 + r4;
        r7.mTotalLength = r3;
        goto L_0x01bf;
    L_0x01bd:
        r2 = r23;
    L_0x01bf:
        if (r15 == 0) goto L_0x020e;
    L_0x01c1:
        r3 = r22;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r3 == r4) goto L_0x01c9;
    L_0x01c7:
        if (r3 != 0) goto L_0x0210;
    L_0x01c9:
        r4 = 0;
        r7.mTotalLength = r4;
        r4 = 0;
    L_0x01cd:
        if (r4 >= r2) goto L_0x0210;
    L_0x01cf:
        r6 = r7.getVirtualChildAt(r4);
        if (r6 != 0) goto L_0x01df;
    L_0x01d5:
        r6 = r7.mTotalLength;
        r11 = r7.measureNullChild(r4);
        r6 = r6 + r11;
        r7.mTotalLength = r6;
        goto L_0x0209;
    L_0x01df:
        r11 = r6.getVisibility();
        if (r11 != r10) goto L_0x01eb;
    L_0x01e5:
        r6 = r7.getChildrenSkipCount(r6, r4);
        r4 = r4 + r6;
        goto L_0x0209;
    L_0x01eb:
        r11 = r6.getLayoutParams();
        r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11;
        r14 = r7.mTotalLength;
        r21 = r14 + r9;
        r10 = r11.topMargin;
        r21 = r21 + r10;
        r10 = r11.bottomMargin;
        r21 = r21 + r10;
        r6 = r7.getNextLocationOffset(r6);
        r6 = r21 + r6;
        r6 = java.lang.Math.max(r14, r6);
        r7.mTotalLength = r6;
    L_0x0209:
        r4 = r4 + 1;
        r10 = 8;
        goto L_0x01cd;
    L_0x020e:
        r3 = r22;
    L_0x0210:
        r4 = r7.mTotalLength;
        r6 = r33.getPaddingTop();
        r10 = r33.getPaddingBottom();
        r6 = r6 + r10;
        r4 = r4 + r6;
        r7.mTotalLength = r4;
        r4 = r7.mTotalLength;
        r6 = r33.getSuggestedMinimumHeight();
        r4 = java.lang.Math.max(r4, r6);
        r6 = r35;
        r10 = r9;
        r9 = 0;
        r4 = android.view.View.resolveSizeAndState(r4, r6, r9);
        r9 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r9 = r9 & r4;
        r11 = r7.mTotalLength;
        r9 = r9 - r11;
        if (r18 != 0) goto L_0x0281;
    L_0x0239:
        if (r9 == 0) goto L_0x0240;
    L_0x023b:
        r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r11 <= 0) goto L_0x0240;
    L_0x023f:
        goto L_0x0281;
    L_0x0240:
        r0 = java.lang.Math.max(r1, r13);
        if (r15 == 0) goto L_0x027c;
    L_0x0246:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r3 == r1) goto L_0x027c;
    L_0x024a:
        r1 = 0;
    L_0x024b:
        if (r1 >= r2) goto L_0x027c;
    L_0x024d:
        r3 = r7.getVirtualChildAt(r1);
        if (r3 == 0) goto L_0x0279;
    L_0x0253:
        r9 = r3.getVisibility();
        r11 = 8;
        if (r9 != r11) goto L_0x025c;
    L_0x025b:
        goto L_0x0279;
    L_0x025c:
        r9 = r3.getLayoutParams();
        r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9;
        r9 = r9.weight;
        r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1));
        if (r9 <= 0) goto L_0x0279;
    L_0x0268:
        r9 = r3.getMeasuredWidth();
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11);
        r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11);
        r3.measure(r9, r13);
    L_0x0279:
        r1 = r1 + 1;
        goto L_0x024b;
    L_0x027c:
        r11 = r34;
        r1 = r8;
        goto L_0x0374;
    L_0x0281:
        r10 = r7.mWeightSum;
        r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1));
        if (r11 <= 0) goto L_0x0288;
    L_0x0287:
        r0 = r10;
    L_0x0288:
        r10 = 0;
        r7.mTotalLength = r10;
        r11 = r0;
        r0 = 0;
        r32 = r8;
        r8 = r1;
        r1 = r32;
    L_0x0292:
        if (r0 >= r2) goto L_0x0363;
    L_0x0294:
        r13 = r7.getVirtualChildAt(r0);
        r14 = r13.getVisibility();
        r15 = 8;
        if (r14 != r15) goto L_0x02a6;
    L_0x02a0:
        r21 = r11;
        r11 = r34;
        goto L_0x035c;
    L_0x02a6:
        r14 = r13.getLayoutParams();
        r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14;
        r10 = r14.weight;
        r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1));
        if (r18 <= 0) goto L_0x0307;
    L_0x02b2:
        r15 = (float) r9;
        r15 = r15 * r10;
        r15 = r15 / r11;
        r15 = (int) r15;
        r11 = r11 - r10;
        r9 = r9 - r15;
        r10 = r33.getPaddingLeft();
        r18 = r33.getPaddingRight();
        r10 = r10 + r18;
        r18 = r9;
        r9 = r14.leftMargin;
        r10 = r10 + r9;
        r9 = r14.rightMargin;
        r10 = r10 + r9;
        r9 = r14.width;
        r21 = r11;
        r11 = r34;
        r9 = getChildMeasureSpec(r11, r10, r9);
        r10 = r14.height;
        if (r10 != 0) goto L_0x02ea;
    L_0x02d9:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r3 == r10) goto L_0x02de;
    L_0x02dd:
        goto L_0x02ec;
    L_0x02de:
        if (r15 <= 0) goto L_0x02e1;
    L_0x02e0:
        goto L_0x02e2;
    L_0x02e1:
        r15 = 0;
    L_0x02e2:
        r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10);
        r13.measure(r9, r15);
        goto L_0x02fc;
    L_0x02ea:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x02ec:
        r23 = r13.getMeasuredHeight();
        r15 = r23 + r15;
        if (r15 >= 0) goto L_0x02f5;
    L_0x02f4:
        r15 = 0;
    L_0x02f5:
        r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10);
        r13.measure(r9, r15);
    L_0x02fc:
        r9 = r13.getMeasuredState();
        r9 = r9 & -256;
        r1 = android.view.View.combineMeasuredStates(r1, r9);
        goto L_0x030e;
    L_0x0307:
        r10 = r11;
        r11 = r34;
        r18 = r9;
        r21 = r10;
    L_0x030e:
        r9 = r14.leftMargin;
        r10 = r14.rightMargin;
        r9 = r9 + r10;
        r10 = r13.getMeasuredWidth();
        r10 = r10 + r9;
        r5 = java.lang.Math.max(r5, r10);
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r15) goto L_0x0329;
    L_0x0320:
        r15 = r14.width;
        r23 = r1;
        r1 = -1;
        if (r15 != r1) goto L_0x032c;
    L_0x0327:
        r15 = 1;
        goto L_0x032d;
    L_0x0329:
        r23 = r1;
        r1 = -1;
    L_0x032c:
        r15 = 0;
    L_0x032d:
        if (r15 == 0) goto L_0x0330;
    L_0x032f:
        goto L_0x0331;
    L_0x0330:
        r9 = r10;
    L_0x0331:
        r8 = java.lang.Math.max(r8, r9);
        if (r19 == 0) goto L_0x033d;
    L_0x0337:
        r9 = r14.width;
        if (r9 != r1) goto L_0x033d;
    L_0x033b:
        r9 = 1;
        goto L_0x033e;
    L_0x033d:
        r9 = 0;
    L_0x033e:
        r10 = r7.mTotalLength;
        r15 = r13.getMeasuredHeight();
        r15 = r15 + r10;
        r1 = r14.topMargin;
        r15 = r15 + r1;
        r1 = r14.bottomMargin;
        r15 = r15 + r1;
        r1 = r7.getNextLocationOffset(r13);
        r15 = r15 + r1;
        r1 = java.lang.Math.max(r10, r15);
        r7.mTotalLength = r1;
        r19 = r9;
        r9 = r18;
        r1 = r23;
    L_0x035c:
        r0 = r0 + 1;
        r11 = r21;
        r10 = 0;
        goto L_0x0292;
    L_0x0363:
        r11 = r34;
        r0 = r7.mTotalLength;
        r3 = r33.getPaddingTop();
        r9 = r33.getPaddingBottom();
        r3 = r3 + r9;
        r0 = r0 + r3;
        r7.mTotalLength = r0;
        r0 = r8;
    L_0x0374:
        if (r19 != 0) goto L_0x037b;
    L_0x0376:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r3) goto L_0x037b;
    L_0x037a:
        goto L_0x037c;
    L_0x037b:
        r0 = r5;
    L_0x037c:
        r3 = r33.getPaddingLeft();
        r5 = r33.getPaddingRight();
        r3 = r3 + r5;
        r0 = r0 + r3;
        r3 = r33.getSuggestedMinimumWidth();
        r0 = java.lang.Math.max(r0, r3);
        r0 = android.view.View.resolveSizeAndState(r0, r11, r1);
        r7.setMeasuredDimension(r0, r4);
        if (r20 == 0) goto L_0x039a;
    L_0x0397:
        r7.forceUniformWidth(r2, r6);
    L_0x039a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x044b  */
    public void measureHorizontal(int r39, int r40) {
        /*
        r38 = this;
        r7 = r38;
        r8 = r39;
        r9 = r40;
        r10 = 0;
        r7.mTotalLength = r10;
        r11 = r38.getVirtualChildCount();
        r12 = android.view.View.MeasureSpec.getMode(r39);
        r13 = android.view.View.MeasureSpec.getMode(r40);
        r0 = r7.mMaxAscent;
        r14 = 4;
        if (r0 == 0) goto L_0x001e;
    L_0x001a:
        r0 = r7.mMaxDescent;
        if (r0 != 0) goto L_0x0026;
    L_0x001e:
        r0 = new int[r14];
        r7.mMaxAscent = r0;
        r0 = new int[r14];
        r7.mMaxDescent = r0;
    L_0x0026:
        r15 = r7.mMaxAscent;
        r6 = r7.mMaxDescent;
        r16 = 3;
        r5 = -1;
        r15[r16] = r5;
        r17 = 2;
        r15[r17] = r5;
        r18 = 1;
        r15[r18] = r5;
        r15[r10] = r5;
        r6[r16] = r5;
        r6[r17] = r5;
        r6[r18] = r5;
        r6[r10] = r5;
        r4 = r7.mBaselineAligned;
        r3 = r7.mUseLargestChild;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 != r2) goto L_0x004c;
    L_0x0049:
        r19 = 1;
        goto L_0x004e;
    L_0x004c:
        r19 = 0;
    L_0x004e:
        r20 = 0;
        r0 = 0;
        r1 = 0;
        r14 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r26 = 0;
        r27 = 1;
        r28 = 0;
    L_0x0061:
        r29 = r6;
        r5 = 8;
        if (r1 >= r11) goto L_0x0205;
    L_0x0067:
        r6 = r7.getVirtualChildAt(r1);
        if (r6 != 0) goto L_0x007c;
    L_0x006d:
        r5 = r7.mTotalLength;
        r6 = r7.measureNullChild(r1);
        r5 = r5 + r6;
        r7.mTotalLength = r5;
    L_0x0076:
        r33 = r3;
        r37 = r4;
        goto L_0x01f5;
    L_0x007c:
        r10 = r6.getVisibility();
        if (r10 != r5) goto L_0x0088;
    L_0x0082:
        r5 = r7.getChildrenSkipCount(r6, r1);
        r1 = r1 + r5;
        goto L_0x0076;
    L_0x0088:
        r5 = r7.hasDividerBeforeChildAt(r1);
        if (r5 == 0) goto L_0x0095;
    L_0x008e:
        r5 = r7.mTotalLength;
        r10 = r7.mDividerWidth;
        r5 = r5 + r10;
        r7.mTotalLength = r5;
    L_0x0095:
        r5 = r6.getLayoutParams();
        r10 = r5;
        r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10;
        r5 = r10.weight;
        r32 = r0 + r5;
        if (r12 != r2) goto L_0x00eb;
    L_0x00a2:
        r0 = r10.width;
        if (r0 != 0) goto L_0x00eb;
    L_0x00a6:
        r0 = r10.weight;
        r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r0 <= 0) goto L_0x00eb;
    L_0x00ac:
        if (r19 == 0) goto L_0x00b9;
    L_0x00ae:
        r0 = r7.mTotalLength;
        r5 = r10.leftMargin;
        r2 = r10.rightMargin;
        r5 = r5 + r2;
        r0 = r0 + r5;
        r7.mTotalLength = r0;
        goto L_0x00c7;
    L_0x00b9:
        r0 = r7.mTotalLength;
        r2 = r10.leftMargin;
        r2 = r2 + r0;
        r5 = r10.rightMargin;
        r2 = r2 + r5;
        r0 = java.lang.Math.max(r0, r2);
        r7.mTotalLength = r0;
    L_0x00c7:
        if (r4 == 0) goto L_0x00dc;
    L_0x00c9:
        r0 = 0;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0);
        r6.measure(r2, r2);
        r35 = r1;
        r33 = r3;
        r37 = r4;
        r3 = r6;
        r31 = -2;
        goto L_0x0167;
    L_0x00dc:
        r35 = r1;
        r33 = r3;
        r37 = r4;
        r3 = r6;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r24 = 1;
        r31 = -2;
        goto L_0x0169;
    L_0x00eb:
        r0 = r10.width;
        if (r0 != 0) goto L_0x00fa;
    L_0x00ef:
        r0 = r10.weight;
        r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r0 <= 0) goto L_0x00fa;
    L_0x00f5:
        r5 = -2;
        r10.width = r5;
        r2 = 0;
        goto L_0x00fd;
    L_0x00fa:
        r5 = -2;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x00fd:
        r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1));
        if (r0 != 0) goto L_0x0106;
    L_0x0101:
        r0 = r7.mTotalLength;
        r30 = r0;
        goto L_0x0108;
    L_0x0106:
        r30 = 0;
    L_0x0108:
        r34 = 0;
        r0 = r38;
        r35 = r1;
        r1 = r6;
        r36 = r2;
        r2 = r35;
        r33 = r3;
        r3 = r39;
        r37 = r4;
        r4 = r30;
        r9 = -1;
        r30 = -2;
        r5 = r40;
        r30 = r6;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r31 = -2;
        r6 = r34;
        r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6);
        r0 = r36;
        if (r0 == r9) goto L_0x0131;
    L_0x012f:
        r10.width = r0;
    L_0x0131:
        r0 = r30.getMeasuredWidth();
        if (r19 == 0) goto L_0x014a;
    L_0x0137:
        r1 = r7.mTotalLength;
        r2 = r10.leftMargin;
        r2 = r2 + r0;
        r3 = r10.rightMargin;
        r2 = r2 + r3;
        r3 = r30;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = r1 + r2;
        r7.mTotalLength = r1;
        goto L_0x0161;
    L_0x014a:
        r3 = r30;
        r1 = r7.mTotalLength;
        r2 = r1 + r0;
        r4 = r10.leftMargin;
        r2 = r2 + r4;
        r4 = r10.rightMargin;
        r2 = r2 + r4;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = java.lang.Math.max(r1, r2);
        r7.mTotalLength = r1;
    L_0x0161:
        if (r33 == 0) goto L_0x0167;
    L_0x0163:
        r14 = java.lang.Math.max(r0, r14);
    L_0x0167:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0169:
        if (r13 == r1) goto L_0x0174;
    L_0x016b:
        r0 = r10.height;
        r2 = -1;
        if (r0 != r2) goto L_0x0174;
    L_0x0170:
        r0 = 1;
        r28 = 1;
        goto L_0x0175;
    L_0x0174:
        r0 = 0;
    L_0x0175:
        r2 = r10.topMargin;
        r4 = r10.bottomMargin;
        r2 = r2 + r4;
        r4 = r3.getMeasuredHeight();
        r4 = r4 + r2;
        r5 = r3.getMeasuredState();
        r6 = r26;
        r5 = android.view.View.combineMeasuredStates(r6, r5);
        if (r37 == 0) goto L_0x01b7;
    L_0x018b:
        r6 = r3.getBaseline();
        r9 = -1;
        if (r6 == r9) goto L_0x01b7;
    L_0x0192:
        r9 = r10.gravity;
        if (r9 >= 0) goto L_0x0199;
    L_0x0196:
        r9 = r7.mGravity;
        goto L_0x019b;
    L_0x0199:
        r9 = r10.gravity;
    L_0x019b:
        r9 = r9 & 112;
        r25 = 4;
        r9 = r9 >> 4;
        r9 = r9 & -2;
        r9 = r9 >> 1;
        r1 = r15[r9];
        r1 = java.lang.Math.max(r1, r6);
        r15[r9] = r1;
        r1 = r29[r9];
        r6 = r4 - r6;
        r1 = java.lang.Math.max(r1, r6);
        r29[r9] = r1;
    L_0x01b7:
        r1 = r21;
        r1 = java.lang.Math.max(r1, r4);
        if (r27 == 0) goto L_0x01c6;
    L_0x01bf:
        r6 = r10.height;
        r9 = -1;
        if (r6 != r9) goto L_0x01c6;
    L_0x01c4:
        r6 = 1;
        goto L_0x01c7;
    L_0x01c6:
        r6 = 0;
    L_0x01c7:
        r9 = r10.weight;
        r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1));
        if (r9 <= 0) goto L_0x01d8;
    L_0x01cd:
        if (r0 == 0) goto L_0x01d0;
    L_0x01cf:
        goto L_0x01d1;
    L_0x01d0:
        r2 = r4;
    L_0x01d1:
        r10 = r23;
        r23 = java.lang.Math.max(r10, r2);
        goto L_0x01e5;
    L_0x01d8:
        r10 = r23;
        if (r0 == 0) goto L_0x01dd;
    L_0x01dc:
        r4 = r2;
    L_0x01dd:
        r2 = r22;
        r22 = java.lang.Math.max(r2, r4);
        r23 = r10;
    L_0x01e5:
        r10 = r35;
        r0 = r7.getChildrenSkipCount(r3, r10);
        r0 = r0 + r10;
        r21 = r1;
        r26 = r5;
        r27 = r6;
        r1 = r0;
        r0 = r32;
    L_0x01f5:
        r1 = r1 + 1;
        r9 = r40;
        r6 = r29;
        r3 = r33;
        r4 = r37;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -1;
        r10 = 0;
        goto L_0x0061;
    L_0x0205:
        r33 = r3;
        r37 = r4;
        r1 = r21;
        r2 = r22;
        r10 = r23;
        r6 = r26;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r31 = -2;
        r3 = r7.mTotalLength;
        if (r3 <= 0) goto L_0x0226;
    L_0x0219:
        r3 = r7.hasDividerBeforeChildAt(r11);
        if (r3 == 0) goto L_0x0226;
    L_0x021f:
        r3 = r7.mTotalLength;
        r4 = r7.mDividerWidth;
        r3 = r3 + r4;
        r7.mTotalLength = r3;
    L_0x0226:
        r3 = r15[r18];
        r4 = -1;
        if (r3 != r4) goto L_0x023c;
    L_0x022b:
        r3 = 0;
        r5 = r15[r3];
        if (r5 != r4) goto L_0x023c;
    L_0x0230:
        r3 = r15[r17];
        if (r3 != r4) goto L_0x023c;
    L_0x0234:
        r3 = r15[r16];
        if (r3 == r4) goto L_0x0239;
    L_0x0238:
        goto L_0x023c;
    L_0x0239:
        r23 = r6;
        goto L_0x026d;
    L_0x023c:
        r3 = r15[r16];
        r4 = 0;
        r5 = r15[r4];
        r9 = r15[r18];
        r4 = r15[r17];
        r4 = java.lang.Math.max(r9, r4);
        r4 = java.lang.Math.max(r5, r4);
        r3 = java.lang.Math.max(r3, r4);
        r4 = r29[r16];
        r5 = 0;
        r9 = r29[r5];
        r5 = r29[r18];
        r23 = r6;
        r6 = r29[r17];
        r5 = java.lang.Math.max(r5, r6);
        r5 = java.lang.Math.max(r9, r5);
        r4 = java.lang.Math.max(r4, r5);
        r3 = r3 + r4;
        r1 = java.lang.Math.max(r1, r3);
    L_0x026d:
        if (r33 == 0) goto L_0x02d0;
    L_0x026f:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r12 == r3) goto L_0x0275;
    L_0x0273:
        if (r12 != 0) goto L_0x02d0;
    L_0x0275:
        r3 = 0;
        r7.mTotalLength = r3;
        r3 = 0;
    L_0x0279:
        if (r3 >= r11) goto L_0x02d0;
    L_0x027b:
        r4 = r7.getVirtualChildAt(r3);
        if (r4 != 0) goto L_0x028b;
    L_0x0281:
        r4 = r7.mTotalLength;
        r5 = r7.measureNullChild(r3);
        r4 = r4 + r5;
        r7.mTotalLength = r4;
        goto L_0x0298;
    L_0x028b:
        r5 = r4.getVisibility();
        r6 = 8;
        if (r5 != r6) goto L_0x029b;
    L_0x0293:
        r4 = r7.getChildrenSkipCount(r4, r3);
        r3 = r3 + r4;
    L_0x0298:
        r22 = r1;
        goto L_0x02cb;
    L_0x029b:
        r5 = r4.getLayoutParams();
        r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5;
        if (r19 == 0) goto L_0x02b4;
    L_0x02a3:
        r6 = r7.mTotalLength;
        r9 = r5.leftMargin;
        r9 = r9 + r14;
        r5 = r5.rightMargin;
        r9 = r9 + r5;
        r4 = r7.getNextLocationOffset(r4);
        r9 = r9 + r4;
        r6 = r6 + r9;
        r7.mTotalLength = r6;
        goto L_0x0298;
    L_0x02b4:
        r6 = r7.mTotalLength;
        r9 = r6 + r14;
        r22 = r1;
        r1 = r5.leftMargin;
        r9 = r9 + r1;
        r1 = r5.rightMargin;
        r9 = r9 + r1;
        r1 = r7.getNextLocationOffset(r4);
        r9 = r9 + r1;
        r1 = java.lang.Math.max(r6, r9);
        r7.mTotalLength = r1;
    L_0x02cb:
        r3 = r3 + 1;
        r1 = r22;
        goto L_0x0279;
    L_0x02d0:
        r22 = r1;
        r1 = r7.mTotalLength;
        r3 = r38.getPaddingLeft();
        r4 = r38.getPaddingRight();
        r3 = r3 + r4;
        r1 = r1 + r3;
        r7.mTotalLength = r1;
        r1 = r7.mTotalLength;
        r3 = r38.getSuggestedMinimumWidth();
        r1 = java.lang.Math.max(r1, r3);
        r3 = 0;
        r1 = android.view.View.resolveSizeAndState(r1, r8, r3);
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 & r1;
        r4 = r7.mTotalLength;
        r3 = r3 - r4;
        if (r24 != 0) goto L_0x0343;
    L_0x02f8:
        if (r3 == 0) goto L_0x02ff;
    L_0x02fa:
        r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r5 <= 0) goto L_0x02ff;
    L_0x02fe:
        goto L_0x0343;
    L_0x02ff:
        r0 = java.lang.Math.max(r2, r10);
        if (r33 == 0) goto L_0x033b;
    L_0x0305:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r2) goto L_0x033b;
    L_0x0309:
        r2 = 0;
    L_0x030a:
        if (r2 >= r11) goto L_0x033b;
    L_0x030c:
        r3 = r7.getVirtualChildAt(r2);
        if (r3 == 0) goto L_0x0338;
    L_0x0312:
        r5 = r3.getVisibility();
        r6 = 8;
        if (r5 != r6) goto L_0x031b;
    L_0x031a:
        goto L_0x0338;
    L_0x031b:
        r5 = r3.getLayoutParams();
        r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5;
        r5 = r5.weight;
        r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1));
        if (r5 <= 0) goto L_0x0338;
    L_0x0327:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5);
        r9 = r3.getMeasuredHeight();
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5);
        r3.measure(r6, r9);
    L_0x0338:
        r2 = r2 + 1;
        goto L_0x030a;
    L_0x033b:
        r3 = r40;
        r26 = r11;
        r2 = r22;
        goto L_0x04e8;
    L_0x0343:
        r5 = r7.mWeightSum;
        r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1));
        if (r6 <= 0) goto L_0x034a;
    L_0x0349:
        r0 = r5;
    L_0x034a:
        r5 = -1;
        r15[r16] = r5;
        r15[r17] = r5;
        r15[r18] = r5;
        r6 = 0;
        r15[r6] = r5;
        r29[r16] = r5;
        r29[r17] = r5;
        r29[r18] = r5;
        r29[r6] = r5;
        r7.mTotalLength = r6;
        r10 = r2;
        r9 = r23;
        r6 = -1;
        r2 = r0;
        r0 = 0;
    L_0x0364:
        if (r0 >= r11) goto L_0x048f;
    L_0x0366:
        r14 = r7.getVirtualChildAt(r0);
        if (r14 == 0) goto L_0x047e;
    L_0x036c:
        r5 = r14.getVisibility();
        r4 = 8;
        if (r5 != r4) goto L_0x0376;
    L_0x0374:
        goto L_0x047e;
    L_0x0376:
        r5 = r14.getLayoutParams();
        r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5;
        r4 = r5.weight;
        r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1));
        if (r23 <= 0) goto L_0x03df;
    L_0x0382:
        r8 = (float) r3;
        r8 = r8 * r4;
        r8 = r8 / r2;
        r8 = (int) r8;
        r2 = r2 - r4;
        r3 = r3 - r8;
        r4 = r38.getPaddingTop();
        r23 = r38.getPaddingBottom();
        r4 = r4 + r23;
        r23 = r2;
        r2 = r5.topMargin;
        r4 = r4 + r2;
        r2 = r5.bottomMargin;
        r4 = r4 + r2;
        r2 = r5.height;
        r24 = r3;
        r26 = r11;
        r11 = -1;
        r3 = r40;
        r2 = getChildMeasureSpec(r3, r4, r2);
        r4 = r5.width;
        if (r4 != 0) goto L_0x03bd;
    L_0x03ac:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r4) goto L_0x03b1;
    L_0x03b0:
        goto L_0x03bf;
    L_0x03b1:
        if (r8 <= 0) goto L_0x03b4;
    L_0x03b3:
        goto L_0x03b5;
    L_0x03b4:
        r8 = 0;
    L_0x03b5:
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4);
        r14.measure(r8, r2);
        goto L_0x03cf;
    L_0x03bd:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x03bf:
        r30 = r14.getMeasuredWidth();
        r8 = r30 + r8;
        if (r8 >= 0) goto L_0x03c8;
    L_0x03c7:
        r8 = 0;
    L_0x03c8:
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4);
        r14.measure(r8, r2);
    L_0x03cf:
        r2 = r14.getMeasuredState();
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2 = r2 & r4;
        r9 = android.view.View.combineMeasuredStates(r9, r2);
        r2 = r23;
        r4 = r24;
        goto L_0x03e5;
    L_0x03df:
        r4 = r3;
        r26 = r11;
        r11 = -1;
        r3 = r40;
    L_0x03e5:
        if (r19 == 0) goto L_0x0402;
    L_0x03e7:
        r8 = r7.mTotalLength;
        r23 = r14.getMeasuredWidth();
        r11 = r5.leftMargin;
        r23 = r23 + r11;
        r11 = r5.rightMargin;
        r23 = r23 + r11;
        r11 = r7.getNextLocationOffset(r14);
        r23 = r23 + r11;
        r8 = r8 + r23;
        r7.mTotalLength = r8;
        r23 = r2;
        goto L_0x041c;
    L_0x0402:
        r8 = r7.mTotalLength;
        r11 = r14.getMeasuredWidth();
        r11 = r11 + r8;
        r23 = r2;
        r2 = r5.leftMargin;
        r11 = r11 + r2;
        r2 = r5.rightMargin;
        r11 = r11 + r2;
        r2 = r7.getNextLocationOffset(r14);
        r11 = r11 + r2;
        r2 = java.lang.Math.max(r8, r11);
        r7.mTotalLength = r2;
    L_0x041c:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 == r2) goto L_0x0427;
    L_0x0420:
        r2 = r5.height;
        r8 = -1;
        if (r2 != r8) goto L_0x0427;
    L_0x0425:
        r2 = 1;
        goto L_0x0428;
    L_0x0427:
        r2 = 0;
    L_0x0428:
        r8 = r5.topMargin;
        r11 = r5.bottomMargin;
        r8 = r8 + r11;
        r11 = r14.getMeasuredHeight();
        r11 = r11 + r8;
        r6 = java.lang.Math.max(r6, r11);
        if (r2 == 0) goto L_0x0439;
    L_0x0438:
        goto L_0x043a;
    L_0x0439:
        r8 = r11;
    L_0x043a:
        r2 = java.lang.Math.max(r10, r8);
        if (r27 == 0) goto L_0x0447;
    L_0x0440:
        r8 = r5.height;
        r10 = -1;
        if (r8 != r10) goto L_0x0448;
    L_0x0445:
        r8 = 1;
        goto L_0x0449;
    L_0x0447:
        r10 = -1;
    L_0x0448:
        r8 = 0;
    L_0x0449:
        if (r37 == 0) goto L_0x0476;
    L_0x044b:
        r14 = r14.getBaseline();
        if (r14 == r10) goto L_0x0476;
    L_0x0451:
        r10 = r5.gravity;
        if (r10 >= 0) goto L_0x0458;
    L_0x0455:
        r5 = r7.mGravity;
        goto L_0x045a;
    L_0x0458:
        r5 = r5.gravity;
    L_0x045a:
        r5 = r5 & 112;
        r24 = 4;
        r5 = r5 >> 4;
        r5 = r5 & -2;
        r5 = r5 >> 1;
        r10 = r15[r5];
        r10 = java.lang.Math.max(r10, r14);
        r15[r5] = r10;
        r10 = r29[r5];
        r11 = r11 - r14;
        r10 = java.lang.Math.max(r10, r11);
        r29[r5] = r10;
        goto L_0x0478;
    L_0x0476:
        r24 = 4;
    L_0x0478:
        r10 = r2;
        r27 = r8;
        r2 = r23;
        goto L_0x0485;
    L_0x047e:
        r4 = r3;
        r26 = r11;
        r24 = 4;
        r3 = r40;
    L_0x0485:
        r0 = r0 + 1;
        r8 = r39;
        r3 = r4;
        r11 = r26;
        r5 = -1;
        goto L_0x0364;
    L_0x048f:
        r3 = r40;
        r26 = r11;
        r0 = r7.mTotalLength;
        r2 = r38.getPaddingLeft();
        r4 = r38.getPaddingRight();
        r2 = r2 + r4;
        r0 = r0 + r2;
        r7.mTotalLength = r0;
        r0 = r15[r18];
        r2 = -1;
        if (r0 != r2) goto L_0x04b6;
    L_0x04a6:
        r0 = 0;
        r4 = r15[r0];
        if (r4 != r2) goto L_0x04b6;
    L_0x04ab:
        r0 = r15[r17];
        if (r0 != r2) goto L_0x04b6;
    L_0x04af:
        r0 = r15[r16];
        if (r0 == r2) goto L_0x04b4;
    L_0x04b3:
        goto L_0x04b6;
    L_0x04b4:
        r0 = r6;
        goto L_0x04e4;
    L_0x04b6:
        r0 = r15[r16];
        r2 = 0;
        r4 = r15[r2];
        r5 = r15[r18];
        r8 = r15[r17];
        r5 = java.lang.Math.max(r5, r8);
        r4 = java.lang.Math.max(r4, r5);
        r0 = java.lang.Math.max(r0, r4);
        r4 = r29[r16];
        r2 = r29[r2];
        r5 = r29[r18];
        r8 = r29[r17];
        r5 = java.lang.Math.max(r5, r8);
        r2 = java.lang.Math.max(r2, r5);
        r2 = java.lang.Math.max(r4, r2);
        r0 = r0 + r2;
        r0 = java.lang.Math.max(r6, r0);
    L_0x04e4:
        r2 = r0;
        r23 = r9;
        r0 = r10;
    L_0x04e8:
        if (r27 != 0) goto L_0x04ef;
    L_0x04ea:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 == r4) goto L_0x04ef;
    L_0x04ee:
        goto L_0x04f0;
    L_0x04ef:
        r0 = r2;
    L_0x04f0:
        r2 = r38.getPaddingTop();
        r4 = r38.getPaddingBottom();
        r2 = r2 + r4;
        r0 = r0 + r2;
        r2 = r38.getSuggestedMinimumHeight();
        r0 = java.lang.Math.max(r0, r2);
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2 = r23 & r2;
        r1 = r1 | r2;
        r2 = r23 << 16;
        r0 = android.view.View.resolveSizeAndState(r0, r3, r2);
        r7.setMeasuredDimension(r1, r0);
        if (r28 == 0) goto L_0x0519;
    L_0x0512:
        r0 = r39;
        r1 = r26;
        r7.forceUniformHeight(r1, r0);
    L_0x0519:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        i5 = this.mGravity;
        int i6 = i5 & 112;
        int i7 = i5 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i6 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        } else if (i6 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        }
        int i8 = 0;
        while (i8 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i8);
            if (virtualChildAt == null) {
                i5 += measureNullChild(i8);
            } else if (virtualChildAt.getVisibility() != 8) {
                int i9;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                i6 = layoutParams.gravity;
                if (i6 < 0) {
                    i6 = i7;
                }
                i6 = GravityCompat.getAbsoluteGravity(i6, ViewCompat.getLayoutDirection(this)) & 7;
                if (i6 == 1) {
                    i6 = (((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin;
                    i9 = layoutParams.rightMargin;
                    i6 -= i9;
                } else if (i6 != 5) {
                    i6 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i9 = layoutParams.rightMargin;
                    i6 -= i9;
                }
                i9 = i6;
                if (hasDividerBeforeChildAt(i8)) {
                    i5 += this.mDividerHeight;
                }
                int i10 = i5 + layoutParams.topMargin;
                LayoutParams layoutParams2 = layoutParams;
                setChildFrame(virtualChildAt, i9, i10 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i8 += getChildrenSkipCount(virtualChildAt, i8);
                i5 = i10 + ((measuredHeight + layoutParams2.bottomMargin) + getNextLocationOffset(virtualChildAt));
            }
            i8++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    public void layoutHorizontal(int r25, int r26, int r27, int r28) {
        /*
        r24 = this;
        r6 = r24;
        r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r24);
        r7 = r24.getPaddingTop();
        r1 = r28 - r26;
        r2 = r24.getPaddingBottom();
        r8 = r1 - r2;
        r1 = r1 - r7;
        r2 = r24.getPaddingBottom();
        r9 = r1 - r2;
        r10 = r24.getVirtualChildCount();
        r1 = r6.mGravity;
        r2 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r2 = r2 & r1;
        r11 = r1 & 112;
        r12 = r6.mBaselineAligned;
        r13 = r6.mMaxAscent;
        r14 = r6.mMaxDescent;
        r1 = androidx.core.view.ViewCompat.getLayoutDirection(r24);
        r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r1);
        r15 = 2;
        r5 = 1;
        if (r1 == r5) goto L_0x004b;
    L_0x0037:
        r2 = 5;
        if (r1 == r2) goto L_0x003f;
    L_0x003a:
        r1 = r24.getPaddingLeft();
        goto L_0x0056;
    L_0x003f:
        r1 = r24.getPaddingLeft();
        r1 = r1 + r27;
        r1 = r1 - r25;
        r2 = r6.mTotalLength;
        r1 = r1 - r2;
        goto L_0x0056;
    L_0x004b:
        r1 = r24.getPaddingLeft();
        r2 = r27 - r25;
        r3 = r6.mTotalLength;
        r2 = r2 - r3;
        r2 = r2 / r15;
        r1 = r1 + r2;
    L_0x0056:
        r2 = 0;
        if (r0 == 0) goto L_0x0060;
    L_0x0059:
        r0 = r10 + -1;
        r16 = r0;
        r17 = -1;
        goto L_0x0064;
    L_0x0060:
        r16 = 0;
        r17 = 1;
    L_0x0064:
        r3 = 0;
    L_0x0065:
        if (r3 >= r10) goto L_0x0145;
    L_0x0067:
        r0 = r17 * r3;
        r2 = r16 + r0;
        r0 = r6.getVirtualChildAt(r2);
        if (r0 != 0) goto L_0x0078;
    L_0x0071:
        r0 = r6.measureNullChild(r2);
        r1 = r1 + r0;
        goto L_0x012f;
    L_0x0078:
        r5 = r0.getVisibility();
        r15 = 8;
        if (r5 == r15) goto L_0x012d;
    L_0x0080:
        r15 = r0.getMeasuredWidth();
        r5 = r0.getMeasuredHeight();
        r18 = r0.getLayoutParams();
        r4 = r18;
        r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4;
        if (r12 == 0) goto L_0x00a0;
    L_0x0092:
        r18 = r3;
        r3 = r4.height;
        r19 = r10;
        r10 = -1;
        if (r3 == r10) goto L_0x00a4;
    L_0x009b:
        r3 = r0.getBaseline();
        goto L_0x00a5;
    L_0x00a0:
        r18 = r3;
        r19 = r10;
    L_0x00a4:
        r3 = -1;
    L_0x00a5:
        r10 = r4.gravity;
        if (r10 >= 0) goto L_0x00aa;
    L_0x00a9:
        r10 = r11;
    L_0x00aa:
        r10 = r10 & 112;
        r20 = r11;
        r11 = 16;
        if (r10 == r11) goto L_0x00e9;
    L_0x00b2:
        r11 = 48;
        if (r10 == r11) goto L_0x00d6;
    L_0x00b6:
        r11 = 80;
        if (r10 == r11) goto L_0x00bf;
    L_0x00ba:
        r3 = r7;
        r11 = -1;
    L_0x00bc:
        r21 = 1;
        goto L_0x00f7;
    L_0x00bf:
        r10 = r8 - r5;
        r11 = r4.bottomMargin;
        r10 = r10 - r11;
        r11 = -1;
        if (r3 == r11) goto L_0x00d4;
    L_0x00c7:
        r21 = r0.getMeasuredHeight();
        r21 = r21 - r3;
        r3 = 2;
        r22 = r14[r3];
        r22 = r22 - r21;
        r10 = r10 - r22;
    L_0x00d4:
        r3 = r10;
        goto L_0x00bc;
    L_0x00d6:
        r11 = -1;
        r10 = r4.topMargin;
        r10 = r10 + r7;
        if (r3 == r11) goto L_0x00e5;
    L_0x00dc:
        r21 = 1;
        r22 = r13[r21];
        r22 = r22 - r3;
        r10 = r10 + r22;
        goto L_0x00e7;
    L_0x00e5:
        r21 = 1;
    L_0x00e7:
        r3 = r10;
        goto L_0x00f7;
    L_0x00e9:
        r11 = -1;
        r21 = 1;
        r3 = r9 - r5;
        r10 = 2;
        r3 = r3 / r10;
        r3 = r3 + r7;
        r10 = r4.topMargin;
        r3 = r3 + r10;
        r10 = r4.bottomMargin;
        r3 = r3 - r10;
    L_0x00f7:
        r10 = r6.hasDividerBeforeChildAt(r2);
        if (r10 == 0) goto L_0x0100;
    L_0x00fd:
        r10 = r6.mDividerWidth;
        r1 = r1 + r10;
    L_0x0100:
        r10 = r4.leftMargin;
        r10 = r10 + r1;
        r1 = r6.getLocationOffset(r0);
        r22 = r10 + r1;
        r1 = r0;
        r0 = r24;
        r25 = r1;
        r11 = r2;
        r2 = r22;
        r22 = r7;
        r23 = -1;
        r7 = r4;
        r4 = r15;
        r0.setChildFrame(r1, r2, r3, r4, r5);
        r0 = r7.rightMargin;
        r15 = r15 + r0;
        r0 = r25;
        r1 = r6.getNextLocationOffset(r0);
        r15 = r15 + r1;
        r10 = r10 + r15;
        r0 = r6.getChildrenSkipCount(r0, r11);
        r3 = r18 + r0;
        r1 = r10;
        goto L_0x0139;
    L_0x012d:
        r18 = r3;
    L_0x012f:
        r22 = r7;
        r19 = r10;
        r20 = r11;
        r21 = 1;
        r23 = -1;
    L_0x0139:
        r3 = r3 + 1;
        r10 = r19;
        r11 = r20;
        r7 = r22;
        r5 = 1;
        r15 = 2;
        goto L_0x0065;
    L_0x0145:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        i &= GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i2 = this.mGravity;
        if ((GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK & i2) != i) {
            this.mGravity = i | (-8388616 & i2);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        i &= 112;
        int i2 = this.mGravity;
        if ((i2 & 112) != i) {
            this.mGravity = i | (i2 & -113);
            requestLayout();
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        return i == 1 ? new LayoutParams(-1, -2) : null;
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }
}
