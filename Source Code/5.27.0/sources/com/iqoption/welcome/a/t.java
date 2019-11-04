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
import com.facebook.login.widget.ProfilePictureView;
import com.iqoption.core.ui.widget.rounded.RoundedFrameLayout;
import com.iqoption.core.ui.widget.rounded.RoundedImageView;
import com.iqoption.welcome.a;
import com.iqoption.welcome.g.d;
import com.iqoption.welcome.g.e;

/* compiled from: FragmentWelcomeRegistrationSocialBindingImpl */
public class t extends s {
    @Nullable
    private static final IncludedLayouts aor = new IncludedLayouts(13);
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
        aor.setIncludes(1, new String[]{"layout_register_button"}, new int[]{4}, new int[]{e.layout_register_button});
        aor.setIncludes(2, new String[]{"layout_welcome_policy"}, new int[]{3}, new int[]{e.layout_welcome_policy});
        aos.put(d.backButton, 5);
        aos.put(d.title, 6);
        aos.put(d.registerContentContainer, 7);
        aos.put(d.socialIcon, 8);
        aos.put(d.socialGoogleAvatar, 9);
        aos.put(d.socialFacebookAvatarContainer, 10);
        aos.put(d.socialFacebookAvatar, 11);
        aos.put(d.socialName, 12);
    }

    public t(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private t(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[5], (aa) objArr[4], (FrameLayout) objArr[0], (FrameLayout) objArr[7], (ProfilePictureView) objArr[11], (RoundedFrameLayout) objArr[10], (RoundedImageView) objArr[9], (RoundedImageView) objArr[8], (TextView) objArr[12], (TextView) objArr[6], (ac) objArr[3]);
        this.aot = -1;
        this.aAS = (LinearLayout) objArr[1];
        this.aAS.setTag(null);
        this.cdZ = (LinearLayout) objArr[2];
        this.cdZ.setTag(null);
        this.ekN.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 4;
        }
        this.eld.invalidateAll();
        this.elb.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r6.eld.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r6.elb.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:14:0x0020, code skipped:
            return false;
     */
    public boolean hasPendingBindings() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.aot;	 Catch:{ all -> 0x0021 }
        r2 = 0;
        r4 = 1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        return r4;
    L_0x000c:
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        r0 = r6.eld;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r4;
    L_0x0016:
        r0 = r6.elb;
        r0 = r0.hasPendingBindings();
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r4;
    L_0x001f:
        r0 = 0;
        return r0;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.welcome.a.t.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.eld.setLifecycleOwner(lifecycleOwner);
        this.elb.setLifecycleOwner(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return i != 1 ? false : a((aa) obj, i2);
        } else {
            return a((ac) obj, i2);
        }
    }

    private boolean a(ac acVar, int i) {
        if (i != a._all) {
            return false;
        }
        synchronized (this) {
            this.aot |= 1;
        }
        return true;
    }

    private boolean a(aa aaVar, int i) {
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        ViewDataBinding.executeBindingsOn(this.eld);
        ViewDataBinding.executeBindingsOn(this.elb);
    }
}
