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
import com.iqoption.fragment.l;
import com.iqoption.g.a.a.a;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: ExpirationFragmentBindingImpl */
public class id extends ic implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ceD;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.contentLayout, 1);
        aos.put(R.id.binaryContainer, 2);
        aos.put(R.id.binaryProfit, 3);
        aos.put(R.id.binaryTitle, 4);
        aos.put(R.id.turboContainer, 5);
        aos.put(R.id.turboProfit, 6);
        aos.put(R.id.turboTitle, 7);
        aos.put(R.id.binaryExpirtions, 8);
        aos.put(R.id.turboExpirtions, 9);
    }

    public id(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, aor, aos));
    }

    private id(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[2], (RecyclerView) objArr[8], (TextView) objArr[3], (RobotoTextView) objArr[4], (FrameLayout) objArr[1], (FrameLayout) objArr[0], (LinearLayout) objArr[5], (RecyclerView) objArr[9], (TextView) objArr[6], (RobotoTextView) objArr[7]);
        this.aot = -1;
        this.aoG.setTag(null);
        setRootTag(view);
        this.ceD = new com.iqoption.g.a.a(this, 1);
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
        a((l) obj);
        return true;
    }

    public void a(@Nullable l lVar) {
        this.ceC = lVar;
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
        l lVar = this.ceC;
        if ((j & 2) != 0) {
            this.aoG.setOnClickListener(this.ceD);
        }
    }

    public final void a(int i, View view) {
        l lVar = this.ceC;
        if ((lVar != null ? 1 : null) != null) {
            lVar.onBackPressed();
        }
    }
}
