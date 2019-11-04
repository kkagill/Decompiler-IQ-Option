package com.iqoption.deposit.b;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.iqoption.core.ui.a;
import com.iqoption.deposit.o.e;

/* compiled from: FragmentPaymentCompletedLightBindingImpl */
public class y extends x {
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
        aos.put(e.back, 2);
        aos.put(e.title, 3);
        aos.put(e.progressLogo, 4);
        aos.put(e.resultTextTitle, 5);
        aos.put(e.resultText, 6);
        aos.put(e.line1, 7);
        aos.put(e.buyingText, 8);
        aos.put(e.line2, 9);
        aos.put(e.startTradingButton, 10);
        aos.put(e.leftButton, 11);
        aos.put(e.rightButton, 12);
    }

    public y(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, aor, aos));
    }

    private y(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (TextView) objArr[8], (TextView) objArr[1], (LinearLayout) objArr[0], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[9], (LottieAnimationView) objArr[4], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[12], (TextView) objArr[10], (TextView) objArr[3]);
        this.aot = -1;
        this.cCB.setTag(null);
        this.cod.setTag(null);
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
            a.j(this.cCB, 0.5f);
        }
    }
}
