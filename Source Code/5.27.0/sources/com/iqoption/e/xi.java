package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateCfdOnOpenConfirmationBindingImpl */
public class xi extends xh {
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
        aos.put(R.id.cancelTitle, 5);
        aos.put(R.id.cancelIcon, 6);
        aos.put(R.id.investValue, 7);
        aos.put(R.id.textView2, 8);
        aos.put(R.id.multValue, 9);
        aos.put(R.id.overnightContainer, 10);
        aos.put(R.id.overnightTitle, 11);
        aos.put(R.id.overnightValue, 12);
        aos.put(R.id.insidePendingLayout, 13);
        aos.put(R.id.pendingLabel, 14);
        aos.put(R.id.pendingValue, 15);
        aos.put(R.id.pendingPicker, 16);
        aos.put(R.id.insideLimitsLayout, 17);
        aos.put(R.id.limitsLabel, 18);
        aos.put(R.id.limitsValue, 19);
        aos.put(R.id.limitsPicker, 20);
        aos.put(R.id.btnConfirmLayout, 21);
        aos.put(R.id.totalInvest, 22);
        aos.put(R.id.btnConfirm, 23);
    }

    public xi(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, aor, aos));
    }

    private xi(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[1], (RobotoTextView) objArr[23], (LinearLayout) objArr[21], (ImageView) objArr[6], (ImageView) objArr[3], (RobotoTextView) objArr[5], (LinearLayout) objArr[0], (LinearLayout) objArr[17], (LinearLayout) objArr[13], (RobotoTextView) objArr[7], (TextView) objArr[18], (FrameLayout) objArr[4], (ImageView) objArr[20], (RobotoTextView) objArr[19], (RobotoTextView) objArr[9], (ConstraintLayout) objArr[10], (RobotoTextView) objArr[11], (RobotoTextView) objArr[12], (TextView) objArr[14], (FrameLayout) objArr[2], (ImageView) objArr[16], (RobotoTextView) objArr[15], (RobotoTextView) objArr[8], (RobotoTextView) objArr[22]);
        this.aot = -1;
        this.cqX.setTag(null);
        this.cqZ.setTag(null);
        this.crb.setTag(null);
        this.crg.setTag(null);
        this.cro.setTag(null);
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
            b.a(this.cqX, voidR);
            b.a(this.cqZ, voidR);
            b.j(this.crg, 0.5f);
            b.j(this.cro, 0.5f);
        }
    }
}
