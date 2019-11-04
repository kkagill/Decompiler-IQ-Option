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
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.x.R;

/* compiled from: SmallNumpadBindingImpl */
public class za extends yz {
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
        aos.put(R.id.line1Dialpad, 12);
        aos.put(R.id.line2Dialpad, 13);
        aos.put(R.id.line3Dialpad, 14);
        aos.put(R.id.line4Dialpad, 15);
        aos.put(R.id.back, 16);
    }

    public za(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, aor, aos));
    }

    private za(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[16], (TextView) objArr[10], (LinearLayout) objArr[0], (TextView) objArr[8], (TextView) objArr[5], (TextView) objArr[4], (LinearLayout) objArr[12], (LinearLayout) objArr[13], (LinearLayout) objArr[14], (LinearLayout) objArr[15], (TextView) objArr[9], (TextView) objArr[1], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[11]);
        this.aot = -1;
        this.bfV.setTag(null);
        this.bfW.setTag(null);
        this.bfX.setTag(null);
        this.bfY.setTag(null);
        this.bfZ.setTag(null);
        this.bge.setTag(null);
        this.bgf.setTag(null);
        this.bgg.setTag(null);
        this.bgi.setTag(null);
        this.bgj.setTag(null);
        this.bgk.setTag(null);
        this.clS.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            Void voidR = (Void) null;
            b.a(this.bfV, voidR);
            b.a(this.bfX, voidR);
            b.a(this.bfY, voidR);
            b.a(this.bfZ, voidR);
            b.a(this.bge, voidR);
            b.a(this.bgf, voidR);
            b.a(this.bgg, voidR);
            b.a(this.bgi, voidR);
            b.a(this.bgj, voidR);
            b.a(this.bgk, voidR);
            b.a(this.clS, voidR);
        }
    }
}
