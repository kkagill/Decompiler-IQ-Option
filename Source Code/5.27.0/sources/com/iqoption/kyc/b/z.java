package com.iqoption.kyc.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.kyc.a;
import com.iqoption.kyc.o.d;
import com.iqoption.kyc.o.e;
import com.iqoption.widget.numpad.NumPad;

/* compiled from: FragmentKycPhoneInputBindingImpl */
public class z extends y {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(6);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAS;
    private long aot;
    @NonNull
    private final ScrollView cfT;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"layout_kyc_button"}, new int[]{2}, new int[]{e.layout_kyc_button});
        aos.put(d.kycPhoneInput, 3);
        aos.put(d.kycPhoneEdit, 4);
        aos.put(d.kycPhoneNumPad, 5);
    }

    public z(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private z(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (bs) objArr[2], (IQTextInputEditText) objArr[4], (TextInputLayout) objArr[3], (NumPad) objArr[5]);
        this.aot = -1;
        this.cfT = (ScrollView) objArr[0];
        this.cfT.setTag(null);
        this.aAS = (LinearLayout) objArr[1];
        this.aAS.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.dvl.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.dvl.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.dvl;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.b.z.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.dvl.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : d((bs) obj, i2);
    }

    private boolean d(bs bsVar, int i) {
        if (i != a._all) {
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
        ViewDataBinding.executeBindingsOn(this.dvl);
    }
}
