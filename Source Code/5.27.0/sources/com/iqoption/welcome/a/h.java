package com.iqoption.welcome.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.welcome.g;
import com.iqoption.welcome.g.d;

/* compiled from: FragmentTrialRegistrationBindingImpl */
public class h extends g {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(d.registerContainer, 3);
        aos.put(d.title, 4);
        aos.put(d.registrationClose, 5);
        aos.put(d.registerContentContainer, 6);
        aos.put(d.emailLayout, 7);
        aos.put(d.emailEdit, 8);
        aos.put(d.passwordLayout, 9);
        aos.put(d.passwordEdit, 10);
        aos.put(d.welcomePolicyCheck, 11);
        aos.put(d.welcomePolicyText, 12);
        aos.put(d.button, 13);
    }

    public h(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, aor, aos));
    }

    private h(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[13], (IQTextInputEditText) objArr[8], (TextInputLayout) objArr[7], (FrameLayout) objArr[0], (IQTextInputEditText) objArr[10], (TextInputLayout) objArr[9], (ToggleButton) objArr[1], (ContentLoadingProgressBar) objArr[2], (FrameLayout) objArr[3], (FrameLayout) objArr[6], (ImageView) objArr[5], (TextView) objArr[4], (CheckBox) objArr[11], (TextView) objArr[12]);
        this.aot = -1;
        this.aoG.setTag(null);
        this.cAR.setTag(null);
        this.bYW.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 1;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.aot != 0) {
                return true;
            }
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            a.j(this.cAR, 0.5f);
            a.a(this.bYW, ViewDataBinding.getColorFromResource(this.bYW, g.a.white));
        }
    }
}
