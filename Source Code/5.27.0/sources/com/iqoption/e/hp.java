package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.x.R;

/* compiled from: DialpadBindingImpl */
public class hp extends ho {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(17);
    @Nullable
    private static final SparseIntArray aos = null;
    private long aot;
    @NonNull
    private final LinearLayout cdZ;
    @NonNull
    private final LinearLayout cea;
    @NonNull
    private final LinearLayout ceb;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        String str = "dialpad_key";
        aor.setIncludes(1, new String[]{str, str, str}, new int[]{5, 6, 7}, new int[]{R.layout.dialpad_key, R.layout.dialpad_key, R.layout.dialpad_key});
        aor.setIncludes(2, new String[]{str, str, str}, new int[]{8, 9, 10}, new int[]{R.layout.dialpad_key, R.layout.dialpad_key, R.layout.dialpad_key});
        aor.setIncludes(3, new String[]{str, str, str}, new int[]{11, 12, 13}, new int[]{R.layout.dialpad_key, R.layout.dialpad_key, R.layout.dialpad_key});
        aor.setIncludes(4, new String[]{"dialpad_key_touchid", "dialpad_key_zero", "dialpad_key_back"}, new int[]{14, 15, 16}, new int[]{R.layout.dialpad_key_touchid, R.layout.dialpad_key_zero, R.layout.dialpad_key_back});
    }

    public hp(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, aor, aos));
    }

    private hp(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 12, (hs) objArr[16], (LinearLayout) objArr[0], (hu) objArr[12], (hw) objArr[14], (hu) objArr[9], (hu) objArr[8], (LinearLayout) objArr[1], (hu) objArr[13], (hu) objArr[5], (hu) objArr[11], (hu) objArr[10], (hu) objArr[7], (hu) objArr[6], (hy) objArr[15]);
        this.aot = -1;
        this.bfW.setTag(null);
        this.bga.setTag(null);
        this.cdZ = (LinearLayout) objArr[2];
        this.cdZ.setTag(null);
        this.cea = (LinearLayout) objArr[3];
        this.cea.setTag(null);
        this.ceb = (LinearLayout) objArr[4];
        this.ceb.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 4096;
        }
        this.cdT.invalidateAll();
        this.cdX.invalidateAll();
        this.cdW.invalidateAll();
        this.cdR.invalidateAll();
        this.cdQ.invalidateAll();
        this.cdV.invalidateAll();
        this.cdU.invalidateAll();
        this.cdO.invalidateAll();
        this.cdS.invalidateAll();
        this.cdP.invalidateAll();
        this.cdY.invalidateAll();
        this.cdN.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.cdT.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.cdX.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.cdW.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x002e, code skipped:
            if (r6.cdR.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:0x0037, code skipped:
            if (r6.cdQ.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:21:0x0039, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:23:0x0040, code skipped:
            if (r6.cdV.hasPendingBindings() == false) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:24:0x0042, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:26:0x0049, code skipped:
            if (r6.cdU.hasPendingBindings() == false) goto L_0x004c;
     */
    /* JADX WARNING: Missing block: B:27:0x004b, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:29:0x0052, code skipped:
            if (r6.cdO.hasPendingBindings() == false) goto L_0x0055;
     */
    /* JADX WARNING: Missing block: B:30:0x0054, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:32:0x005b, code skipped:
            if (r6.cdS.hasPendingBindings() == false) goto L_0x005e;
     */
    /* JADX WARNING: Missing block: B:33:0x005d, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:35:0x0064, code skipped:
            if (r6.cdP.hasPendingBindings() == false) goto L_0x0067;
     */
    /* JADX WARNING: Missing block: B:36:0x0066, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:38:0x006d, code skipped:
            if (r6.cdY.hasPendingBindings() == false) goto L_0x0070;
     */
    /* JADX WARNING: Missing block: B:39:0x006f, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:41:0x0076, code skipped:
            if (r6.cdN.hasPendingBindings() == false) goto L_0x0079;
     */
    /* JADX WARNING: Missing block: B:42:0x0078, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:44:0x007a, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x007b }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x007b }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x007b }
        r0 = r6.cdT;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.cdX;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.cdW;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = r6.cdR;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r4;
    L_0x0031:
        r0 = r6.cdQ;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        return r4;
    L_0x003a:
        r0 = r6.cdV;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0043;
    L_0x0042:
        return r4;
    L_0x0043:
        r0 = r6.cdU;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x004c;
    L_0x004b:
        return r4;
    L_0x004c:
        r0 = r6.cdO;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0055;
    L_0x0054:
        return r4;
    L_0x0055:
        r0 = r6.cdS;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x005e;
    L_0x005d:
        return r4;
    L_0x005e:
        r0 = r6.cdP;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0067;
    L_0x0066:
        return r4;
    L_0x0067:
        r0 = r6.cdY;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0070;
    L_0x006f:
        return r4;
    L_0x0070:
        r0 = r6.cdN;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0079;
    L_0x0078:
        return r4;
    L_0x0079:
        r0 = 0;
        return r0;
    L_0x007b:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x007b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.hp.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.cdT.setLifecycleOwner(lifecycleOwner);
        this.cdX.setLifecycleOwner(lifecycleOwner);
        this.cdW.setLifecycleOwner(lifecycleOwner);
        this.cdR.setLifecycleOwner(lifecycleOwner);
        this.cdQ.setLifecycleOwner(lifecycleOwner);
        this.cdV.setLifecycleOwner(lifecycleOwner);
        this.cdU.setLifecycleOwner(lifecycleOwner);
        this.cdO.setLifecycleOwner(lifecycleOwner);
        this.cdS.setLifecycleOwner(lifecycleOwner);
        this.cdP.setLifecycleOwner(lifecycleOwner);
        this.cdY.setLifecycleOwner(lifecycleOwner);
        this.cdN.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return a((hu) obj, i2);
            case 1:
                return b((hu) obj, i2);
            case 2:
                return c((hu) obj, i2);
            case 3:
                return a((hy) obj, i2);
            case 4:
                return a((hs) obj, i2);
            case 5:
                return d((hu) obj, i2);
            case 6:
                return e((hu) obj, i2);
            case 7:
                return a((hw) obj, i2);
            case 8:
                return f((hu) obj, i2);
            case 9:
                return g((hu) obj, i2);
            case 10:
                return h((hu) obj, i2);
            case 11:
                return i((hu) obj, i2);
            default:
                return false;
        }
    }

    private boolean a(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean b(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    private boolean c(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 4;
        }
        return true;
    }

    private boolean a(hy hyVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 8;
        }
        return true;
    }

    private boolean a(hs hsVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 16;
        }
        return true;
    }

    private boolean d(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 32;
        }
        return true;
    }

    private boolean e(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 64;
        }
        return true;
    }

    private boolean a(hw hwVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 128;
        }
        return true;
    }

    private boolean f(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 256;
        }
        return true;
    }

    private boolean g(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 512;
        }
        return true;
    }

    private boolean h(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1024;
        }
        return true;
    }

    private boolean i(hu huVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2048;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.cdT);
        ViewDataBinding.executeBindingsOn(this.cdX);
        ViewDataBinding.executeBindingsOn(this.cdW);
        ViewDataBinding.executeBindingsOn(this.cdR);
        ViewDataBinding.executeBindingsOn(this.cdQ);
        ViewDataBinding.executeBindingsOn(this.cdV);
        ViewDataBinding.executeBindingsOn(this.cdU);
        ViewDataBinding.executeBindingsOn(this.cdO);
        ViewDataBinding.executeBindingsOn(this.cdS);
        ViewDataBinding.executeBindingsOn(this.cdP);
        ViewDataBinding.executeBindingsOn(this.cdY);
        ViewDataBinding.executeBindingsOn(this.cdN);
    }
}
