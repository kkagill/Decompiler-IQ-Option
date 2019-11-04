package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: PriceMovementsItemBindingImpl */
public class wo extends wn {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.signalDate, 1);
        aos.put(R.id.signalIcon, 2);
        aos.put(R.id.signalTime, 3);
        aos.put(R.id.signalValue, 4);
        aos.put(R.id.signalActive, 5);
        aos.put(R.id.signalLevel, 6);
        aos.put(R.id.signalLevel1, 7);
        aos.put(R.id.signalLevel2, 8);
        aos.put(R.id.signalLevel3, 9);
        aos.put(R.id.signalType, 10);
    }

    public wo(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, aor, aos));
    }

    private wo(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[5], (TextView) objArr[1], (ImageView) objArr[2], (LinearLayout) objArr[6], (ImageView) objArr[7], (ImageView) objArr[8], (ImageView) objArr[9], (TextView) objArr[3], (TextView) objArr[10], (TextView) objArr[4]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
        synchronized (this) {
            long j = this.aot;
            this.aot = 0;
        }
    }
}
