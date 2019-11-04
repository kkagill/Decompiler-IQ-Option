package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.aa;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: DialogOvernightFeeInfoBindingImpl */
public class gn extends gm implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ccq;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.scheduleTitle, 2);
        aos.put(R.id.scheduleList, 3);
    }

    public gn(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private gn(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[1], (RecyclerView) objArr[3], (TextView) objArr[2], (FrameLayout) objArr[0]);
        this.aot = -1;
        this.caT.setTag(null);
        setRootTag(view);
        this.ccq = new com.iqoption.g.a.a(this, 1);
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
        a((aa) obj);
        return true;
    }

    public void a(@Nullable aa aaVar) {
        this.ccp = aaVar;
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
        aa aaVar = this.ccp;
        if ((j & 2) != 0) {
            this.caT.setOnClickListener(this.ccq);
        }
    }

    public final void a(int i, View view) {
        aa aaVar = this.ccp;
        if ((aaVar != null ? 1 : null) != null) {
            aaVar.onClose();
        }
    }
}
