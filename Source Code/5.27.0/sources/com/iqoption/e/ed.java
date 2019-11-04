package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: CloseCryptoPositionDelegateBindingImpl */
public class ed extends ec {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @NonNull
    private final FrameLayout aow;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.value, 2);
        aos.put(R.id.investTitle, 3);
        aos.put(R.id.invest, 4);
        aos.put(R.id.countTitle, 5);
        aos.put(R.id.count, 6);
        aos.put(R.id.tpslTitle, 7);
        aos.put(R.id.tpslValue, 8);
        aos.put(R.id.tpslPercente, 9);
        aos.put(R.id.closeContainer, 10);
        aos.put(R.id.close, 11);
        aos.put(R.id.progress, 12);
    }

    public ed(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private ed(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RobotoTextView) objArr[11], (FrameLayout) objArr[10], (TextView) objArr[6], (TextView) objArr[5], (RobotoTextView) objArr[4], (TextView) objArr[3], (ContentLoadingProgressBar) objArr[12], (ImageView) objArr[1], (TextView) objArr[9], (TextView) objArr[7], (RobotoTextView) objArr[8], (TextView) objArr[2]);
        this.aot = -1;
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        this.bYX.setTag(null);
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
            ImageViewBindingAdapter.setImageDrawable(this.bYX, ViewDataBinding.getDrawableFromResource(this.bYX, R.drawable.ic_setting_gray_blur_18));
        }
    }
}
