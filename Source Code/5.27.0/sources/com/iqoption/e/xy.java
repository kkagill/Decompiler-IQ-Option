package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.rightpanel.DigitalRightPanelDelegate.c;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.BuyNewDialogView;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateDigitalBindingImpl */
public class xy extends xx implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener csE;
    @Nullable
    private final OnClickListener csF;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.guideline, 3);
        aos.put(R.id.expLabel, 4);
        aos.put(R.id.expTime, 5);
        aos.put(R.id.strikeLabel, 6);
        aos.put(R.id.strikeValue, 7);
        aos.put(R.id.expPicker, 8);
        aos.put(R.id.amountLabel, 9);
        aos.put(R.id.amountValue, 10);
        aos.put(R.id.amountPicker, 11);
        aos.put(R.id.operationLayout, 12);
        aos.put(R.id.confirmDialog, 13);
        aos.put(R.id.buyNewDialog, 14);
    }

    public xy(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, aor, aos));
    }

    private xy(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[9], (FrameLayout) objArr[2], (ImageView) objArr[11], (TextView) objArr[10], (BuyNewDialogView) objArr[14], (ConfirmDialogView) objArr[13], (TextView) objArr[4], (ConstraintLayout) objArr[1], (ImageView) objArr[8], (RobotoTextView) objArr[5], (Guideline) objArr[3], (FrameLayout) objArr[12], (LinearLayout) objArr[0], (TextView) objArr[6], (TextView) objArr[7]);
        this.aot = -1;
        this.crt.setTag(null);
        this.csw.setTag(null);
        this.csA.setTag(null);
        setRootTag(view);
        this.csE = new com.iqoption.g.a.a(this, 1);
        this.csF = new com.iqoption.g.a.a(this, 2);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.aot = 2;
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

    public boolean setVariable(int i, @Nullable Object obj) {
        if (2 != i) {
            return false;
        }
        a((c) obj);
        return true;
    }

    public void a(@Nullable c cVar) {
        this.csD = cVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        c cVar = this.csD;
        if ((j & 2) != 0) {
            this.crt.setOnClickListener(this.csF);
            b.j(this.crt, 0.5f);
            this.csw.setOnClickListener(this.csE);
            b.j(this.csw, 0.5f);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        c cVar;
        if (i == 1) {
            cVar = this.csD;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFu();
            }
        } else if (i == 2) {
            cVar = this.csD;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFv();
            }
        }
    }
}
