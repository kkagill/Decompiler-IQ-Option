package com.iqoption.e;

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
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.x.R;

/* compiled from: FragmentCommissionChangeBindingImpl */
public class it extends is {
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
        aos.put(R.id.contentLayout, 2);
        aos.put(R.id.linearLayoutContainer, 3);
        aos.put(R.id.optionType, 4);
        aos.put(R.id.infoButton, 5);
        aos.put(R.id.textInfo1, 6);
        aos.put(R.id.textInfo2, 7);
        aos.put(R.id.commissionTitle, 8);
        aos.put(R.id.commissions, 9);
    }

    public it(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private it(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (TextView) objArr[1], (LinearLayout) objArr[8], (RecyclerView) objArr[9], (FrameLayout) objArr[2], (ImageView) objArr[5], (LinearLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[7]);
        this.aot = -1;
        this.cfH.setTag(null);
        this.cbI.setTag(null);
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
            b.j(this.cbI, 0.5f);
        }
    }
}
