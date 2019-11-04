package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.d;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: CfdExpirationFragmentBindingImpl */
public class eb extends ea implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener bYP;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.cfdExpirtions, 2);
    }

    public eb(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, aor, aos));
    }

    private eb(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[2], (FrameLayout) objArr[1], (FrameLayout) objArr[0]);
        this.aot = -1;
        this.aoG.setTag(null);
        setRootTag(view);
        this.bYP = new com.iqoption.g.a.a(this, 1);
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
        if (4 != i) {
            return false;
        }
        a((d) obj);
        return true;
    }

    public void a(@Nullable d dVar) {
        this.bYO = dVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        d dVar = this.bYO;
        if ((j & 2) != 0) {
            this.aoG.setOnClickListener(this.bYP);
        }
    }

    public final void a(int i, View view) {
        d dVar = this.bYO;
        if ((dVar != null ? 1 : null) != null) {
            dVar.onBackPressed();
        }
    }
}
