package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.fragment.account.security.phone.c;
import com.iqoption.g.a.a.a;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.x.R;

/* compiled from: AccountSecurityConfirmPhoneFragmentBindingImpl */
public class h extends g implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;
    @Nullable
    private final OnClickListener bSL;
    @Nullable
    private final OnClickListener bSM;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.phone, 3);
    }

    public h(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, aor, aos));
    }

    private h(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConfirmButtonView) objArr[2], (ConfirmButtonView) objArr[1], (FormattedTextView) objArr[3]);
        this.aot = -1;
        this.bSw.setTag(null);
        this.bSI.setTag(null);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        setRootTag(view);
        this.bSL = new com.iqoption.g.a.a(this, 1);
        this.bSM = new com.iqoption.g.a.a(this, 2);
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
        if (5 != i) {
            return false;
        }
        a((c) obj);
        return true;
    }

    public void a(@Nullable c cVar) {
        this.bSK = cVar;
        synchronized (this) {
            this.aot |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    /* Access modifiers changed, original: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.aot;
            this.aot = 0;
        }
        c cVar = this.bSK;
        if ((j & 2) != 0) {
            this.bSw.setOnClickListener(this.bSM);
            this.bSI.setOnClickListener(this.bSL);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        c cVar;
        if (i == 1) {
            cVar = this.bSK;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.LJ();
            }
        } else if (i == 2) {
            cVar = this.bSK;
            if (cVar != null) {
                obj = 1;
            }
            if (obj != null) {
                cVar.azE();
            }
        }
    }
}
