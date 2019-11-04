package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.core.ui.widget.NumberAnimateTextView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateDigitalCallPutBindingImpl */
public class ya extends xz {
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
        aos.put(R.id.maxHeightConstraintView, 3);
        aos.put(R.id.guideLineVertical50, 4);
        aos.put(R.id.guideLineVerticalStart8, 5);
        aos.put(R.id.buttonCallProfitFrame, 6);
        aos.put(R.id.buttonCallProfitFrameBackground, 7);
        aos.put(R.id.buttonPutProfitFrame, 8);
        aos.put(R.id.buttonPutProfitFrameBackground, 9);
        aos.put(R.id.buttonPutBackground, 10);
        aos.put(R.id.buttonCall, 11);
        aos.put(R.id.buttonPut, 12);
        aos.put(R.id.callProfitFrame, 13);
        aos.put(R.id.callProfitLabel, 14);
        aos.put(R.id.callProfitValue, 15);
        aos.put(R.id.callProfitPercent, 16);
        aos.put(R.id.putProfitFrame, 17);
        aos.put(R.id.putProfitLabel, 18);
        aos.put(R.id.putProfitValue, 19);
        aos.put(R.id.putProfitPercent, 20);
    }

    public ya(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, aor, aos));
    }

    private ya(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[11], (TextView) objArr[1], (View) objArr[6], (View) objArr[7], (FrameLayout) objArr[12], (View) objArr[10], (TextView) objArr[2], (View) objArr[8], (View) objArr[9], (View) objArr[13], (RobotoTextView) objArr[14], (NumberAnimateTextView) objArr[16], (NumberAnimateTextView) objArr[15], (ConstraintLayout) objArr[0], (Guideline) objArr[4], (Guideline) objArr[5], (Space) objArr[3], (View) objArr[17], (RobotoTextView) objArr[18], (NumberAnimateTextView) objArr[20], (NumberAnimateTextView) objArr[19]);
        this.aot = -1;
        this.csH.setTag(null);
        this.csM.setTag(null);
        this.csT.setTag(null);
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
            TextViewBindingAdapter.setDrawableLeft(this.csH, ViewDataBinding.getDrawableFromResource(this.csH, R.drawable.call_arrow));
            TextViewBindingAdapter.setDrawableLeft(this.csM, ViewDataBinding.getDrawableFromResource(this.csM, R.drawable.put_arrow));
        }
    }
}
