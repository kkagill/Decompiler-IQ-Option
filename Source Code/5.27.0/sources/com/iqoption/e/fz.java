package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: DialogGdprWarningBindingImpl */
public class fz extends fy {
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
        aos.put(R.id.gdprContainer, 1);
        aos.put(R.id.gdprSpaceTop, 2);
        aos.put(R.id.gdprWarningIcon, 3);
        aos.put(R.id.gdprSpaceMiddle, 4);
        aos.put(R.id.gdprWarningTitle, 5);
        aos.put(R.id.gdprWarningText, 6);
        aos.put(R.id.gdprSpaceBottom, 7);
        aos.put(R.id.gdprConfirm, 8);
        aos.put(R.id.gdprConfirmProgress, 9);
    }

    public fz(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private fz(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (TextView) objArr[8], (ContentLoadingProgressBar) objArr[9], (LinearLayout) objArr[1], (Space) objArr[7], (Space) objArr[4], (Space) objArr[2], (ImageView) objArr[3], (TextView) objArr[6], (TextView) objArr[5]);
        this.aot = -1;
        this.aoG.setTag(null);
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
