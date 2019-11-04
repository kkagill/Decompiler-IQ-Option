package com.iqoption.forexcalendar.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.iqoption.forexcalendar.r.d;

/* compiled from: FragmentForexCalendarDetailBindingImpl */
public class j extends i {
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
        aos.put(d.btnBack, 1);
        aos.put(d.separator, 2);
        aos.put(d.date, 3);
        aos.put(d.title, 4);
        aos.put(d.volatility, 5);
        aos.put(d.level, 6);
        aos.put(d.levelInfo, 7);
        aos.put(d.f661urrentlyTitle, 8);
        aos.put(d.forecastTitle, 9);
        aos.put(d.previousTitle, 10);
        aos.put(d.currently, 11);
        aos.put(d.forecast, 12);
        aos.put(d.previous, 13);
        aos.put(d.tabs, 14);
        aos.put(d.pager, 15);
    }

    public j(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, aor, aos));
    }

    private j(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[8], (ImageView) objArr[1], (TextView) objArr[11], (TextView) objArr[3], (TextView) objArr[12], (TextView) objArr[9], (ImageView) objArr[6], (TextView) objArr[7], (ViewPager) objArr[15], (TextView) objArr[13], (TextView) objArr[10], (View) objArr[2], (TabLayout) objArr[14], (TextView) objArr[4], (TextView) objArr[5]);
        this.aot = -1;
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
