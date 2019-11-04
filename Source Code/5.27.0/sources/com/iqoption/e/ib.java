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
import com.google.android.material.tabs.TabLayout;
import com.iqoption.fragment.j;
import com.iqoption.g.a.a.a;
import com.iqoption.x.R;

/* compiled from: DigitalExpirationFragmentBindingImpl */
public class ib extends ia implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener cet;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.mainLinearLayout, 2);
        aos.put(R.id.expTitle, 3);
        aos.put(R.id.strikeTitle, 4);
        aos.put(R.id.profitTitle, 5);
        aos.put(R.id.priceTitle, 6);
        aos.put(R.id.expirtionList, 7);
        aos.put(R.id.strikeList, 8);
        aos.put(R.id.autoSelectionStrike, 9);
        aos.put(R.id.spotTabsTitle, 10);
        aos.put(R.id.spotTabs, 11);
    }

    public ib(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, aor, aos));
    }

    private ib(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SwitchCompat) objArr[9], (FrameLayout) objArr[1], (FrameLayout) objArr[0], (TextView) objArr[3], (RecyclerView) objArr[7], (LinearLayout) objArr[2], (TextView) objArr[6], (TextView) objArr[5], (TabLayout) objArr[11], (TextView) objArr[10], (RecyclerView) objArr[8], (TextView) objArr[4]);
        this.aot = -1;
        this.aoG.setTag(null);
        setRootTag(view);
        this.cet = new com.iqoption.g.a.a(this, 1);
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
        a((j) obj);
        return true;
    }

    public void a(@Nullable j jVar) {
        this.ces = jVar;
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
        j jVar = this.ces;
        if ((j & 2) != 0) {
            this.aoG.setOnClickListener(this.cet);
        }
    }

    public final void a(int i, View view) {
        j jVar = this.ces;
        if ((jVar != null ? 1 : null) != null) {
            jVar.onBackPressed();
        }
    }
}
