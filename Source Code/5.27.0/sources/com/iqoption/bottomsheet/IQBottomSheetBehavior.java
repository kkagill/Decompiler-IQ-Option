package com.iqoption.bottomsheet;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.view.ViewCompat;
import com.iqoption.bottomsheet.d.a;
import java.lang.ref.WeakReference;
import java.util.List;

public final class IQBottomSheetBehavior<V extends View> extends Behavior<V> implements OnGestureListener, d {
    private static final a azR = new a();
    private boolean Ha = true;
    private boolean Hc;
    private boolean He;
    private int Hf = -1;
    private WeakReference<V> Hg = new WeakReference(null);
    private int Hj;
    private CoordinatorLayout aAa;
    private V aAb;
    private float aAc;
    private float aAd = 0.2f;
    private boolean aAe;
    private boolean aAf;
    private e aAg;
    private List<WeakReference<View>> aAh;
    private boolean azS = true;
    private int azT;
    private boolean azU = false;
    @Nullable
    private a azV;
    private int azW = -1;
    private int azX = -1;
    private int azY = -1;
    private GestureDetector azZ;
    private int state = 0;
    private int viewHeight = -1;

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public IQBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void j(int i, boolean z) {
        Animator ej = z ? ej(i) : null;
        if (ej != null) {
            ej.start();
        } else if (ei(i)) {
            requestLayout();
        }
    }

    private boolean ei(int i) {
        if (i == this.state) {
            return false;
        }
        this.state = i;
        View view = (View) this.Hg.get();
        if (view != null) {
            a aVar = this.azV;
            if (aVar != null) {
                aVar.b(view, i);
            }
        }
        return true;
    }

    @Nullable
    public Animator ej(int i) {
        if (i != this.state) {
            View view = (View) this.Hg.get();
            if (view != null) {
                return a(view, i, 350).c(this);
            }
        }
        return null;
    }

