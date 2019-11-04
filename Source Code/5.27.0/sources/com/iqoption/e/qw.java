package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: MicroPortfolioCfdInfoBindingImpl */
public class qw extends qv {
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
        aos.put(R.id.investLayout, 5);
        aos.put(R.id.investLabel, 6);
        aos.put(R.id.investment, 7);
        aos.put(R.id.multiplierLayout, 8);
        aos.put(R.id.multiplier, 9);
        aos.put(R.id.quantityLayout, 10);
        aos.put(R.id.quantity, 11);
        aos.put(R.id.openPriceLayout, 12);
        aos.put(R.id.openPrice, 13);
        aos.put(R.id.currentPrice, 14);
        aos.put(R.id.takeProfitLayout, 15);
        aos.put(R.id.takeProfitPercent, 16);
        aos.put(R.id.stopLossLayout, 17);
        aos.put(R.id.stopLossTitle, 18);
        aos.put(R.id.stopLossPercent, 19);
        aos.put(R.id.marginLayout, 20);
        aos.put(R.id.marginTitle, 21);
        aos.put(R.id.marginPercent, 22);
        aos.put(R.id.commissionLayout, 23);
        aos.put(R.id.commissionValue, 24);
        aos.put(R.id.swapLayout, 25);
        aos.put(R.id.custodialLayout, 26);
        aos.put(R.id.custodialLabel, 27);
        aos.put(R.id.btnClose, 28);
        aos.put(R.id.btnCloseLabel, 29);
        aos.put(R.id.btnCloseProgress, 30);
        aos.put(R.id.btnEdit, 31);
    }

    public qw(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 32, aor, aos));
    }

    private qw(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[28], (TextView) objArr[29], (ProgressBar) objArr[30], (ImageView) objArr[31], (LinearLayout) objArr[23], (RobotoTextView) objArr[24], (RobotoTextView) objArr[14], (ImageView) objArr[3], (TextView) objArr[27], (LinearLayout) objArr[26], (RobotoTextView) objArr[4], (ImageView) objArr[1], (TextView) objArr[6], (LinearLayout) objArr[5], (RobotoTextView) objArr[7], (LinearLayout) objArr[20], (RobotoTextView) objArr[22], (TextView) objArr[21], (RobotoTextView) objArr[9], (LinearLayout) objArr[8], (RobotoTextView) objArr[13], (LinearLayout) objArr[12], (RobotoTextView) objArr[11], (LinearLayout) objArr[10], (LinearLayout) objArr[17], (RobotoTextView) objArr[19], (TextView) objArr[18], (LinearLayout) objArr[25], (RobotoTextView) objArr[2], (LinearLayout) objArr[15], (RobotoTextView) objArr[16]);
        this.aot = -1;
        this.cnk.setTag(null);
        this.cnn.setTag(null);
        this.cno.setTag(null);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.cnD.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            Void voidR = (Void) null;
            b.a(this.cnk, voidR);
            b.a(this.cnn, voidR);
            b.a(this.cno, voidR);
            b.a(this.cnD, voidR);
        }
    }
}
