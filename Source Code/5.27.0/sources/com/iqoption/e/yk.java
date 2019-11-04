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
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.rightpanel.BinaryRightPanelDelegate.c;
import com.iqoption.fragment.rightpanel.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.BuyNewDialogView;
import com.iqoption.view.ConfirmDialogView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: RightPanelDelegateTurboBinaryBindingImpl */
public class yk extends yj implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    private long aot;
    @Nullable
    private final OnClickListener ctA;
    @Nullable
    private final OnClickListener ctB;
    @Nullable
    private final OnClickListener ctC;
    @Nullable
    private final OnClickListener ctz;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.expLabel, 5);
        aos.put(R.id.expValue, 6);
        aos.put(R.id.expPicker, 7);
        aos.put(R.id.amountLabel, 8);
        aos.put(R.id.amountValue, 9);
        aos.put(R.id.amountPicker, 10);
        aos.put(R.id.operationLayout, 11);
        aos.put(R.id.confirmDialog, 12);
        aos.put(R.id.buyNewDialog, 13);
    }

    public yk(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, aor, aos));
    }

    private yk(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[8], (FrameLayout) objArr[2], (TextView) objArr[3], (ImageView) objArr[10], (TextView) objArr[4], (RobotoTextView) objArr[9], (BuyNewDialogView) objArr[13], (ConfirmDialogView) objArr[12], (TextView) objArr[5], (FrameLayout) objArr[1], (ImageView) objArr[7], (RobotoTextView) objArr[6], (FrameLayout) objArr[11], (LinearLayout) objArr[0]);
        this.aot = -1;
        this.crt.setTag(null);
        this.crZ.setTag(null);
        this.csa.setTag(null);
        this.ctg.setTag(null);
        this.csA.setTag(null);
        setRootTag(view);
        this.ctz = new com.iqoption.g.a.a(this, 4);
        this.ctA = new com.iqoption.g.a.a(this, 2);
        this.ctB = new com.iqoption.g.a.a(this, 3);
        this.ctC = new com.iqoption.g.a.a(this, 1);
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
        this.cty = cVar;
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
        c cVar = this.cty;
        if ((j & 2) != 0) {
            this.crt.setOnClickListener(this.ctA);
            b.j(this.crt, 0.5f);
            this.crZ.setOnClickListener(this.ctB);
            b.j(this.crZ, 0.5f);
            this.csa.setOnClickListener(this.ctz);
            b.j(this.csa, 0.5f);
            this.ctg.setOnClickListener(this.ctC);
            b.j(this.ctg, 0.5f);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        c cVar;
        if (i == 1) {
            cVar = this.cty;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFu();
            }
        } else if (i == 2) {
            cVar = this.cty;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFv();
            }
        } else if (i == 3) {
            cVar = this.cty;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFw();
            }
        } else if (i == 4) {
            cVar = this.cty;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.aFx();
            }
        }
    }
}
