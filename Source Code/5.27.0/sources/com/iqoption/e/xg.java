package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.MaxSizeLinearLayout;
import com.iqoption.core.ui.widget.NumberAnimateTextView;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.BuyNewDialogView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateCfdMainBindingImpl */
public class xg extends xf {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(R.id.expirationContainer, 5);
        aos.put(R.id.expirationLabel, 6);
        aos.put(R.id.expirationValue, 7);
        aos.put(R.id.expirationPicker, 8);
        aos.put(R.id.amountLabel, 9);
        aos.put(R.id.amountValue, 10);
        aos.put(R.id.amountPicker, 11);
        aos.put(R.id.multiplierTotalLayout, 12);
        aos.put(R.id.multiplierHighlighter, 13);
        aos.put(R.id.multiplierLabel, 14);
        aos.put(R.id.multiplierValue, 15);
        aos.put(R.id.multiplierPicker, 16);
        aos.put(R.id.totalContainerAmount, 17);
        aos.put(R.id.totalLabel, 18);
        aos.put(R.id.totalValue, 19);
        aos.put(R.id.insidePendingLayout, 20);
        aos.put(R.id.pendingLabel, 21);
        aos.put(R.id.pendingValue, 22);
        aos.put(R.id.pendingPicker, 23);
        aos.put(R.id.callPut, 24);
        aos.put(R.id.buttonCall, 25);
        aos.put(R.id.callIconLayout, 26);
        aos.put(R.id.arrowBuy, 27);
        aos.put(R.id.paddingIconBuy, 28);
        aos.put(R.id.askValue, 29);
        aos.put(R.id.spreadLabel, 30);
        aos.put(R.id.spreadValue, 31);
        aos.put(R.id.buttonPut, 32);
        aos.put(R.id.putIconLayout, 33);
        aos.put(R.id.arrowSell, 34);
        aos.put(R.id.paddingIconSell, 35);
        aos.put(R.id.bidValue, 36);
        aos.put(R.id.buyNewDialog, 37);
    }

    public xg(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 38, aor, aos));
    }

    private xg(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[9], (FrameLayout) objArr[1], (ImageView) objArr[11], (TextView) objArr[10], (ImageView) objArr[27], (ImageView) objArr[34], (NumberAnimateTextView) objArr[29], (NumberAnimateTextView) objArr[36], (LinearLayout) objArr[25], (LinearLayout) objArr[32], (BuyNewDialogView) objArr[37], (FrameLayout) objArr[26], (MaxSizeLinearLayout) objArr[24], (ImageView) objArr[4], (FrameLayout) objArr[5], (TextView) objArr[6], (ImageView) objArr[8], (TextView) objArr[7], (LinearLayout) objArr[20], (LinearLayout) objArr[0], (ImageView) objArr[13], (TextView) objArr[14], (FrameLayout) objArr[2], (ImageView) objArr[16], (LinearLayout) objArr[12], (TextView) objArr[15], (ImageView) objArr[28], (ImageView) objArr[35], (TextView) objArr[21], (FrameLayout) objArr[3], (ImageView) objArr[23], (RobotoTextView) objArr[22], (FrameLayout) objArr[33], (TextView) objArr[30], (NumberAnimateTextView) objArr[31], (LinearLayout) objArr[17], (TextView) objArr[18], (TextView) objArr[19]);
        this.aot = -1;
        this.crt.setTag(null);
        this.crF.setTag(null);
        this.crK.setTag(null);
        this.crN.setTag(null);
        this.crT.setTag(null);
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
            b.j(this.crt, 0.5f);
            b.a(this.crF, (Void) null);
            b.j(this.crN, 0.5f);
            b.j(this.crT, 0.5f);
        }
    }
}
