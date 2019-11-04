package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: DialogTpslBindingImpl */
public class gz extends gy {
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
        aos.put(R.id.toolbar, 2);
        aos.put(R.id.titleDialog, 3);
        aos.put(R.id.closeButton, 4);
        aos.put(R.id.paramsBar, 5);
        aos.put(R.id.valueTitle, 6);
        aos.put(R.id.valuePrice, 7);
        aos.put(R.id.valuePercente, 8);
        aos.put(R.id.activeName, 9);
        aos.put(R.id.warningText, 10);
        aos.put(R.id.takeProfitSwitcher, 11);
        aos.put(R.id.takeProfitAdd, 12);
        aos.put(R.id.textView, 13);
        aos.put(R.id.takeProfitEdit, 14);
        aos.put(R.id.takeProfitValue, 15);
        aos.put(R.id.takeProfitEditControl, 16);
        aos.put(R.id.takeProfitInputDecr, 17);
        aos.put(R.id.takeProfitInputFrame, 18);
        aos.put(R.id.takeProfitInput, 19);
        aos.put(R.id.takeProfitInputIncr, 20);
        aos.put(R.id.takeProfitResultTouch, 21);
        aos.put(R.id.takeProfitResult, 22);
        aos.put(R.id.takeProfitRemove, 23);
        aos.put(R.id.stopLossSwitcher, 24);
        aos.put(R.id.stopLossAdd, 25);
        aos.put(R.id.stopLossEdit, 26);
        aos.put(R.id.stopLossValue, 27);
        aos.put(R.id.stopLossEditControl, 28);
        aos.put(R.id.stopLossInputDecr, 29);
        aos.put(R.id.stopLossInputFrame, 30);
        aos.put(R.id.stopLossInput, 31);
        aos.put(R.id.stopLossInputIncr, 32);
        aos.put(R.id.stopLossResultTouch, 33);
        aos.put(R.id.stopLossResult, 34);
        aos.put(R.id.stopLossRemove, 35);
        aos.put(R.id.trailingStopContainer, 36);
        aos.put(R.id.trailingStop, 37);
        aos.put(R.id.marginAddOn, 38);
        aos.put(R.id.btnCancel, 39);
        aos.put(R.id.btnSave, 40);
        aos.put(R.id.btnProgress, 41);
    }

    public gz(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 42, aor, aos));
    }

    private gz(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RobotoTextView) objArr[9], (TextView) objArr[39], (ProgressBar) objArr[41], (TextView) objArr[40], (ImageView) objArr[4], (ImageView) objArr[1], (SwitchCompat) objArr[38], (FrameLayout) objArr[5], (LinearLayout) objArr[25], (LinearLayout) objArr[26], (LinearLayout) objArr[28], (RobotoTextView) objArr[31], (ImageView) objArr[29], (FrameLayout) objArr[30], (ImageView) objArr[32], (ImageView) objArr[35], (RobotoTextView) objArr[34], (FrameLayout) objArr[33], (ViewSwitcher) objArr[24], (RobotoTextView) objArr[27], (LinearLayout) objArr[12], (LinearLayout) objArr[14], (LinearLayout) objArr[16], (RobotoTextView) objArr[19], (ImageView) objArr[17], (FrameLayout) objArr[18], (ImageView) objArr[20], (ImageView) objArr[23], (RobotoTextView) objArr[22], (FrameLayout) objArr[21], (ViewSwitcher) objArr[11], (RobotoTextView) objArr[15], (TextView) objArr[13], (TextView) objArr[3], (RelativeLayout) objArr[2], (SwitchCompat) objArr[37], (FrameLayout) objArr[36], (RobotoTextView) objArr[8], (RobotoTextView) objArr[7], (TextView) objArr[6], (RobotoTextView) objArr[10]);
        this.aot = -1;
        this.ccS.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        if ((j & 1) != 0) {
            b.a(this.ccS, (Void) null);
        }
    }
}
