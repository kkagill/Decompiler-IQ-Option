package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: CommissionViewBindingImpl */
public class el extends ek {
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
        aos.put(R.id.commissionTitle, 3);
        aos.put(R.id.commissionContainer, 4);
        aos.put(R.id.commissionType, 5);
        aos.put(R.id.commissionAmount, 6);
        aos.put(R.id.commissionInfoRect, 7);
        aos.put(R.id.otnPicker, 8);
        aos.put(R.id.otnRewardValue, 9);
    }

    public el(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 10, aor, aos));
    }

    private el(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        View[] viewArr2 = viewArr;
        super(dataBindingComponent, viewArr2[0], 0, (RobotoTextView) objArr[6], (LinearLayout) objArr[4], (View) objArr[7], (RobotoTextView) objArr[3], (RobotoTextView) objArr[5], (RelativeLayout) objArr[0], (ImageView) objArr[8], (RobotoTextView) objArr[1], (RobotoTextView) objArr[9], (LinearLayout) objArr[2]);
        this.aot = -1;
        this.bZt.setTag(null);
        this.bZv.setTag(null);
        this.bZx.setTag(null);
        setRootTag(viewArr2);
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
