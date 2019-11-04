package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.view.ViewCompat;
import com.google.android.material.d.b;
import java.util.List;

public abstract class ExpandableBehavior extends Behavior<View> {
    private int FL = 0;

    public abstract boolean a(View view, View view2, boolean z, boolean z2);

    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @CallSuper
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final View view, int i) {
        if (!ViewCompat.isLaidOut(view)) {
            final b b = b(coordinatorLayout, view);
            if (b != null && af(b.nq())) {
                this.FL = b.nq() ? 1 : 2;
                i = this.FL;
                view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.FL == i) {
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            b bVar = b;
                            expandableBehavior.a((View) bVar, view, bVar.nq(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!af(bVar.nq())) {
            return false;
        }
        this.FL = bVar.nq() ? 1 : 2;
        return a((View) bVar, view, bVar.nq(), true);
    }

    /* Access modifiers changed, original: protected */
    @Nullable
    public b b(CoordinatorLayout coordinatorLayout, View view) {
        List dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    private boolean af(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.FL;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.FL == 1) {
            z2 = true;
        }
        return z2;
    }
}
