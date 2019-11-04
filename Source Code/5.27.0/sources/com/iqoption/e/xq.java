package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.NumberAnimateTextView;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateCryptoConfirmationBindingImpl */
public class xq extends xp {
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
        aos.put(R.id.confirmInvest, 7);
        aos.put(R.id.confirmQuantity, 8);
        aos.put(R.id.insidePendingLayout, 9);
        aos.put(R.id.pendingLabel, 10);
        aos.put(R.id.pendingValue, 11);
        aos.put(R.id.pendingPicker, 12);
        aos.put(R.id.insideLimitsLayout, 13);
        aos.put(R.id.limitsLabel, 14);
        aos.put(R.id.limitsValue, 15);
        aos.put(R.id.limitsPicker, 16);
        aos.put(R.id.globalCommissionContainer, 17);
        aos.put(R.id.commissionTitle, 18);
        aos.put(R.id.commissionContainer, 19);
        aos.put(R.id.commissionType, 20);
        aos.put(R.id.commissionAmount, 21);
        aos.put(R.id.commissionInfoRect, 22);
        aos.put(R.id.otnPicker, 23);
        aos.put(R.id.otnRewardTitle, 24);
        aos.put(R.id.otnRewardValueContainer, 25);
        aos.put(R.id.otnRewardValue, 26);
        aos.put(R.id.btnConfirmLayout, 27);
        aos.put(R.id.totalInvest, 28);
        aos.put(R.id.btnConfirm, 29);
    }

    public xq(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 30, aor, aos));
    }

    private xq(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[1], (RobotoTextView) objArr[29], (LinearLayout) objArr[27], (ImageView) objArr[6], (ImageView) objArr[3], (RobotoTextView) objArr[5], (RobotoTextView) objArr[21], (LinearLayout) objArr[19], (View) objArr[22], (RobotoTextView) objArr[18], (RobotoTextView) objArr[20], (RobotoTextView) objArr[7], (LinearLayout) objArr[0], (NumberAnimateTextView) objArr[8], (RelativeLayout) objArr[17], (LinearLayout) objArr[13], (LinearLayout) objArr[9], (TextView) objArr[14], (FrameLayout) objArr[4], (ImageView) objArr[16], (RobotoTextView) objArr[15], (ImageView) objArr[23], (RobotoTextView) objArr[24], (RobotoTextView) objArr[26], (LinearLayout) objArr[25], (TextView) objArr[10], (FrameLayout) objArr[2], (ImageView) objArr[12], (RobotoTextView) objArr[11], (RobotoTextView) objArr[28]);
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
