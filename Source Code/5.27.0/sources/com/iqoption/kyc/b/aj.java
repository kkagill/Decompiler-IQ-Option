package com.iqoption.kyc.b;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.kyc.o.d;

/* compiled from: FragmentKycQuestionTextBindingImpl */
public class aj extends ai {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final ScrollView cfT;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(d.kycTextQuestionExpired, 1);
        aos.put(d.kycTextQuestionInput, 2);
        aos.put(d.kycTextQuestionEdit, 3);
    }

    public aj(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private aj(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (IQTextInputEditText) objArr[3], new ViewStubProxy((ViewStub) objArr[1]), (TextInputLayout) objArr[2]);
        this.aot = -1;
        this.dvy.setContainingBinding(this);
        this.cfT = (ScrollView) objArr[0];
        this.cfT.setTag(null);
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
        if (this.dvy.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.dvy.getBinding());
        }
    }
}
