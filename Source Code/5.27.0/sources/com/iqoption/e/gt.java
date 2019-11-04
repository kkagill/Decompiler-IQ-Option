package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.x.R;

/* compiled from: DialogProTraderBenefitsBindingImpl */
public class gt extends gs {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(7);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final TableLayout ccC;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"layout_dialog_toolbar"}, new int[]{3}, new int[]{R.layout.layout_dialog_toolbar});
        aor.setIncludes(2, new String[]{"layout_pro_trader_benefits_top_row", "layout_pro_trader_benefits_bottom_row"}, new int[]{4, 5}, new int[]{R.layout.layout_pro_trader_benefits_top_row, R.layout.layout_pro_trader_benefits_bottom_row});
        aos.put(R.id.proBenefitsAccessToHigherLeverages, 6);
    }

    public gt(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private gt(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (FrameLayout) objArr[0], (TextView) objArr[6], (pl) objArr[5], (LinearLayout) objArr[1], (ph) objArr[3], (pn) objArr[4]);
        this.aot = -1;
        this.aoG.setTag(null);
        this.ccC = (TableLayout) objArr[2];
        this.ccC.setTag(null);
        this.ccz.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 8;
        }
        this.ccA.invalidateAll();
        this.ccB.invalidateAll();
        this.ccy.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.ccA.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.ccB.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.ccy.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x0029, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x002a }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x002a }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x002a }
        r0 = r6.ccA;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.ccB;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.ccy;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = 0;
        return r0;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x002a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.gt.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.ccA.setLifecycleOwner(lifecycleOwner);
        this.ccB.setLifecycleOwner(lifecycleOwner);
        this.ccy.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return a((ph) obj, i2);
        }
        if (i != 1) {
            return i != 2 ? false : a((pn) obj, i2);
        } else {
            return a((pl) obj, i2);
        }
    }

    private boolean a(ph phVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(pl plVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    private boolean a(pn pnVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 4;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.ccA);
        ViewDataBinding.executeBindingsOn(this.ccB);
        ViewDataBinding.executeBindingsOn(this.ccy);
    }
}
