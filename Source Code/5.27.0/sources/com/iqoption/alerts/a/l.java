package com.iqoption.alerts.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.alerts.b;
import com.iqoption.alerts.b.d;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.clippinglayout.ClipConstrainedLayout;
import com.iqoption.widget.numpad.NumPad;

/* compiled from: AlertsPricePickerFragmentBindingImpl */
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
        aos.put(d.title, 5);
        aos.put(d.value, 6);
        aos.put(d.current, 7);
        aos.put(d.numpad, 8);
    }

    public l(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, aor, aos));
    }

    private l(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[3], (ImageView) objArr[4], (ClipConstrainedLayout) objArr[1], (TextView) objArr[7], (FrameLayout) objArr[0], (NumPad) objArr[8], (TextView) objArr[5], (EditText) objArr[6]);
        this.aot = -1;
        this.aoB.setTag(null);
        this.aoC.setTag(null);
        this.aoD.setTag(null);
        this.aoE.setTag(null);
        this.aoG.setTag(null);
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
            a.m(this.aoB, 0.5f);
            a.n(this.aoB, ViewDataBinding.getColorFromResource(this.aoB, b.a.grey_blue_5));
            a.m(this.aoC, 0.5f);
            a.n(this.aoC, ViewDataBinding.getColorFromResource(this.aoC, b.a.grey_blue_5));
            a.m(this.aoD, 0.5f);
            a.n(this.aoE, ViewDataBinding.getColorFromResource(this.aoE, b.a.dark_blue));
        }
    }
}
