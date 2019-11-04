package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: AssetsHeaderFxBindingImpl */
public class cu extends ct {
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
        aos.put(R.id.containerName, 1);
        aos.put(R.id.sortLabelName, 2);
        aos.put(R.id.sortIndicatorName, 3);
        aos.put(R.id.containerDiff, 4);
        aos.put(R.id.sortLabelDiff, 5);
        aos.put(R.id.sortIndicatorDiff, 6);
        aos.put(R.id.containerExpiration, 7);
        aos.put(R.id.sortLabelExpiration, 8);
        aos.put(R.id.sortIndicatorExpiration, 9);
    }

    public cu(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private cu(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (LinearLayout) objArr[7], (LinearLayout) objArr[1], (LinearLayout) objArr[0], (ImageView) objArr[6], (ImageView) objArr[9], (ImageView) objArr[3], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[2]);
        this.aot = -1;
        this.bXV.setTag(null);
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
