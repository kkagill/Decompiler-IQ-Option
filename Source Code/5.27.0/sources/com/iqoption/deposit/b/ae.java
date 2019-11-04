package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.deposit.a;
import com.iqoption.deposit.o.e;
import com.iqoption.deposit.o.f;

/* compiled from: FragmentRefundAddressBindingImpl */
public class ae extends ad {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(8);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"layout_deposit_toolbar_lite", "layout_deposit_button"}, new int[]{1, 2}, new int[]{f.layout_deposit_toolbar_lite, f.layout_deposit_button});
        aos.put(e.depositRefundEdit, 3);
        aos.put(e.depositRefundScan, 4);
        aos.put(e.depositRefundDescription, 5);
        aos.put(e.depositRefundScanCardContainer, 6);
        aos.put(e.depositRefundScanContainer, 7);
    }

    public ae(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private ae(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (bj) objArr[1], (ax) objArr[2], (LinearLayout) objArr[0], (TextView) objArr[5], (EditText) objArr[3], (ImageView) objArr[4], (CardView) objArr[6], (FrameLayout) objArr[7]);
        this.aot = -1;
        this.cCP.setTag(null);
        View view2 = view;
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 4;
        }
        this.cBc.invalidateAll();
        this.cCO.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cBc.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.cCO.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0020, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x0021 }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        r0 = r6.cBc;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.cCO;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = 0;
        return r0;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.b.ae.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cBc.setLifecycleOwner(lifecycleOwner);
        this.cCO.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return i != 1 ? false : a((ax) obj, i2);
        } else {
            return a((bj) obj, i2);
        }
    }

    private boolean a(bj bjVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(ax axVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.cBc);
        ViewDataBinding.executeBindingsOn(this.cCO);
    }
}
