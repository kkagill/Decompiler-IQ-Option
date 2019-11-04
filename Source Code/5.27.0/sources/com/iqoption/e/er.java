package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.iqoption.x.R;

/* compiled from: DialogClosedDealsBindingImpl */
public class er extends eq {
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
        aos.put(R.id.toolbar, 1);
        aos.put(R.id.title, 2);
        aos.put(R.id.titleSuffix, 3);
        aos.put(R.id.closeButton, 4);
        aos.put(R.id.coordinator, 5);
        aos.put(R.id.appbar, 6);
        aos.put(R.id.collapsingGraphStub, 7);
        aos.put(R.id.collapsingHeaderStub, 8);
        aos.put(R.id.headerListLayout, 9);
        aos.put(R.id.info, 10);
        aos.put(R.id.headerLayout, 11);
        aos.put(R.id.graphLayout, 12);
        aos.put(R.id.graphProgress, 13);
        aos.put(R.id.list, 14);
    }

    public er(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private er(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppBarLayout) objArr[6], (ImageView) objArr[4], (Space) objArr[7], (Space) objArr[8], (LinearLayout) objArr[0], (CoordinatorLayout) objArr[5], (FrameLayout) objArr[12], (ContentLoadingProgressBar) objArr[13], (FrameLayout) objArr[11], (FrameLayout) objArr[9], (LinearLayout) objArr[10], (RecyclerView) objArr[14], (TextView) objArr[2], (TextView) objArr[3], (FrameLayout) objArr[1]);
        this.aot = -1;
        this.bZU.setTag(null);
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
