package com.iqoption.tradinghistory.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.core.ui.a;
import com.iqoption.tradinghistory.b;
import com.iqoption.tradinghistory.g.d;
import com.iqoption.tradinghistory.g.e;

/* compiled from: FragmentTradingHistoryFiltersBindingImpl */
public class h extends g {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(10);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"layout_trading_history_toolbar"}, new int[]{5}, new int[]{e.layout_trading_history_toolbar});
        aos.put(d.tradingHistoryFilterInstrumentValue, 6);
        aos.put(d.tradingHistoryFilterBalanceValue, 7);
        aos.put(d.tradingHistoryFilterActiveValue, 8);
        aos.put(d.tradingHistoryFilterDateValue, 9);
    }

    public h(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private h(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LinearLayout) objArr[3], (TextView) objArr[8], (LinearLayout) objArr[2], (TextView) objArr[7], (LinearLayout) objArr[4], (TextView) objArr[9], (LinearLayout) objArr[1], (TextView) objArr[6], (y) objArr[5]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.dVX.setTag(null);
        this.dVZ.setTag(null);
        this.dWb.setTag(null);
        this.dWd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.dWf.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.dWf.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x0017, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x0018 }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x0018 }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x0018 }
        r0 = r6.dWf;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = 0;
        return r0;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.a.h.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.dWf.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : d((y) obj, i2);
    }

    private boolean d(y yVar, int i) {
        if (i != b._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 2) != 0) {
            a.m(this.dVX, 0.5f);
            a.m(this.dVZ, 0.5f);
            a.m(this.dWb, 0.5f);
            a.m(this.dWd, 0.5f);
        }
        ViewDataBinding.executeBindingsOn(this.dWf);
    }
}
