package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.deposit.o.e;

/* compiled from: FragmentDepositMethodsLightBindingImpl */
public class q extends p {
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
        aos.put(e.toolbarClose, 1);
        aos.put(e.depositMethodsTitle, 2);
        aos.put(e.depositProgress, 3);
        aos.put(e.depositError, 4);
        aos.put(e.depositMethodsList, 5);
    }

    public q(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private q(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[4], (LinearLayout) objArr[0], (RecyclerView) objArr[5], (TextView) objArr[2], (FrameLayout) objArr[3], (ImageView) objArr[1]);
        this.aot = -1;
        this.cBT.setTag(null);
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
