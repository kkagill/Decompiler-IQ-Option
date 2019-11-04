package com.iqoption.e;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.iqoption.core.ui.widget.ConfirmButtonView;
import com.iqoption.fragment.account.security.phone.b;
import com.iqoption.g.a.a.a;
import com.iqoption.view.text.SoftKeyboardEditText;
import com.iqoption.widget.CountDownProgressBar;
import com.iqoption.x.R;

/* compiled from: AccountSecurityConfirmCodeFragmentBindingImpl */
public class d extends c implements a {
    @Nullable
    private static final IncludedLayouts aor = null;
    @Nullable
    private static final SparseIntArray aos = new SparseIntArray();
    @NonNull
    private final LinearLayout aAA;
    private long aot;
    @Nullable
    private final OnClickListener bSC;
    @Nullable
    private final OnClickListener bSD;
    @Nullable
    private final OnClickListener bSE;

    /* Access modifiers changed, original: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        aos.put(R.id.confirmCodeTitle, 5);
        aos.put(R.id.confirmationCodeSentText, 6);
        aos.put(R.id.countDownProgress, 7);
    }

    public d(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, aor, aos));
    }

    private d(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConfirmButtonView) objArr[4], (ConfirmButtonView) objArr[3], (SoftKeyboardEditText) objArr[1], (TextView) objArr[5], (TextView) objArr[6], (CountDownProgressBar) objArr[7], (ConfirmButtonView) objArr[2]);
        this.aot = -1;
        this.bSv.setTag(null);
        this.bSw.setTag(null);
        this.bSx.setTag(null);
        this.aAA = (LinearLayout) objArr[0];
        this.aAA.setTag(null);
        this.bSA.setTag(null);
        setRootTag(view);
        this.bSC = new com.iqoption.g.a.a(this, 3);
        this.bSD = new com.iqoption.g.a.a(this, 1);
        this.bSE = new com.iqoption.g.a.a(this, 2);
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
        a((b) obj);
        return true;
    }

    public void a(@Nullable b bVar) {
        this.bSB = bVar;
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
        b bVar = this.bSB;
        CharSequence charSequence = null;
        long j2 = 3 & j;
        if (!(j2 == 0 || bVar == null)) {
            charSequence = bVar.azB();
        }
        if ((j & 2) != 0) {
            this.bSv.setOnClickListener(this.bSC);
            this.bSw.setOnClickListener(this.bSE);
            this.bSA.setOnClickListener(this.bSD);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.bSx, charSequence);
        }
    }

    public final void a(int i, View view) {
        Object obj = null;
        b bVar;
        if (i == 1) {
            bVar = this.bSB;
            if (bVar != null) {
                obj = 1;
            }
            if (obj != null) {
                bVar.azD();
            }
        } else if (i == 2) {
            bVar = this.bSB;
            if (bVar != null) {
                obj = 1;
            }
            if (obj != null) {
                bVar.azE();
            }
        } else if (i == 3) {
            bVar = this.bSB;
            if (bVar != null) {
                obj = 1;
            }
            if (obj != null) {
                bVar.azF();
            }
        }
    }
}
