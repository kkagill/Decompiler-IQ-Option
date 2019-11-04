package com.iqoption.welcome.a;

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
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.welcome.a;
import com.iqoption.welcome.g.d;
import com.iqoption.welcome.g.e;

/* compiled from: FragmentWelcomeRegistrationBindingLandImpl */
public class r extends p {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(14);
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAS;
    private long aot;
    @NonNull
    private final LinearLayout cea;
    @Nullable
    private final ae ele;

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aor.setIncludes(1, new String[]{"layout_register_button"}, new int[]{6}, new int[]{e.layout_register_button});
        aor.setIncludes(3, new String[]{"layout_welcome_social", "layout_welcome_policy"}, new int[]{4, 5}, new int[]{e.layout_welcome_social, e.layout_welcome_policy});
        aos.put(d.backButton, 7);
        aos.put(d.title, 8);
        aos.put(d.registerContentContainer, 9);
        aos.put(d.emailLayout, 10);
        aos.put(d.emailEdit, 11);
        aos.put(d.passwordLayout, 12);
        aos.put(d.passwordEdit, 13);
    }

    public r(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, aor, aos));
    }

    private r(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[7], (IQTextInputEditText) objArr[11], (TextInputLayout) objArr[10], (aa) objArr[6], (IQTextInputEditText) objArr[13], (TextInputLayout) objArr[12], (TextView) objArr[2], (FrameLayout) objArr[0], (FrameLayout) objArr[9], (TextView) objArr[8], (ac) objArr[5]);
        this.aot = -1;
        this.aAS = (LinearLayout) objArr[1];
        this.aAS.setTag(null);
        this.cea = (LinearLayout) objArr[3];
        this.cea.setTag(null);
        this.ele = (ae) objArr[4];
        setContainedBinding(this.ele);
        this.elc.setTag(null);
        this.ekN.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 4;
        }
        this.ele.invalidateAll();
        this.eld.invalidateAll();
        this.elb.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.ele.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.eld.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            if (r6.elb.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0027, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:17:0x0029, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x002a }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x002a }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x002a }
        r0 = r6.ele;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.eld;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = r6.elb;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        return r4;
    L_0x0028:
        r0 = 0;
        return r0;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x002a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.welcome.a.r.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.ele.setLifecycleOwner(lifecycleOwner);
        this.eld.setLifecycleOwner(lifecycleOwner);
        this.elb.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return i != 1 ? false : a((ac) obj, i2);
        } else {
            return a((aa) obj, i2);
        }
    }

    private boolean a(aa aaVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(ac acVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 2;
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
        if ((j & 4) != 0) {
            com.iqoption.core.ui.a.j(this.elc, 0.5f);
        }
        ViewDataBinding.executeBindingsOn(this.ele);
        ViewDataBinding.executeBindingsOn(this.eld);
        ViewDataBinding.executeBindingsOn(this.elb);
    }
}
