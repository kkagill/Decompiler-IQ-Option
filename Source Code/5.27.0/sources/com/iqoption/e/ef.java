package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.x.R;

/* compiled from: CloseDelegateBindingImpl */
public class ef extends ee {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.expirationContainer, 2);
        aos.put(R.id.countTitle, 3);
        aos.put(R.id.countPosition, 4);
        aos.put(R.id.investTitle, 5);
        aos.put(R.id.invest, 6);
        aos.put(R.id.closeProfitTilte, 7);
        aos.put(R.id.closeProfit, 8);
        aos.put(R.id.closeProfitPercent, 9);
        aos.put(R.id.closeContainer, 10);
        aos.put(R.id.close, 11);
        aos.put(R.id.progress, 12);
    }

    public ef(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private ef(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[11], (FrameLayout) objArr[10], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[1], (LinearLayout) objArr[2], (TextView) objArr[6], (TextView) objArr[5], (ContentLoadingProgressBar) objArr[12]);
        this.aot = -1;
        this.bTD.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
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
            TextViewBindingAdapter.setDrawableLeft(this.bTD, ViewDataBinding.getDrawableFromResource(this.bTD, R.drawable.ic_flag_8_8));
        }
    }
}
