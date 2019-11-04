package com.iqoption.alerts.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.alerts.b;
import com.iqoption.alerts.b.d;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.DialogContentLayout;
import com.iqoption.core.ui.widget.clippinglayout.ClipLinearLayout;

/* compiled from: AlertsOptionsPickerFragmentBindingImpl */
public class j extends i {
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
        aos.put(d.optionsList, 3);
    }

    public j(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private j(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ClipLinearLayout) objArr[1], (DialogContentLayout) objArr[0], (RecyclerView) objArr[3], (TextView) objArr[2]);
        this.aot = -1;
        this.aoy.setTag(null);
        this.aoz.setTag(null);
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
            a.n(this.aoy, ViewDataBinding.getColorFromResource(this.aoy, b.a.dark_blue));
        }
    }
}
