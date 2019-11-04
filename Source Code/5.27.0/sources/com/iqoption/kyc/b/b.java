package com.iqoption.kyc.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.kyc.o.d;

/* compiled from: FragmentKycAddressBindingImpl */
public class b extends a {
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
        aos.put(d.kycCityInput, 1);
        aos.put(d.kycCityEdit, 2);
        aos.put(d.kycPostalCodeInput, 3);
        aos.put(d.kycPostalCodeEdit, 4);
        aos.put(d.kycAddressInput, 5);
        aos.put(d.kycAddressEdit, 6);
    }

    public b(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private b(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (IQTextInputEditText) objArr[6], (TextInputLayout) objArr[5], (IQTextInputEditText) objArr[2], (TextInputLayout) objArr[1], (IQTextInputEditText) objArr[4], (TextInputLayout) objArr[3]);
        this.aot = -1;
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
    }
}
