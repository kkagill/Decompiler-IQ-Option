package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.x.R;

/* compiled from: ClosePositionDelegateBindingImpl */
public class eh extends eg {
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
        aos.put(R.id.expirationContainer, 3);
        aos.put(R.id.type, 4);
        aos.put(R.id.value, 5);
        aos.put(R.id.investTitle, 6);
        aos.put(R.id.invest, 7);
        aos.put(R.id.closeProfitTilte, 8);
        aos.put(R.id.closeProfit, 9);
        aos.put(R.id.closeProfitPercent, 10);
        aos.put(R.id.closeContainer, 11);
        aos.put(R.id.close, 12);
        aos.put(R.id.progress, 13);
    }

    public eh(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, aor, aos));
    }

    private eh(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[12], (FrameLayout) objArr[11], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[8], (TextView) objArr[1], (LinearLayout) objArr[3], (TextView) objArr[7], (TextView) objArr[6], (ContentLoadingProgressBar) objArr[13], (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[5]);
        this.aot = -1;
        this.bTD.setTag(null);
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
            TextViewBindingAdapter.setDrawableLeft(this.bTD, ViewDataBinding.getDrawableFromResource(this.bTD, R.drawable.ic_flag_8_8));
            ImageViewBindingAdapter.setImageDrawable(this.bYX, ViewDataBinding.getDrawableFromResource(this.bYX, R.drawable.ic_setting_gray_blur_18));
        }
    }
}
