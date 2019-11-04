package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.iqoption.core.ui.a;
import com.iqoption.deposit.o.b;
import com.iqoption.deposit.o.e;

/* compiled from: LayoutDepositButtonLightBindingImpl */
public class ba extends az {
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
        aos.put(e.depositBottomButtonText, 2);
        aos.put(e.googlepay_button, 3);
    }

    public ba(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private ba(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (ContentLoadingProgressBar) objArr[1], (TextView) objArr[2], new ViewStubProxy((ViewStub) objArr[3]));
        this.aot = -1;
        this.cDo.setTag(null);
        this.cDp.setTag(null);
        this.cDr.setContainingBinding(this);
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
            a.a(this.cDp, ViewDataBinding.getColorFromResource(this.cDp, b.white));
        }
        if (this.cDr.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.cDr.getBinding());
        }
    }
}
