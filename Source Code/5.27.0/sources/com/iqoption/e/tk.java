package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: NumpadBindingImpl */
public class tk extends tj {
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
        aos.put(R.id.line1Dialpad, 1);
        aos.put(R.id.one, 2);
        aos.put(R.id.two, 3);
        aos.put(R.id.three, 4);
        aos.put(R.id.line2Dialpad, 5);
        aos.put(R.id.four, 6);
        aos.put(R.id.five, 7);
        aos.put(R.id.six, 8);
        aos.put(R.id.line3Dialpad, 9);
        aos.put(R.id.seven, 10);
        aos.put(R.id.eight, 11);
        aos.put(R.id.nine, 12);
        aos.put(R.id.line4Dialpad, 13);
        aos.put(R.id.customButton, 14);
        aos.put(R.id.zero, 15);
        aos.put(R.id.zeroValue, 16);
        aos.put(R.id.sign, 17);
        aos.put(R.id.back, 18);
    }

    public tk(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, aor, aos));
    }

    private tk(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[18], (TextView) objArr[14], (LinearLayout) objArr[0], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[6], (LinearLayout) objArr[1], (LinearLayout) objArr[5], (LinearLayout) objArr[9], (LinearLayout) objArr[13], (TextView) objArr[12], (TextView) objArr[2], (TextView) objArr[10], (TextView) objArr[17], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[3], (LinearLayout) objArr[15], (TextView) objArr[16]);
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
