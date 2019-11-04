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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.core.ui.widget.MaxSizeLinearLayout;
import com.iqoption.core.ui.widget.time.TimeTextView;
import com.iqoption.fragment.rightpanel.FxRightPanelDelegate.c;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.BuyNewDialogView;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelFxDelegateBindingImpl */
public class yo extends yn implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ctN;
    @Nullable
    private final OnClickListener ctO;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.callPut, 5);
        aos.put(R.id.guideline, 6);
        aos.put(R.id.expLabel, 7);
        aos.put(R.id.expTime, 8);
        aos.put(R.id.strikeLabel, 9);
        aos.put(R.id.strikeValue, 10);
        aos.put(R.id.expPicker, 11);
        aos.put(R.id.amountLabel, 12);
        aos.put(R.id.amountValue, 13);
        aos.put(R.id.amountPicker, 14);
        aos.put(R.id.putLayout, 15);
        aos.put(R.id.confirmDialog, 16);
        aos.put(R.id.buyNewDialog, 17);
    }

    public yo(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, aor, aos));
    }

    private yo(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[12], (FrameLayout) objArr[2], (ImageView) objArr[14], (TextView) objArr[13], (RobotoTextView) objArr[3], (RobotoTextView) objArr[4], (BuyNewDialogView) objArr[17], (LinearLayout) objArr[5], (ConfirmDialogView) objArr[16], (TextView) objArr[7], (ConstraintLayout) objArr[1], (ImageView) objArr[11], (TimeTextView) objArr[8], (Guideline) objArr[6], (MaxSizeLinearLayout) objArr[15], (FrameLayout) objArr[0], (TextView) objArr[9], (TextView) objArr[10]);
        this.aot = -1;
        this.crt.setTag(null);
        this.ctD.setTag(null);
        this.ctE.setTag(null);
        this.csw.setTag(null);
        this.ctL.setTag(null);
        setRootTag(view);
        this.ctN = new com.iqoption.g.a.a(this, 2);
        this.ctO = new com.iqoption.g.a.a(this, 1);
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
        this.ctM = cVar;
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
        c cVar = this.ctM;
        if ((j & 2) != 0) {
            this.crt.setOnClickListener(this.ctN);
            b.j(this.crt, 0.5f);
            TextViewBindingAdapter.setDrawableLeft(this.ctD, ViewDataBinding.getDrawableFromResource(this.ctD, R.drawable.call_arrow));
            TextViewBindingAdapter.setDrawableLeft(this.ctE, ViewDataBinding.getDrawableFromResource(this.ctE, R.drawable.put_arrow));
            this.csw.setOnClickListener(this.ctO);
            b.j(this.csw, 0.5f);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        c cVar;
        if (i == 1) {
            cVar = this.ctM;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFu();
            }
        } else if (i == 2) {
            cVar = this.ctM;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFv();
            }
        }
    }
}
