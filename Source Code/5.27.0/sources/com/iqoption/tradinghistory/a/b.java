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
import com.iqoption.tradinghistory.g.d;
import com.iqoption.tradinghistory.g.e;

/* compiled from: FragmentDealDetailsBindingImpl */
public class b extends a {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(31);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"layout_trading_history_toolbar"}, new int[]{1}, new int[]{e.layout_trading_history_toolbar});
        aos.put(d.dealDetailsScrollContainer, 2);
        aos.put(d.scrollableContent, 3);
        aos.put(d.assetTitle, 4);
        aos.put(d.asset, 5);
        aos.put(d.instrumentsTitle, 6);
        aos.put(d.instruments, 7);
        aos.put(d.openingPriceTitle, 8);
        aos.put(d.openingPrice, 9);
        aos.put(d.openingPriceIcon, 10);
        aos.put(d.openingTimeTitle, 11);
        aos.put(d.openingTime, 12);
        aos.put(d.closingPriceTitle, 13);
        aos.put(d.closingPrice, 14);
        aos.put(d.closingTimeTitle, 15);
        aos.put(d.closingTime, 16);
        aos.put(d.amountTitle, 17);
        aos.put(d.amount, 18);
        aos.put(d.leverageTitle, 19);
        aos.put(d.leverage, 20);
        aos.put(d.overnightTitle, 21);
        aos.put(d.overnight, 22);
        aos.put(d.custodialTitle, 23);
        aos.put(d.custodial, 24);
        aos.put(d.profitTitle, 25);
        aos.put(d.profit, 26);
        aos.put(d.closeReasonTitle, 27);
        aos.put(d.closeReason, 28);
        aos.put(d.tickInfo, 29);
        aos.put(d.tickInfoText, 30);
    }

    public b(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 31, aor, aos));
    }

    private b(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[18], (TextView) objArr[17], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[28], (TextView) objArr[27], (TextView) objArr[14], (TextView) objArr[13], (TextView) objArr[16], (TextView) objArr[15], (TextView) objArr[24], (TextView) objArr[23], (ScrollView) objArr[2], (y) objArr[1], (TextView) objArr[7], (TextView) objArr[6], (LinearLayout) objArr[0], (TextView) objArr[20], (TextView) objArr[19], (TextView) objArr[9], (ImageView) objArr[10], (TextView) objArr[8], (TextView) objArr[12], (TextView) objArr[11], (TextView) objArr[22], (TextView) objArr[21], (TextView) objArr[26], (TextView) objArr[25], (ConstraintLayout) objArr[3], (ImageView) objArr[29], (TextView) objArr[30]);
        this.aot = -1;
        this.cod.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.dVD.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.dVD.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.dVD;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.a.b.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.dVD.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : a((y) obj, i2);
    }

    private boolean a(y yVar, int i) {
        if (i != com.iqoption.tradinghistory.b._all) {
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
        ViewDataBinding.executeBindingsOn(this.dVD);
    }
}
