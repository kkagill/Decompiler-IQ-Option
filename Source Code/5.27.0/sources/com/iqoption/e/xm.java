package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.view.CryptoAssetPager;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateCryptoBindingImpl */
public class xm extends xl {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(8);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final RelativeLayout cgo;
    @NonNull
    private final FrameLayout csl;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"right_panel_delegate_crypto_confirmation"}, new int[]{6}, new int[]{R.layout.right_panel_delegate_crypto_confirmation});
        aor.setIncludes(1, new String[]{"right_panel_delegate_crypto_main", "right_panel_delegate_crypto_loading", "right_panel_delegate_crypto_success", "right_panel_delegate_crypto_closed"}, new int[]{2, 3, 4, 5}, new int[]{R.layout.right_panel_delegate_crypto_main, R.layout.right_panel_delegate_crypto_loading, R.layout.right_panel_delegate_crypto_success, R.layout.right_panel_delegate_crypto_closed});
        aos.put(R.id.assetPager, 7);
    }

    public xm(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private xm(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (CryptoAssetPager) objArr[7], (xn) objArr[5], (xp) objArr[6], (xr) objArr[3], (xt) objArr[2], (xv) objArr[4]);
        this.aot = -1;
        this.cgo = (RelativeLayout) objArr[0];
        this.cgo.setTag(null);
        this.csl = (FrameLayout) objArr[1];
        this.csl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 32;
        }
        this.csj.invalidateAll();
        this.csi.invalidateAll();
        this.csk.invalidateAll();
        this.csg.invalidateAll();
        this.csh.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.csj.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.csi.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.csk.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x002e, code skipped:
            if (r6.csg.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:0x0037, code skipped:
            if (r6.csh.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:21:0x0039, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:23:0x003b, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x003c }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        r0 = r6.csj;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.csi;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.csk;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = r6.csg;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r4;
    L_0x0031:
        r0 = r6.csh;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        return r4;
    L_0x003a:
        r0 = 0;
        return r0;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.xm.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.csj.setLifecycleOwner(lifecycleOwner);
        this.csi.setLifecycleOwner(lifecycleOwner);
        this.csk.setLifecycleOwner(lifecycleOwner);
        this.csg.setLifecycleOwner(lifecycleOwner);
        this.csh.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return a((xr) obj, i2);
        }
        if (i == 1) {
            return a((xp) obj, i2);
        }
        if (i == 2) {
            return a((xn) obj, i2);
        }
        if (i != 3) {
            return i != 4 ? false : a((xv) obj, i2);
        } else {
            return a((xt) obj, i2);
        }
    }

    private boolean a(xr xrVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(xp xpVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    private boolean a(xn xnVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 4;
        }
        return true;
    }

    private boolean a(xt xtVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 8;
        }
        return true;
    }

    private boolean a(xv xvVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 16;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.csj);
        ViewDataBinding.executeBindingsOn(this.csi);
        ViewDataBinding.executeBindingsOn(this.csk);
        ViewDataBinding.executeBindingsOn(this.csg);
        ViewDataBinding.executeBindingsOn(this.csh);
    }
}
