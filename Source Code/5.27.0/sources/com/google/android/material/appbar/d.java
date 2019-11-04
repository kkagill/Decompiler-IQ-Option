package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

/* compiled from: ViewOffsetBehavior */
class d<V extends View> extends Behavior<V> {
    private e FA;
    private int FB = 0;
    private int FC = 0;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.FA == null) {
            this.FA = new e(v);
        }
        this.FA.mO();
        int i2 = this.FB;
        if (i2 != 0) {
            this.FA.au(i2);
            this.FB = 0;
        }
        i2 = this.FC;
        if (i2 != 0) {
            this.FA.ay(i2);
            this.FC = 0;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean au(int i) {
        e eVar = this.FA;
        if (eVar != null) {
            return eVar.au(i);
        }
        this.FB = i;
        return false;
    }

    public int mE() {
        e eVar = this.FA;
        return eVar != null ? eVar.mE() : 0;
    }
}
