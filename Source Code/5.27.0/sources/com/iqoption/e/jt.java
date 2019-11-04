package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.x.R;

/* compiled from: FragmentKycDocumentsUploadBindingImpl */
public class jt extends js {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(14);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"layout_kyc_toolbar_old"}, new int[]{2}, new int[]{R.layout.layout_kyc_toolbar_old});
        aos.put(R.id.documentsTittle, 3);
        aos.put(R.id.redirectText, 4);
        aos.put(R.id.proofOfIdentity, 5);
        aos.put(R.id.proofOfIdentityText, 6);
        aos.put(R.id.proofOfIdentityStatus, 7);
        aos.put(R.id.proofOfIdentityProgress, 8);
        aos.put(R.id.addressOfResidence, 9);
        aos.put(R.id.addressOfResidenceText, 10);
        aos.put(R.id.addressOfResidenceStatus, 11);
        aos.put(R.id.addressOfResidenceProgress, 12);
        aos.put(R.id.attachDocumentsLater, 13);
    }

    public jt(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, aor, aos));
    }

    private jt(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[1], (LinearLayout) objArr[9], (ContentLoadingProgressBar) objArr[12], (TextView) objArr[11], (TextView) objArr[10], (ConfirmButtonView) objArr[13], (TextView) objArr[3], (pj) objArr[2], (LinearLayout) objArr[5], (ContentLoadingProgressBar) objArr[8], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[4]);
        this.aot = -1;
        this.cgp.setTag(null);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.jt.hasPendingBindings():boolean");
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 2) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.cgp, ViewDataBinding.getDrawableFromResource(this.cgp, R.drawable.ic_kyc_next_selector));
        }
        ViewDataBinding.executeBindingsOn(this.cfS);
    }
}
