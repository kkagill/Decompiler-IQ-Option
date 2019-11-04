package com.iqoption.kyc.b;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.iqoption.kyc.o.d;

/* compiled from: FragmentKycQuestionSingleChoiceBindingImpl */
public class ah extends ag {
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
        aos.put(d.kycSingleQuestionExpired, 1);
        aos.put(d.kycSingleQuestionTitle, 2);
        aos.put(d.kycSingleQuestionAnswers, 3);
    }

    public ah(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private ah(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RadioGroup) objArr[3], new ViewStubProxy((ViewStub) objArr[1]), (TextView) objArr[2]);
        this.aot = -1;
        this.dvv.setContainingBinding(this);
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
        if (this.dvv.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.dvv.getBinding());
        }
    }
}
