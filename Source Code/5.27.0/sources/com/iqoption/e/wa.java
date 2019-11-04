package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: PortfolioPendingInfoBindingImpl */
public class wa extends vz {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.createTimeLayout, 1);
        aos.put(R.id.createTime, 2);
        aos.put(R.id.investLayout, 3);
        aos.put(R.id.investment, 4);
        aos.put(R.id.multiplierLayout, 5);
        aos.put(R.id.multiplier, 6);
        aos.put(R.id.quantityLayout, 7);
        aos.put(R.id.quantity, 8);
        aos.put(R.id.currentPrice, 9);
        aos.put(R.id.takeProfitLayout, 10);
        aos.put(R.id.takeProfit, 11);
        aos.put(R.id.stopLossLayout, 12);
        aos.put(R.id.stopLoss, 13);
        aos.put(R.id.btnClose, 14);
        aos.put(R.id.btnCloseLabel, 15);
        aos.put(R.id.btnCloseProgress, 16);
        aos.put(R.id.btnEdit, 17);
    }

    public wa(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, aor, aos));
    }

    private wa(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[14], (TextView) objArr[15], (ProgressBar) objArr[16], (ImageView) objArr[17], (RobotoTextView) objArr[2], (LinearLayout) objArr[1], (RobotoTextView) objArr[9], (LinearLayout) objArr[3], (RobotoTextView) objArr[4], (RobotoTextView) objArr[6], (LinearLayout) objArr[5], (RobotoTextView) objArr[8], (LinearLayout) objArr[7], (RobotoTextView) objArr[13], (LinearLayout) objArr[12], (RobotoTextView) objArr[11], (LinearLayout) objArr[10]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
