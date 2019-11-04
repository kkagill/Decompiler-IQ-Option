package com.iqoption.dialogs.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.dialogs.d.d;

/* compiled from: DialogSimpleBindingImpl */
public class r extends q {
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
        aos.put(d.title, 2);
        aos.put(d.text, 3);
        aos.put(d.info, 4);
        aos.put(d.btnAction1, 5);
        aos.put(d.btnAction2, 6);
    }

    public r(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private r(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[5], (TextView) objArr[6], (ConstraintLayout) objArr[1], (TextView) objArr[4], (FrameLayout) objArr[0], (TextView) objArr[3], (TextView) objArr[2]);
        this.aot = -1;
        this.aIv.setTag(null);
        this.aHP.setTag(null);
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
            a.n(this.aIv, ViewDataBinding.getColorFromResource(this.aIv, com.iqoption.dialogs.d.a.simple_dialog_bg));
        }
    }
}
