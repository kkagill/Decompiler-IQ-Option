package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* compiled from: ViewOffsetHelper */
class e {
    private int FD;
    private int FE;
    private int FF;
    private int FG;
    private final View view;

    public e(View view) {
        this.view = view;
    }

    public void mO() {
        this.FD = this.view.getTop();
        this.FE = this.view.getLeft();
        mP();
    }

    private void mP() {
        View view = this.view;
        ViewCompat.offsetTopAndBottom(view, this.FF - (view.getTop() - this.FD));
        view = this.view;
        ViewCompat.offsetLeftAndRight(view, this.FG - (view.getLeft() - this.FE));
    }

    public boolean au(int i) {
        if (this.FF == i) {
            return false;
        }
        this.FF = i;
        mP();
        return true;
    }

    public boolean ay(int i) {
        if (this.FG == i) {
            return false;
        }
        this.FG = i;
        mP();
        return true;
    }

    public int mE() {
        return this.FF;
    }
}
