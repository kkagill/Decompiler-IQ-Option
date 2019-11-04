package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.z;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: DialogOtnRewardInfoBindingImpl */
public class gl extends gk implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ccm;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.textCommission, 2);
    }

    public gl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, aor, aos));
    }

    private gl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[1], (FrameLayout) objArr[0], (TextView) objArr[2]);
        this.aot = -1;
        this.caT.setTag(null);
        setRootTag(view);
        this.ccm = new com.iqoption.g.a.a(this, 1);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
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

    public boolean setVariable(int i, @Nullable Object obj) {
        if (1 != i) {
            return false;
        }
        a((z) obj);
        return true;
    }

    public void a(@Nullable z zVar) {
        this.ccl = zVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        z zVar = this.ccl;
        if ((j & 2) != 0) {
            this.caT.setOnClickListener(this.ccm);
        }
    }

    public final void a(int i, View view) {
        z zVar = this.ccl;
        if ((zVar != null ? 1 : null) != null) {
            zVar.onClose();
        }
    }
}