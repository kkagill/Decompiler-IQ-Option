package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.legacy.widget.Space;
import androidx.lifecycle.LifecycleOwner;
import com.iqoption.x.R;

/* compiled from: FragmentOtnLeadingBoardProfileBindingImpl */
public class mc extends mb {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(12);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAS;
    private long aot;
    @NonNull
    private final LinearLayout cdZ;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"fragment_otn_leading_board_user_board_trading"}, new int[]{7}, new int[]{R.layout.fragment_otn_leading_board_user_board_trading});
        aor.setIncludes(2, new String[]{"fragment_otn_leading_board_user_board_user", "fragment_otn_leading_board_user_board_date", "fragment_otn_leading_board_user_board_place", "fragment_otn_leading_board_user_board_commission"}, new int[]{3, 4, 5, 6}, new int[]{R.layout.fragment_otn_leading_board_user_board_user, R.layout.fragment_otn_leading_board_user_board_date, R.layout.fragment_otn_leading_board_user_board_place, R.layout.fragment_otn_leading_board_user_board_commission});
        aos.put(R.id.space1, 8);
        aos.put(R.id.space2, 9);
        aos.put(R.id.space3, 10);
        aos.put(R.id.space4, 11);
    }

    public mc(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private mc(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (md) objArr[6], (mf) objArr[4], (mh) objArr[5], (FrameLayout) objArr[0], (Space) objArr[8], (Space) objArr[9], (Space) objArr[10], (Space) objArr[11], (mj) objArr[7], (ml) objArr[3]);
        this.aot = -1;
        this.aAS = (LinearLayout) objArr[1];
        this.aAS.setTag(null);
        this.cdZ = (LinearLayout) objArr[2];
        this.cdZ.setTag(null);
        this.chw.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 32;
        }
        this.chC.invalidateAll();
        this.chu.invalidateAll();
        this.chv.invalidateAll();
        this.cht.invalidateAll();
        this.chB.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.chC.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.chu.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.chv.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x002e, code skipped:
            if (r6.cht.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:18:0x0030, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:0x0037, code skipped:
            if (r6.chB.hasPendingBindings() == false) goto L_0x003a;
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
        r0 = r6.chC;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.chu;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.chv;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = r6.cht;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r4;
    L_0x0031:
        r0 = r6.chB;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.e.mc.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.chC.setLifecycleOwner(lifecycleOwner);
        this.chu.setLifecycleOwner(lifecycleOwner);
        this.chv.setLifecycleOwner(lifecycleOwner);
        this.cht.setLifecycleOwner(lifecycleOwner);
        this.chB.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return a((mf) obj, i2);
        }
        if (i == 1) {
            return a((mh) obj, i2);
        }
        if (i == 2) {
            return a((mj) obj, i2);
        }
        if (i != 3) {
            return i != 4 ? false : a((md) obj, i2);
        } else {
            return a((ml) obj, i2);
        }
    }

    private boolean a(mf mfVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(mh mhVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
        }
        return true;
    }

    private boolean a(mj mjVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 4;
        }
        return true;
    }

    private boolean a(ml mlVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.aot |= 8;
        }
        return true;
    }

    private boolean a(md mdVar, int i) {
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
        ViewDataBinding.executeBindingsOn(this.chC);
        ViewDataBinding.executeBindingsOn(this.chu);
        ViewDataBinding.executeBindingsOn(this.chv);
        ViewDataBinding.executeBindingsOn(this.cht);
        ViewDataBinding.executeBindingsOn(this.chB);
    }
}
