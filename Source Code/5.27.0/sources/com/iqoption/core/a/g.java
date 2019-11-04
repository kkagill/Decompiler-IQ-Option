package com.iqoption.core.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: FragmentSplashBindingImpl */
public class g extends f {
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
        aos.put(com.iqoption.core.i.g.frontText, 1);
        aos.put(com.iqoption.core.i.g.timerText, 2);
        aos.put(com.iqoption.core.i.g.logText, 3);
        aos.put(com.iqoption.core.i.g.noDurationText, 4);
        aos.put(com.iqoption.core.i.g.ic_cysec, 5);
        aos.put(com.iqoption.core.i.g.splash_connecting_info, 6);
        aos.put(com.iqoption.core.i.g.animation, 7);
        aos.put(com.iqoption.core.i.g.bottomLeftView, 8);
    }

    public g(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, aor, aos));
    }

    private g(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LottieAnimationView) objArr[7], (View) objArr[8], (TextView) objArr[1], (ImageView) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (FrameLayout) objArr[0], (TextView) objArr[6], (TextView) objArr[2]);
        this.aot = -1;
        this.bfB.setTag(null);
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
