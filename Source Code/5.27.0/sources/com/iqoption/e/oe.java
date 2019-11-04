package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.fragment.n;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: FxExpirationFragmentBindingImpl */
public class oe extends od implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ckY;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.mainLinearLayout, 2);
        aos.put(R.id.expTitle, 3);
        aos.put(R.id.expirtionList, 4);
        aos.put(R.id.strikeList, 5);
        aos.put(R.id.autoSelectionStrike, 6);
    }

    public oe(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private oe(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SwitchCompat) objArr[6], (FrameLayout) objArr[1], (FrameLayout) objArr[0], (TextView) objArr[3], (RecyclerView) objArr[4], (LinearLayout) objArr[2], (RecyclerView) objArr[5]);
        this.aot = -1;
        this.aoG.setTag(null);
        setRootTag(view);
        this.ckY = new com.iqoption.g.a.a(this, 1);
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
        a((n) obj);
        return true;
    }

    public void a(@Nullable n nVar) {
        this.ckX = nVar;
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
        n nVar = this.ckX;
        if ((j & 2) != 0) {
            this.aoG.setOnClickListener(this.ckY);
        }
    }

    public final void a(int i, View view) {
        n nVar = this.ckX;
        if ((nVar != null ? 1 : null) != null) {
            nVar.onBackPressed();
        }
    }
}
