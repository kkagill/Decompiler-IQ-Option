package com.iqoption.dialogs.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.widget.MaxSizeConstraintLayout;
import com.iqoption.core.ui.widget.StarBar;
import com.iqoption.dialogs.d.d;

/* compiled from: DialogRateUsBindingImpl */
public class p extends o {
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
        aos.put(d.logo, 2);
        aos.put(d.text, 3);
        aos.put(d.starBar, 4);
        aos.put(d.btnAction, 5);
    }

    public p(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, aor, aos));
    }

    private p(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[5], (MaxSizeConstraintLayout) objArr[1], (ImageView) objArr[2], (FrameLayout) objArr[0], (StarBar) objArr[4], (TextView) objArr[3]);
        this.aot = -1;
        this.cMv.setTag(null);
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
            a.n(this.cMv, ViewDataBinding.getColorFromResource(this.cMv, com.iqoption.dialogs.d.a.rate_us_dialog_bg));
        }
    }
}
