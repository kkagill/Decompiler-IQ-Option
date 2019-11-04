package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

public class FixedHeaderBehavior<V extends View> extends d<V> {
    private Runnable Fh;
    private int mActivePointerId = -1;
    private boolean mIsBeingDragged;
    private int mLastMotionY;
    private OverScroller mScroller;
    private int mTouchSlop = -1;
    private VelocityTracker mVelocityTracker;

    private class a implements Runnable {
        private final CoordinatorLayout Fi;
        private final V mLayout;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.Fi = coordinatorLayout;
            this.mLayout = v;
        }

        public void run() {
            if (this.mLayout != null && FixedHeaderBehavior.this.mScroller != null) {
                if (FixedHeaderBehavior.this.mScroller.computeScrollOffset()) {
                    FixedHeaderBehavior fixedHeaderBehavior = FixedHeaderBehavior.this;
                    fixedHeaderBehavior.a(this.Fi, this.mLayout, fixedHeaderBehavior.mScroller.getCurrY());
                    ViewCompat.postOnAnimation(this.mLayout, this);
                    return;
                }
                FixedHeaderBehavior.this.a(this.Fi, this.mLayout);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* Access modifiers changed, original: protected */
    public void mK() {
    }

    /* Access modifiers changed, original: 0000 */
    public boolean u(V v) {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean au(int i) {
        return super.au(i);
    }

    public /* bridge */ /* synthetic */ int mE() {
        return super.mE();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    public FixedHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Missing block: B:14:0x002c, code skipped:
            if (r0 != 3) goto L_0x0083;
     */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
        r4 = this;
        r0 = r4.mTouchSlop;
        if (r0 >= 0) goto L_0x0012;
    L_0x0004:
        r0 = r5.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.getScaledTouchSlop();
        r4.mTouchSlop = r0;
    L_0x0012:
        r0 = r7.getAction();
        r1 = 2;
        r2 = 1;
        if (r0 != r1) goto L_0x001f;
    L_0x001a:
        r0 = r4.mIsBeingDragged;
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r2;
    L_0x001f:
        r0 = r7.getActionMasked();
        r3 = 0;
        if (r0 == 0) goto L_0x0060;
    L_0x0026:
        r5 = -1;
        if (r0 == r2) goto L_0x0051;
    L_0x0029:
        if (r0 == r1) goto L_0x002f;
    L_0x002b:
        r6 = 3;
        if (r0 == r6) goto L_0x0051;
    L_0x002e:
        goto L_0x0083;
    L_0x002f:
        r6 = r4.mActivePointerId;
        if (r6 != r5) goto L_0x0034;
    L_0x0033:
        goto L_0x0083;
    L_0x0034:
        r6 = r7.findPointerIndex(r6);
        if (r6 != r5) goto L_0x003b;
    L_0x003a:
        goto L_0x0083;
    L_0x003b:
        r5 = r7.getY(r6);
        r5 = (int) r5;
        r6 = r4.mLastMotionY;
        r6 = r5 - r6;
        r6 = java.lang.Math.abs(r6);
        r0 = r4.mTouchSlop;
        if (r6 <= r0) goto L_0x0083;
    L_0x004c:
        r4.mIsBeingDragged = r2;
        r4.mLastMotionY = r5;
        goto L_0x0083;
    L_0x0051:
        r4.mIsBeingDragged = r3;
        r4.mActivePointerId = r5;
        r5 = r4.mVelocityTracker;
        if (r5 == 0) goto L_0x0083;
    L_0x0059:
        r5.recycle();
        r5 = 0;
        r4.mVelocityTracker = r5;
        goto L_0x0083;
    L_0x0060:
        r4.mIsBeingDragged = r3;
        r0 = r7.getX();
        r0 = (int) r0;
        r1 = r7.getY();
        r1 = (int) r1;
        r2 = r4.u(r6);
        if (r2 == 0) goto L_0x0083;
    L_0x0072:
        r5 = r5.isPointInChildBounds(r6, r0, r1);
        if (r5 == 0) goto L_0x0083;
    L_0x0078:
        r4.mLastMotionY = r1;
        r5 = r7.getPointerId(r3);
        r4.mActivePointerId = r5;
        r4.mL();
    L_0x0083:
        r5 = r4.mVelocityTracker;
        if (r5 == 0) goto L_0x008a;
    L_0x0087:
        r5.addMovement(r7);
    L_0x008a:
        r5 = r4.mIsBeingDragged;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.FixedHeaderBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Missing block: B:10:0x0021, code skipped:
            if (r0 != 3) goto L_0x00ae;
     */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
        r11 = this;
        r0 = r11.mTouchSlop;
        if (r0 >= 0) goto L_0x0012;
    L_0x0004:
        r0 = r12.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.getScaledTouchSlop();
        r11.mTouchSlop = r0;
    L_0x0012:
        r0 = r14.getActionMasked();
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x008d;
    L_0x001a:
        r3 = -1;
        if (r0 == r1) goto L_0x005c;
    L_0x001d:
        r4 = 2;
        if (r0 == r4) goto L_0x0025;
    L_0x0020:
        r12 = 3;
        if (r0 == r12) goto L_0x007e;
    L_0x0023:
        goto L_0x00ae;
    L_0x0025:
        r0 = r11.mActivePointerId;
        r0 = r14.findPointerIndex(r0);
        if (r0 != r3) goto L_0x002e;
    L_0x002d:
        return r2;
    L_0x002e:
        r0 = r14.getY(r0);
        r0 = (int) r0;
        r2 = r11.mLastMotionY;
        r2 = r2 - r0;
        r3 = r11.mIsBeingDragged;
        if (r3 != 0) goto L_0x0049;
    L_0x003a:
        r3 = java.lang.Math.abs(r2);
        r4 = r11.mTouchSlop;
        if (r3 <= r4) goto L_0x0049;
    L_0x0042:
        r11.mIsBeingDragged = r1;
        if (r2 <= 0) goto L_0x0048;
    L_0x0046:
        r2 = r2 - r4;
        goto L_0x0049;
    L_0x0048:
        r2 = r2 + r4;
    L_0x0049:
        r6 = r2;
        r2 = r11.mIsBeingDragged;
        if (r2 == 0) goto L_0x00ae;
    L_0x004e:
        r11.mLastMotionY = r0;
        r7 = r11.t(r13);
        r8 = 0;
        r3 = r11;
        r4 = r12;
        r5 = r13;
        r3.b(r4, r5, r6, r7, r8);
        goto L_0x00ae;
    L_0x005c:
        r0 = r11.mVelocityTracker;
        if (r0 == 0) goto L_0x007e;
    L_0x0060:
        r0.addMovement(r14);
        r0 = r11.mVelocityTracker;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.computeCurrentVelocity(r4);
        r0 = r11.mVelocityTracker;
        r4 = r11.mActivePointerId;
        r10 = r0.getYVelocity(r4);
        r0 = r11.s(r13);
        r8 = -r0;
        r9 = 0;
        r5 = r11;
        r6 = r12;
        r7 = r13;
        r5.a(r6, r7, r8, r9, r10);
    L_0x007e:
        r11.mIsBeingDragged = r2;
        r11.mActivePointerId = r3;
        r12 = r11.mVelocityTracker;
        if (r12 == 0) goto L_0x00ae;
    L_0x0086:
        r12.recycle();
        r12 = 0;
        r11.mVelocityTracker = r12;
        goto L_0x00ae;
    L_0x008d:
        r0 = r14.getX();
        r0 = (int) r0;
        r3 = r14.getY();
        r3 = (int) r3;
        r12 = r12.isPointInChildBounds(r13, r0, r3);
        if (r12 == 0) goto L_0x00b6;
    L_0x009d:
        r12 = r11.u(r13);
        if (r12 == 0) goto L_0x00b6;
    L_0x00a3:
        r11.mLastMotionY = r3;
        r12 = r14.getPointerId(r2);
        r11.mActivePointerId = r12;
        r11.mL();
    L_0x00ae:
        r12 = r11.mVelocityTracker;
        if (r12 == 0) goto L_0x00b5;
    L_0x00b2:
        r12.addMovement(r14);
    L_0x00b5:
        return r1;
    L_0x00b6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.FixedHeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* Access modifiers changed, original: 0000 */
    public int a(CoordinatorLayout coordinatorLayout, V v, int i) {
        return a(coordinatorLayout, (View) v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int mE = mE();
        if (i2 != 0 && mE >= i2 && mE <= i3) {
            int clamp = MathUtils.clamp(i, i2, i3);
            if (mE != clamp) {
                au(clamp);
                return mE - clamp;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int mD() {
        return mE();
    }

    /* Access modifiers changed, original: final */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return a(coordinatorLayout, (View) v, mD() - i, i2, i3);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.Fh;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.Fh = null;
        }
        if (this.mScroller == null) {
            this.mScroller = new OverScroller(v.getContext());
        }
        this.mScroller.fling(0, mE(), 0, Math.round(f), 0, 0, i, i2);
        CoordinatorLayout coordinatorLayout2;
        if (this.mScroller.computeScrollOffset()) {
            coordinatorLayout2 = coordinatorLayout;
            this.Fh = new a(coordinatorLayout, v);
            ViewCompat.postOnAnimation(v, this.Fh);
            mK();
            return true;
        }
        coordinatorLayout2 = coordinatorLayout;
        a(coordinatorLayout, v);
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public int t(V v) {
        return -v.getHeight();
    }

    /* Access modifiers changed, original: 0000 */
    public int s(V v) {
        return v.getHeight();
    }

    private void mL() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }
}
