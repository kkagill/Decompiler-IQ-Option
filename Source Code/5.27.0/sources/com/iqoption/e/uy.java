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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.timer.TimerView;
import com.iqoption.x.R;

/* compiled from: PortfolioExpMultiGroupItemBindingImpl */
public class uy extends ux {
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
        aos.put(R.id.header, 1);
        aos.put(R.id.timerView, 2);
        aos.put(R.id.activeName, 3);
        aos.put(R.id.expandIndicator, 4);
        aos.put(R.id.value, 5);
        aos.put(R.id.instrument, 6);
        aos.put(R.id.pnl, 7);
        aos.put(R.id.infoLayout, 8);
        aos.put(R.id.investLayout, 9);
        aos.put(R.id.investLabel, 10);
        aos.put(R.id.activeNameLayout1, 11);
        aos.put(R.id.activeName1, 12);
        aos.put(R.id.status1, 13);
        aos.put(R.id.activeNameLayout2, 14);
        aos.put(R.id.activeName2, 15);
        aos.put(R.id.status2, 16);
        aos.put(R.id.activeNameLayout3, 17);
        aos.put(R.id.activeName3, 18);
        aos.put(R.id.status3, 19);
        aos.put(R.id.btnSell, 20);
        aos.put(R.id.btnSellLabel, 21);
        aos.put(R.id.btnSellProgress, 22);
    }

    public uy(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, aor, aos));
    }

    private uy(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (TextView) objArr[12], (TextView) objArr[15], (TextView) objArr[18], (LinearLayout) objArr[11], (LinearLayout) objArr[14], (LinearLayout) objArr[17], (FrameLayout) objArr[20], (TextView) objArr[21], (ProgressBar) objArr[22], (ImageView) objArr[4], (ConstraintLayout) objArr[1], (LinearLayout) objArr[8], (TextView) objArr[6], (TextView) objArr[10], (LinearLayout) objArr[9], (LinearLayout) objArr[0], (TextView) objArr[7], (TextView) objArr[13], (TextView) objArr[16], (TextView) objArr[19], (TimerView) objArr[2], (TextView) objArr[5]);
        this.aot = -1;
        this.cod.setTag(null);
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
