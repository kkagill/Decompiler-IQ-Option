package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.x.R;

/* compiled from: RightPanelPriceAlertBindingImpl */
public class yq extends yp {
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
        aos.put(R.id.title, 7);
        aos.put(R.id.labelPrice, 8);
        aos.put(R.id.labelCurrent, 9);
        aos.put(R.id.labelRepeat, 10);
        aos.put(R.id.btnConfirmLabel, 11);
    }

    public yq(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private yq(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (FrameLayout) objArr[5], (TextView) objArr[11], (ProgressBar) objArr[6], (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.aot = -1;
        this.bYA.setTag(null);
        this.ctP.setTag(null);
        this.ctR.setTag(null);
        this.aow = (FrameLayout) objArr[0];
        this.aow.setTag(null);
        this.ctV.setTag(null);
        this.ctW.setTag(null);
        this.ctX.setTag(null);
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
            a.m(this.bYA, 0.5f);
            a.m(this.ctP, 0.5f);
            a.n(this.ctP, ViewDataBinding.getColorFromResource(this.ctP, R.color.gold));
            b.a(this.ctR, ViewDataBinding.getColorFromResource(this.ctR, R.color.white));
            a.n(this.ctV, ViewDataBinding.getColorFromResource(this.ctV, R.color.black_15));
            a.m(this.ctW, 0.5f);
            a.m(this.ctX, 0.5f);
        }
    }
}
