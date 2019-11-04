package com.iqoption.feed.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.feed.i.d;
import com.iqoption.feed.i.e;

/* compiled from: MacroFeedOptionsBindingImpl */
public class l extends k {
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
        aos.put(e.options_container, 4);
    }

    public l(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, aor, aos));
    }

    private l(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (TextView) objArr[1], (LinearLayout) objArr[4], (TextView) objArr[3], (FrameLayout) objArr[0]);
        this.aot = -1;
        this.cPN.setTag(null);
        this.cPO.setTag(null);
        this.cPQ.setTag(null);
        this.cQh.setTag(null);
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
            TextViewBindingAdapter.setDrawableStart(this.cPN, ViewDataBinding.getDrawableFromResource(this.cPN, d.ic_copy_feed));
            TextViewBindingAdapter.setDrawableStart(this.cPO, ViewDataBinding.getDrawableFromResource(this.cPO, d.ic_no_interesting));
            TextViewBindingAdapter.setDrawableStart(this.cPQ, ViewDataBinding.getDrawableFromResource(this.cPQ, d.ic_share));
        }
    }
}
