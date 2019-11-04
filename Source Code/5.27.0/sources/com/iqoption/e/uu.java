package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: PortfolioExpInfoBindingImpl */
public class uu extends ut {
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
        aos.put(R.id.optPriceLayout, 1);
        aos.put(R.id.optPriceLabel, 2);
        aos.put(R.id.optPrice, 3);
        aos.put(R.id.qttyLayout, 4);
        aos.put(R.id.qtty, 5);
        aos.put(R.id.expLayout, 6);
        aos.put(R.id.expTime, 7);
        aos.put(R.id.expProfit, 8);
        aos.put(R.id.investment, 9);
        aos.put(R.id.currentPrice, 10);
        aos.put(R.id.pnlSell, 11);
        aos.put(R.id.btnSell, 12);
        aos.put(R.id.btnSellLabel, 13);
        aos.put(R.id.btnSellProgress, 14);
    }

    public uu(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private uu(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[12], (TextView) objArr[13], (ProgressBar) objArr[14], (RobotoTextView) objArr[10], (LinearLayout) objArr[6], (RobotoTextView) objArr[8], (RobotoTextView) objArr[7], (RobotoTextView) objArr[9], (RobotoTextView) objArr[3], (TextView) objArr[2], (LinearLayout) objArr[1], (RobotoTextView) objArr[11], (RobotoTextView) objArr[5], (LinearLayout) objArr[4]);
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
