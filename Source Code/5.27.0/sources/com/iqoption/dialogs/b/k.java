package com.iqoption.dialogs.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.DialogContentLayout;
import com.iqoption.dialogs.d.d;

/* compiled from: DialogCustodialFeeBindingImpl */
public class k extends j {
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
        aos.put(d.title, 2);
        aos.put(d.text1, 3);
        aos.put(d.listHeader, 4);
        aos.put(d.btnOk, 5);
        aos.put(d.schedule, 6);
        aos.put(d.separator, 7);
    }

    public k(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private k(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[5], (View) objArr[1], (TextView) objArr[4], (DialogContentLayout) objArr[0], (RecyclerView) objArr[6], (View) objArr[7], (TextView) objArr[3], (TextView) objArr[2]);
        this.aot = -1;
        this.aHN.setTag(null);
        this.cMn.setTag(null);
        View view2 = view;
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
            a.n((ConstraintLayout) this.aHN, ViewDataBinding.getColorFromResource(this.aHN, com.iqoption.dialogs.d.a.simple_dialog_bg));
        }
    }
}
