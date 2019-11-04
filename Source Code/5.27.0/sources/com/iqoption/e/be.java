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

/* compiled from: AssetInfoStatisticsFullItemBindingImpl */
public class be extends bd {
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
        aos.put(R.id.oneWeekTitle, 2);
        aos.put(R.id.oneWeekDiff, 3);
        aos.put(R.id.oneWeekLowHighBar, 4);
        aos.put(R.id.oneWeekLow, 5);
        aos.put(R.id.oneWeekHigh, 6);
        aos.put(R.id.oneMounthTitle, 7);
        aos.put(R.id.oneMounthDiff, 8);
        aos.put(R.id.oneMounthLowHighBar, 9);
        aos.put(R.id.oneMounthLow, 10);
        aos.put(R.id.oneMounthHigh, 11);
    }

    public be(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private be(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[1], (TextView) objArr[8], (TextView) objArr[11], (TextView) objArr[10], (LowHighBar) objArr[9], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[6], (TextView) objArr[5], (LowHighBar) objArr[4], (TextView) objArr[2]);
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
