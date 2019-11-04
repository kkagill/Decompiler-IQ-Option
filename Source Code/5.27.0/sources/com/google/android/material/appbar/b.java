package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior */
abstract class b extends d<View> {
    final Rect Fu = new Rect();
    final Rect Fv = new Rect();
    private int Fw = 0;
    private int Fx;

    private static int resolveGravity(int i) {
        return i == 0 ? 8388659 : i;
    }

    public abstract View j(List<View> list);

    /* Access modifiers changed, original: 0000 */
    public float v(View view) {
        return 1.0f;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View j = j(coordinatorLayout.getDependencies(view));
            if (j != null) {
                View view2;
                if (!ViewCompat.getFitsSystemWindows(j) || ViewCompat.getFitsSystemWindows(view)) {
                    view2 = view;
                } else {
                    view2 = view;
                    ViewCompat.setFitsSystemWindows(view, true);
                    if (ViewCompat.getFitsSystemWindows(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.onMeasureChild(view, i, i2, MeasureSpec.makeMeasureSpec((size - j.getMeasuredHeight()) + w(j), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View j = j(coordinatorLayout.getDependencies(view));
        if (j != null) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = this.Fu;
            rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, j.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + j.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (!(lastWindowInsets == null || !ViewCompat.getFitsSystemWindows(coordinatorLayout) || ViewCompat.getFitsSystemWindows(view))) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.Fv;
            GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i = x(j);
            view.layout(rect2.left, rect2.top - i, rect2.right, rect2.bottom - i);
            this.Fw = rect2.top - j.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.Fw = 0;
    }

    /* Access modifiers changed, original: final */
    public final int x(View view) {
        if (this.Fx == 0) {
            return 0;
        }
        float v = v(view);
        int i = this.Fx;
        return MathUtils.clamp((int) (v * ((float) i)), 0, i);
    }

    /* Access modifiers changed, original: 0000 */
    public int w(View view) {
        return view.getMeasuredHeight();
    }

    /* Access modifiers changed, original: final */
    public final int mM() {
        return this.Fw;
    }

    public final void ax(int i) {
        this.Fx = i;
    }

    public final int mN() {
        return this.Fx;
    }
}
