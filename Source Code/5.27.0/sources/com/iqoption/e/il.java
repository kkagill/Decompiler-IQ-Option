package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: FragmentAccountSecurityPasscodeBindingImpl */
public class il extends ik implements a {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(15);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener cfp;

    static {
        aor.setIncludes(1, new String[]{"dialpad"}, new int[]{10}, new int[]{R.layout.dialpad});
        aor.setIncludes(2, new String[]{"dialpad_dot", "dialpad_dot", "dialpad_dot", "dialpad_dot", "dialpad_dot", "dialpad_dot"}, new int[]{4, 5, 6, 7, 8, 9}, new int[]{R.layout.dialpad_dot, R.layout.dialpad_dot, R.layout.dialpad_dot, R.layout.dialpad_dot, R.layout.dialpad_dot, R.layout.dialpad_dot});
        aos.put(R.id.passcodeTitleLayout, 11);
        aos.put(R.id.passcodeTitleText, 12);
        aos.put(R.id.passcodeVerificationTitleLayout, 13);
        aos.put(R.id.enterPasscodeOrUseTouchIdText, 14);
    }

    public il(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private il(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (TextView) objArr[3], (ho) objArr[10], (hq) objArr[4], (hq) objArr[5], (hq) objArr[6], (hq) objArr[7], (hq) objArr[8], (hq) objArr[9], (LinearLayout) objArr[2], (TextView) objArr[14], (LinearLayout) objArr[1], (FrameLayout) objArr[0], (FrameLayout) objArr[11], (TextSwitcher) objArr[12], (LinearLayout) objArr[13]);
        this.aot = -1;
        this.cfb.setTag(null);
        this.ceL.setTag(null);
        this.bgn.setTag(null);
        this.cfa.setTag(null);
        setRootTag(view);
        this.cfp = new com.iqoption.g.a.a(this, 1);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 256;
        }
        this.cfe.invalidateAll();
        this.cff.invalidateAll();
        this.cfg.invalidateAll();
        this.cfh.invalidateAll();
        this.cfi.invalidateAll();
        this.cfj.invalidateAll();
        this.cfc.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cfe.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.cff.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.cfg.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x002e, code skipped:
            if (r6.cfh.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:0x0037, code skipped:
            if (r6.cfi.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:21:0x0039, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:23:0x0040, code skipped:
            if (r6.cfj.hasPendingBindings() == false) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:24:0x0042, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:26:0x0049, code skipped:
            if (r6.cfc.hasPendingBindings() == false) goto L_0x004c;
     */
    /* JADX WARNING: Missing block: B:27:0x004b, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:29:0x004d, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x004e }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x004e }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x004e }
        r0 = r6.cfe;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.cff;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.cfg;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = r6.cfh;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r4;
    L_0x0031:
        r0 = r6.cfi;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        return r4;
    L_0x003a:
        r0 = r6.cfj;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0043;
    L_0x0042:
        return r4;
    L_0x0043:
        r0 = r6.cfc;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x004c;
    L_0x004b:
        return r4;
    L_0x004c:
        r0 = 0;
        return r0;
    L_0x004e:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x004e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.il.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        if (4 != i) {
            return false;
        }
        a((PasscodeFragment) obj);
        return true;
    }

    public void a(@Nullable PasscodeFragment passcodeFragment) {
        this.cfo = passcodeFragment;
        synchronized (this) {
            this.aot |= 128;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cfe.setLifecycleOwner(lifecycleOwner);
        this.cff.setLifecycleOwner(lifecycleOwner);
        this.cfg.setLifecycleOwner(lifecycleOwner);
        this.cfh.setLifecycleOwner(lifecycleOwner);
        this.cfi.setLifecycleOwner(lifecycleOwner);
        this.cfj.setLifecycleOwner(lifecycleOwner);
        this.cfc.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return a((ho) obj, i2);
            case 1:
                return a((hq) obj, i2);
            case 2:
                return b((hq) obj, i2);
            case 3:
                return c((hq) obj, i2);
            case 4:
                return d((hq) obj, i2);
            case 5:
                return e((hq) obj, i2);
            case 6:
                return f((hq) obj, i2);
            default:
                return false;
        }
    }

    private boolean a(ho hoVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(hq hqVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    private boolean b(hq hqVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 4;
        }
        return true;
    }

    private boolean c(hq hqVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 8;
        }
        return true;
    }

    private boolean d(hq hqVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 16;
        }
        return true;
    }

    private boolean e(hq hqVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 32;
        }
        return true;
    }

    private boolean f(hq hqVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 64;
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
        PasscodeFragment passcodeFragment = this.cfo;
        if ((j & 256) != 0) {
            this.cfb.setOnClickListener(this.cfp);
        }
        ViewDataBinding.executeBindingsOn(this.cfe);
        ViewDataBinding.executeBindingsOn(this.cff);
        ViewDataBinding.executeBindingsOn(this.cfg);
        ViewDataBinding.executeBindingsOn(this.cfh);
        ViewDataBinding.executeBindingsOn(this.cfi);
        ViewDataBinding.executeBindingsOn(this.cfj);
        ViewDataBinding.executeBindingsOn(this.cfc);
    }

    public final void a(int i, View view) {
        PasscodeFragment passcodeFragment = this.cfo;
        if ((passcodeFragment != null ? 1 : null) != null) {
            passcodeFragment.ayg();
        }
    }
}
