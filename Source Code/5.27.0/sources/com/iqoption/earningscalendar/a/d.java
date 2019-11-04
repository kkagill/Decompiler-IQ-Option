package com.iqoption.earningscalendar.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.earningscalendar.o.b;

/* compiled from: MacroEarningsCalendarItemBindingImpl */
public class d extends c {
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
        aos.put(b.earningIcon, 1);
        aos.put(b.earningName, 2);
        aos.put(b.earningDiff, 3);
        aos.put(b.earningAnnounceTime, 4);
        aos.put(b.currentlyTitle, 5);
        aos.put(b.currently, 6);
        aos.put(b.timeContainer, 7);
        aos.put(b.timeValue, 8);
        aos.put(b.forecastTitle, 9);
        aos.put(b.forecast, 10);
        aos.put(b.previousTitle, 11);
        aos.put(b.previous, 12);
    }

    public d(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private d(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[1], (ConstraintLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[12], (TextView) objArr[11], (LinearLayout) objArr[7], (TextView) objArr[8]);
        this.aot = -1;
        this.cNT.setTag(null);
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
            a.j(this.cNT, 0.5f);
        }
    }
}
