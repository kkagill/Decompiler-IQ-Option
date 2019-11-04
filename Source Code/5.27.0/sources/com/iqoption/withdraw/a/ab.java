package com.iqoption.withdraw.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.withdraw.d.d;

/* compiled from: WithdrawHistoryPayoutItemBindingImpl */
public class ab extends aa {
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
        aos.put(d.withdrawTitle, 2);
        aos.put(d.withdrawTime, 3);
        aos.put(d.withdrawValueBarrier, 4);
        aos.put(d.withdrawProgressIcon, 5);
        aos.put(d.withdrawValue, 6);
        aos.put(d.withdrawCommission, 7);
        aos.put(d.withdrawCancelBarrier, 8);
        aos.put(d.withdrawCancelProgress, 9);
        aos.put(d.withdrawEnd, 10);
        aos.put(d.withdrawBottomBarrier, 11);
        aos.put(d.withdrawComment, 12);
        aos.put(d.withdrawBottomSpace, 13);
        aos.put(d.withdrawDivider, 14);
    }

    public ab(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private ab(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[11], (Space) objArr[13], (ImageView) objArr[1], (Barrier) objArr[8], (ContentLoadingProgressBar) objArr[9], (TextView) objArr[12], (TextView) objArr[7], (View) objArr[14], (Space) objArr[10], (ImageView) objArr[5], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[6], (Barrier) objArr[4]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
        this.eqO.setTag(null);
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
            a.a(this.eqO, (Void) null);
        }
    }
}
