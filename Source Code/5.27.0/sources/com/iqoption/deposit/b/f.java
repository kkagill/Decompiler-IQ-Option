package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.iqoption.core.ui.a;
import com.iqoption.deposit.o.e;

/* compiled from: FragmentCardPaymentLightBindingImpl */
public class f extends e {
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
        aos.put(e.cardNumber, 3);
        aos.put(e.cardType, 4);
        aos.put(e.scan_card, 5);
        aos.put(e.cardHolderName, 6);
        aos.put(e.cardMonthAndYear, 7);
        aos.put(e.cardCvv, 8);
        aos.put(e.depositHoldWarning, 9);
    }

    public f(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private f(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (EditText) objArr[8], (LinearLayout) objArr[0], (EditText) objArr[6], (EditText) objArr[7], (EditText) objArr[3], (ImageView) objArr[4], new ViewStubProxy((ViewStub) objArr[9]), (ToggleButton) objArr[2], (ImageView) objArr[5], (TextView) objArr[1]);
        this.aot = -1;
        this.cAL.setTag(null);
        this.cAQ.setContainingBinding(this);
        this.cAR.setTag(null);
        this.cAT.setTag(null);
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
            a.j(this.cAT, 0.5f);
        }
        if (this.cAQ.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.cAQ.getBinding());
        }
    }
}
