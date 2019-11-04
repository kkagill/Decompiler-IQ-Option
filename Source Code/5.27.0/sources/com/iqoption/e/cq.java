package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: AssetsHeaderCfdBindingImpl */
public class cq extends cp {
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
        aos.put(R.id.column1, 1);
        aos.put(R.id.column2, 2);
        aos.put(R.id.column3, 3);
        aos.put(R.id.column4, 4);
        aos.put(R.id.sortLabelVolume, 5);
        aos.put(R.id.sortIndicatorVolume, 6);
        aos.put(R.id.sortIndicatorDiff, 7);
        aos.put(R.id.sortLabelDiff, 8);
        aos.put(R.id.sortIndicatorSpread, 9);
        aos.put(R.id.sortLabelSpread, 10);
        aos.put(R.id.sortIndicatorLeverage, 11);
        aos.put(R.id.sortLabelLeverage, 12);
    }

    public cq(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private cq(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Space) objArr[1], (Space) objArr[2], (Space) objArr[3], (Space) objArr[4], (ConstraintLayout) objArr[0], (ImageView) objArr[7], (ImageView) objArr[11], (ImageView) objArr[9], (ImageView) objArr[6], (TextView) objArr[8], (TextView) objArr[12], (TextView) objArr[10], (TextView) objArr[5]);
        this.aot = -1;
        this.bXJ.setTag(null);
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
