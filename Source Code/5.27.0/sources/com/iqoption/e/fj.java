package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: DialogClosedDealsItemCfdAggregatedBindingImpl */
public class fj extends fi {
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
        aos.put(R.id.startPrice, 1);
        aos.put(R.id.sideIndicator, 2);
        aos.put(R.id.startTime, 3);
        aos.put(R.id.investment, 4);
        aos.put(R.id.endPrice, 5);
        aos.put(R.id.endTime, 6);
        aos.put(R.id.pnl, 7);
        aos.put(R.id.leverage, 8);
        aos.put(R.id.status, 9);
        aos.put(R.id.pnlPercent, 10);
    }

    public fj(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private fj(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RobotoTextView) objArr[5], (RobotoTextView) objArr[6], (RobotoTextView) objArr[4], (RobotoTextView) objArr[8], (RobotoTextView) objArr[7], (TextView) objArr[10], (ImageView) objArr[2], (RobotoTextView) objArr[1], (RobotoTextView) objArr[3], (RobotoTextView) objArr[9]);
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
