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

/* compiled from: PortfolioCfdInfoBindingImpl */
public class ug extends uf {
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
        aos.put(R.id.openTime, 5);
        aos.put(R.id.openPriceLayout, 6);
        aos.put(R.id.openPrice, 7);
        aos.put(R.id.investmentLayout, 8);
        aos.put(R.id.investLabel, 9);
        aos.put(R.id.investment, 10);
        aos.put(R.id.quantityLayout, 11);
        aos.put(R.id.quantity, 12);
        aos.put(R.id.currentPrice, 13);
        aos.put(R.id.takeProfitLayout, 14);
        aos.put(R.id.takeProfit, 15);
        aos.put(R.id.stopLossLayout, 16);
        aos.put(R.id.stopLossTitle, 17);
        aos.put(R.id.stopLoss, 18);
        aos.put(R.id.marginLayout, 19);
        aos.put(R.id.marginTitle, 20);
        aos.put(R.id.marginPercente, 21);
        aos.put(R.id.commissionLayout, 22);
        aos.put(R.id.commissionValue, 23);
        aos.put(R.id.swapLayout, 24);
        aos.put(R.id.custodialLayout, 25);
        aos.put(R.id.custodialLabel, 26);
        aos.put(R.id.btnClose, 27);
        aos.put(R.id.btnCloseLabel, 28);
        aos.put(R.id.btnCloseProgress, 29);
        aos.put(R.id.btnEdit, 30);
    }

    public ug(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 31, aor, aos));
    }

    private ug(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[27], (TextView) objArr[28], (ProgressBar) objArr[29], (ImageView) objArr[30], (LinearLayout) objArr[22], (RobotoTextView) objArr[23], (RobotoTextView) objArr[13], (ImageView) objArr[3], (TextView) objArr[26], (LinearLayout) objArr[25], (RobotoTextView) objArr[4], (ImageView) objArr[1], (TextView) objArr[9], (RobotoTextView) objArr[10], (LinearLayout) objArr[8], (LinearLayout) objArr[19], (RobotoTextView) objArr[21], (TextView) objArr[20], (RobotoTextView) objArr[7], (LinearLayout) objArr[6], (RobotoTextView) objArr[5], (RobotoTextView) objArr[12], (LinearLayout) objArr[11], (RobotoTextView) objArr[18], (LinearLayout) objArr[16], (TextView) objArr[17], (LinearLayout) objArr[24], (RobotoTextView) objArr[2], (RobotoTextView) objArr[15], (LinearLayout) objArr[14]);
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
