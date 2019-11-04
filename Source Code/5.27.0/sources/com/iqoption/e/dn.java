package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: BottomSheetCommissionBindingImpl */
public class dn extends dm {
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
        aos.put(R.id.toolbar, 3);
        aos.put(R.id.titleDialog, 4);
        aos.put(R.id.closeButton, 5);
        aos.put(R.id.titleDescription, 6);
        aos.put(R.id.paramsBar, 7);
        aos.put(R.id.totalValue, 8);
        aos.put(R.id.list, 9);
        aos.put(R.id.progress, 10);
    }

    public dn(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private dn(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[5], (RecyclerView) objArr[9], (View) objArr[1], (FrameLayout) objArr[7], (ProgressBar) objArr[10], (LinearLayout) objArr[2], (RobotoTextView) objArr[6], (RobotoTextView) objArr[4], (RelativeLayout) objArr[3], (RobotoTextView) objArr[8]);
        this.aot = -1;
        this.bYp = (CoordinatorLayout) objArr[0];
        this.bYp.setTag(null);
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
