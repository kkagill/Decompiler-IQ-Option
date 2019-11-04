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
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.fragment.w;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: DialogMultiplierConfirmBindingImpl */
public class gf extends ge implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener cbK;
    @Nullable
    private final OnClickListener cbL;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 2);
    }

    public gf(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, aor, aos));
    }

    private gf(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (FrameLayout) objArr[2], (FrameLayout) objArr[0]);
        this.aot = -1;
        this.cbI.setTag(null);
        this.caT.setTag(null);
        setRootTag(view);
        this.cbK = new com.iqoption.g.a.a(this, 2);
        this.cbL = new com.iqoption.g.a.a(this, 1);
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
        a((w) obj);
        return true;
    }

    public void a(@Nullable w wVar) {
        this.cbJ = wVar;
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
        w wVar = this.cbJ;
        if ((j & 2) != 0) {
            this.cbI.setOnClickListener(this.cbK);
            b.j(this.cbI, 0.5f);
            this.caT.setOnClickListener(this.cbL);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        w wVar;
        if (i == 1) {
            wVar = this.cbJ;
            if (wVar != null) {
                obj = 1;
            }
            if (obj != null) {
                wVar.onClose();
            }
        } else if (i == 2) {
            wVar = this.cbJ;
            if (wVar != null) {
                obj = 1;
            }
            if (obj != null) {
                wVar.axC();
            }
        }
    }
}
