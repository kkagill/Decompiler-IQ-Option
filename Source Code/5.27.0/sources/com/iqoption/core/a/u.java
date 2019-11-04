package com.iqoption.core.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.i.g;

/* compiled from: NumpadBindingImpl */
public class u extends t {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(g.line1Dialpad, 1);
        aos.put(g.one, 2);
        aos.put(g.two, 3);
        aos.put(g.three, 4);
        aos.put(g.line2Dialpad, 5);
        aos.put(g.four, 6);
        aos.put(g.five, 7);
        aos.put(g.six, 8);
        aos.put(g.line3Dialpad, 9);
        aos.put(g.seven, 10);
        aos.put(g.eight, 11);
        aos.put(g.nine, 12);
        aos.put(g.line4Dialpad, 13);
        aos.put(g.back, 14);
        aos.put(g.zero, 15);
        aos.put(g.zeroValue, 16);
        aos.put(g.sign, 17);
        aos.put(g.customButton, 18);
    }

    public u(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, aor, aos));
    }

    private u(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[14], (TextView) objArr[18], (LinearLayout) objArr[0], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[6], (LinearLayout) objArr[1], (LinearLayout) objArr[5], (LinearLayout) objArr[9], (LinearLayout) objArr[13], (TextView) objArr[12], (TextView) objArr[2], (TextView) objArr[10], (TextView) objArr[17], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[3], (LinearLayout) objArr[15], (TextView) objArr[16]);
        this.aot = -1;
        this.bfW.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 1;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.aot != 0) {
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
