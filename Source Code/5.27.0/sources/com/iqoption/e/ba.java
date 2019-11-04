package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.x.R;

/* compiled from: AssetInfoPriceFullItemBindingImpl */
public class ba extends az {
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
        aos.put(R.id.volumeContainer, 1);
        aos.put(R.id.volume, 2);
        aos.put(R.id.mktContainer, 3);
        aos.put(R.id.mktCap, 4);
        aos.put(R.id.yearlyContainer, 5);
        aos.put(R.id.yearlyEps, 6);
        aos.put(R.id.dividendContainer, 7);
        aos.put(R.id.dividend, 8);
        aos.put(R.id.peRatioContainer, 9);
        aos.put(R.id.peRatio, 10);
        aos.put(R.id.sharesContainer, 11);
        aos.put(R.id.sharesOutst, 12);
        aos.put(R.id.betaContainer, 13);
        aos.put(R.id.beta, 14);
        aos.put(R.id.pegRatioContainer, 15);
        aos.put(R.id.pegRatio, 16);
        aos.put(R.id.equitContainer, 17);
        aos.put(R.id.returnOnEquit, 18);
        aos.put(R.id.revenueContainer, 19);
        aos.put(R.id.revenue, 20);
        aos.put(R.id.dateContainer, 21);
        aos.put(R.id.earnDate, 22);
    }

    public ba(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, aor, aos));
    }

    private ba(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[14], (LinearLayout) objArr[13], (LinearLayout) objArr[21], (TextView) objArr[8], (LinearLayout) objArr[7], (TextView) objArr[22], (LinearLayout) objArr[17], (TextView) objArr[4], (LinearLayout) objArr[3], (TextView) objArr[10], (LinearLayout) objArr[9], (TextView) objArr[16], (LinearLayout) objArr[15], (TextView) objArr[18], (TextView) objArr[20], (LinearLayout) objArr[19], (LinearLayout) objArr[11], (TextView) objArr[12], (TextView) objArr[2], (LinearLayout) objArr[1], (LinearLayout) objArr[5], (TextView) objArr[6]);
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
