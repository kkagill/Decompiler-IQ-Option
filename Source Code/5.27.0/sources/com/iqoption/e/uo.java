package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.iqoption.core.ui.a;
import com.iqoption.x.R;

/* compiled from: PortfolioDelegateMicroBindingImpl */
public class uo extends un {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final ConstraintLayout aoV;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.toolbarBottom, 2);
        aos.put(R.id.btnExpand, 3);
        aos.put(R.id.title, 4);
        aos.put(R.id.tabs, 5);
        aos.put(R.id.pager, 6);
    }

    public uo(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private uo(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (TextView) objArr[1], (ViewPager) objArr[6], (TabLayout) objArr[5], (TextView) objArr[4], (Guideline) objArr[2]);
        this.aot = -1;
        this.ciF.setTag(null);
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
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
            TextViewBindingAdapter.setDrawableEnd(this.ciF, ViewDataBinding.getDrawableFromResource(this.ciF, R.drawable.ic_arrow_down));
            a.a(this.ciF, this.ciF.getResources().getDimension(R.dimen.dp12), ViewDataBinding.getColorFromResource(this.ciF, R.color.grey_blur_70));
        }
    }
}
