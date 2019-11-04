package com.iqoption.kyc.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.kyc.a;
import com.iqoption.kyc.o.d;
import com.iqoption.kyc.o.e;

/* compiled from: FragmentKycDocumentBindingImpl */
public class j extends i {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(13);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"layout_kyc_button"}, new int[]{5}, new int[]{e.layout_kyc_button});
        aos.put(d.kycDocumentIcon, 6);
        aos.put(d.kycDocumentTitle, 7);
        aos.put(d.kycDocumentSubtitle, 8);
        aos.put(d.kycDocumentDescription, 9);
        aos.put(d.kycDocumentComment, 10);
        aos.put(d.kycDocumentPoaTypes, 11);
        aos.put(d.kycDocumentProgress, 12);
    }

    public j(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private j(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (bs) objArr[5], (TextView) objArr[10], (LinearLayout) objArr[1], (TextView) objArr[9], (TextView) objArr[3], (ImageView) objArr[6], (LinearLayout) objArr[11], (FrameLayout) objArr[12], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[2]);
        this.aot = -1;
        this.duL.setTag(null);
        this.duN.setTag(null);
        this.duR.setTag(null);
        this.duU.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.duJ.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.duJ.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.duJ;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.kyc.b.j.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.duJ.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : a((bs) obj, i2);
    }

    private boolean a(bs bsVar, int i) {
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 2) != 0) {
            com.iqoption.core.ui.a.j(this.duN, 0.5f);
            com.iqoption.core.ui.a.j(this.duR, 0.5f);
            com.iqoption.core.ui.a.a(this.duU, (Void) null);
        }
        ViewDataBinding.executeBindingsOn(this.duJ);
    }
}
