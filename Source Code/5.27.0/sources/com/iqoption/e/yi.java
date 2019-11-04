package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
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

/* compiled from: RightPanelDelegateSpotBindingImpl */
public class yi extends yh {
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
        aos.put(R.id.guideLineVertical50, 3);
        aos.put(R.id.guideLineVerticalStart8, 4);
        aos.put(R.id.buttonCallProfitFrame, 5);
        aos.put(R.id.buttonCallProfitFrameBackground, 6);
        aos.put(R.id.buttonPutProfitFrame, 7);
        aos.put(R.id.buttonPutProfitFrameBackground, 8);
        aos.put(R.id.putProfitFrame, 9);
        aos.put(R.id.callProfitLabel, 10);
        aos.put(R.id.putProfitValue, 11);
        aos.put(R.id.putProfitPercentFrame, 12);
        aos.put(R.id.putProfitPercent, 13);
        aos.put(R.id.callProfitFrame, 14);
        aos.put(R.id.putProfitLabel, 15);
        aos.put(R.id.callProfitValue, 16);
        aos.put(R.id.callProfitPercent, 17);
    }

    public yi(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, aor, aos));
    }

    private yi(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (View) objArr[5], (View) objArr[6], (TextView) objArr[2], (View) objArr[7], (View) objArr[8], (View) objArr[14], (TextView) objArr[10], (NumberAnimateTextView) objArr[17], (NumberAnimateTextView) objArr[16], (ConstraintLayout) objArr[0], (Guideline) objArr[3], (Guideline) objArr[4], (View) objArr[9], (RobotoTextView) objArr[15], (NumberAnimateTextView) objArr[13], (View) objArr[12], (NumberAnimateTextView) objArr[11]);
        this.aot = -1;
        this.ctr.setTag(null);
        this.cts.setTag(null);
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
            TextViewBindingAdapter.setDrawableLeft(this.ctr, ViewDataBinding.getDrawableFromResource(this.ctr, R.drawable.call_arrow));
            TextViewBindingAdapter.setDrawableLeft(this.cts, ViewDataBinding.getDrawableFromResource(this.cts, R.drawable.put_arrow));
        }
    }
}
