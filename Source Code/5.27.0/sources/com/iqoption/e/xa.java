package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.x.R;

/* compiled from: RightPanelClosedBindingImpl */
public class xa extends wz {
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
        aos.put(R.id.activeImage, 2);
        aos.put(R.id.title, 3);
        aos.put(R.id.panelClosedInfoContainer, 4);
        aos.put(R.id.panelClosedInfo, 5);
    }

    public xa(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private xa(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (TextView) objArr[1], (ToggleButton) objArr[5], (FrameLayout) objArr[4], (TextView) objArr[3]);
        this.aot = -1;
        this.cqS.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
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
            TextViewBindingAdapter.setDrawableStart(this.cqS, ViewDataBinding.getDrawableFromResource(this.cqS, R.drawable.ic_clock_white_10dp));
        }
    }
}