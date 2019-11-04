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
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateCfdOnOpenMainBindingImpl */
public class xk extends xj {
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
        aos.put(R.id.amountLabel, 7);
        aos.put(R.id.amountValue, 8);
        aos.put(R.id.amountPicker, 9);
        aos.put(R.id.multiplierTotalLayout, 10);
        aos.put(R.id.multiplierHighlighter, 11);
        aos.put(R.id.multiplierLabel, 12);
        aos.put(R.id.multiplierValue, 13);
        aos.put(R.id.multiplierPicker, 14);
        aos.put(R.id.totalLabel, 15);
        aos.put(R.id.totalValue, 16);
        aos.put(R.id.insidePendingLayout, 17);
        aos.put(R.id.pendingLabel, 18);
        aos.put(R.id.pendingValue, 19);
        aos.put(R.id.pendingPicker, 20);
        aos.put(R.id.callPut, 21);
        aos.put(R.id.buttonCall, 22);
        aos.put(R.id.callIconLayout, 23);
        aos.put(R.id.arrowBuy, 24);
        aos.put(R.id.paddingIconBuy, 25);
        aos.put(R.id.pendingBuyLabel, 26);
        aos.put(R.id.spreadLabel, 27);
        aos.put(R.id.spreadValue, 28);
        aos.put(R.id.buttonPut, 29);
        aos.put(R.id.putIconLayout, 30);
        aos.put(R.id.arrowSell, 31);
        aos.put(R.id.paddingIconSell, 32);
        aos.put(R.id.pendingSellLabel, 33);
    }

    public xk(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 34, aor, aos));
    }

    private xk(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[7], (FrameLayout) objArr[1], (TextView) objArr[2], (ImageView) objArr[9], (TextView) objArr[3], (RobotoTextView) objArr[8], (ImageView) objArr[24], (ImageView) objArr[31], (LinearLayout) objArr[22], (LinearLayout) objArr[29], (FrameLayout) objArr[23], (MaxSizeLinearLayout) objArr[21], (ImageView) objArr[6], (LinearLayout) objArr[17], (ImageView) objArr[11], (TextView) objArr[12], (FrameLayout) objArr[4], (ImageView) objArr[14], (LinearLayout) objArr[10], (RobotoTextView) objArr[13], (ImageView) objArr[25], (ImageView) objArr[32], (TextView) objArr[26], (TextView) objArr[18], (FrameLayout) objArr[5], (ImageView) objArr[20], (TextView) objArr[33], (RobotoTextView) objArr[19], (FrameLayout) objArr[30], (TextView) objArr[27], (NumberAnimateTextView) objArr[28], (TextView) objArr[15], (RobotoTextView) objArr[16]);
        this.aot = -1;
        this.crt.setTag(null);
        this.crZ.setTag(null);
        this.csa.setTag(null);
        this.crF.setTag(null);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
            b.j(this.crZ, 0.5f);
            b.j(this.csa, 0.5f);
            b.a(this.crF, (Void) null);
            b.j(this.crN, 0.5f);
            b.j(this.crT, 0.5f);
        }
    }
}
