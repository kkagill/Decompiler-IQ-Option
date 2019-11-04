package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: ClosedPortfolioItemBindingImpl */
public class ej extends ei {
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
        aos.put(R.id.dateTitle, 1);
        aos.put(R.id.contentLayout, 2);
        aos.put(R.id.activeIcon, 3);
        aos.put(R.id.activeName, 4);
        aos.put(R.id.pnl, 5);
        aos.put(R.id.instrument, 6);
        aos.put(R.id.pnlPercent, 7);
        aos.put(R.id.loader, 8);
    }

    public ej(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, aor, aos));
    }

    private ej(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (TextView) objArr[4], (ConstraintLayout) objArr[2], (TextView) objArr[1], (TextView) objArr[6], (ContentLoadingProgressBar) objArr[8], (RobotoTextView) objArr[5], (RobotoTextView) objArr[7]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        View view2 = view;
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
