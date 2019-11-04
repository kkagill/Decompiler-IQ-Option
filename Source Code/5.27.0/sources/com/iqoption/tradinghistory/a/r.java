package com.iqoption.tradinghistory.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.tradinghistory.g.d;

/* compiled from: ItemTradingHistoryBindingImpl */
public class r extends q {
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
        aos.put(d.icon, 1);
        aos.put(d.title, 2);
        aos.put(d.subtitle, 3);
        aos.put(d.profit, 4);
        aos.put(d.profitPercent, 5);
    }

    public r(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private r(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[2]);
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            a.m(this.aoV, 0.8f);
        }
    }
}