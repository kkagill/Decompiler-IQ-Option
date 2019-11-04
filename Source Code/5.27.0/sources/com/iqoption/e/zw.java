package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.FixedAppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.iqoption.core.ui.a;
import com.iqoption.x.R;

/* compiled from: ToolsContentIndicatorsCommonBindingImpl */
public class zw extends zv {
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
        aos.put(R.id.appbar, 2);
        aos.put(R.id.searchContent, 3);
        aos.put(R.id.searchIcon, 4);
        aos.put(R.id.searchField, 5);
        aos.put(R.id.pager, 6);
    }

    public zw(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private zw(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FixedAppBarLayout) objArr[2], (CoordinatorLayout) objArr[0], (ViewPager) objArr[6], (LinearLayout) objArr[3], (TextView) objArr[5], (ImageView) objArr[4], (TabLayout) objArr[1]);
        this.aot = -1;
        this.cuq.setTag(null);
        this.cfQ.setTag(null);
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
            a.n(this.cfQ, ViewDataBinding.getColorFromResource(this.cfQ, R.color.bg_dialog));
        }
    }
}
