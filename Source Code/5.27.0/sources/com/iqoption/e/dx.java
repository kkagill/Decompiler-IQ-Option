package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.x.R;

/* compiled from: BottomSheetPortfolioTpslChooserBindingImpl */
public class dx extends dw {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final CoordinatorLayout bYp;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.outside, 1);
        aos.put(R.id.sheet, 2);
        aos.put(R.id.takeProfitTitle, 3);
        aos.put(R.id.takeProfitValues, 4);
        aos.put(R.id.stopLossTitle, 5);
        aos.put(R.id.stopLossValues, 6);
        aos.put(R.id.btnCancel, 7);
        aos.put(R.id.btnDone, 8);
    }

    public dx(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, aor, aos));
    }

    private dx(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[7], (TextView) objArr[8], (View) objArr[1], (LinearLayout) objArr[2], (TextView) objArr[5], (RecyclerView) objArr[6], (TextView) objArr[3], (RecyclerView) objArr[4]);
        this.aot = -1;
        this.bYp = (CoordinatorLayout) objArr[0];
        this.bYp.setTag(null);
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
