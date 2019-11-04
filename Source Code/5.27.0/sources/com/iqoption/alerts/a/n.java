package com.iqoption.alerts.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;

/* compiled from: AlertsPricePickerNumpadBindingImpl */
public class n extends m {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = null;
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

    public n(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private n(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[11], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (ImageView) objArr[12]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
        this.aoJ.setTag(null);
        this.aoK.setTag(null);
        this.aoL.setTag(null);
        this.aoM.setTag(null);
        this.aoN.setTag(null);
        this.aoO.setTag(null);
        this.aoP.setTag(null);
        this.aoQ.setTag(null);
        this.aoR.setTag(null);
        this.aoS.setTag(null);
        this.aoT.setTag(null);
        this.aoU.setTag(null);
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
            a.m(this.aoJ, 0.5f);
            a.m(this.aoK, 0.5f);
            a.m(this.aoL, 0.5f);
            a.m(this.aoM, 0.5f);
            a.m(this.aoN, 0.5f);
            a.m(this.aoO, 0.5f);
            a.m(this.aoP, 0.5f);
            a.m(this.aoQ, 0.5f);
            a.m(this.aoR, 0.5f);
            a.m(this.aoS, 0.5f);
            a.m(this.aoT, 0.5f);
            a.m(this.aoU, 0.5f);
        }
    }
}
