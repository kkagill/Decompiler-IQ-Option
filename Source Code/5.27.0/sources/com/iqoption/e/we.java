package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: PortfolioPendingSingleGroupItemBindingImpl */
public class we extends wd {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(12);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAS;
    private long aot;
    @NonNull
    private final FrameLayout aow;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"portfolio_pending_info"}, new int[]{2}, new int[]{R.layout.portfolio_pending_info});
        aos.put(R.id.selectionIndicator, 3);
        aos.put(R.id.header, 4);
        aos.put(R.id.activeIcon, 5);
        aos.put(R.id.activeName, 6);
        aos.put(R.id.instrument, 7);
        aos.put(R.id.quantity, 8);
        aos.put(R.id.sideIndicator, 9);
        aos.put(R.id.limitPrice, 10);
        aos.put(R.id.invest, 11);
    }

    public we(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private we(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[5], (TextView) objArr[6], (ConstraintLayout) objArr[4], (vz) objArr[2], (TextView) objArr[7], (RobotoTextView) objArr[11], (RobotoTextView) objArr[10], (TextView) objArr[8], (FrameLayout) objArr[3], (ImageView) objArr[9]);
        this.aot = -1;
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        this.aAS = (LinearLayout) objArr[1];
        this.aAS.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.cqb.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cqb.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.cqb;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.we.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cqb.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : a((vz) obj, i2);
    }

    private boolean a(vz vzVar, int i) {
        if (i != 0) {
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
        ViewDataBinding.executeBindingsOn(this.cqb);
    }
}
