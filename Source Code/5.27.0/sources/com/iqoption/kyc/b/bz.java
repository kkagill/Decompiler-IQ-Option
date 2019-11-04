package com.iqoption.kyc.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.kyc.o.d;

/* compiled from: LayoutKycToolbarBindingImpl */
public class bz extends by {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(d.toolbarBack, 2);
        aos.put(d.kycTitle, 3);
        aos.put(d.kycSearchEdit, 4);
        aos.put(d.kycSearchIcon, 5);
        aos.put(d.kycSearchClear, 6);
        aos.put(d.kycSkipProgress, 7);
        aos.put(d.kycInfoIcon, 8);
        aos.put(d.kycProgress, 9);
    }

    public bz(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private bz(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[8], (ProgressBar) objArr[9], (ImageView) objArr[6], (EditText) objArr[4], (ImageView) objArr[5], (TextView) objArr[1], (ContentLoadingProgressBar) objArr[7], (TextView) objArr[3], (ImageView) objArr[2]);
        this.aot = -1;
        this.dwM.setTag(null);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
            a.j(this.dwM, 0.5f);
        }
    }
}
