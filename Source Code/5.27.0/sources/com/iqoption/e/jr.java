package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.x.R;

/* compiled from: FragmentKycDocumentsIntroBindingImpl */
public class jr extends jq {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(4);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final RelativeLayout cgo;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"layout_kyc_toolbar_old"}, new int[]{1}, new int[]{R.layout.layout_kyc_toolbar_old});
        aos.put(R.id.phone, 2);
        aos.put(R.id.nextButton, 3);
    }

    public jr(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private jr(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (pj) objArr[1], (ConfirmButtonView) objArr[3], (TextView) objArr[2]);
        this.aot = -1;
        this.cgo = (RelativeLayout) objArr[0];
        this.cgo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.cfS.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cfS.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.cfS;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.jr.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cfS.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : a((pj) obj, i2);
    }

    private boolean a(pj pjVar, int i) {
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
        ViewDataBinding.executeBindingsOn(this.cfS);
    }
}