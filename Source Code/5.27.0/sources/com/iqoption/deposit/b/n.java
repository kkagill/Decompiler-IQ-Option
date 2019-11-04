package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.deposit.a;
import com.iqoption.deposit.o.e;
import com.iqoption.deposit.o.f;

/* compiled from: FragmentDepositHoldLightBindingImpl */
public class n extends m {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(10);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    @NonNull
    private final LinearLayout aAS;
    private long aot;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"layout_deposit_hold_show_more"}, new int[]{2}, new int[]{f.layout_deposit_hold_show_more});
        aos.put(e.holdKycIcon, 3);
        aos.put(e.holdKycTitle, 4);
        aos.put(e.layout_deposit_hold_time_warning_expanded, 5);
        aos.put(e.holdKycWarning, 6);
        aos.put(e.holdCardWarning, 7);
        aos.put(e.depositHoldKycButton, 8);
        aos.put(e.depositHoldCardButton, 9);
    }

    public n(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private n(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[7], (ImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[6], (bb) objArr[2], new ViewStubProxy((ViewStub) objArr[5]));
        this.aot = -1;
        this.cBR.setContainingBinding(this);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.aAS = (LinearLayout) objArr[1];
        this.aAS.setTag(null);
        View view2 = view;
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.cBQ.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cBQ.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.cBQ;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.b.n.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cBQ.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : a((bb) obj, i2);
    }

    private boolean a(bb bbVar, int i) {
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
        ViewDataBinding.executeBindingsOn(this.cBQ);
        if (this.cBR.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.cBR.getBinding());
        }
    }
}
