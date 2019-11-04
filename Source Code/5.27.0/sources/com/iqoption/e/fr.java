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
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: DialogClosedDealsItemMultiBindingImpl */
public class fr extends fq {
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
        aos.put(R.id.item1, 1);
        aos.put(R.id.assetIcon1, 2);
        aos.put(R.id.assetName1, 3);
        aos.put(R.id.strike1, 4);
        aos.put(R.id.invest1, 5);
        aos.put(R.id.status1, 6);
        aos.put(R.id.item2, 7);
        aos.put(R.id.assetIcon2, 8);
        aos.put(R.id.assetName2, 9);
        aos.put(R.id.strike2, 10);
        aos.put(R.id.invest2, 11);
        aos.put(R.id.status2, 12);
        aos.put(R.id.item3, 13);
        aos.put(R.id.assetIcon3, 14);
        aos.put(R.id.assetName3, 15);
        aos.put(R.id.strike3, 16);
        aos.put(R.id.invest3, 17);
        aos.put(R.id.status3, 18);
    }

    public fr(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, aor, aos));
    }

    private fr(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[8], (ImageView) objArr[14], (RobotoTextView) objArr[3], (RobotoTextView) objArr[9], (RobotoTextView) objArr[15], (TextView) objArr[5], (TextView) objArr[11], (TextView) objArr[17], (LinearLayout) objArr[1], (LinearLayout) objArr[7], (LinearLayout) objArr[13], (TextView) objArr[6], (TextView) objArr[12], (TextView) objArr[18], (RobotoTextView) objArr[4], (RobotoTextView) objArr[10], (RobotoTextView) objArr[16]);
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
