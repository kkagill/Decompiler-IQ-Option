package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.core.ui.widget.time.TimeTextView;
import com.iqoption.deposit.a;
import com.iqoption.deposit.o.e;
import com.iqoption.deposit.o.f;

/* compiled from: FragmentDepositCryptoRequisitesBindingImpl */
public class l extends k {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(28);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"layout_deposit_toolbar_lite"}, new int[]{3}, new int[]{f.layout_deposit_toolbar_lite});
        aos.put(e.cryptoRequisitesContent, 4);
        aos.put(e.cryptoToolbarBorder, 5);
        aos.put(e.cryptoSendTitle, 6);
        aos.put(e.cryptoSendBorder, 7);
        aos.put(e.cryptoGetTitle, 8);
        aos.put(e.cryptoTitleBarrier, 9);
        aos.put(e.cryptoSendValue, 10);
        aos.put(e.cryptoQuestion, 11);
        aos.put(e.cryptoGetValue, 12);
        aos.put(e.cryptoGetBorder, 13);
        aos.put(e.cryptoDetailsArrow, 14);
        aos.put(e.cryptoDetailsContainer, 15);
        aos.put(e.cryptoDetailsRefundAddressTitle, 16);
        aos.put(e.cryptoDetailsRefundAddress, 17);
        aos.put(e.cryptoDetailsFee, 18);
        aos.put(e.cryptoDetailsBorder, 19);
        aos.put(e.cryptoTimeLeftTitle, 20);
        aos.put(e.cryptoTimeLeftValue, 21);
        aos.put(e.cryptoQRCodeImageContainer, 22);
        aos.put(e.cryptoQRCodeImage, 23);
        aos.put(e.cryptoCopy, 24);
        aos.put(e.cryptoAddress, 25);
        aos.put(e.cryptoCopyDescription, 26);
        aos.put(e.cryptoRequisitesProgress, 27);
    }

    public l(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 28, aor, aos));
    }

    private l(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (TextView) objArr[25], (CardView) objArr[24], (TextView) objArr[26], (ImageView) objArr[14], (View) objArr[19], (LinearLayout) objArr[2], (LinearLayout) objArr[15], (TextView) objArr[18], (TextView) objArr[17], (TextView) objArr[16], (View) objArr[13], (TextView) objArr[8], (TextView) objArr[12], (ImageView) objArr[23], (CardView) objArr[22], (ImageView) objArr[11], (ConstraintLayout) objArr[1], (ScrollView) objArr[4], (ContentLoadingProgressBar) objArr[27], (View) objArr[7], (TextView) objArr[6], (TextView) objArr[10], (TextView) objArr[20], (TimeTextView) objArr[21], (Barrier) objArr[9], (bj) objArr[3], (View) objArr[5]);
        this.aot = -1;
        this.cBp.setTag(null);
        this.cBA.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
        }
        this.cBc.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cBc.hasPendingBindings() == false) goto L_0x0016;
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
        r0 = r6.cBc;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.b.l.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cBc.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return i != 0 ? false : a((bj) obj, i2);
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

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 2) != 0) {
            com.iqoption.core.ui.a.j(this.cBp, 0.5f);
        }
        ViewDataBinding.executeBindingsOn(this.cBc);
    }
}
