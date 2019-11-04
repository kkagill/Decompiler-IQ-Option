package com.iqoption.forexcalendar.a;

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
import com.iqoption.forexcalendar.r.d;

/* compiled from: AssetAffectedItemBindingImpl */
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
        aos.put(d.icon, 1);
        aos.put(d.name, 2);
        aos.put(d.rate, 3);
        aos.put(d.diff, 4);
        aos.put(d.closedConteiner, 5);
        aos.put(d.closedTitle, 6);
        aos.put(d.timeContainer, 7);
        aos.put(d.timeIcon, 8);
        aos.put(d.timeValue, 9);
    }

    public b(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private b(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (LinearLayout) objArr[5], (TextView) objArr[6], (TextView) objArr[4], (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (LinearLayout) objArr[7], (ImageView) objArr[8], (TextView) objArr[9]);
        this.aot = -1;
        this.cSZ.setTag(null);
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
            a.j(this.cSZ, 0.5f);
        }
    }
}
