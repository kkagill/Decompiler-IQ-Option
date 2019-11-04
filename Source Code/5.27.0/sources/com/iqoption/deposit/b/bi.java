package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.deposit.o.e;

/* compiled from: LayoutDepositProtectedLightBindingImpl */
public class bi extends bh {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final ConstraintLayout aoV;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(e.protectedVisa, 1);
        aos.put(e.protectedMasterCard, 2);
        aos.put(e.protectedSslIcon, 3);
        aos.put(e.protectedSslTitle, 4);
        aos.put(e.protectedSslSubtitle, 5);
        aos.put(e.protectedBankIcon, 6);
        aos.put(e.protectedBankTitle, 7);
        aos.put(e.protected3dsIcon, 8);
        aos.put(e.protected3dsTitle, 9);
    }

    public bi(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private bi(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[8], (TextView) objArr[9], (ImageView) objArr[6], (TextView) objArr[7], (ImageView) objArr[2], (ImageView) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (ImageView) objArr[1]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
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
