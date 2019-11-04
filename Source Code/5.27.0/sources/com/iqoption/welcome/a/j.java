package com.iqoption.welcome.a;

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
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.welcome.g;
import com.iqoption.welcome.g.d;

/* compiled from: FragmentTwoStepAuthBindingImpl */
public class j extends i {
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
        aos.put(d.backButton, 3);
        aos.put(d.title, 4);
        aos.put(d.verificationCodeSentText, 5);
        aos.put(d.codeInput, 6);
        aos.put(d.codeEdit, 7);
        aos.put(d.verificationCodeInfoText, 8);
        aos.put(d.verificationCodeTimerText, 9);
        aos.put(d.button, 10);
    }

    public j(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private j(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (TextView) objArr[10], (IQTextInputEditText) objArr[7], (TextInputLayout) objArr[6], (LinearLayout) objArr[0], (ContentLoadingProgressBar) objArr[2], (TextView) objArr[1], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[5], (TextView) objArr[9]);
        this.aot = -1;
        this.aRl.setTag(null);
        this.bYW.setTag(null);
        this.ekU.setTag(null);
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
            a.a(this.bYW, ViewDataBinding.getColorFromResource(this.bYW, g.a.white));
            a.j(this.ekU, 0.5f);
        }
    }
}
