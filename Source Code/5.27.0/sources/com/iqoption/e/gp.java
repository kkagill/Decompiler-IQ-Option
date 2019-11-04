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
import com.iqoption.fragment.r;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: DialogPortfolioInvestInfoBindingImpl */
public class gp extends go implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener cct;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.content, 2);
    }

    public gp(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, aor, aos));
    }

    private gp(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (FrameLayout) objArr[1], (FrameLayout) objArr[0]);
        this.aot = -1;
        this.caT.setTag(null);
        setRootTag(view);
        this.cct = new com.iqoption.g.a.a(this, 1);
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
        a((r) obj);
        return true;
    }

    public void a(@Nullable r rVar) {
        this.ccs = rVar;
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
        r rVar = this.ccs;
        if ((j & 2) != 0) {
            this.caT.setOnClickListener(this.cct);
        }
    }

    public final void a(int i, View view) {
        r rVar = this.ccs;
        if ((rVar != null ? 1 : null) != null) {
            rVar.onClose();
        }
    }
}
