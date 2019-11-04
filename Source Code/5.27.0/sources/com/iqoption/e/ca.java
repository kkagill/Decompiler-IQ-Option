package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.timer.TimerView;
import com.iqoption.x.R;

/* compiled from: AssetSpinnerHandleBindingImpl */
public class ca extends bz {
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
        aos.put(R.id.frameAssetHandler, 1);
        aos.put(R.id.iconSwitcher, 2);
        aos.put(R.id.assetIcon, 3);
        aos.put(R.id.timerView, 4);
        aos.put(R.id.titleContainer, 5);
        aos.put(R.id.assetTitle, 6);
        aos.put(R.id.assetType, 7);
        aos.put(R.id.divinerCloseButton1, 8);
        aos.put(R.id.closeSpinner, 9);
        aos.put(R.id.expirationProgress, 10);
        aos.put(R.id.arrowSpinner, 11);
    }

    public ca(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private ca(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[11], (ImageView) objArr[3], (TextView) objArr[6], (TextView) objArr[7], (FrameLayout) objArr[0], (ImageView) objArr[9], (View) objArr[8], (ProgressBar) objArr[10], (LinearLayout) objArr[1], (ImageSwitcher) objArr[2], (TimerView) objArr[4], (LinearLayout) objArr[5]);
        this.aot = -1;
        this.bXk.setTag(null);
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
