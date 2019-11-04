package com.iqoption.cardsverification.a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.cardsverification.g.d;

/* compiled from: VerifySideItemBindingImpl */
public class p extends o {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final ConstraintLayout aoV;
    private long aot;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        aos.put(d.verifySideHintContainer, 1);
        aos.put(d.verifySideTitle, 2);
        aos.put(d.verifySideHint, 3);
        aos.put(d.verifyRightBarrier, 4);
        aos.put(d.verifySideButton, 5);
        aos.put(d.verifySideUploaded, 6);
    }

    public p(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, aor, aos));
    }

    private p(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[4], (TextView) objArr[5], (ImageView) objArr[3], (LinearLayout) objArr[1], (TextView) objArr[2], (LinearLayout) objArr[6]);
        this.aot = -1;
        this.aoV = (ConstraintLayout) objArr[0];
        this.aoV.setTag(null);
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