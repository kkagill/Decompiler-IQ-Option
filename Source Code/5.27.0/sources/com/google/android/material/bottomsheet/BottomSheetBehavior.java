package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;
import com.google.android.material.a.d;
import com.google.android.material.a.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    ViewDragHelper FQ;
    int Fn;
    private VelocityTracker Fq;
    private int GC;
    private boolean GJ;
    private int GK;
    private int GO;
    int GV;
    int GX;
    int GZ;
    private final Callback Gb = new Callback() {
        public boolean tryCaptureView(@NonNull View view, int i) {
            boolean z = true;
            if (BottomSheetBehavior.this.state == 1 || BottomSheetBehavior.this.Hk) {
                return false;
            }
            if (BottomSheetBehavior.this.state == 3 && BottomSheetBehavior.this.Fn == i) {
                View view2 = (View) BottomSheetBehavior.this.Hh.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (BottomSheetBehavior.this.Hg == null || BottomSheetBehavior.this.Hg.get() != view) {
                z = false;
            }
            return z;
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.aG(i2);
        }

        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.aF(1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
        public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
            r7 = this;
            r0 = 0;
            r1 = 0;
            r2 = 4;
            r3 = 6;
            r4 = 3;
            r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1));
            if (r5 >= 0) goto L_0x002c;
        L_0x0009:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r9 = r9.Gy;
            if (r9 == 0) goto L_0x0018;
        L_0x0011:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r9 = r9.GV;
        L_0x0015:
            r2 = 3;
            goto L_0x00d4;
        L_0x0018:
            r9 = r8.getTop();
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = r10.GX;
            if (r9 <= r10) goto L_0x002a;
        L_0x0022:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r9.GX;
        L_0x0026:
            r9 = r0;
            r2 = 6;
            goto L_0x00d4;
        L_0x002a:
            r9 = 0;
            goto L_0x0015;
        L_0x002c:
            r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r5 = r5.Ha;
            if (r5 == 0) goto L_0x0057;
        L_0x0032:
            r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r5 = r5.c(r8, r10);
            if (r5 == 0) goto L_0x0057;
        L_0x003a:
            r5 = r8.getTop();
            r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r6 = r6.GZ;
            if (r5 > r6) goto L_0x0050;
        L_0x0044:
            r5 = java.lang.Math.abs(r9);
            r6 = java.lang.Math.abs(r10);
            r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
            if (r5 >= 0) goto L_0x0057;
        L_0x0050:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r9 = r9.Hf;
            r2 = 5;
            goto L_0x00d4;
        L_0x0057:
            r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1));
            if (r1 == 0) goto L_0x006d;
        L_0x005b:
            r9 = java.lang.Math.abs(r9);
            r10 = java.lang.Math.abs(r10);
            r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
            if (r9 <= 0) goto L_0x0068;
        L_0x0067:
            goto L_0x006d;
        L_0x0068:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r9 = r9.GZ;
            goto L_0x00d4;
        L_0x006d:
            r9 = r8.getTop();
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = r10.Gy;
            if (r10 == 0) goto L_0x009a;
        L_0x0079:
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = r10.GV;
            r10 = r9 - r10;
            r10 = java.lang.Math.abs(r10);
            r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r0.GZ;
            r9 = r9 - r0;
            r9 = java.lang.Math.abs(r9);
            if (r10 >= r9) goto L_0x0094;
        L_0x008e:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r9.GV;
            r9 = r0;
            goto L_0x0015;
        L_0x0094:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r9.GZ;
        L_0x0098:
            r9 = r0;
            goto L_0x00d4;
        L_0x009a:
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = r10.GX;
            if (r9 >= r10) goto L_0x00b4;
        L_0x00a0:
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = r10.GZ;
            r10 = r9 - r10;
            r10 = java.lang.Math.abs(r10);
            if (r9 >= r10) goto L_0x00ae;
        L_0x00ac:
            goto L_0x002a;
        L_0x00ae:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r9.GX;
            goto L_0x0026;
        L_0x00b4:
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = r10.GX;
            r10 = r9 - r10;
            r10 = java.lang.Math.abs(r10);
            r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r0.GZ;
            r9 = r9 - r0;
            r9 = java.lang.Math.abs(r9);
            if (r10 >= r9) goto L_0x00cf;
        L_0x00c9:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r9.GX;
            goto L_0x0026;
        L_0x00cf:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r0 = r9.GZ;
            goto L_0x0098;
        L_0x00d4:
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = r10.FQ;
            r0 = r8.getLeft();
            r9 = r10.settleCapturedViewAt(r0, r9);
            if (r9 == 0) goto L_0x00f3;
        L_0x00e2:
            r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r10 = 2;
            r9.aF(r10);
            r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c;
            r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r9.<init>(r8, r2);
            androidx.core.view.ViewCompat.postOnAnimation(r8, r9);
            goto L_0x00f8;
        L_0x00f3:
            r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this;
            r8.aF(r2);
        L_0x00f8:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior$AnonymousClass2.onViewReleased(android.view.View, float, float):void");
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return MathUtils.clamp(i, BottomSheetBehavior.this.mY(), BottomSheetBehavior.this.Ha ? BottomSheetBehavior.this.Hf : BottomSheetBehavior.this.GZ);
        }

        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            if (BottomSheetBehavior.this.Ha) {
                return BottomSheetBehavior.this.Hf;
            }
            return BottomSheetBehavior.this.GZ;
        }
    };
    private boolean Gy = true;
    private float Gz;
    boolean Ha;
    private boolean Hb;
    private boolean Hc;
    private int Hd;
    private boolean He;
    int Hf;
    WeakReference<V> Hg;
    WeakReference<View> Hh;
    private a Hi;
    private int Hj;
    boolean Hk;
    private Map<View, Integer> Hl;
    int state = 4;

    public static abstract class a {
        public abstract void b(@NonNull View view, int i);

        public abstract void d(@NonNull View view, float f);
    }

    private class c implements Runnable {
        private final int Hp;
        private final View view;

        c(View view, int i) {
            this.view = view;
            this.Hp = i;
        }

        public void run() {
            if (BottomSheetBehavior.this.FQ == null || !BottomSheetBehavior.this.FQ.continueSettling(true)) {
                BottomSheetBehavior.this.aF(this.Hp);
            } else {
                ViewCompat.postOnAnimation(this.view, this);
            }
        }
    }

    protected static class b extends AbsSavedState {
        public static final Creator<b> CREATOR = new ClassLoaderCreator<b>() {
            /* renamed from: d */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: Q */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* renamed from: aH */
            public b[] newArray(int i) {
                return new b[i];
            }
        };
        final int state;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public b(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            aE(obtainStyledAttributes.getDimensionPixelSize(k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            aE(peekValue.data);
        }
        W(obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_hideable, false));
        V(obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        X(obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.Gz = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new b(super.onSaveInstanceState(coordinatorLayout, v), this.state);
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, bVar.getSuperState());
        if (bVar.state == 1 || bVar.state == 2) {
            this.state = 4;
        } else {
            this.state = bVar.state;
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.Hf = coordinatorLayout.getHeight();
        if (this.GJ) {
            if (this.GK == 0) {
                this.GK = coordinatorLayout.getResources().getDimensionPixelSize(d.design_bottom_sheet_peek_height_min);
            }
            this.GO = Math.max(this.GK, this.Hf - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.GO = this.GC;
        }
        this.GV = Math.max(0, this.Hf - v.getHeight());
        this.GX = this.Hf / 2;
        mX();
        i = this.state;
        if (i == 3) {
            ViewCompat.offsetTopAndBottom(v, mY());
        } else if (i == 6) {
            ViewCompat.offsetTopAndBottom(v, this.GX);
        } else if (this.Ha && i == 5) {
            ViewCompat.offsetTopAndBottom(v, this.Hf);
        } else {
            i = this.state;
            if (i == 4) {
                ViewCompat.offsetTopAndBottom(v, this.GZ);
            } else if (i == 1 || i == 2) {
                ViewCompat.offsetTopAndBottom(v, top - v.getTop());
            }
        }
        if (this.FQ == null) {
            this.FQ = ViewDragHelper.create(coordinatorLayout, this.Gb);
        }
        this.Hg = new WeakReference(v);
        this.Hh = new WeakReference(D(v));
        return true;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.Fq == null) {
                this.Fq = VelocityTracker.obtain();
            }
            this.Fq.addMovement(motionEvent);
            View view = null;
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.Hj = (int) motionEvent.getY();
                WeakReference weakReference = this.Hh;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x, this.Hj)) {
                    this.Fn = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.Hk = true;
                }
                boolean z2 = this.Fn == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.Hj);
                this.Hc = z2;
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.Hk = false;
                this.Fn = -1;
                if (this.Hc) {
                    this.Hc = false;
                    return false;
                }
            }
            if (!this.Hc) {
                ViewDragHelper viewDragHelper = this.FQ;
                if (viewDragHelper != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            WeakReference weakReference2 = this.Hh;
            if (weakReference2 != null) {
                view = (View) weakReference2.get();
            }
            if (!(actionMasked != 2 || view == null || this.Hc || this.state == 1 || coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.FQ == null || Math.abs(((float) this.Hj) - motionEvent.getY()) <= ((float) this.FQ.getTouchSlop()))) {
                z = true;
            }
            return z;
        }
        this.Hc = true;
        return false;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.FQ;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.Fq == null) {
            this.Fq = VelocityTracker.obtain();
        }
        this.Fq.addMovement(motionEvent);
        if (actionMasked == 2 && !this.Hc && Math.abs(((float) this.Hj) - motionEvent.getY()) > ((float) this.FQ.getTouchSlop())) {
            this.FQ.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.Hc ^ 1;
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.Hd = 0;
        this.He = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 != 1 && view == ((View) this.Hh.get())) {
            i = v.getTop();
            i3 = i - i2;
            if (i2 > 0) {
                if (i3 < mY()) {
                    iArr[1] = i - mY();
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    aF(3);
                } else {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    aF(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i4 = this.GZ;
                if (i3 <= i4 || this.Ha) {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    aF(1);
                } else {
                    iArr[1] = i - i4;
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    aF(4);
                }
            }
            aG(v.getTop());
            this.Hd = i2;
            this.He = true;
        }
    }

    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int i2 = 3;
        if (v.getTop() == mY()) {
            aF(3);
            return;
        }
        if (view == this.Hh.get() && this.He) {
            int mY;
            if (this.Hd > 0) {
                mY = mY();
            } else if (this.Ha && c(v, getYVelocity())) {
                mY = this.Hf;
                i2 = 5;
            } else {
                if (this.Hd == 0) {
                    mY = v.getTop();
                    if (!this.Gy) {
                        int i3 = this.GX;
                        if (mY < i3) {
                            if (mY < Math.abs(mY - this.GZ)) {
                                mY = 0;
                            } else {
                                mY = this.GX;
                            }
                        } else if (Math.abs(mY - i3) < Math.abs(mY - this.GZ)) {
                            mY = this.GX;
                        } else {
                            mY = this.GZ;
                        }
                        i2 = 6;
                    } else if (Math.abs(mY - this.GV) < Math.abs(mY - this.GZ)) {
                        mY = this.GV;
                    } else {
                        mY = this.GZ;
                    }
                } else {
                    mY = this.GZ;
                }
                i2 = 4;
            }
            if (this.FQ.smoothSlideViewTo(v, v.getLeft(), mY)) {
                aF(2);
                ViewCompat.postOnAnimation(v, new c(v, i2));
            } else {
                aF(i2);
            }
            this.He = false;
        }
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        return view == this.Hh.get() && (this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    public void V(boolean z) {
        if (this.Gy != z) {
            this.Gy = z;
            if (this.Hg != null) {
                mX();
            }
            int i = (this.Gy && this.state == 6) ? 3 : this.state;
            aF(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    public final void aE(int r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = 0;
        r2 = -1;
        if (r4 != r2) goto L_0x000c;
    L_0x0005:
        r4 = r3.GJ;
        if (r4 != 0) goto L_0x0015;
    L_0x0009:
        r3.GJ = r0;
        goto L_0x0024;
    L_0x000c:
        r2 = r3.GJ;
        if (r2 != 0) goto L_0x0017;
    L_0x0010:
        r2 = r3.GC;
        if (r2 == r4) goto L_0x0015;
    L_0x0014:
        goto L_0x0017;
    L_0x0015:
        r0 = 0;
        goto L_0x0024;
    L_0x0017:
        r3.GJ = r1;
        r1 = java.lang.Math.max(r1, r4);
        r3.GC = r1;
        r1 = r3.Hf;
        r1 = r1 - r4;
        r3.GZ = r1;
    L_0x0024:
        if (r0 == 0) goto L_0x003a;
    L_0x0026:
        r4 = r3.state;
        r0 = 4;
        if (r4 != r0) goto L_0x003a;
    L_0x002b:
        r4 = r3.Hg;
        if (r4 == 0) goto L_0x003a;
    L_0x002f:
        r4 = r4.get();
        r4 = (android.view.View) r4;
        if (r4 == 0) goto L_0x003a;
    L_0x0037:
        r4.requestLayout();
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.aE(int):void");
    }

    public void W(boolean z) {
        this.Ha = z;
    }

    public void X(boolean z) {
        this.Hb = z;
    }

    public void a(a aVar) {
        this.Hi = aVar;
    }

    public final void setState(final int i) {
        if (i != this.state) {
            WeakReference weakReference = this.Hg;
            if (weakReference == null) {
                if (i == 4 || i == 3 || i == 6 || (this.Ha && i == 5)) {
                    this.state = i;
                }
                return;
            }
            final View view = (View) weakReference.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
                    view.post(new Runnable() {
                        public void run() {
                            BottomSheetBehavior.this.a(view, i);
                        }
                    });
                } else {
                    a(view, i);
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aF(int i) {
        if (this.state != i) {
            this.state = i;
            if (i == 6 || i == 3) {
                Y(true);
            } else if (i == 5 || i == 4) {
                Y(false);
            }
            View view = (View) this.Hg.get();
            if (view != null) {
                a aVar = this.Hi;
                if (aVar != null) {
                    aVar.b(view, i);
                }
            }
        }
    }

    private void mX() {
        if (this.Gy) {
            this.GZ = Math.max(this.Hf - this.GO, this.GV);
        } else {
            this.GZ = this.Hf - this.GO;
        }
    }

    private void reset() {
        this.Fn = -1;
        VelocityTracker velocityTracker = this.Fq;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Fq = null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean c(View view, float f) {
        boolean z = true;
        if (this.Hb) {
            return true;
        }
        if (view.getTop() < this.GZ) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.GZ)) / ((float) this.GC) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: 0000 */
    @VisibleForTesting
    public View D(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View D = D(viewGroup.getChildAt(i));
                if (D != null) {
                    return D;
                }
            }
        }
        return null;
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.Fq;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.Gz);
        return this.Fq.getYVelocity(this.Fn);
    }

    private int mY() {
        return this.Gy ? this.GV : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.GZ;
        } else if (i == 6) {
            int i3 = this.GX;
            if (this.Gy) {
                int i4 = this.GV;
                if (i3 <= i4) {
                    i2 = i4;
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = mY();
        } else if (this.Ha && i == 5) {
            i2 = this.Hf;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal state argument: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.FQ.smoothSlideViewTo(view, view.getLeft(), i2)) {
            aF(2);
            ViewCompat.postOnAnimation(view, new c(view, i));
            return;
        }
        aF(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void aG(int i) {
        View view = (View) this.Hg.get();
        if (view != null) {
            a aVar = this.Hi;
            if (aVar != null) {
                int i2 = this.GZ;
                if (i > i2) {
                    aVar.d(view, ((float) (i2 - i)) / ((float) (this.Hf - i2)));
                } else {
                    aVar.d(view, ((float) (i2 - i)) / ((float) (i2 - mY())));
                }
            }
        }
    }

    public static <V extends View> BottomSheetBehavior<V> E(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void Y(boolean z) {
        WeakReference weakReference = this.Hg;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.Hl == null) {
                        this.Hl = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.Hg.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.Hl.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            ViewCompat.setImportantForAccessibility(childAt, 4);
                        } else {
                            Map map = this.Hl;
                            if (map != null && map.containsKey(childAt)) {
                                ViewCompat.setImportantForAccessibility(childAt, ((Integer) this.Hl.get(childAt)).intValue());
                            }
                        }
                    }
                }
                if (!z) {
                    this.Hl = null;
                }
            }
        }
    }
}
