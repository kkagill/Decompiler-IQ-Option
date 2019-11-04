package com.iqoption.core.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.i.g;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.IQTextInputEditText;

/* compiled from: LayoutCountryFieldBindingImpl */
public class o extends n {
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
        aos.put(g.countryInput, 3);
        aos.put(g.countryEdit, 4);
        aos.put(g.countryProgress, 5);
    }

    public o(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private o(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (IQTextInputEditText) objArr[4], (TextInputLayout) objArr[3], (ImageView) objArr[1], (ImageView) objArr[2], (ContentLoadingProgressBar) objArr[5]);
        this.aot = -1;
        this.bfL.setTag(null);
        this.bfp.setTag(null);
        this.bfM.setTag(null);
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
            a.j(this.bfp, 0.5f);
            a.j(this.bfM, 0.5f);
        }
    }
}
