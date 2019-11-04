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

/* compiled from: MicroPortfolioPendingInfoBindingImpl */
public class sk extends sj {
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
        aos.put(R.id.createTime, 1);
        aos.put(R.id.investLayout, 2);
        aos.put(R.id.investment, 3);
        aos.put(R.id.multiplierLayout, 4);
        aos.put(R.id.multiplier, 5);
        aos.put(R.id.quantityLayout, 6);
        aos.put(R.id.quantity, 7);
        aos.put(R.id.currentPrice, 8);
        aos.put(R.id.takeProfitLayout, 9);
        aos.put(R.id.takeProfitPercent, 10);
        aos.put(R.id.stopLossLayout, 11);
        aos.put(R.id.stopLossPercent, 12);
        aos.put(R.id.btnClose, 13);
        aos.put(R.id.btnCloseLabel, 14);
        aos.put(R.id.btnCloseProgress, 15);
        aos.put(R.id.btnEdit, 16);
    }

    public sk(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, aor, aos));
    }

    private sk(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[13], (TextView) objArr[14], (ProgressBar) objArr[15], (ImageView) objArr[16], (RobotoTextView) objArr[1], (RobotoTextView) objArr[8], (LinearLayout) objArr[2], (RobotoTextView) objArr[3], (RobotoTextView) objArr[5], (LinearLayout) objArr[4], (RobotoTextView) objArr[7], (LinearLayout) objArr[6], (LinearLayout) objArr[11], (RobotoTextView) objArr[12], (LinearLayout) objArr[9], (RobotoTextView) objArr[10]);
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
