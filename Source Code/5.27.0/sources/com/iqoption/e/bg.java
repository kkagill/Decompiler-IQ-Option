package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.LowHighBar;
import com.iqoption.x.R;

/* compiled from: AssetInfoStatisticsItemBindingImpl */
public class bg extends bf {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final ConstraintLayout aoV;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.line, 1);
        aos.put(R.id.title, 2);
        aos.put(R.id.fiveMinTitle, 3);
        aos.put(R.id.lowTitle, 4);
        aos.put(R.id.highTitle, 5);
        aos.put(R.id.fiveMinDiff, 6);
        aos.put(R.id.fiveMinLowHighBar, 7);
        aos.put(R.id.fiveMinLow, 8);
        aos.put(R.id.fiveMinHigh, 9);
        aos.put(R.id.oneHourTitle, 10);
        aos.put(R.id.oneHourDiff, 11);
        aos.put(R.id.oneHourLowHighBar, 12);
        aos.put(R.id.oneHourLow, 13);
        aos.put(R.id.oneHourHigh, 14);
        aos.put(R.id.oneDayTitle, 15);
        aos.put(R.id.oneDayDiff, 16);
        aos.put(R.id.oneDayLowHighBar, 17);
        aos.put(R.id.oneDayLow, 18);
        aos.put(R.id.oneDayHigh, 19);
    }

    public bg(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, aor, aos));
    }

    private bg(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[8], (LowHighBar) objArr[7], (TextView) objArr[3], (TextView) objArr[5], (Guideline) objArr[1], (TextView) objArr[4], (TextView) objArr[16], (TextView) objArr[19], (TextView) objArr[18], (LowHighBar) objArr[17], (TextView) objArr[15], (TextView) objArr[11], (TextView) objArr[14], (TextView) objArr[13], (LowHighBar) objArr[12], (TextView) objArr[10], (TextView) objArr[2]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
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
