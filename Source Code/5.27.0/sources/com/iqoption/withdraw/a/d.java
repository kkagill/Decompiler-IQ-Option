package com.iqoption.withdraw.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.withdraw.a;
import com.iqoption.withdraw.d.e;

/* compiled from: FragmentWithdrawFieldsBindingImpl */
public class d extends c {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(8);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"withdraw_insufficient_founds_layout"}, new int[]{2}, new int[]{e.withdraw_insufficient_founds_layout});
        aor.setIncludes(1, new String[]{"layout_withdraw_no_fee", "layout_withdraw_fee", "withdraw_button_layout"}, new int[]{3, 4, 5}, new int[]{e.layout_withdraw_no_fee, e.layout_withdraw_fee, e.withdraw_button_layout});
        aos.put(com.iqoption.withdraw.d.d.withdrawFieldsVerifyContainer, 6);
        aos.put(com.iqoption.withdraw.d.d.withdrawFieldsContainer, 7);
    }

    public d(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private d(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (y) objArr[5], (s) objArr[4], (LinearLayout) objArr[7], (ae) objArr[2], (LinearLayout) objArr[1], (FrameLayout) objArr[6], (u) objArr[3]);
        this.aot = -1;
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        this.epX.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 16;
        }
        this.epW.invalidateAll();
        this.epZ.invalidateAll();
        this.epU.invalidateAll();
        this.epT.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.epW.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.epZ.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.epU.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x002e, code skipped:
            if (r6.epT.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:0x0032, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x0033 }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x0033 }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x0033 }
        r0 = r6.epW;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.epZ;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.epU;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = r6.epT;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r4;
    L_0x0031:
        r0 = 0;
        return r0;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0033 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.a.d.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.epW.setLifecycleOwner(lifecycleOwner);
        this.epZ.setLifecycleOwner(lifecycleOwner);
        this.epU.setLifecycleOwner(lifecycleOwner);
        this.epT.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return a((s) obj, i2);
        }
        if (i == 1) {
            return a((y) obj, i2);
        }
        if (i != 2) {
            return i != 3 ? false : a((ae) obj, i2);
        } else {
            return a((u) obj, i2);
        }
    }

    private boolean a(s sVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(y yVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    private boolean a(u uVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 4;
        }
        return true;
    }

    private boolean a(ae aeVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 8;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.epW);
        ViewDataBinding.executeBindingsOn(this.epZ);
        ViewDataBinding.executeBindingsOn(this.epU);
        ViewDataBinding.executeBindingsOn(this.epT);
    }
}
