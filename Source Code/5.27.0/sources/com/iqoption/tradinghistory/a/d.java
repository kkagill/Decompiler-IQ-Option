package com.iqoption.tradinghistory.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.tradinghistory.b;
import com.iqoption.tradinghistory.g.e;

/* compiled from: FragmentDealDetailsMultiBindingImpl */
public class d extends c {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(13);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"layout_trading_history_toolbar"}, new int[]{1}, new int[]{e.layout_trading_history_toolbar});
        aos.put(com.iqoption.tradinghistory.g.d.dealDetailsMultiScrollContainer, 2);
        aos.put(com.iqoption.tradinghistory.g.d.dealDetailsMultiContent, 3);
        aos.put(com.iqoption.tradinghistory.g.d.dealDetailsMultiItemsContainer, 4);
        aos.put(com.iqoption.tradinghistory.g.d.amountTitle, 5);
        aos.put(com.iqoption.tradinghistory.g.d.amount, 6);
        aos.put(com.iqoption.tradinghistory.g.d.profitTitle, 7);
        aos.put(com.iqoption.tradinghistory.g.d.profit, 8);
        aos.put(com.iqoption.tradinghistory.g.d.closeReasonTitle, 9);
        aos.put(com.iqoption.tradinghistory.g.d.closeReason, 10);
        aos.put(com.iqoption.tradinghistory.g.d.tickInfo, 11);
        aos.put(com.iqoption.tradinghistory.g.d.tickInfoText, 12);
    }

    public d(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private d(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[10], (TextView) objArr[9], (ConstraintLayout) objArr[3], (LinearLayout) objArr[4], (ScrollView) objArr[2], (y) objArr[1], (LinearLayout) objArr[0], (TextView) objArr[8], (TextView) objArr[7], (ImageView) objArr[11], (TextView) objArr[12]);
        this.aot = -1;
        this.cod.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.dVU.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.dVU.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.dVU;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.a.d.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.dVU.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : b((y) obj, i2);
    }

    private boolean b(y yVar, int i) {
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.dVU);
    }
}
