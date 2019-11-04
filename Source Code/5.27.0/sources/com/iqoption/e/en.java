package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.a;
import com.iqoption.core.ui.b;
import com.iqoption.core.ui.widget.time.TimeTextView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: ConfirmDialogViewBindingImpl */
public class en extends em {
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
        aos.put(R.id.titleConfirmDialog, 2);
        aos.put(R.id.cancelIcon, 3);
        aos.put(R.id.typeContainer, 4);
        aos.put(R.id.type, 5);
        aos.put(R.id.expiration, 6);
        aos.put(R.id.level, 7);
        aos.put(R.id.confirmationPriceContainer, 8);
        aos.put(R.id.confirmationPrice, 9);
        aos.put(R.id.confirmationBepContainer, 10);
        aos.put(R.id.confirmationBep, 11);
        aos.put(R.id.confirmationInvestContainer, 12);
        aos.put(R.id.confirmationInvest, 13);
        aos.put(R.id.btnConfirm, 14);
    }

    public en(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private en(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RobotoTextView) objArr[14], (ImageView) objArr[3], (RobotoTextView) objArr[11], (LinearLayout) objArr[10], (RobotoTextView) objArr[13], (LinearLayout) objArr[12], (RobotoTextView) objArr[9], (LinearLayout) objArr[8], (TimeTextView) objArr[6], (RobotoTextView) objArr[7], (SwitchCompat) objArr[1], (RobotoTextView) objArr[2], (ImageView) objArr[5], (LinearLayout) objArr[4]);
        this.aot = -1;
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.bZI.setTag(null);
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
            a.a(this.bZI, b.hg(this.bZI.getResources().getString(R.string.font_regular)));
        }
    }
}
