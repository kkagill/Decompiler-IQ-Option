package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.deposit.a;
import com.iqoption.deposit.o.e;
import com.iqoption.deposit.o.f;

/* compiled from: FragmentDepositPerformLightBindingImpl */
public class u extends t {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(27);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    @NonNull
    private final LinearLayout aAS;
    private long aot;
    @NonNull
    private final LinearLayout cdZ;
    @NonNull
    private final LinearLayout cea;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(0, new String[]{"layout_deposit_button_light"}, new int[]{7}, new int[]{f.layout_deposit_button_light});
        aor.setIncludes(1, new String[]{"layout_perform_toolbar_title_light"}, new int[]{4}, new int[]{f.layout_perform_toolbar_title_light});
        aor.setIncludes(2, new String[]{"layout_deposit_protected_light"}, new int[]{6}, new int[]{f.layout_deposit_protected_light});
        aor.setIncludes(3, new String[]{"layout_currency_selector_light"}, new int[]{5}, new int[]{f.layout_currency_selector_light});
        aos.put(e.toolbarBack, 8);
        aos.put(e.depositPerformHoldContainer, 9);
        aos.put(e.depositInfoHint, 10);
        aos.put(e.depositInfoHintText, 11);
        aos.put(e.depositInfoHintButton, 12);
        aos.put(e.depositPerformLightScroll, 13);
        aos.put(e.topFocusableView, 14);
        aos.put(e.depositAmountContainer, 15);
        aos.put(e.depositAmountTitle, 16);
        aos.put(e.depositAmountEdit, 17);
        aos.put(e.depositAmountConvertedDivider, 18);
        aos.put(e.depositAmountConvertedContainer, 19);
        aos.put(e.depositAmountConvertedEdit, 20);
        aos.put(e.depositAmountConvertedCurrency, 21);
        aos.put(e.depositAmountKycError, 22);
        aos.put(e.depositPresetsList, 23);
        aos.put(e.depositNoData, 24);
        aos.put(e.depositFields, 25);
        aos.put(e.depositTerms, 26);
    }

    public u(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 27, aor, aos));
    }

    private u(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (av) objArr[5], (LinearLayout) objArr[15], (LinearLayout) objArr[19], (TextView) objArr[21], (View) objArr[18], (EditText) objArr[20], (EditText) objArr[17], (TextView) objArr[22], (TextView) objArr[16], (az) objArr[7], (FrameLayout) objArr[25], (LinearLayout) objArr[10], (TextView) objArr[12], (TextView) objArr[11], (TextView) objArr[24], (FrameLayout) objArr[9], (ScrollView) objArr[13], (RecyclerView) objArr[23], (bh) objArr[6], (TextView) objArr[26], (ImageView) objArr[8], (bo) objArr[4], (View) objArr[14]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.aAS = (LinearLayout) objArr[1];
        this.aAS.setTag(null);
        this.cdZ = (LinearLayout) objArr[2];
        this.cdZ.setTag(null);
        this.cea = (LinearLayout) objArr[3];
        this.cea.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 16;
        }
        this.cCv.invalidateAll();
        this.cCa.invalidateAll();
        this.cCs.invalidateAll();
        this.cCj.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cCv.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.cCa.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.cCs.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x002e, code skipped:
            if (r6.cCj.hasPendingBindings() == false) goto L_0x0031;
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
        r0 = r6.cCv;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.cCa;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.cCs;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = r6.cCj;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.b.u.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cCv.setLifecycleOwner(lifecycleOwner);
        this.cCa.setLifecycleOwner(lifecycleOwner);
        this.cCs.setLifecycleOwner(lifecycleOwner);
        this.cCj.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return a((bo) obj, i2);
        }
        if (i == 1) {
            return a((bh) obj, i2);
        }
        if (i != 2) {
            return i != 3 ? false : a((az) obj, i2);
        } else {
            return a((av) obj, i2);
        }
    }

    private boolean a(bo boVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(bh bhVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    private boolean a(av avVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 4;
        }
        return true;
    }

    private boolean a(az azVar, int i) {
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
        ViewDataBinding.executeBindingsOn(this.cCv);
        ViewDataBinding.executeBindingsOn(this.cCa);
        ViewDataBinding.executeBindingsOn(this.cCs);
        ViewDataBinding.executeBindingsOn(this.cCj);
    }
}
