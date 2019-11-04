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

/* compiled from: DialogOtnExpectationBindingImpl */
public class gj extends gi {
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
        aos.put(R.id.title, 1);
        aos.put(R.id.subtitle, 2);
        aos.put(R.id.closeButton, 3);
        aos.put(R.id.contentLayout, 4);
        aos.put(R.id.totalCommission, 5);
        aos.put(R.id.btnTotalCommissionInfo, 6);
        aos.put(R.id.totalCommissionDesc, 7);
        aos.put(R.id.yourCommission, 8);
        aos.put(R.id.btnYourCommissionInfo, 9);
        aos.put(R.id.yourCommissionDesc, 10);
        aos.put(R.id.tokensLabel, 11);
        aos.put(R.id.tokensValue, 12);
        aos.put(R.id.btnTokensToDistributeInfo, 13);
        aos.put(R.id.tokensToDistributeDesc, 14);
        aos.put(R.id.youReceiveLayout, 15);
        aos.put(R.id.youReceive, 16);
        aos.put(R.id.btnYouReceiveInfo, 17);
        aos.put(R.id.youReceiveDesc, 18);
    }

    public gj(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, aor, aos));
    }

    private gj(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[13], (ImageView) objArr[6], (ImageView) objArr[17], (ImageView) objArr[9], (ImageView) objArr[3], (LinearLayout) objArr[4], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[11], (TextView) objArr[14], (TextView) objArr[12], (RobotoTextView) objArr[5], (TextView) objArr[7], (TextView) objArr[16], (TextView) objArr[18], (LinearLayout) objArr[15], (TextView) objArr[8], (TextView) objArr[10]);
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