    private void requestLayout() {
        View view = (View) this.Hg.get();
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Missing block: B:11:0x005f, code skipped:
            if (r1 != 4) goto L_0x0068;
     */
    public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r6, @androidx.annotation.NonNull V r7, int r8) {
        /*
        r5 = this;
        r8 = r7.getTop();
        r0 = r6.getMeasuredHeight();
        r1 = r7.getMeasuredHeight();
        r5.viewHeight = r1;
        r1 = r5.azS;
        if (r1 == 0) goto L_0x0029;
    L_0x0012:
        r1 = 1054867456; // 0x3ee00000 float:0.4375 double:5.21173771E-315;
        r2 = (float) r0;
        r2 = r2 * r1;
        r1 = java.lang.Math.round(r2);
        r2 = r7.getMeasuredHeight();
        r2 = r0 - r2;
        r1 = java.lang.Math.max(r1, r2);
        r1 = r0 - r1;
        r5.azT = r1;
    L_0x0029:
        r1 = r5.azT;
        r1 = r0 - r1;
        r5.azX = r1;
        r1 = r7.getMeasuredHeight();
        r1 = r0 - r1;
        r2 = 0;
        r1 = java.lang.Math.max(r2, r1);
        r5.azW = r1;
        r6 = r6.getMeasuredHeight();
        r5.Hf = r6;
        r6 = r5.Hf;
        r1 = r5.azW;
        r6 = r6 - r1;
        r6 = java.lang.Math.abs(r6);
        r5.azY = r6;
        r6 = r7.getMeasuredWidth();
        r1 = r5.state;
        r3 = 1;
        if (r1 == 0) goto L_0x0068;
    L_0x0056:
        if (r1 == r3) goto L_0x0065;
    L_0x0058:
        r4 = 2;
        if (r1 == r4) goto L_0x0062;
    L_0x005b:
        r4 = 3;
        if (r1 == r4) goto L_0x0069;
    L_0x005e:
        r4 = 4;
        if (r1 == r4) goto L_0x0069;
    L_0x0061:
        goto L_0x0068;
    L_0x0062:
        r8 = r5.azW;
        goto L_0x0069;
    L_0x0065:
        r8 = r5.azX;
        goto L_0x0069;
    L_0x0068:
        r8 = r0;
    L_0x0069:
        r0 = r7.getMeasuredHeight();
        r0 = r0 + r8;
        r7.layout(r2, r8, r6, r0);
        r6 = new java.lang.ref.WeakReference;
        r6.<init>(r7);
        r5.Hg = r6;
        r6 = r5.aAh;
        if (r6 != 0) goto L_0x0084;
    L_0x007c:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r5.aAh = r6;
        goto L_0x0087;
    L_0x0084:
        r6.clear();
    L_0x0087:
        r6 = r5.aAh;
        r5.a(r6, r7);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.bottomsheet.IQBottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        boolean z = false;
        if (i2 != 0) {
            return false;
        }
        this.He = false;
        if ((i & 2) != 0) {
            z = true;
        }
        return z;
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 0 && R(view)) {
            if (i2 > 0) {
                iArr[1] = -d(coordinatorLayout, v, -i2);
            } else if (i2 < 0) {
                if (this.state != 2) {
                    iArr[1] = -d(coordinatorLayout, v, -i2);
                } else if (!view.canScrollVertically(Math.round(Math.signum((float) i2)))) {
                    iArr[1] = -d(coordinatorLayout, v, -i2);
                }
            }
            this.He = true;
        }
    }

    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        if (i != 0 || !R(view)) {
            return;
        }
        if (this.He || this.state == 4) {
            if (!this.aAf) {
                b(T(v));
            }
            this.aAf = false;
            this.He = false;
        }
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        if (this.state == 2 && view.canScrollVertically(Math.round(Math.signum(f2)))) {
            return false;
        }
        b(f(v, -f2));
        this.aAf = true;
        return true;
    }

    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = false;
        if (v.isShown()) {
            if (this.aAc == 0.0f) {
                this.aAc = ((float) ViewConfiguration.get(v.getContext()).getScaledTouchSlop()) * this.aAd;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                this.Hj = y;
                if (coordinatorLayout.isPointInChildBounds(v, x, y)) {
                    if (this.state == 3) {
                        KU();
                        ei(4);
                    }
                    a(coordinatorLayout, motionEvent);
                    this.Hc = false;
                } else {
                    this.Hc = true;
                }
            }
            if (!(motionEvent.getAction() != 2 || this.Hc || this.state == 4 || a(coordinatorLayout, x, y) || ((float) Math.abs(this.Hj - y)) <= this.aAc)) {
                z = true;
            }
            return z;
        }
        this.Hc = true;
        return false;
    }

    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown() || this.Hc) {
            return false;
        }
        this.aAa = coordinatorLayout;
        this.aAb = v;
        boolean a = a(coordinatorLayout, motionEvent);
        if (!this.aAe && motionEvent.getAction() == 1 && this.state == 4) {
            b(T(this.aAb));
            a = true;
        }
        this.aAe = false;
        return a;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        d(this.aAa, this.aAb, -Math.round(f2));
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 == 0.0f) {
            return false;
        }
        b(f(this.aAb, f2));
        this.aAe = true;
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public View getView() {
        return (View) this.Hg.get();
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public AnimatorListener a(@NonNull final e eVar) {
        return new AnimatorListenerAdapter() {
            boolean cancelled = false;

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                IQBottomSheetBehavior.this.KU();
                IQBottomSheetBehavior.this.aAg = eVar;
                IQBottomSheetBehavior.this.ei(3);
            }

            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.cancelled = true;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!this.cancelled) {
                    IQBottomSheetBehavior iQBottomSheetBehavior = IQBottomSheetBehavior.this;
                    iQBottomSheetBehavior.ei(iQBottomSheetBehavior.aAg.KV().state);
                }
                IQBottomSheetBehavior.this.KU();
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public void c(@NonNull View view, int i) {
        ViewCompat.offsetTopAndBottom(view, i);
        a aVar = this.azV;
        if (aVar != null) {
            aVar.e(view, ((float) Math.abs(this.Hf - view.getTop())) / ((float) this.azY));
        }
    }

    private boolean a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull MotionEvent motionEvent) {
        if (this.azZ == null) {
            this.azZ = new GestureDetector(coordinatorLayout.getContext(), this);
            this.azZ.setIsLongpressEnabled(false);
        }
        return this.azZ.onTouchEvent(motionEvent);
    }

    private int c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        int top = v.getTop();
        return Math.min(Math.max(Math.max(i, -top), coordinatorLayout.getMeasuredHeight() - (v.getMeasuredHeight() + top)), coordinatorLayout.getMeasuredHeight() - top);
    }

    private int d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        int c = c(coordinatorLayout, v, i);
        if (this.state != 4) {
            ei(e(v, c));
        }
        c(v, c);
        if (this.state == 4) {
            int e = e(v, 0);
            if (e != 4) {
                ei(e);
            }
        }
        return c;
    }

    private boolean R(@NonNull View view) {
        List list = this.aAh;
        if (!(list == null || list.isEmpty())) {
            int size = this.aAh.size();
            for (int i = 0; i < size; i++) {
                if (((WeakReference) this.aAh.get(i)).get() == view) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(CoordinatorLayout coordinatorLayout, int i, int i2) {
        int size = this.aAh.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) ((WeakReference) this.aAh.get(i3)).get();
            if (view != null && coordinatorLayout.isPointInChildBounds(view, i, i2)) {
                return true;
            }
        }
        return false;
    }

    private void a(List<WeakReference<View>> list, View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            list.add(new WeakReference(view));
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a((List) list, viewGroup.getChildAt(i));
            }
        }
    }

    private int d(@NonNull V v, int i) {
        if (i == 0) {
            return this.Hf;
        }
        if (i == 1) {
            return this.azX;
        }
        if (i != 2) {
            return v.getTop();
        }
        return this.azW;
    }

    private int S(@NonNull V v) {
        a(v.getTop(), 0, 0, azR);
        return azR.state;
    }

    private int e(@NonNull V v, int i) {
        a(v.getTop() + i, 0, 0, azR);
        return azR.aAm == 0 ? azR.state : 4;
    }

    private void b(@NonNull e eVar) {
        Animator c = eVar.c(this);
        if (c != null) {
            c.start();
        } else if (eVar.KV().aAm == 0) {
            ei(eVar.KV().state);
        } else if (eVar.KV().duration == 0) {
            j(eVar.KV().state, false);
        }
    }

    private e a(@NonNull V v, int i, long j) {
        int d = d(v, i) - v.getTop();
        e eVar = new e();
        a(v.getTop(), d, j, eVar.KV());
        return eVar;
    }

    private e T(@NonNull V v) {
        return a((View) v, S(v), 250);
    }

    private e f(@NonNull V v, float f) {
        float f2 = -50000.0f;
        float f3 = (-Math.abs(f)) / -50000.0f;
        if (f3 > 0.35f) {
            f2 = (-Math.abs(f)) / 0.35f;
            f3 = 0.35f;
        } else if (f3 < 0.2f) {
            f2 = (-Math.abs(f)) / 0.2f;
            f3 = 0.2f;
        }
        long round = (long) Math.round(1000.0f * f3);
        int round2 = Math.round(Math.signum(f) * ((((f2 * 0.5f) * f3) * f3) + (Math.abs(f) * f3)));
        e eVar = new e();
        a(v.getTop(), round2, round, eVar.KV());
        return eVar;
    }

    private void KU() {
        e eVar = this.aAg;
        if (eVar != null) {
            eVar.recycle();
            this.aAg = null;
        }
    }

    private void a(int i, int i2, long j, @NonNull a aVar) {
        i2 += i;
        int i3 = this.azW - i2;
        int i4 = this.Hf - i2;
        if (!this.azU) {
            int i5 = this.azX - i2;
            if (this.Ha && Math.abs(i4) < Math.abs(i5)) {
                aVar.aAm = this.Hf - i;
                aVar.state = 0;
            } else if (Math.abs(i5) < Math.abs(i3)) {
                aVar.aAm = this.azX - i;
                aVar.state = 1;
            } else {
                aVar.aAm = this.azW - i;
                aVar.state = 2;
            }
        } else if (!this.Ha || Math.abs(i4) >= Math.abs(i3)) {
            aVar.aAm = this.azW - i;
            aVar.state = 2;
        } else {
            aVar.aAm = this.Hf - i;
            aVar.state = 0;
        }
        aVar.duration = j;
    }
}
