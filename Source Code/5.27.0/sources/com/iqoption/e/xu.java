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

/* compiled from: RightPanelDelegateCryptoMainBindingImpl */
public class xu extends xt {
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
        aos.put(R.id.amountLabel, 4);
        aos.put(R.id.amountValue, 5);
        aos.put(R.id.amountPicker, 6);
        aos.put(R.id.insidePendingLayout, 7);
        aos.put(R.id.pendingLabel, 8);
        aos.put(R.id.pendingValue, 9);
        aos.put(R.id.pendingPicker, 10);
        aos.put(R.id.callPut, 11);
        aos.put(R.id.buttonCall, 12);
        aos.put(R.id.callIconLayout, 13);
        aos.put(R.id.arrowBuy, 14);
        aos.put(R.id.paddingIconBuy, 15);
        aos.put(R.id.askValue, 16);
        aos.put(R.id.spreadLabel, 17);
        aos.put(R.id.spreadValue, 18);
        aos.put(R.id.buttonPut, 19);
        aos.put(R.id.putIconLayout, 20);
        aos.put(R.id.arrowSell, 21);
        aos.put(R.id.paddingIconSell, 22);
        aos.put(R.id.bidValue, 23);
    }

    public xu(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, aor, aos));
    }

    private xu(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[4], (FrameLayout) objArr[1], (ImageView) objArr[6], (RobotoTextView) objArr[5], (ImageView) objArr[14], (ImageView) objArr[21], (NumberAnimateTextView) objArr[16], (NumberAnimateTextView) objArr[23], (LinearLayout) objArr[12], (LinearLayout) objArr[19], (FrameLayout) objArr[13], (MaxSizeLinearLayout) objArr[11], (ImageView) objArr[3], (LinearLayout) objArr[7], (ImageView) objArr[15], (ImageView) objArr[22], (TextView) objArr[8], (FrameLayout) objArr[2], (ImageView) objArr[10], (RobotoTextView) objArr[9], (FrameLayout) objArr[20], (TextView) objArr[17], (NumberAnimateTextView) objArr[18]);
        this.aot = -1;
        this.crt.setTag(null);
        this.crF.setTag(null);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
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
            b.j(this.crT, 0.5f);
        }
    }
}
