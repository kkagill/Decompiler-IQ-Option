package com.google.android.material.d;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper */
public final class c {
    private final View Id;
    @IdRes
    private int Ie;
    private boolean expanded;

    public boolean nq() {
        return this.expanded;
    }

    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.expanded);
        bundle.putInt("expandedComponentIdHint", this.Ie);
        return bundle;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.expanded = bundle.getBoolean("expanded", false);
        this.Ie = bundle.getInt("expandedComponentIdHint", 0);
        if (this.expanded) {
            nr();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.Ie = i;
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.Ie;
    }

    private void nr() {
        ViewParent parent = this.Id.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.Id);
        }
    }
}
