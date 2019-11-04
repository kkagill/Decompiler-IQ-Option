package com.iqoption.alerts.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.alerts.b.d;
import com.iqoption.core.ui.a;

/* compiled from: AlertsListAlertItemBindingImpl */
public class b extends a {
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
        aos.put(d.itemBottom, 3);
        aos.put(d.assetImage, 4);
        aos.put(d.value, 5);
        aos.put(d.assetName, 6);
        aos.put(d.label, 7);
        aos.put(d.labelImage, 8);
        aos.put(d.instrumentType, 9);
        aos.put(d.containerButtons, 10);
    }

    public b(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private b(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (TextView) objArr[6], (ImageView) objArr[2], (TextView) objArr[1], (LinearLayout) objArr[10], (TextView) objArr[9], (Guideline) objArr[3], (ConstraintLayout) objArr[0], (TextView) objArr[7], (ImageView) objArr[8], (TextView) objArr[5]);
        this.aot = -1;
        this.aoi.setTag(null);
        this.aoj.setTag(null);
        this.aon.setTag(null);
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
            a.m(this.aoi, 0.5f);
            a.n(this.aoi, ViewDataBinding.getColorFromResource(this.aoi, com.iqoption.alerts.b.a.grey_blue_10));
            a.m(this.aoj, 0.5f);
            a.n(this.aoj, ViewDataBinding.getColorFromResource(this.aoj, com.iqoption.alerts.b.a.grey_blue_10));
        }
    }
}
